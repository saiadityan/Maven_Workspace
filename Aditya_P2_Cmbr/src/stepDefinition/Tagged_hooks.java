package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tagged_hooks 
{
	@Given("My first step")
	public void my_first_step() 
	{
	   System.out.println("First Scenario first step- executed");
	}
	
	@When("My second step")
	public void my_second_step() 
	{
		System.out.println("First Scenario second step- executed");
	}
	
	@Then("My third step")
	public void my_third_step() 
	{
		System.out.println("First Scenario third step- executed");
	}
	
	@Given("My Scnd scnr first step")
	public void my_scnd_scnr_first_step() 
	{
		System.out.println("Second Scenario first step- executed");
	}
	
	@When("My Scnd scnr second step")
	public void my_scnd_scnr_second_step() 
	{
		System.out.println("Second Scenario second step- executed");
	}
	
	@Then("My Scnd scnr third step")
	public void my_scnd_scnr_third_step() 
	{
		System.out.println("Second Scenario third step- executed");
	}

	@Given("My Thrd scnr first step")
	public void my_thrd_scnr_first_step() 
	{
		System.out.println("Third Scenario first step- executed");
	}
	
	@When("My Thrd scnr second step")
	public void my_thrd_scnr_second_step() 
	{
		System.out.println("Third Scenario second step- executed");
	}
	
	@Then("My Thrd scnr third step")
	public void my_thrd_scnr_third_step() 
	{
		System.out.println("Third Scenario third step- executed");
	}


}
