package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ClassA 
{
  @Test
  public void tc001() 
  {
	  Reporter.log("tc001 executed successfull", true);
  }
  @Test
  public void tc002() 
  {
	  Reporter.log("tc002 executed successfull", true);
  }
  
  @Test
  public void tc003() 
  {
	  Reporter.log("tc003 executed successfull", true);
  }
  @Test
  public void Login() 
  {
	  Reporter.log("Login test successfull", true);
  }
}
