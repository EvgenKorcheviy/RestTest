package entity;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Evgen on 22.05.2017.
 */
public class Post {
    private String id;
    private String title;
    private String author;


    public Post(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public Post() {
    }

    public String getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }

    @XmlElement(name = "id")
    public void setId(String id) {
        this.id = id;
    }
    @XmlElement(name = "title")
    public void setTitle(String title) {
        this.title = title;
    }
    @XmlElement(name = "author")
    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author=" + author +
                '}';
    }
}
