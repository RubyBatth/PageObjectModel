package stepDefination;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaggedHooksStepDefination {
	@Before()
	public void setUp() {
		System.out.println("launchFF");
	System.out.println("Enter URL for Free CRM App");
	}
	@After()
	public void teardown() {
		System.out.println("close the browser");	
	}
	@Before("@First")
	public void beforeFirst() {
		System.out.println("before only first scenario");		
	}
	@After("@First")
	public void afterFirst() {
		System.out.println("after only first scenario");	
	}
	@Before("@Second")
	public void beforeSecond() {
		System.out.println("before only second scenario");	
	}
	@After("@Second")
	public void afterSecond() {
		System.out.println("after only second scenario");	
	}
	@Before("@Third")
	public void beforeThird() {
		System.out.println("before only third scenario");	
	}
	@After("@Third")
	public void afterThird() {
		System.out.println("after only third scenario");		
	}
	@Given("^this is the first step$")
	public void this_is_the_first_step() {
		System.out.println("1st Step");
	}
	@When("^this is the second step")
	public void this_is_the_second_step() {
	System.out.println("2nd Step");	
	}
	@Then("^this is the third step$")
	public void this_is_the_third_step() {
		System.out.println("3rd Step");
	}
	
}
