package in.co.gorest.gorestinfo;

import in.co.gorest.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class GoRestGetTest extends TestBase {

    @Test
    public void getAllUsers(){
        Response response = given()
                .when()
                .get();
        response.then().statusCode(200);
        response.prettyPrint();

        List<Integer> records = response.then().extract().path("");
        System.out.println("1.records    = "+records.size());

        String name = response.then().extract().path("[3].name");
        System.out.println("2.name       = "+name);

        String email = response.then().extract().path("[1].email");
        System.out.println("3.email      = "+email);

        List<?> status = response.then().extract().path("findAll{it.status=='active'}.id");
        System.out.println("4.status     = "+status);

        String gender1 = response.then().extract().path("[4].gender");
        System.out.println("5.gender     = "+gender1);

        String gender2 = response.then().extract().path("[5].gender");
        System.out.println("6.gender     = "+gender2);
    }
}
