package entity;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Evgen on 22.05.2017.
 */
//@XmlRootElement
public class WebService {

    public static final String BASE_URL = "http://localhost:3000";

    private List<Post> posts;
    private List<Comment> comments;
    private Profile profile;

    public WebService() {
    }
    public WebService(List<Post> posts, List<Comment> comments, Profile profile) {
        this.posts = posts;
        this.comments = comments;
        this.profile = profile;
    }


    public List<Post> getPosts() {
        return posts;
    }
    public List<Comment> getComments() {
        return comments;
    }
    public Profile getProfile() {
        return profile;
    }

    @XmlElement(name = "posts")
    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
    @XmlElement(name = "comments")
    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
    @XmlElement(name = "profile")
    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        return "WebService{" +
                "posts=" + posts +
                ", comments=" + comments +
                ", profile=" + profile +
                '}';
    }
}
