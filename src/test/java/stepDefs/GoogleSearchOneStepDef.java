package stepDefs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchOneStepDef {
	
	WebDriver driver;
	@Given("User is on Google Home Page")
	public void user_is_on_google_page() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://google.com/");
	    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	    
	}
	@When("User Search Cypress Tutorial")
	public void user_search_cypress_tutorial() {
		 driver.findElement(By.name("q")).sendKeys("Cypress Tutorial");
		 driver.findElement(By.name("q")).submit();
		 
	}
	@Then("Should display Cypress result page")
	public void should_display_cypress_result_page() {
	    String pageTitle = driver.getTitle();
	    Assert.assertEquals("Cypress Tutorial - Google Search", pageTitle);
	    driver.close();
	}
	
	@After
	public void teardown(Scenario scenario) throws IOException{
		if(scenario.isFailed()) {
			TakesScreenshot screen = (TakesScreenshot)driver;
			File screenshot = screen.getScreenshotAs(OutputType.FILE);
			byte[] fileContent = FileUtils.readFileToByteArray(screenshot);
			scenario.attach(fileContent, "image/png", "image1");
			
		}
}

}