package activities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.*;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class Activity2 {

    String rootURI =" https://petstore.swagger.io/v2/user";

    @Test(priority = 1)
    public void postRequest() throws Exception {

        FileInputStream fs = new FileInputStream("src/test/java/activities/userInfo.json");
        String req = new String(fs.readAllBytes());

        Response response = given().contentType(ContentType.JSON).body(req).when().post(rootURI);

        String body = response.getBody().asPrettyString();
        System.out.println(body);

        response.then().body("code",equalTo(200));
        response.then().body("message",equalTo("1278"));


    }

    @Test(priority = 2)
    public void getRequest(){
        File os = new File("src/test/java/activities/responseOutput.json");
        Response response=given().contentType(ContentType.JSON).when().pathParam("username","Sasuke").
        get(rootURI+"/{username}");

        String rbody = response.getBody().asPrettyString();
        System.out.println(rbody);

        try{
            os.createNewFile();
            FileWriter fw = new FileWriter(os.getPath());
            fw.write(rbody);
            fw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        response.then().body("username",equalTo("Sasuke"));

    }

    @Test(priority = 3)
    public void deleteRequest(){

        Response response = given().contentType(ContentType.JSON).when().pathParam("username","Sasuke").
                delete(rootURI+"/{username}");

        response.then().body("code",equalTo(200));
        response.then().body("message",equalTo("Sasuke"));



    }



}
