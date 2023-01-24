package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class User_Registration 
{
	@When("User enter valid mobile number")
	public void user_enter_valid_mobile_number() 
	{
		System.out.println("Valid Mobile Number Entered");
	}
	
	@When("wait for OTP")
	public void wait_for_otp() 
	{
		System.out.println("TimeOut For OTP to Generate");
	}
	
	@When("Enter valid OTP")
	public void enter_valid_otp() 
	{
		System.out.println("OTP is Entered");
	}
	
	@When("click on Create Account Button")
	public void click_on_create_account_button() 
	{
		System.out.println("Create account button clicked");
	}
	
	@Then("verify Registration successfull message displayed")
	public void verify_registration_successfull_message_displayed() 
	{
		System.out.println("Registration successfull Message Displayed");
	}

}
