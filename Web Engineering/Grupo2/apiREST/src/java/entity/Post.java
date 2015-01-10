/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Antonio
 */
@Entity
@Table(name = "post")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Post.findAll", query = "SELECT p FROM Post p ORDER BY p.date ASC"),
    @NamedQuery(name = "Post.findByIdpost", query = "SELECT p FROM Post p WHERE p.idpost = :idpost"),
    @NamedQuery(name = "Post.findByPost", query = "SELECT p FROM Post p WHERE p.post = :post"),
    @NamedQuery(name = "Post.findByCity", query = "SELECT p FROM Post p WHERE p.city = :city"),
    @NamedQuery(name = "Post.findByCountry", query = "SELECT p FROM Post p WHERE p.country = :country"),
    @NamedQuery(name = "Post.findByNick", query = "SELECT p FROM Post p WHERE p.nick = :nick"),
    @NamedQuery(name = "Post.findByDate", query = "SELECT p FROM Post p WHERE p.date = :date"),
    @NamedQuery(name = "Post.findByRegion", query = "SELECT p FROM Post p WHERE p.region = :region")})
public class Post implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpost")
    private Integer idpost;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "post")
    private String post;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "city")
    private String city;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "country")
    private String country;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nick")
    private String nick;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "region")
    private String region;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "postIdpost")
    private Collection<Comment> commentCollection;

    public Post() {
    }

    public Post(Integer idpost) {
        this.idpost = idpost;
    }

    public Post(Integer idpost, String post, String city, String country, String nick, Date date, String region) {
        this.idpost = idpost;
        this.post = post;
        this.city = city;
        this.country = country;
        this.nick = nick;
        this.date = date;
        this.region = region;
    }

    public Integer getIdpost() {
        return idpost;
    }

    public void setIdpost(Integer idpost) {
        this.idpost = idpost;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @XmlTransient
    public Collection<Comment> getCommentCollection() {
        return commentCollection;
    }

    public void setCommentCollection(Collection<Comment> commentCollection) {
        this.commentCollection = commentCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpost != null ? idpost.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Post)) {
            return false;
        }
        Post other = (Post) object;
        if ((this.idpost == null && other.idpost != null) || (this.idpost != null && !this.idpost.equals(other.idpost))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Post[ idpost=" + idpost + " ]";
    }
    
}
