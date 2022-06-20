package PATCH;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;


public class PATCHRequest {

    @Test
    public void patchRequestCharacters(){

        JSONObject request = new JSONObject();

        request.put("character","Palpatine");

        baseURI = "http://localhost:3000";

        given().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                header("Content-Type","application/json").
                body(request.toJSONString()).
        when().
                patch("/starwarscharacters/5").
        then().
                statusCode(200).
                log().all();
        System.out.println("********************");
    }

    @Test
    public void patchRequestJobs(){

        JSONObject request = new JSONObject();

        request.put("mission" , "DESTROY THEM ALL!!!!");

        baseURI = "http://localhost:3000";

        given().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                header("Content-Type","application/json").
                body(request.toJSONString()).
        when().
                patch("/jobs/5").
        then().
                statusCode(200).
                log().all();
        System.out.println("********************");
    }
}
