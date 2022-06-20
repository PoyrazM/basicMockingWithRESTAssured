package GET;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class GETRequest {

    @Test
    public void getRequestCharacters(){

        baseURI = "http://localhost:3000";

        given().
                param("character","Anakin Skywalker").
                get("/starwarscharacters").
        then().
                statusCode(200).
                log().all();
    }

    @Test
    public void getRequestJobs(){
        System.out.println("********************");

        baseURI = "http://localhost:3000";

        given().
                param("mission","Destroy the all universe").
                get("/jobs").
        then().
                statusCode(200).
                log().all();
        System.out.println("********************");
    }
}
