import entity.Comment;
import entity.Post;
import entity.Profile;
import entity.WebService;
import io.restassured.RestAssured;
import org.junit.BeforeClass;
import org.junit.Test;
import util.APIService;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by Evgen on 22.05.2017.
 */
public class FunctionalTest {
    public static final String BASE_HOST = "http://localhost:3000/";

    @BeforeClass
    public static void setup() {
        RestAssured.baseURI = BASE_HOST;
    }

    @Test
    public void basicGetProfileTest() {
        given().when().get("/profile").then().statusCode(200);
    }

    @Test
    public void basicPostProfileTest() {
        Profile profile = new Profile("Evgen");
        given().contentType("application/json").body(profile).when().post("/profile").then().statusCode(201);
    }

    @Test
    public void basicGetPostsTest() {
        given().when().get("/posts").then().statusCode(200);
    }

    @Test
    public void basicPostPostTest() {
        Post post = new Post("2", "Test post", "evgen");
        given().contentType("application/json").body(post).when().post("/posts").then().statusCode(201);
    }

    @Test
    public void basicGetCommentTest() {
        given().when().get("/comments").then().statusCode(200);
    }

    @Test
    public void basicPostCommentTest() {
        Comment comment = new Comment("1", "Hello", "1" );
        given().contentType("application/json").body(comment).when().post("/comments").then().statusCode(201);
    }


    @Test
    public void getProfileTest() {
        given().when().get("/profile").then().body("name", equalTo("Evgen"));
    }

    @Test
    public void getPostTest() {
        given().when().get("/posts").then().body("id", equalTo("1"));
    }

    @Test
    public void getCommentTest() {
        given().pathParam("id", 1).when().get("/comments/{id}").then().body("body", equalTo("some comment"));
    }
}
