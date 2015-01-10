/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entity.Post;
import flickr.photoservice.flickrresponse.ObjectFactory;
import flickr.photoservice.flickrresponse.Rsp;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import services.FlickrClient;

/**
 *
 * @author Antonio
 */
@ManagedBean
@RequestScoped
public class postDetailsMB {

    Post selectedPost;

    /**
     * Creates a new instance of postDetailsMB
     */
    public postDetailsMB() {
    }

    public Post getSelectedPost() {
        return selectedPost;
    }

    public void setSelectedPost(Post selectedPost) {
        this.selectedPost = selectedPost;
    }

    public String load(Post p) {
        this.selectedPost = p;
        return "faces/postDetails.xhtml";

    }

    public void photo() {
        String farm, serverPhoto, idPhoto, sizePhoto;
        farm = serverPhoto = idPhoto = sizePhoto = null;
        //TODO coger strings de la respuesta
        String photoUrl = "http://farm" + farm + ".staticflickr.com/" + serverPhoto + "/" + idPhoto + "_SECRET" + "_" + sizePhoto + ".jpg";
        FlickrClient fc = new FlickrClient();
        
    }

    public String volver() {

        return "/faces/index.xhtml";
    }
}
