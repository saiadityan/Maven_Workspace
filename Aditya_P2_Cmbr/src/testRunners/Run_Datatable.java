package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="resources\\features\\DataTable.feature",glue="stepDefinition",dryRun=false,monochrome=true)
public class Run_Datatable 
{

}
