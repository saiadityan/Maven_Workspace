package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hooks 
{
	
	@Before
	public void beforeScenario()
	{
		System.out.println("This will run before Scenario");
	}
	
	@After
	public void afterScenario()
	{
		System.out.println("This will run after Scenario"+"\n");
	}
	
	@Given("This is the first step")
	public void this_is_the_first_step() 
	{
	    System.out.println("the first step is executed");
	}
	
	@When("This is the second step")
	public void this_is_the_second_step() 
	{
	    System.out.println("the second step is executed");
	}
	
	@Then("This is the third step")
	public void this_is_the_third_step() 
	{
	    System.out.println("the third step is executed");
	}
	
	
	@Given("First step of Scd Scnr")
	public void first_step_of_scd_scnr() 
	{
	    System.out.println("Scnd Scnr First step executed");
	}
	
	@When("Second step of Scd Scnr")
	public void second_step_of_scd_scnr() 
	{
		 System.out.println("Scnd Scnr Second step executed");
	}
	
	@Then("Third step of Scd Scnr")
	public void third_step_of_scd_scnr() 
	{
		 System.out.println("Scnd Scnr third step executed");
	}


}
