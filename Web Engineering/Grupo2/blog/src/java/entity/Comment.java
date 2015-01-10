/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Antonio
 */
@Entity
@Table(name = "comment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Comment.findAll", query = "SELECT c FROM Comment c"),
    @NamedQuery(name = "Comment.findByIdcomment", query = "SELECT c FROM Comment c WHERE c.idcomment = :idcomment"),
    @NamedQuery(name = "Comment.findByComment", query = "SELECT c FROM Comment c WHERE c.comment = :comment"),
    @NamedQuery(name = "Comment.findByNick", query = "SELECT c FROM Comment c WHERE c.nick = :nick"),
    @NamedQuery(name = "Comment.findByDate", query = "SELECT c FROM Comment c WHERE c.date = :date")})
public class Comment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcomment")
    private Integer idcomment;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "comment")
    private String comment;
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
    @JoinColumn(name = "post_idpost", referencedColumnName = "idpost")
    @ManyToOne(optional = false)
    private Post postIdpost;

    public Comment() {
    }

    public Comment(Integer idcomment) {
        this.idcomment = idcomment;
    }

    public Comment(Integer idcomment, String comment, String nick, Date date) {
        this.idcomment = idcomment;
        this.comment = comment;
        this.nick = nick;
        this.date = date;
    }

    public Integer getIdcomment() {
        return idcomment;
    }

    public void setIdcomment(Integer idcomment) {
        this.idcomment = idcomment;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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

    public Post getPostIdpost() {
        return postIdpost;
    }

    public void setPostIdpost(Post postIdpost) {
        this.postIdpost = postIdpost;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcomment != null ? idcomment.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Comment)) {
            return false;
        }
        Comment other = (Comment) object;
        if ((this.idcomment == null && other.idcomment != null) || (this.idcomment != null && !this.idcomment.equals(other.idcomment))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Comment[ idcomment=" + idcomment + " ]";
    }
    
}
