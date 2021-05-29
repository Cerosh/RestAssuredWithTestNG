package Org.Testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import Org.Testing.TestResponseValidation.ResponseValidate;
import Org.Testing.TestSteps.HttpMethods;
import Org.Testing.TestUtilities.PropertiesFileLoad;
import io.restassured.response.Response;

public class TC3 {

	public void TestCaseForDeletingUsers() throws IOException {
		Properties prop = PropertiesFileLoad
				.PropFileLoad("/Users/ceroshjacob/eclipse-workspace/RestAssuredFrameworkProject/Env.properties");
		HttpMethods http = new HttpMethods(prop);
		Response Res = http.DeleteData(TC2.JsonKeyValue, "QA_URI1");
		ResponseValidate ResObj = new ResponseValidate();
		ResObj.ResponseValidation(Res);
		ResObj.ResponseStatusCodeVal(200, Res);
	}
}
