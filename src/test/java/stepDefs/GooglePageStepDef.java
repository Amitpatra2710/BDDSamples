package stepDefs;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

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


public class GooglePageStepDef {
	WebDriver driver;
	@Given("User is on Google Page")
	public void user_is_on_google_page() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://google.com/");
	    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	    
	}
	@When("User Search Java Tutorial")
	public void user_search_java_tutorial() {
		 driver.findElement(By.name("q")).sendKeys("Java Tutorial");
		 driver.findElement(By.name("q")).submit();
		 
	}
	@Then("Should display Java result page")
	public void should_display_java_result_page() {
	    String pageTitle = driver.getTitle();
	    Assert.assertEquals("Java Tutorial - Google Search", pageTitle);
	}
	    
	@When("User Search Selenium Tutorial")
	public void user_search_selenium_tutorial() {
		 driver.findElement(By.name("q")).sendKeys("Selenium Tutorial");
		 driver.findElement(By.name("q")).submit();
		 
	}
	@Then("Should display Selenium result page")
	public void should_display_selenium_result_page() {
	    String pageTitle = driver.getTitle();
	    Assert.assertEquals("Selenium Tutorial - Google Search", pageTitle);
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
