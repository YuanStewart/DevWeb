/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.FabricaDeConexoes;
import Model.Aluno;
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
public class AlunoDAO {

    Connection connection = null;
    PreparedStatement stmt = null;

    private void closeConnection() throws SQLException {
        this.connection.close();
    }

    public void adicionaAlunoDAO(Aluno aluno) throws SQLException {
        try {
            connection = new FabricaDeConexoes().getConnection();
            stmt = connection.prepareStatement("INSERT INTO aluno (id, login, nome, senha, bairro, celular, cep, cidade, comentario, cpf, email, endereco) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            stmt.setInt(1, aluno.getId());
            stmt.setString(2, aluno.getLogin());
            stmt.setString(3, aluno.getNome());
            stmt.setString(4, aluno.getSenha());
            stmt.setString(5, aluno.getBairro());
            stmt.setString(6, aluno.getCelular());
            stmt.setString(7, aluno.getCep());
            stmt.setString(8, aluno.getCidade());
            stmt.setString(9, aluno.getComentario());
            stmt.setString(10, aluno.getCpf());
            stmt.setString(11, aluno.getEmail());
            stmt.setString(12, aluno.getEndereco());
            stmt.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao registrar aluno DAO: " + e.getMessage());
        } finally {
            this.closeConnection();
        }
    }

    ;
        
    
    
    public void deletaAlunoDAO(int id) throws SQLException {
        try {
            connection = new FabricaDeConexoes().getConnection();
            stmt = connection.prepareStatement("DELETE FROM aluno WHERE id = " + id);
            stmt.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error ao deletar aluno: " + e.getMessage());
        } finally {
            this.closeConnection();
        }
    }

    
    public void atualizaAlunoDAO(Aluno aluno) throws SQLException {
         try {
            connection = new FabricaDeConexoes().getConnection();
            stmt = connection.prepareStatement("UPDATE aluno SET login = ?,nome = ?, senha = ?, bairro = ?, celular = ?, cep =?, cidade = ?, comentario = ?, cpf = ?, email = ?, endereco =? WHERE id = ?");
            stmt.setString(1, aluno.getLogin());
            stmt.setString(2, aluno.getNome());
            stmt.setString(3, aluno.getSenha());
            stmt.setString(4, aluno.getBairro());
            stmt.setString(5, aluno.getCelular());
            stmt.setString(6, aluno.getCep());
            stmt.setString(7, aluno.getCidade());
            stmt.setString(8, aluno.getComentario());
            stmt.setString(9, aluno.getCpf());
            stmt.setString(10, aluno.getEmail());
            stmt.setString(11, aluno.getEndereco());
            stmt.setInt(12, aluno.getId());

            stmt.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar aluno DAO: " + e.getMessage());
        } finally {
            this.closeConnection();
        }};
    public Aluno listarAlunoPorIdDAO(int id) throws SQLException {
		
        ResultSet rs = null;
        Aluno aluno = null;
		
        try {
        	connection = new FabricaDeConexoes().getConnection();
        	stmt = connection.prepareStatement("SELECT * FROM alunos WHERE id =" + id);
        	rs = stmt.executeQuery();
        	if(rs.next()) {
        	aluno = new Aluno();
        	aluno.setId(rs.getInt("id"));
        	aluno.setCpf(rs.getString("cpf"));
        	aluno.setNome(rs.getString("nome"));
        	aluno.setEmail(rs.getString("email"));
        	aluno.setCelular(rs.getString("celular"));
                aluno.setLogin(rs.getString("login"));
                aluno.setSenha(rs.getString("senha"));
                aluno.setEndereco(rs.getString("endereco"));
                aluno.setCidade(rs.getString("cidade"));
                aluno.setBairro(rs.getString("bairro"));
                aluno.setCep(rs.getString("cep"));
                aluno.setComentario(rs.getString("comentario"));
                aluno.setAprovado(rs.getBoolean("aprovado"));
        	}
        } catch(SQLException e) {
        	JOptionPane.showMessageDialog(null, "Erro ao listar aluno pelo ID: " + e.getMessage());
        } finally {
            this.closeConnection();
        }
        
        return aluno;
	}
    public List<Aluno> listarTodosOsAlunosDAO() throws SQLException {
		
        ResultSet rs = null;
        List<Aluno> alunos = new ArrayList<>();
        Aluno aluno = null;
        
        try {
        	connection = new FabricaDeConexoes().getConnection();
            stmt = connection.prepareStatement("SELECT * FROM alunos");
            rs = stmt.executeQuery();
            
            while(rs.next()) {
            	aluno = new Aluno();
            	aluno.setId(rs.getInt("id"));
            	aluno.setCpf(rs.getString("cpf"));
            	aluno.setNome(rs.getString("nome"));
            	aluno.setEmail(rs.getString("email"));
            	aluno.setCelular(rs.getString("celular"));
            	aluno.setLogin(rs.getString("login"));
            	aluno.setSenha(rs.getString("senha"));
            	aluno.setEndereco(rs.getString("endereco"));
            	aluno.setCidade(rs.getString("cidade"));
            	aluno.setBairro(rs.getString("bairro"));
            	aluno.setCep(rs.getString("cep"));
            	aluno.setAprovado(rs.getBoolean("aprovado"));
            	alunos.add(aluno);
            }        	
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar todos os alunos: " + e.getMessage());
        } finally {
            this.closeConnection();
        }

        return alunos;
	}
    public void aprovarAlunoDAO(Aluno aluno) throws SQLException {
		
        
        try {
            connection = new FabricaDeConexoes().getConnection();
            stmt = connection.prepareStatement("UPDATE alunos SET aprovado = ? WHERE id = ?");
            stmt.setBoolean(1, aluno.getAprovado());
            stmt.setInt(2, aluno.getId());
            stmt.executeUpdate();
            
        } catch (SQLException e) {
        	JOptionPane.showMessageDialog(null, "Erro ao aprovar aluno DAO: " + e.getMessage());
        } finally {
            this.closeConnection();
        }
	}
  }
    

