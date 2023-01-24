package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Parameters 
{
	
	@Given("Flipkart site url as {string}")
	public void flipkart_site_url_as(String fkurl) 
	{
	    System.out.println("The entered Flipkart url is-->"+fkurl);
	}
	
	@Given("click on Register with us")
	public void click_on_register_with_us() 
	{
	    System.out.println("Registration button is clicked");
	}
	
	@When("User enter valid mobile number {string}")
	public void user_enter_valid_mobile_number(String mbn) 
	{
	    System.out.println("Mobile number entered is-->"+mbn);
	}
	
	@When("Enter firstname as {string}")
	public void enter_firstname_as(String fnm) 
	{
	   System.out.println("Firstname entered is -->"+fnm);
	}
	
	@When("Enter surname as {string}")
	public void enter_surname_as(String snm) 
	{
	   System.out.println("Surname entered is -->"+snm);
	}
	
	@When("Enter age as {int}")
	public void enter_age_as(Integer int1) 
	{
	    System.out.println("Age entered is -->"+int1);
	}
	
	@When("click on Register")
	public void click_on_register() 
	{
	    System.out.println("Register button is clicked");
	}
	
	@Then("Verify Registration success message display")
	public void verify_registration_success_message_display() 
	{
		System.out.println("Registration success message is displayed");
	}


}
