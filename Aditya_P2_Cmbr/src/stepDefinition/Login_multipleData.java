package stepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_multipleData 
{
	@Given("User is on Home Page")
	public void user_is_on_home_page() 
	{
	    System.out.println("Browser is Up and Homepage is opened");
	}
	
	@When("User navigate to Login Page")
	public void user_navigate_to_login_page() 
	{
		System.out.println("Succesfully navigated to Login page");
	}
	
	@When("User enter credentials to LogIn")
	public void user_enter_credentials_to_log_in(DataTable dataTable) 
	{
	   String UID1=dataTable.row(0).get(0);
	   String PWD1 =dataTable.row(0).get(1);
	   
	   System.out.println(UID1+"  "+PWD1);
	}
	
	@Then("Message displayed LogIn Successfull")
	public void message_displayed_log_in_successfull() 
	{
		System.out.println("Error message displayed");
	}



}
