import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;

public class OlaMundo {

	public static void main(String[] args) {
		//requisisção do tipo get | vai me dar uma responsta (response)
		//objeto response 
		Response request = RestAssured.request(Method.GET, "https://restapi.wcaquino.me/ola");
		System.out.println(request.getBody().asString());
		
	}

}
