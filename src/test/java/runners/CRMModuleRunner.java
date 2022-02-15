package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		publish = true,
		features = "src//test//resources//features//taggedFeatures//",
		glue = {"stepDefs"},
		dryRun = false,
		monochrome = true,
		tags = "@RegressionTest"
		//tags = "@SmokeTest"
		//tags = "@RegressionTest and @SmokeTest"
		//tags = "@RegressionTest or @SmokeTest"
		//tags = "not @RegressionTest and not @SmokeTest"
		//tags = "@PhaseOne and @RegressionTest"
		//tags = "@PhaseTwo and @SmokeTest"
		//tags = "@PhaseOne or @PhaseTwo and not @RegressionTest"
		//tags = "@PhaseOne and not @RegressionTest or @PhaseTwo and not @RegressionTest"
		//tags = "@PhaseOne and @RegressionTest or @SmokeTest"
		//tags = "@PhaseTwo"
		)
public class CRMModuleRunner {

}
