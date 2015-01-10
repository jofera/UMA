package entity;

import entity.Post;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-12-21T15:21:10")
@StaticMetamodel(Comment.class)
public class Comment_ { 

    public static volatile SingularAttribute<Comment, String> nick;
    public static volatile SingularAttribute<Comment, Date> date;
    public static volatile SingularAttribute<Comment, Post> postIdpost;
    public static volatile SingularAttribute<Comment, Integer> idcomment;
    public static volatile SingularAttribute<Comment, String> comment;

}