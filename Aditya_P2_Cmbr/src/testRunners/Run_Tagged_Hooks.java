package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="resources\\features\\Tagged_Hooks.feature",glue="stepDefinition",
				 dryRun=false,monochrome=true,tags= {"@SmokeTest,@Reg"})
public class Run_Tagged_Hooks 
{

}
