package entity;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Evgen on 22.05.2017.
 */
public class Comment {
    private String id;
    private String body;
    private String postId;


    public Comment() {
    }

    public Comment(String id, String body, String postId) {
        this.id = id;
        this.body = body;
        this.postId = postId;
    }


    public String getId() {
        return id;
    }
    public String getBody() {
        return body;
    }
    public String getPostId() {
        return postId;
    }

    @XmlElement(name = "id")
    public void setId(String id) {
        this.id = id;
    }
    @XmlElement(name = "body")
    public void setBody(String body) {
        this.body = body;
    }
    @XmlElement(name = "postId")
    public void setPost(String postId) {
        this.postId = postId;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id='" + id + '\'' +
                ", body='" + body + '\'' +
                ", postId='" + postId + '\'' +
                '}';
    }
}
