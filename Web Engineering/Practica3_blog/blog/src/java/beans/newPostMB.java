/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entity.Post;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import services.PostClientService;

/**
 *
 * @author Antonio
 */
@ManagedBean
@RequestScoped
public class newPostMB {

    private Post newPost;

    public Post getNewPost() {
        return newPost;
    }

    public void setNewPost(Post newPost) {
        this.newPost = newPost;
    }
    /**
     * Creates a new instance of newPostMB
     */
    public newPostMB() {
    }
    
    @PostConstruct
    public void prepareNewPost(){
    
        newPost = new Post();
    }
    
    public String createNewPost(){
    
        //el objeto newPost se rellena con los setter a partir de los datos de la JSF
        
        newPost.setDate(java.util.Calendar.getInstance().getTime());//fijamos lahora actual
        PostClientService pcs = new PostClientService();
        pcs.create_JSON(newPost);
            
        FacesMessage mensaje = new FacesMessage(FacesMessage.SEVERITY_INFO, "Nueva entrada añadida", "Creación exitosa");
        FacesContext contexto = FacesContext.getCurrentInstance();
        contexto.addMessage(null, mensaje);
        
        newPost = new Post();
       
        pcs.close();
        
               
        return "faces/index.xhtml";
    }
    
}
