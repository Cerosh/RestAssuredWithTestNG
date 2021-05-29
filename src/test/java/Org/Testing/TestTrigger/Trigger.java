package Org.Testing.TestTrigger;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Org.Testing.TestCases.TC1;
import Org.Testing.TestCases.TC2;
import Org.Testing.TestCases.TC3;
import Org.Testing.TestCases.TC4;
import java.lang.reflect.Method;

public class Trigger {
	@BeforeMethod
	void ExecuteBeforeEveryMethod(Method method) {
		System.out.println("----***Starting To Execute " + method.getName() + "***----");
	}

	@AfterMethod
	void ExecuteAfterEveryMethod(ITestResult result) {
		System.out.println("----***Completed Executing " + result.getMethod().getMethodName() + "***----");
	}

	@Test(priority = 1)
	void ThePostRequest() throws IOException {
		TC2 TC2Obj = new TC2();
		TC2Obj.TestcaseForPostRequest();
	}

	@Test(priority = 2)
	void TheGetRequest() throws IOException {
		TC1 TC1obj = new TC1();
		TC1obj.TestCaseForUsers();
	}

	@Test(priority = 3)
	void ThePutRequest() throws IOException {
		TC4 TC4Obj = new TC4();
		TC4Obj.CreatePutMethod();
	}

	@Test(priority = 4)
	void TheDeleteRequest() throws IOException {
		TC3 TC3Obj = new TC3();
		TC3Obj.TestCaseForDeletingUsers();
	}

}
