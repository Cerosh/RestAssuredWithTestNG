package Org.Testing.TestCases;

import Org.Testing.TestUtilities.JsonResParsing;
import Org.Testing.TestUtilities.PropertiesFileLoad;
import io.restassured.response.Response;

import java.io.IOException;
import java.util.Properties;
import Org.Testing.Payloads.PojoBodyData;

import Org.Testing.Payloads.PojoSimpleUpdatedDate;
import Org.Testing.TestResponseValidation.ResponseValidate;
import Org.Testing.TestSteps.HttpMethods;

public class TC4 {
	public void CreatePutMethod() throws IOException {
		Properties prop = PropertiesFileLoad
				.PropFileLoad("/Users/ceroshjacob/eclipse-workspace/RestAssuredFrameworkProject/Env.properties");
		PojoBodyData Body = PojoSimpleUpdatedDate.GetUpdatedBodyData();

		HttpMethods http = new HttpMethods(prop);
		Response Resp = http.PutRequest(Body, "QA_URI1", TC2.JsonKeyValue);
		ResponseValidate ResValObj = new ResponseValidate();
		ResValObj.ResponseStatusCodeVal(200, Resp);
		String UpdatedData = JsonResParsing.JsonResDataParsing(Resp, "lastName");
		ResValObj.ResponseDataValid("Singh", UpdatedData);

	}

}
