/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import dao.ComentarioFacade;
import dao.UsuarioFacade;
import entity.Comentario;
import entity.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Facundo 
 */
@WebServlet(name = "createCommentServlet", urlPatterns = {"/createCommentServlet"})
public class createCommentServlet extends HttpServlet {
    @EJB
    private ComentarioFacade comentarioFacade;
    @EJB
    private UsuarioFacade usuarioFacade;
    
    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");        
        // coger el id del usuario a través de la sesión
        HttpSession session = request.getSession();
        String conectado = (String)session.getAttribute("logedUser");
        
        Usuario usuario = usuarioFacade.findByNameUsuario(conectado);
        short filmId = (Short)session.getAttribute("filmCommentId");
        String comentario = request.getParameter("comentario");
       //tratar la fecha 
        Date fecha = new Date();
        
        Comentario nuevo = new Comentario();
        nuevo.setComentario(comentario);
        nuevo.setFecha(fecha);
        nuevo.setIdcomentario(comentarioFacade.findAll().size());
        nuevo.setIdpelicula(filmId);
        nuevo.setUsuarioIdusuario(usuario);
        System.out.println("filmId:  " + filmId + ", comentario = " + comentario + " , usuario : " + usuario.getNombre());  
        comentarioFacade.create(nuevo);
        RequestDispatcher rd;
        rd=getServletContext().getRequestDispatcher("/createComment.jsp");
        
        
        rd.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
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
