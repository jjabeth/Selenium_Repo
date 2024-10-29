package runnerHomeAssignments;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = //"src/test/java/featuresHomeAssignments/SalesforceHomeAssignmentsStaticParameter.feature",
							"src/test/java/featuresHomeAssignments/SalesforceHomeAssignmentsDynamicParameters.feature",
				 glue = "stepdefsHomeAssignments",
				 monochrome = true,
				 publish = true,
				 dryRun = false
					)
public class RunnerClassHA extends AbstractTestNGCucumberTests {

}
