package Org.Testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import Org.Testing.Payloads.PojoBodyData;
import Org.Testing.TestResponseValidation.ResponseValidate;
import Org.Testing.TestSteps.HttpMethods;
import Org.Testing.TestUtilities.PropertiesFileLoad;
import Org.Testing.TestUtilities.JsonResParsing;
import io.restassured.response.Response;
import Org.Testing.Payloads.PojoSimpleBody;

public class TC2 {
	static String JsonKeyValue;

	public void TestcaseForPostRequest() throws IOException {
		Properties prop = PropertiesFileLoad
				.PropFileLoad("/Users/ceroshjacob/eclipse-workspace/RestAssuredFrameworkProject/Env.properties");
		HttpMethods http = new HttpMethods(prop);
		PojoSimpleBody simplyBody = new PojoSimpleBody();
		PojoBodyData Body = simplyBody.GetBodyData();
		Response Resp = http.PostRequest(Body, "QA_URI1");
		ResponseValidate ResValObj = new ResponseValidate();
		ResValObj.ResponseValidation(Resp);
		ResValObj.ResponseStatusCodeVal(201, Resp);
		JsonKeyValue = JsonResParsing.JsonResDataParsing(Resp, "id");
		ResValObj.ResponseDataValid("244", JsonKeyValue);
	}

}
