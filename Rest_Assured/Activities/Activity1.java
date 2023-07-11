package activities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;


public class Activity1 {

    String rootURI = "https://petstore.swagger.io/v2/pet";
    @Test(priority = 1)
    public void postRequest(){

        String req = "{"
                + "\"id\": 12349,"
                + "\"name\": \"Naruto\","
                + " \"status\": \"alive\""
                + "}";

        Response response =
                given().contentType(ContentType.JSON) // Set headers
                        .body(req).when().post(rootURI); // Send POST request

        // Print response of POST request
        String body = response.getBody().asPrettyString();
        System.out.println(body);

        response.then().body("id",equalTo(12349));
        response.then().body("name",equalTo("Naruto"));
        response.then().body("status",equalTo("alive"));
        }

    @Test(priority = 2)
    public void getRequest(){

        Response response = given().contentType(ContentType.JSON).
                when().pathParam("petId","12349").get(rootURI+"/{petId}");

        response.then().body("id",equalTo(12349));
        response.then().body("name",equalTo("Naruto"));
        response.then().body("status",equalTo("alive"));
    }

    @Test(priority = 3)
    public void deleteRequest(){
        Response response=given().contentType(ContentType.JSON).
                when().pathParam("petId","12349").delete(rootURI+"/{petId}");

        response.then().body("code",equalTo(200));
        response.then().body("message",equalTo("12349"));
    }

}
