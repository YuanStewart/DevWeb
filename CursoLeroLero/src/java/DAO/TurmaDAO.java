/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Model.FabricaDeConexoes;
import Model.Turma;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
/**
 *
 * @author yuan
 */
public class TurmaDAO {
    Connection connection = null;
    PreparedStatement stmt = null;
    
    private void closeConnection() throws SQLException {
        this.connection.close();
    }
   
    public void inserirTurmaDAO(Turma turma) throws SQLException {
		try {
			connection = new FabricaDeConexoes().getConnection();
			stmt = connection.prepareStatement("INSERT INTO turmas (instrutores_id, cursos_id, data_inicio, data_final, carga_horaria) VALUES (?, ?, ?, ?, ?)");
			stmt.setInt(1, turma.getInstrutor_id());
			stmt.setInt(2, turma.getCursos_id());
			
			java.util.Date dataInicio = turma.getData_inicio();
			java.sql.Date dtinicio = new java.sql.Date (dataInicio.getTime());
			
			java.util.Date dataFinal = turma.getData_final();
			java.sql.Date dtfinal = new java.sql.Date (dataFinal.getTime());	
			
			stmt.setDate(3, dtinicio);
			stmt.setDate(4, dtfinal);
			stmt.setInt(5, turma.getCarga_horaria());
			stmt.execute();
			
		} catch(SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao registrar turma DAO: " + e.getMessage());
		} finally {
			this.closeConnection();
		}
    }
    public Turma listarTurmaPorIdDAO(int id) throws SQLException {
		
        ResultSet rs = null;
        Turma turma = null;
		
        try {
        	connection = new FabricaDeConexoes().getConnection();
        	stmt = connection.prepareStatement("SELECT * FROM turmas WHERE id =" + id);
        	rs = stmt.executeQuery();
        	
        	if(rs.next()) {
        		turma = new Turma();
        		turma.setInstrutor_id(rs.getInt("instrutores_id"));
        		turma.setCursos_id(rs.getInt("cursos_id"));
        		turma.setData_inicio(rs.getDate("data_inicio"));
        		turma.setData_final(rs.getDate("data_final"));
        		turma.setCarga_horaria(rs.getInt("carga_horaria"));
        		return turma;
        	}
        } catch(SQLException e) {
        	JOptionPane.showMessageDialog(null, "Erro ao listar turma pelo ID: " + e.getMessage());
        } finally {
            this.closeConnection();
        }
        
        return turma;
	}
    public void alterarTurmaDAO(Turma turma) throws SQLException {
		Connection connection = null;
        PreparedStatement stmt = null;
        
        try {
            connection = new FabricaDeConexoes().getConnection();
            stmt = connection.prepareStatement("UPDATE turmas SET instrutores_id = ?, cursos_id = ?, data_inicio = ?, data_final = ?, carga_horaria = ? WHERE id = ?");
            stmt.setInt(1, turma.getInstrutor_id());
            stmt.setInt(2, turma.getCursos_id());
            java.util.Date dataInicio = turma.getData_inicio();
			java.sql.Date dtinicio = new java.sql.Date (dataInicio.getTime());
			
			java.util.Date dataFinal = turma.getData_final();
			java.sql.Date dtfinal = new java.sql.Date (dataFinal.getTime());	
			
			stmt.setDate(3, dtinicio);
			stmt.setDate(4, dtfinal);
			
            stmt.setInt(5, turma.getCarga_horaria());
            stmt.setInt(6, turma.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar turma DAO: " + e.getMessage());
        } finally {
            this.closeConnection();
        }
	}
    
	public void deletarTurmaDAO(int id) throws SQLException {
        

        try {
            connection = new FabricaDeConexoes().getConnection();
            stmt = connection.prepareStatement("DELETE FROM turmas WHERE id = " + id);
            stmt.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error ao deletar turma: " + e.getMessage());
        } finally {
            this.closeConnection();
        }
    }
    
}

    
