package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Invalid 
{
	WebDriver driver;
	
	@Given("Outlook url at Chrome")
	public void outlook_url_at_chrome() throws Exception 
	{
	    driver = new ChromeDriver();
	    System.out.println("Chromebrowser is launched");
	    driver.get("https://outlook.live.com/owa/");
	    System.out.println("Outlook page is opened");
	    driver.manage().window().maximize();
	    Thread.sleep(4000);
	}
	
	@Given("click on SignIn button")
	public void click_on_sign_in_button() throws Exception 
	{
		driver.findElement(By.linkText("Sign in")).click();
		System.out.println("Sign in button is clicked");
		Thread.sleep(4000);
	}
	
	@When("User enter valid username")
	public void user_enter_valid_username() throws Exception 
	{
		driver.findElement(By.id("i0116")).sendKeys("sunilreddy.gajjala@outlook.com");
	    driver.findElement(By.id("idSIButton9")).click();
	    System.out.println("Valid username is entered");
	    Thread.sleep(4000);
	}
	
	@When("enter invalid password")
	public void enter_invalid_password() throws Exception 
	{
		  driver.findElement(By.id("i0118")).sendKeys("345trh23sdawd");
		  driver.findElement(By.id("idSIButton9")).click();
		  System.out.println("Invalid password is entered");
		  Thread.sleep(4000);
	}
	
	@Then("verify error message displayed")
	public void verify_error_message_displayed() throws Exception 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[contains(@id,'passwordError')]"), "Your account or password is incorrect. If you don't remember your password"));
	    System.out.println("Error message display is verified");
	    Thread.sleep(5000);
	    driver.close();
	}



}
