package runners;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		publish = true,
		features = "src//test//resources//features//GoogleSearch.feature",
		glue = {"stepDefs"},
		dryRun = false,
		monochrome = true,
		plugin = {"pretty",
				"html:target/reports/HtmlReport.html",
			//	"usage:target/reports/UsageReport",
			//	"json:target/reports/JsonReport.json",
			//	"junit:target/reports/JunitReport.xml"
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				}
		)
public class GooglePageRunner {



}
