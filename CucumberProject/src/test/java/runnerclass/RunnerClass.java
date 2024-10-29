package runnerclass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ="src/test/java/features/LoginStaticParameters.feature",
				  glue = "stepdefs",
				  monochrome = true,
				  publish = true,
				  dryRun =false
				  
				)
public class RunnerClass extends AbstractTestNGCucumberTests{

}
