package entity;

import entity.Comment;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-12-21T15:21:10")
@StaticMetamodel(Post.class)
public class Post_ { 

    public static volatile SingularAttribute<Post, String> nick;
    public static volatile SingularAttribute<Post, Date> date;
    public static volatile SingularAttribute<Post, String> country;
    public static volatile SingularAttribute<Post, String> post;
    public static volatile SingularAttribute<Post, String> city;
    public static volatile CollectionAttribute<Post, Comment> commentCollection;
    public static volatile SingularAttribute<Post, Integer> idpost;
    public static volatile SingularAttribute<Post, String> region;

}