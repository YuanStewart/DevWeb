package Controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Model.Aluno;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DAO.AlunoDAO;
import java.sql.SQLException;

/**
 *
 * @author yuan
 */
public class ServletAluno extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletAluno</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletAluno at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    public void insereAluno(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		String cpf = request.getParameter("cpf").replaceAll("[.-]", "");
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String celular = request.getParameter("celular").replaceAll("[.-]", "");
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		String endereco = request.getParameter("endereco");
		String cidade  = request.getParameter("cidade");
		String bairro = request.getParameter("bairro");
		String cep = request.getParameter("cep").replaceAll("[.-]", "");
		Boolean aprovado = false;
                
                Aluno aluno = new Aluno(cpf, nome, email, celular, login, senha, endereco, cidade, bairro, cep, aprovado);
		
		AlunoDAO AlunoDAO = new AlunoDAO();
		
		AlunoDAO.adicionaAlunoDAO(aluno);
		
		
	}
    
    public void deletaAluno(HttpServletRequest request, HttpServletResponse response) throws SQLException  {
		int id = Integer.parseInt(request.getParameter("id"));
                AlunoDAO AlunoDAO = new AlunoDAO();
		AlunoDAO.deletaAlunoDAO(id);
	}

    public void atualizaAluno(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		int id = Integer.parseInt(request.getParameter("id"));
		String cpf = request.getParameter("cpf").replaceAll("[.-]", "");
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String celular = request.getParameter("celular").replaceAll("[.-]", "");
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		String endereco = request.getParameter("endereco");
		String cidade = request.getParameter("cidade");
		String bairro = request.getParameter("bairro");
		String cep = request.getParameter("cep").replaceAll("[.-]", "");
                Boolean aprovado = false;
		
		Aluno aluno = new Aluno(cpf, nome, email, celular, login, senha, endereco, cidade, bairro, cep, aprovado);
                AlunoDAO AlunoDAO = new AlunoDAO();
		
	
		AlunoDAO.atualizaAlunoDAO(aluno);
		
		
}
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>


}