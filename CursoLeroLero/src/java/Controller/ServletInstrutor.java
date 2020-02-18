package Controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import DAO.InstrutorDAO;
import Model.Instrutor;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author yuan
 */
public class ServletInstrutor extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        // Cria um novo instrutor com os dados dos Form
        Instrutor instrutor = new Instrutor(
                request.getParameter("nome"),
                request.getParameter("email"),
                Integer.parseInt(request.getParameter("valor_hora")),
                request.getParameter("login"), 
                request.getParameter("senha"),
                request.getParameter("experiencia"));
        
        // Cria um objeto de acesso ao BD
        InstrutorDAO instrutorDAO = new InstrutorDAO();
        try {
            // Chama método para cadastrar instrutor
            instrutorDAO.inserirInstrutor(instrutor);
            try {
            instrutorDAO.closeConnection();
            request.getRequestDispatcher("/listaUsuariosJSP.jsp").forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ServletInstrutor.class.getName()).log(Level.SEVERE, null, ex);
        }
        } catch (SQLException ex) {
            Logger.getLogger(ServletInstrutor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

}
