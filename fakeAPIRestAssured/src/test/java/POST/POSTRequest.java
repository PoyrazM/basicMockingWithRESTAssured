package POST;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class POSTRequest {


    @Test
    public void postRequestCharacters(){

        JSONObject request = new JSONObject();

        request.put("title","Star Wars");
        request.put("character","Darth Maul");
        request.put("class","Sith");

        baseURI = "http://localhost:3000";

        given().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                header("Content-Type","application/json").
                body(request.toJSONString()).
        when().
                post("/starwarscharacters").
        then().
                statusCode(201).
                log().all();
        System.out.println("********************");
    }

    @Test
    public void postRequestJobs(){

        JSONObject request = new JSONObject();

        request.put("mission" , "Destroy the all universe");

        baseURI = "http://localhost:3000";

        given().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                header("Content-Type","application/json").
                body(request.toJSONString()).
        when().
                post("/jobs").
        then().
                statusCode(201).
                log().all();
        System.out.println("********************");
    }
}
