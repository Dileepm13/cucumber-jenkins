package runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\mangu\\eclipse-workspace\\ATE-Phase2-Cucumber-ExtentReports-Jenkins\\src\\test\\java\\features\\AmazonTest.feature",
		glue = {"steps"}, //package name where the steps are
		plugin= {"pretty",
		"html:target/cucumberreport.html",
		/*
		 * "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		 * "timeline:test-output-thread/"
		 */
		
		
		}
		
		)
public class Amazonrunner {
}