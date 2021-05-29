package Org.Testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import Org.Testing.TestUtilities.JsonResParsing;
import Org.Testing.TestUtilities.PropertiesFileLoad;
import io.restassured.response.Response;
import Org.Testing.TestSteps.HttpMethods;
import Org.Testing.TestResponseValidation.ResponseValidate;

public class TC1 {

	public void TestCaseForUsers() throws IOException {
		Properties prop = PropertiesFileLoad
				.PropFileLoad("/Users/ceroshjacob/eclipse-workspace/RestAssuredFrameworkProject/Env.properties");
		HttpMethods http = new HttpMethods(prop);
		System.err.println(TC2.JsonKeyValue);
		Response Res = http.GetSpecificRequest(TC2.JsonKeyValue, "QA_URI1");
		ResponseValidate ResObj = new ResponseValidate();
		ResObj.ResponseValidation(Res);
		ResObj.ResponseStatusCodeVal(200, Res);
		String ParseData = JsonResParsing.JsonResDataParsing(Res, "firstName");
		ResObj.ResponseDataValid("Rashmitha", ParseData);

	}
}
