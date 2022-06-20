package DELETE;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;

public class DELETERequest {

    @Test
    public void deleteRequestCharacters(){

        baseURI = "http://localhost:3000";

        when().
                delete("/starwarscharacters/6").
        then().
                statusCode(200);
        System.out.println("********************");
    }

    @Test
    public void deleteRequestJobs(){

        baseURI = "http://localhost:3000";

        when().
                delete("/jobs/6").
                then().
                statusCode(200);
    }
}
