package in.co.gorest.gorestinfo;

import in.co.gorest.model.GoRestPojo;
import in.co.gorest.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GoRestDeleteTest extends TestBase {

    @Test
    public void updateUser(){

        Response response = given()
                .header("Content-Type","application/json")
                .header("Authorization","Bearer c426452f777927f6e49219f45652a5fd08178e3f873af217a5b982a6fdd15dac")
                .pathParam("id",4154)
                .when()
                .delete("/{id}");
        response.prettyPrint();
        response.then().statusCode(204);
    }
}
