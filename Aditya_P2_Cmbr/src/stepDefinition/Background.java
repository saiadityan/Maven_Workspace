package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Background 
{
	@Given("Gmail Homepage")
	public void gmail_homepage() 
	{
	    System.out.println("Gmail homepage displayed");
	}
	
	@Given("Login into Account")
	public void login_into_account() 
	{
	   System.out.println("User Login into account");
	}
	
	@Given("search email")
	public void search_email() 
	{
	    System.out.println("User search for email");
	}
	
	@When("User click on reply button")
	public void user_click_on_reply_button() 
	{
	    System.out.println("User clicked reply button");
	}
	
	@Then("verify reply screen dispalyed")
	public void verify_reply_screen_dispalyed() 
	{
	    System.out.println("Verify Reply screen is displayed");
	}
	
	@When("User click on Forward button")
	public void user_click_on_forward_button() 
	{
	    System.out.println("User clicked forward button");
	}
	
	@Then("verify Forward screen displayed")
	public void verify_forward_screen_displayed() 
	{
	    System.out.println("Verify forward screen is displayed");
	}
	
	@When("User click on delete button")
	public void user_click_on_delete_button() 
	{
	    System.out.println("User clicked delete button");
	}
	
	@Then("verify email delete option displayed")
	public void verify_email_delete_option_displayed() 
	{
	    System.out.println("Verify delete button is displayed");
	}


}
