package lesson2e8Tests;

import io.restassured.RestAssured;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Headers;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TestsAPI {

    @BeforeAll
    public static void walkBaseUri() {
        RestAssured.baseURI = "https://postman-echo.com";
    }

    @AfterAll
    public static void tearDown() {
        RestAssured.reset();
    }

    @Test
    @DisplayName("тест на добавление текста")
    public void whenCreateRawText_thenStatus200() {
        String z = "ZSP";
        given().log().body()
                .contentType("text/plain").body(z)
                .when().post("/post")
                .then().log().body()
                .body("data", equalTo(z))
                .and().statusCode(HttpStatus.SC_OK);
    }

    @Test
    @DisplayName("тест метода get")
    public void whenGetRequest_thenStatus200() {
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("foo1", "bar1");
        map1.put("foo2", "bar2");
        given().log().body()
                .params(map1)
                .when().get("/get")
                .then().log().body()
                .statusCode(HttpStatus.SC_OK)
                .and().body("headers.accept", equalTo("*/*"))
                .and().body("args.foo1", equalTo(map1.get("foo1")))
                .and().body("args.foo2", equalTo(map1.get("foo2")));
    }

    @Test
    @DisplayName("тест метода редактирования - put")
    public void whenPutText_thenStatus200() {
        String b = "Privet!";
        given().log().body()
                .contentType("text/plain").body(b)
                .when().put("/put")
                .then().log().body()
                .body("data", equalTo(b))
                .and().statusCode(HttpStatus.SC_OK);
    }

    @Test
    @DisplayName("тестирование patch")
    public void whenPatchPull_thenStatus200() {
        given().log().all()
                .contentType("application/json").body("{\n" +
                        "    \"simbols\": \"This is expected to be sent back as part of response body.\"\n" +
                        "}")
                .when().patch("/patch")
                .then().log().all()
                .body("data.simbols", equalTo("This is expected to be sent back as part of response body."))
                .and().statusCode(HttpStatus.SC_OK);
    }

    @Test
    @DisplayName("тест метода Delete")
    public void whenDelete_thenStatusOK() {
        given()
                .contentType("text/plane").body("Account deleted")
                .when().delete("/delete")
                .then()
                .body("data", equalTo("Account deleted"))
                .and().statusCode(HttpStatus.SC_OK);
    }

    @Test
    @DisplayName("тест метода POST Form Data")
    public void whenPostFormEncode_thenStatusOK() {
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("foo1", "bar1");
        map1.put("foo2", "bar2");
        given().log().all()
                .contentType("application/x-www-form-urlencoded; charset=UTF-8")
                .formParams(map1)
                .when().post("/post")
                .then().log().all()
                .body("form", equalTo(map1))
                .and().statusCode(HttpStatus.SC_OK);
    }
}
