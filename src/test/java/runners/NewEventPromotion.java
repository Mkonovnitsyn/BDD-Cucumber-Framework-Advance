package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/java/features/eventPromotion.feature", glue = {
 "steps" },
 dryRun = false,
 monochrome = true,
 plugin = {"pretty", "de.monochromata.cucumber.report.PrettyReports:target/pretty-cucumber", "html:target/cucumber-html", "json:target/report.json","junit:target/cucumber.xml","rerun:target/rerun.txt"} )
public class NewEventPromotion {
}