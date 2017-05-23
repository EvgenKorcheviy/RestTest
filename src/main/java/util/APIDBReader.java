package util;

import entity.WebService;

import java.io.FileWriter;
import java.io.IOException;

import static io.restassured.RestAssured.given;

/**
 * Created by Evgen on 22.05.2017.
 */
public class APIDBReader {
    public static String getJson() {
        FileWriter fileWriter = null;
        String json = null;
        try {
            fileWriter = new FileWriter("src/main/resources/json.json");

        json = given().get(WebService.BASE_URL + "/db").asString();
        fileWriter.write(json);
        fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return json;
    }
}
