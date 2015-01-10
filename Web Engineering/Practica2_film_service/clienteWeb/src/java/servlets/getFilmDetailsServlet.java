/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import dao.ComentarioFacade;
import entity.Comentario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import services.Film;
import services.FilmService_Service;

/**
 *
 * @author Antonio
 */
@WebServlet(name = "getFilmDetailsServlet", urlPatterns = {"/getFilmDetailsServlet"})
public class getFilmDetailsServlet extends HttpServlet {
    @EJB
    private ComentarioFacade comentarioFacade;
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/peliculasServer-war/filmService.wsdl")
    private FilmService_Service service;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        short filmId = Short.parseShort(request.getParameter("filmId"));
        
        Film peli = buscarPeliculaById(filmId);
        request.setAttribute("peli", peli);
        List<Comentario> listaComentarios = comentarioFacade.findComentariosByFilmId(filmId);
        request.setAttribute("comentarios", listaComentarios);
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/filmDetails.jsp");
        rd.forward(request, response);
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
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

    private Film buscarPeliculaById(short id) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        services.FilmService port = service.getFilmServicePort();
        return port.buscarPeliculaById(id);
    }
    
}
