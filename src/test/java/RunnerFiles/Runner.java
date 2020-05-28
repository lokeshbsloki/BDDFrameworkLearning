package RunnerFiles;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@Test
@CucumberOptions(features = "./src/test/java/FeatureFiles",glue = {"StepDefinitionFiles"},dryRun = false)
public class Runner extends AbstractTestNGCucumberTests {

}
