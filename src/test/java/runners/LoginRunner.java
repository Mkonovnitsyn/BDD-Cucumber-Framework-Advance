package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/java/features/login.feature", glue = {
 "steps" },
 dryRun = false,
 monochrome = true,
 plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "html:target/cucumber-html", "json:target/report.json","junit:target/cucumber.xml","rerun:target/rerun.txt"} )
public class LoginRunner {
}