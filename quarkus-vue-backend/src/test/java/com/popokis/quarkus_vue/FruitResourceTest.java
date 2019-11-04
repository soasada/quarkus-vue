package com.popokis.quarkus_vue;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class FruitResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/api/v1/fruits")
          .then()
             .statusCode(200)
             .body(is("hello from Quarkus-Vue!\nNumber Of processors: " + Runtime.getRuntime().availableProcessors() + "\nMemory (bytes): " + Runtime.getRuntime().maxMemory()));
    }

}