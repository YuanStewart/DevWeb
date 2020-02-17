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
    
}

    
