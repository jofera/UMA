/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Gonzalo
 */
@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> {
    @PersistenceContext(unitName = "clienteWebPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }
    
    public Usuario findByNameUsuario(String name){
        return (Usuario)em.createNamedQuery("Usuario.findByNombre").setParameter("nombre", name).getSingleResult();
    }
    
    public boolean checkLogin(String email, String password){
        boolean success = false;
        List<Usuario> resultList = (List<Usuario>) em.createNamedQuery("Usuario.findByEmail").setParameter("email", email).getResultList();
        if(!resultList.isEmpty()){
            Usuario usuario = resultList.get(0);
            if(usuario != null)
                success = usuario.getPassword().equals(password);
        }
        return success;
    }
}
