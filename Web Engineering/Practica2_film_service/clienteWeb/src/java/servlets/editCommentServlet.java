/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import dao.ComentarioFacade;
import entity.Comentario;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Marcos
 */
@WebServlet(name = "editCommentServlet", urlPatterns = {"/editCommentServlet"})
public class editCommentServlet extends HttpServlet {
    @EJB
    private ComentarioFacade comentarioFacade;

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
         Integer comentarioId= Integer.parseInt(request.getParameter("comentarioId"));
        
        Comentario comentario=comentarioFacade.find(comentarioId);
        request.setAttribute("coment", comentario);
        
        RequestDispatcher rd;
        rd=getServletContext().getRequestDispatcher("/editComment.jsp");
        
        
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
        processRequest(request,response);
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
        String idComent=(String) request.getParameter("idComent");
        String descripcion=(String)request.getParameter("descripcion");
        
        Integer id;
        id=Integer.parseInt(idComent);
        Comentario coment=comentarioFacade.find(id);
        
        if(coment!=null) {
            coment.setComentario(descripcion);
            comentarioFacade.edit(coment);
            int filmId = coment.getIdpelicula();
            String direccion = "/getFilmDetailsServlet";
            String ruta = direccion.concat("?filmId=" + filmId);
            RequestDispatcher rd;
            rd = this.getServletContext().getRequestDispatcher(ruta);
            rd.forward(request, response);
        }    
                
            
            
        
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
