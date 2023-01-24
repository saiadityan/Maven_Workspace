package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="resources\\features\\Hooks_Order.feature",glue="stepDefinition",
				 dryRun=false,monochrome=true)
public class Run_Hooks_order 
{

}
