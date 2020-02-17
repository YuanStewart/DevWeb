/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.FabricaDeConexoes;
import Model.Administrador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author yuan
 */
public class AdministradorDAO {
    Connection connection = null;
    PreparedStatement stmt = null;
    
    private void closeConnection() throws SQLException {
            this.connection.close();
    }
    
    public void adicionaAdm(Administrador admin) throws SQLException{
    	try {
			connection = new FabricaDeConexoes().getConnection();
			stmt = connection.prepareStatement("INSERT INTO administrador (id, login, nome, senha) VALUES (?, ?, ?, ?)");
			stmt.setInt(1, admin.getId());
			stmt.setString(2, admin.getLogin());
                        stmt.setString(3, admin.getNome());
			stmt.setString(4, admin.getSenha());
			stmt.execute();
		} catch(SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao registrar administrador DAO: " + e.getMessage());
		} finally {
			this.closeConnection();
		}};
    
    public void deletaAdm(int id) throws SQLException {
     try {
            connection = new FabricaDeConexoes().getConnection();
            stmt = connection.prepareStatement("DELETE FROM administrador WHERE id = " + id);
            stmt.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error ao deletar administrador: " + e.getMessage());
        } finally {
            this.closeConnection();
        }};
    
    public void atualizaAdm(Administrador admin) throws SQLException {
      try {
            connection = new FabricaDeConexoes().getConnection();
            stmt = connection.prepareStatement("UPDATE administrador SET login = ?,nome = ?, senha = ? WHERE id = ?");
			stmt.setString(1, admin.getLogin());
                        stmt.setString(2, admin.getNome());
			stmt.setString(3, admin.getSenha());
                        stmt.setInt(4, admin.getId());

			stmt.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar administrador DAO: " + e.getMessage());
        } finally {
            this.closeConnection();
        }};
}
