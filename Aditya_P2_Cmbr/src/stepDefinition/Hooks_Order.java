package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hooks_Order 
{
	
	//@Before(order=0)
	public void beforeScenario1()
	{
		System.out.println("This will run before Scenario-Precondition1");
	}
	
	//@Before(order=1)
	public void beforeScenario2()
	{
		System.out.println("This will run before Scenario-Precondition2");
	}
	
	//@After(order=1)
	public void afterScenario2()
	{
		System.out.println("This will run after Scenario-Postcondition2"+"\n");
	}
	
	//@After(order=0)
	public void afterScenario1()
	{
		System.out.println("This will run after Scenario-Postcondition1"+"\n");
	}
	
	@Given("the first step")
	public void the_first_step() 
	{
	   System.out.println("the first step is executed");
	}
	
	@When("the second step")
	public void the_second_step() 
	{
	    System.out.println("the second step is executed");
	}
	
	@Then("the third step")
	public void the_third_step() 
	{
	   System.out.println("the third step is executed");
	}
	
	@Given("Scnd scnr first step")
	public void scnd_scnr_first_step() 
	{
	    System.out.println("Second scenario first step executed");
	}
	
	@When("Scnd scnr second step")
	public void scnd_scnr_second_step() 
	{
		System.out.println("Second scenario second step executed");
	}
	
	@Then("Scnd scnr third step")
	public void scnd_scnr_third_step() 
	{
		System.out.println("Second scenario third step executed");
	}



}
