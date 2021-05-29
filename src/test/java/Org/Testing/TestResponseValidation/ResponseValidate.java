package Org.Testing.TestResponseValidation;

import io.restassured.response.Response;
import junit.framework.Assert;

public class ResponseValidate {
	public void ResponseValidation(Response Res) {
		System.out.println(Res.getStatusLine());
		System.out.println(Res.asPrettyString());
	}

	public void ResponseStatusCodeVal(int ExpStatCode, Response Res) {
		Assert.assertEquals(Res.getStatusCode(), ExpStatCode);
		System.out.println("Response Status code Validated");
	}

	public void ResponseDataValid(String expData, String actData) {
		Assert.assertEquals(expData, actData);
		System.out.println("Response Data Validated");

	}

}
