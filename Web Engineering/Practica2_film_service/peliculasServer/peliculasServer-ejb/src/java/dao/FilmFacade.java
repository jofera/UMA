/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Film;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Antonio
 */
@Stateless
public class FilmFacade extends AbstractFacade<Film> {
    @PersistenceContext(unitName = "peliculasServer-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FilmFacade() {
        super(Film.class);
    }
    
    public Film buscarPeliculaById(short id){
        List<Film> res = em.createNamedQuery("Film.findByFilmId").setParameter("filmId", id).getResultList();
        
        return res.isEmpty() ? null : res.get(0);
    }
    
    public List<Film> listByRange(int start, int end){
        List<Film> res = em.createNamedQuery("Film.findByFilmId").setParameter("filmIdStart", start).setParameter("filmIdEnd", end).getResultList();
        
        return res;
    }
    
}
