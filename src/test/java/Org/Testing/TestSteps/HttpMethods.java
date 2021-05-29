package Org.Testing.TestSteps;

import java.util.Properties;

import Org.Testing.Payloads.PojoBodyData;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class HttpMethods {
	Properties prop;

	public HttpMethods(Properties prop) {
		this.prop = prop;
	}

	public Response GetRequest(String URI) {
		Response Res = given().contentType(ContentType.JSON).when().get(prop.getProperty(URI));
		return Res;
	}

	public Response GetSpecificRequest(String id, String URI) {
		String FinalUri = (String) prop.getProperty(URI) + "/" + id;
		Response Res = given().contentType(ContentType.JSON).when().get(FinalUri);
		return Res;
	}

	public Response PostRequest(PojoBodyData Body, String URI) {
		Response Res = given().contentType(ContentType.JSON).body(Body).when().post(prop.getProperty(URI));
		return Res;

	}

	public Response DeleteData(String id, String URI) {
		String FinalUri = (String) prop.getProperty(URI) + "/" + id;
		Response Res = given().contentType(ContentType.JSON).when().delete(FinalUri);
		return Res;
	}

	public Response PutRequest(PojoBodyData Body, String URI, String id) {
		String FinalURI = (String) prop.getProperty(URI) + "/" + id;
		Response Res = given().contentType(ContentType.JSON).body(Body).when().put(FinalURI);
		return Res;
	}
}
