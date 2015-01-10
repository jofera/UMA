/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.FilmFacade;
import entity.Film;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Gonzalo
 */
@WebService(serviceName = "filmService")
public class filmService {
    @EJB
    private FilmFacade ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "listarPeliculas")
    public List<Film> listarPeliculas() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "buscarPeliculaById")
    public Film buscarPeliculaById(@WebParam(name = "id") short id) {
        return ejbRef.buscarPeliculaById(id);
    }
    
}
