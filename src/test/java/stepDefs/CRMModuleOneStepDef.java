package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CRMModuleOneStepDef {
	//Tagged Hooks
	@Before(value = "@RegressionTest", order=2)
	//@Before(order = 2)
	//Hooks
	//@BeforeStep
	public void setupDBOne() {
		System.out.println("Setting DB One");
	}
	@Before(value ="@RegressionTest" , order=1)
	//@Before(order = 1)
	//@BeforeStep
	public void readConfigFile() {
		System.out.println("Read from config file");
	}
	
	@Before(value ="@SmokeTest" , order=3)
	//@BeforeStep
	public void setupDataFileConfig() {
		System.out.println("Data File SetUp");
	}
	
	
	
	//@After
//	@AfterStep
//	public void cleanupData() {
//		System.out.println("After Each Scenario");
//	}

	@Given("User must have logged in")
	public void user_must_have_logged_in() {
		System.out.println("User Loggedin");
	}
	
	@When("User create a contact")
	public void user_create_a_contact() {
		System.out.println("User created contact");
	}

	@When("User Update a contact")
	public void user_update_a_contact() {
		System.out.println("User updated contact");
	}

	@When("User View a contact")
	public void user_view_a_contact() {
		System.out.println("User Viewed contact");
	}


	@When("User create a Deal")
	public void user_create_a_deal() {
		System.out.println("User created Deal");
	}

	@When("User Update a Deal")
	public void user_update_a_deal() {
		System.out.println("User updated Deal");
	}


	@When("User View a Deal")
	public void user_view_a_deal() {
		System.out.println("User viewed a Deal");
	}
	
	@When("User create a Task")
	public void user_create_a_task() {
		System.out.println("User created Task");
	}

	@When("User Update a Task")
	public void user_update_a_task() {
		System.out.println("User updated Task");
	}


	@When("User View a Task")
	public void user_view_a_task() {
		System.out.println("User viewed a Task");
	}


	@When("User Logout")
	public void user_logout() {
		System.out.println("User loggedout");
	}

}
