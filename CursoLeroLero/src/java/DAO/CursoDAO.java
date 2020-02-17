/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Curso;
import Model.FabricaDeConexoes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;

import javax.swing.JOptionPane;

/**
 *
 * @author yuan
 */
public class CursoDAO {
    Connection connection = null;
    PreparedStatement stmt = null;
      
    private void closeConnection() throws SQLException  {
       this.connection.close();
    }
    
        public void inserirCursoDAO(Curso curso) throws SQLException{
		
		
		try {
			connection = new FabricaDeConexoes().getConnection();
			stmt = connection.prepareStatement("INSERT INTO cursos (nome, requisito, ementa, carga_horaria, preco) VALUES (?, ?, ?, ?, ?)");
			stmt.setString(1, curso.getNome());
			stmt.setString(2, curso.getRequisito());
			stmt.setString(3, curso.getEmenta());
			stmt.setInt(4, curso.getCarga_horaria());
			stmt.setDouble(5, curso.getPreco());
			stmt.execute();
		} catch(SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao registrar curso DAO: " + e.getMessage());
		} finally {
			this.closeConnection();
		}
	}

        public void alterarCursoDAO(Curso curso) throws SQLException {
        

        try {
            connection = new FabricaDeConexoes().getConnection();
            stmt = connection.prepareStatement("UPDATE cursos SET nome = ?, requisito = ?, ementa = ?, carga_horaria = ?, preco = ? WHERE id = ?");
            stmt.setString(1, curso.getNome());
            stmt.setString(2, curso.getRequisito());
            stmt.setString(3, curso.getEmenta());
            stmt.setInt(4, curso.getCarga_horaria());
            stmt.setDouble(5, curso.getPreco());
            stmt.setInt(6, curso.getId());
            
            stmt.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar curso DAO: " + e.getMessage());
        } finally {
            this.closeConnection();
        }
    }
  
	public List<Curso> listarTodosCursosDAO() throws SQLException {
		
        ResultSet rs = null;
        List<Curso> cursos = new ArrayList<>();
        Curso curso = null;
        
        try {
        	connection = new FabricaDeConexoes().getConnection();
            stmt = connection.prepareStatement("SELECT * FROM cursos");
            rs = stmt.executeQuery();
            
            while(rs.next()) {
            	curso = new Curso();
            	curso.setId(rs.getInt("id"));
            	curso.setNome(rs.getString("nome"));
            	curso.setRequisito(rs.getString("requisito"));
            	curso.setEmenta(rs.getString("ementa"));
            	curso.setCarga_horaria(rs.getInt("carga_horaria"));
            	curso.setPreco(rs.getDouble("preco"));
            	
            	cursos.add(curso);
            }        	
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar todos os cursos: " + e.getMessage());
        } finally {
            this.closeConnection();
        }

        return cursos;
	}
    
    public void deletarCursoDAO(int id) throws SQLException {
       

        try {
            connection = new FabricaDeConexoes().getConnection();
            stmt = connection.prepareStatement("DELETE FROM cursos WHERE id = " + id);
            stmt.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error ao deletar curso: " + e.getMessage());
        } finally {
            this.closeConnection();
        }
    }
    
}
