package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Scnr_Outline 
{
	@Given("Account User is on Home Page")
	public void account_user_is_on_home_page() 
	{
	    System.out.println("User opened Home Page");
	}
	
	@When("User navigate to Account Login Page")
	public void user_navigate_to_account_login_page() 
	{
	    System.out.println("User navigated to Account Login Page");
	}
	
	@When("User enters {string} and {string}")
	public void user_enters_and(String UID, String PWD) 
	{
	    System.out.println("User enters username as "+UID+" and password as "+PWD);
	}
	
	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully() 
	{
	    System.out.println("Login successfully message is displayed"+"\n");
	}



}
