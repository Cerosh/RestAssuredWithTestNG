package Org.Testing.TestUtilities;

import io.restassured.response.Response;

public class JsonResParsing {

	public static String JsonResDataParsing(Response resp, String jsonpath) {
		String JsonParseKeyValue = resp.jsonPath().get(jsonpath).toString();
		return JsonParseKeyValue;
	}

}
