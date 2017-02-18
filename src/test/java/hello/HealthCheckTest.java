package hello;

import static spark.Spark.*;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import io.restassured.http.ContentType;

public class HealthCheckTest {

	@Before
	public void setUp() throws Exception {
		port(8080);
		HealthCheck hc = new HealthCheck();
		hc.healthCheck();
	}

	@Test
	public void testMain() {
		given().
			accept(ContentType.JSON).

		when().
			get("healthcheck").

		then().
			body(
				"description", equalTo("spark app is running healthy"),
				"statusCode", equalTo(200));

	}

	@After
	public void tearDown() throws Exception {
		stop();
	}

}
