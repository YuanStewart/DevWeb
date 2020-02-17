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
import java.sql.SQLException;
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

    public void adicionaAluno(Aluno aluno) throws SQLException {
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
        
    
    
    public void deletaAluno(int id) throws SQLException {
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

    
    public void atualizaAluno(Aluno aluno) throws SQLException {
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
  }
    

