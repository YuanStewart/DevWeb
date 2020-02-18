/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.FabricaDeConexoes;
import Model.Matricula;
import java.sql.Connection;
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
public class MatriculaDAO {
    Connection connection = null;
    PreparedStatement stmt = null;
    
    private void closeConnection() throws SQLException {
            this.connection.close();
    }
    
   public void inserirMatriculaDAO(Matricula matricula) throws SQLException {
		
		
		try {
			connection = new FabricaDeConexoes().getConnection();
			stmt = connection.prepareStatement("INSERT INTO matriculas (turmas_id, alunos_id, data_matricula, nota) VALUES (?, ?, ?, ?)");
			stmt.setInt(1, matricula.getTurmas_id());
			stmt.setInt(2, matricula.getAlunos_id());
			
			java.util.Date data = matricula.getData_matricula();
			java.sql.Date dataMatricula = new java.sql.Date (data.getTime());
			stmt.setDate(3, dataMatricula);
			
			stmt.setDouble(4, matricula.getNota());
			stmt.execute();
		} catch(SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao registrar matricula DAO: " + e.getMessage());
		} finally {
			this.closeConnection();
		}
	}

    public List<Matricula> listarTodasAsMatriculasDAO() throws SQLException {
		
        ResultSet rs = null;
        List<Matricula> matriculas = new ArrayList<>();
        Matricula matricula = null;
        
        try {
        	connection = new FabricaDeConexoes().getConnection();
            stmt = connection.prepareStatement("SELECT * FROM matriculas");
            rs = stmt.executeQuery();
            
            while(rs.next()) {
            	matricula = new Matricula();
            	matricula.setId(rs.getInt("id"));
        		matricula.setTurmas_id(rs.getInt("turma_id"));
        		matricula.setAlunos_id(rs.getInt("aluno_id"));
        		matricula.setData_matricula(rs.getDate("data"));
        		matricula.setNota(rs.getInt("nota"));
        		
        		matriculas.add(matricula);
        	}     	
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar todas as matriculas: " + e.getMessage());
        } finally {
            this.closeConnection();
        }

        return matriculas;
	}
    
    
	public void alterarMatriculaDAO(Matricula matricula) throws SQLException {
        

        try {
            connection = new FabricaDeConexoes().getConnection();
            stmt = connection.prepareStatement("UPDATE matriculas SET turmas_id = ?, alunos_id = ?, data_matricula = ?, nota = ? WHERE id = ?");
            stmt.setInt(1, matricula.getTurmas_id());
            stmt.setInt(2, matricula.getAlunos_id());
            
            java.util.Date data = matricula.getData_matricula();
			java.sql.Date dataMatricula = new java.sql.Date (data.getTime());
			stmt.setDate(3, dataMatricula);
            
			stmt.setDouble(4, matricula.getNota());
            stmt.setInt(5, matricula.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar matricula DAO: " + e.getMessage());
        } finally {
            this.closeConnection();
        }
    }
        
        public void darNotaParaMatriculaDAO(Matricula matricula, double nota) throws SQLException {
    	 
         
      
        try {
            connection = new FabricaDeConexoes().getConnection();
            stmt = connection.prepareStatement("UPDATE matriculas SET nota = "+ nota +" WHERE id = " + matricula.getId());
            
            stmt.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar nota na matricula DAO: " + e.getMessage());
        } finally {
            this.closeConnection();
        }
    }
        
        public void deletarMatriculaDAO(int id) throws SQLException {
        

        try {
            connection = new FabricaDeConexoes().getConnection();
            stmt = connection.prepareStatement("DELETE FROM matriculas WHERE id = " + id);
            stmt.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error ao deletar matricula: " + e.getMessage());
        } finally {
            this.closeConnection();
        }
    }
        public Matricula listarMatriculaPeloIdDAO(int id) throws SQLException {
        
        ResultSet rs = null;
        Matricula matricula = null;

        try {
            connection = new FabricaDeConexoes().getConnection();
            stmt = connection.prepareStatement("SELECT * FROM matriculas WHERE id = " + id);
            rs = stmt.executeQuery();
            if (rs.next()) {
                matricula = new Matricula();
                matricula.setTurmas_id(rs.getInt("turmas_id"));
                matricula.setAlunos_id(rs.getInt("alunos_id"));
                matricula.setData_matricula(rs.getDate("data_matricula"));
                matricula.setNota(rs.getFloat("nota"));
                return matricula;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar matricula pelo ID: " + e.getMessage());
        } finally {
            this.closeConnection();
        }

        return null;
    }
        public List<Integer> listarTurmasPorAlunoDAO(int id) throws SQLException {
        
        ResultSet rs = null;
        List<Integer> turmas = new ArrayList<>();
        
        try {
            connection = new FabricaDeConexoes().getConnection();
            stmt = connection.prepareStatement("SELECT turmas_id FROM matriculas WHERE alunos_id =" + id);
            rs = stmt.executeQuery();
            
            while(rs.next()) {
            	turmas.add(rs.getInt("turmas_id"));
        	}    
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar turmas pelo ID do aluno: " + e.getMessage());
        } finally {
            this.closeConnection();
        }

        return turmas;
    }
        public List<Integer> listarNotasPorAlunoDAO(int id) throws SQLException {
        
        ResultSet rs = null;
        List<Integer> notas = new ArrayList<>();
        
        try {
            connection = new FabricaDeConexoes().getConnection();
            stmt = connection.prepareStatement("SELECT notas FROM matriculas WHERE alunos_id =" + id);
            rs = stmt.executeQuery();
            
            while(rs.next()) {
            	notas.add(rs.getInt("notas"));
        	}    
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar notas pelo ID do aluno: " + e.getMessage());
        } finally {
            this.closeConnection();
        }

        return notas;
    }
        
	public List<Integer> listarAlunosPorTurmaDAO(int id) throws SQLException {
        
        ResultSet rs = null;
        List<Integer> alunos = new ArrayList<>();
        
        try {
        	connection = new FabricaDeConexoes().getConnection();
            stmt = connection.prepareStatement("SELECT alunos_id FROM matriculas WHERE turmas_id =" + id);
            rs = stmt.executeQuery();
            
            while(rs.next()) {
            	alunos.add(rs.getInt("alunos_id"));
        	}    
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar alunos pelo ID da turma: " + e.getMessage());
        } finally {
            this.closeConnection();
        }

        return alunos;
    }
	
	
	public List<Matricula> listarTodasMatriculasPorAlunoIdDAO(int id) throws SQLException {
		
        ResultSet rs = null;
        List<Matricula> matriculas = new ArrayList<>();
        Matricula matricula = null;
        
        try {
        	connection = new FabricaDeConexoes().getConnection();
            stmt = connection.prepareStatement("SELECT * FROM matriculas WHERE alunos_id = " + id);
            rs = stmt.executeQuery();
            
            while(rs.next()) {
            	matricula = new Matricula();
            	matricula.setId(rs.getInt("id"));
        		matricula.setTurmas_id(rs.getInt("turmas_id"));
        		matricula.setAlunos_id(rs.getInt("alunos_id"));
        		matricula.setData_matricula(rs.getDate("data_matricula"));
        		matricula.setNota(rs.getInt("nota"));
        		
        		matriculas.add(matricula);
        	}     	
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar todas as matriculas por aluno id: " + e.getMessage());
        } finally {
            this.closeConnection();
        }

        return matriculas;
	}
    
}


