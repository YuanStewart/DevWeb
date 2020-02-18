/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.FabricaDeConexoes;
import Model.Instrutor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Model.Turma;

import javax.swing.JOptionPane;



/**
 *
 * @author yuan
 */
public class InstrutorDAO {
        Connection connection = null;
        PreparedStatement stmt = null;
    
    public void closeConnection() throws SQLException {
        this.connection.close();
        
    }
    public void inserirInstrutorDAO(Instrutor instrutor) throws SQLException{
        
        
        try {
			connection = new FabricaDeConexoes().getConnection();
			stmt = connection.prepareStatement("INSERT INTO instrutores (nome, email, valor_hora, login, senha, experiencia) VALUES (?, ?, ?, ?, ?, ?)");
			stmt.setString(1, instrutor.getNome());
			stmt.setString(2, instrutor.getEmail());
			stmt.setInt(3, instrutor.getValor_hora());
			stmt.setString(4, instrutor.getLogin());
			stmt.setString(5, instrutor.getSenha());
			stmt.setString(6, instrutor.getExperiencia());
			stmt.execute();
		} catch(SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao registrar instrutor DAO: " + e.getMessage());
		} finally {
			this.closeConnection();
		}
    }
    
    public void alterarInstrutorDAO(Instrutor instrutor) throws SQLException {
		
        
        try {
                    connection = new FabricaDeConexoes().getConnection();
                    stmt = connection.prepareStatement("UPDATE instrutores SET nome = ?, email = ?, valor_hora = ?, login = ?, senha = ?, experiencia = ? WHERE id = ?");
                    stmt.setString(1, instrutor.getNome());
                    stmt.setString(2, instrutor.getEmail());
                    stmt.setInt(3, instrutor.getValor_hora());
                    stmt.setString(4, instrutor.getLogin());
                    stmt.setString(5, instrutor.getSenha());
                    stmt.setString(6, instrutor.getExperiencia());
                    stmt.executeUpdate();
            } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar instrutor DAO: " + e.getMessage());
            } finally {
            this.closeConnection();
            }
    }
    public List<Instrutor> listarTodosInstrutoresDAO() throws SQLException {
		
        ResultSet rs = null;
        ArrayList<Instrutor> instrutores = new ArrayList<>();
        Instrutor instrutor = null;
        
        try {
        	connection = new FabricaDeConexoes().getConnection();
                stmt = connection.prepareStatement("SELECT * FROM instrutores");
                rs = stmt.executeQuery();
            
            while(rs.next()) {
            	instrutor = new Instrutor();
            	instrutor.setId(rs.getInt("id"));
            	instrutor.setNome(rs.getString("nome"));
            	instrutor.setEmail(rs.getString("email"));
            	instrutor.setValor_hora(rs.getInt("valor_hora"));
            	instrutor.setLogin(rs.getString("login"));
            	instrutor.setSenha(rs.getString("senha"));
            	instrutor.setExperiencia(rs.getString("experiencia"));
            	instrutores.add(instrutor);
            }        	
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar todos os instrutores: " + e.getMessage());
        } finally {
            this.closeConnection();
        }

        return instrutores;
    }
    
    public void deletarInstrutorDAO(int id) throws SQLException {
        

        try {
            connection = new FabricaDeConexoes().getConnection();
            stmt = connection.prepareStatement("DELETE FROM instrutores WHERE id = " + id);
            stmt.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error ao deletar instrutor: " + e.getMessage());
        } finally {
            this.closeConnection();
        }
    }
    
    public Instrutor listarInstrutorPorIdDAO(int id) throws SQLException {
        
        ResultSet rs = null;
        Instrutor instrutor = null;
		
        try {
        	connection = new FabricaDeConexoes().getConnection();
        	stmt = connection.prepareStatement("SELECT * FROM instrutores WHERE id = " + id);
        	rs = stmt.executeQuery();
        	if(rs.next()) {
        	instrutor = new Instrutor();
        	instrutor.setNome(rs.getString("nome"));
        	instrutor.setEmail(rs.getString("email"));
        	instrutor.setValor_hora(rs.getInt("valor_hora"));
        	instrutor.setLogin(rs.getString("login"));
                instrutor.setSenha(rs.getString("senha"));
                instrutor.setExperiencia(rs.getString("experiencia"));
        	}
        } catch(SQLException e) {
        	JOptionPane.showMessageDialog(null, "Erro ao listar instrutor pelo ID: " + e.getMessage());
        } finally {
            this.closeConnection();
        }
        
        return instrutor;
	}
    
    public List<Turma> listarTodasAsTurmasPorIdDoInstrutorDAO(int id) throws SQLException {
		
        ResultSet rs = null;
        ArrayList<Turma> turmas = new ArrayList<>();
        Turma turma = null;
        
        try {
        	connection = new FabricaDeConexoes().getConnection();
            stmt = connection.prepareStatement("SELECT * FROM turmas WHERE instrutores_id = " + id);
            rs = stmt.executeQuery();
            
            while(rs.next()) {
            	turma = new Turma();
            	turma.setId(rs.getInt("id"));
        		turma.setInstrutor_id(rs.getInt("instrutores_id"));
        		turma.setCursos_id(rs.getInt("cursos_id"));
        		turma.setData_inicio(rs.getDate("data_inicio"));
        		turma.setData_final(rs.getDate("data_final"));
        		turma.setCarga_horaria(rs.getInt("carga_horaria"));
        		
        		turmas.add(turma);
            }
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar todas as turmas de instrutor: " + e.getMessage());
        } finally {
            this.closeConnection();
        }
        
        return turmas;
	}
}