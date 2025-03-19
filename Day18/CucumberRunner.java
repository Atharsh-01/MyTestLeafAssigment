package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/features/Login.feature"},glue = {"steps"},dryRun = false)
public class CucumberRunner extends AbstractTestNGCucumberTests {

}
