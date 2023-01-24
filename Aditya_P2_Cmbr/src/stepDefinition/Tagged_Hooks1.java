package stepDefinition;

import io.cucumber.java.en.Given;

public class Tagged_Hooks1 
{
	@Given("url flights page")
	public void url_flights_page() 
	{
		System.out.println("flights page opened");
	}
	
	@Given("url trins page")
	public void url_trins_page() 
	{
		System.out.println("trains page opened");
	}
	
	@Given("url packages page")
	public void url_packages_page() 
	{
		System.out.println("Packages page opened");;
	}
	
	@Given("url BUS page")
	public void url_bus_page() 
	{
		System.out.println("Bus page opened");
	}
	
	@Given("url Cars page")
	public void url_cars_page() 
	{
		System.out.println("cars page opened");
	}
	
	@Given("url Product page")
	public void url_product_page() 
	{
		System.out.println("products page opened");
	}

}
