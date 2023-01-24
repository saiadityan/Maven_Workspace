package stepDefinition;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_DataTable 
{
	@Given("User is onto Home page")
	public void user_is_onto_home_page() 
	{
		System.out.println("Browser is Up and Homepage is opened");
	}
	
	@When("User navigate to Login page")
	public void user_navigate_to_login_page() 
	{
		System.out.println("Succesfully navigated to Login page");
	}
	
	@When("User enter credentials to LogIn page")
	public void user_enter_credentials_to_log_in_page(DataTable dataTable) 
	{
	    for (List<String> eachvalue : dataTable.asLists()) 
	    {
			System.out.println(eachvalue);
		}
	}
	
	@Then("LogIn Successfull message dispalyed")
	public void log_in_successfull_message_dispalyed() 
	{
		System.out.println("Error message displayed");
	}


}
