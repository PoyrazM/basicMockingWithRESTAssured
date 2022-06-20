package PUT;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class PUTRequest {

    @Test
    public void putRequestCharacters() {
        JSONObject request = new JSONObject();

        request.put("title", "Star Wars");
        request.put("character", "Galen Marek");
        request.put("class", "Sith");

        baseURI = "http://localhost:3000";

        given().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                header("Content-Type", "application/json").
                body(request.toJSONString()).
        when().
                put("/starwarscharacters/6").
        then().
                statusCode(200).
                log().all();
        System.out.println("********************");
    }

    @Test
    public void putRequestJobs(){

        JSONObject request = new JSONObject();

        request.put("mission" , "DESTROY THEM ALL!!!!");

        baseURI = "http://localhost:3000";

        given().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                header("Content-Type","application/json").
                body(request.toJSONString()).
        when().
                put("/jobs/6").
        then().
                statusCode(200).
                log().all();
        System.out.println("********************");
    }
}