package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-html-report", "json:target/json-report/cucumber-json-report.json"},
        features = {"src/test/resources/"},
        glue = {"stepdefinitions"},
        monochrome = false,
        tags = {"@REGRESSION"}
)
public class Runner {
}
