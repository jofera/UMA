/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entity.Post;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

import services.PostClientService;

import javax.faces.bean.RequestScoped;

/**
 *
 * @author Antonio
 */
@ManagedBean(eager = true)
@RequestScoped
public class postListMB {

    /* Atributos API Flickr */
    String flickrKey = "76b006d6fcbb5e973254d93c7f39fa8c";
    String flickrSecret = "93257d029b4a4ded";

    /* Listas con los atributos de las fotos */
    List<Integer> serverList, idList, farmList = new ArrayList<>();
    List<Character> sizeList = new ArrayList<>();
    List<String> secretList = new ArrayList<>();

    List<Post> postsList = new ArrayList<Post>();

    public List<Post> getPostsList() {
        return postsList;
    }

    public void setPostsList(List<Post> postsList) {
        this.postsList = postsList;
    }

    /**
     * Creates a new instance of postListMB
     */
    public postListMB() {
    }

    @PostConstruct
    public void getAllPosts() {

        PostClientService pcs = new PostClientService();

        Response r = pcs.findAll_JSON(Response.class);
        GenericType<List<Post>> genericType = new GenericType<List<Post>>() {
        };
        postsList = r.readEntity(genericType);
    }

    public String create() {

        return "/faces/newPost.xhtml";
    }

    public void updatePage() {
        getAllPosts();
    }
}
