import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class demoApi {
	@Test

	public void postRequestAutomation() {
		RestAssured.baseURI = "https://reqres.in/api/users";

		RestAssured.given().body("{\r\n"
				+ "    \"name\": \"monu\",\r\n"
				+ "    \"job\": \"QA\"\r\n"
				+ "}").post().then().log().all().assertThat()
				.statusCode(201);

	}

}
