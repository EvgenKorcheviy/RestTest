package util;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import entity.Comment;
import entity.Post;
import entity.Profile;
import entity.WebService;

import java.io.File;
import java.io.IOException;

import static io.restassured.RestAssured.given;


/**
 * Created by Evgen on 22.05.2017.
 */
public class APIService {

    public static WebService getWebServiceData() {
        APIDBReader.getJson();
        ObjectMapper mapper = new ObjectMapper();
        WebService webService = null;
        try {
            webService = mapper.readValue(new File("src/main/resources/json.json"), WebService.class);
            String jsonInString = APIDBReader.getJson();
            System.out.println(webService);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return webService;
    }

    public static Profile getProfile(){return getWebServiceData().getProfile();};
    public static void postProfile(Profile profile){given().contentType("application/json")
            .body(profile).when().post(WebService.BASE_URL + "/posts");};
    public static void putProfile(Profile profile){};
    public static void pastProfile(Profile profile){};

    public static Comment getComment(){return null;};
    public static void postComment(Comment comment){};
    public static void putComment(Comment comment){};
    public static void pastComment(Comment comment){};

    public static Post getPost(){return null;};
    public static void postPost(Post post){};
    public static void putPost(Post post){};
    public static void pastPost(Post post){};



}
