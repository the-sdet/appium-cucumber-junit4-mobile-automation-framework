package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * Runner class to glue features and step definitions
 *
 * @author Pabitra Swain (contact.the.sdet@gmail.com)
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", glue = {"stepdefinitions", "hooks"},
        plugin = {"pretty", "html:testReports/CucumberReport.html", "json:testReports/CucumberReport.json", "timeline:testReports/timelineReport", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        tags = "not @ignore"
)
public class TestRunner {

}