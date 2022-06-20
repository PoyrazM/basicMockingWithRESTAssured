import DELETE.DELETERequest;
import GET.GETRequest;
import PATCH.PATCHRequest;
import POST.POSTRequest;
import PUT.PUTRequest;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BaseTest {

    private GETRequest getRequest;
    private POSTRequest postRequest;
    private PUTRequest putRequest;
    private PATCHRequest patchRequest;
    private DELETERequest deleteRequest;

    @Test(priority = 1)
    void getOperations(){
        System.out.println("GET REQUESTS STARTED");
        getRequest = new GETRequest();
        getRequest.getRequestCharacters();
        getRequest.getRequestJobs();
        Reporter.log("GET REQUESTS SUCCESSFULLY");
    }

    @Test(priority = 2)
    void postOperations(){
        System.out.println("POST REQUESTS STARTED");
        postRequest = new POSTRequest();
        postRequest.postRequestCharacters();
        postRequest.postRequestJobs();
        Reporter.log("POST REQUESTS SUCCESSFULLY");
    }

    @Test(priority = 3)
    void putOperations(){
        System.out.println("PUT REQUESTS STARTED");
        putRequest = new PUTRequest();
        putRequest.putRequestCharacters();
        putRequest.putRequestJobs();
        Reporter.log("PUT REQUESTS SUCCESSFULLY");
    }

    @Test(priority = 4)
    void patchOperations(){
        System.out.println("PATCH REQUESTS STARTED");
        patchRequest = new PATCHRequest();
        patchRequest.patchRequestCharacters();
        patchRequest.patchRequestJobs();
        Reporter.log("PATCH REQUESTS SUCCESSFULLY");
    }

    @Test(priority = 5)
    void deleteOperations(){
        System.out.println("DELETE REQUESTS STARTED");
        deleteRequest = new DELETERequest();
        deleteRequest.deleteRequestCharacters();
        deleteRequest.deleteRequestJobs();
        Reporter.log("DELETE REQUESTS SUCCESSFULLY");
    }
}
