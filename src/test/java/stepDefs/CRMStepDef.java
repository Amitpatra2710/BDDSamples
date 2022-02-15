package stepDefs;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CRMStepDef {

	WebDriver driver;

	@Given("User is on Login page")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		// driver.get("https://ui.cogmento.com/");
		driver.get("https://the-internet.herokuapp.com/login");

	}

//	@When("User enters login credentials")
//	public void user_enters_login_credentials() {
	// driver.findElement(By.name("email")).sendKeys("corpdevops@gmail.com");
	// driver.findElement(By.name("password")).sendKeys("CrmPro123");
	// driver.findElement(By.xpath("//div[contains(text(), 'Login')]")).click();

//		driver.findElement(By.name("username")).sendKeys("tomsmith");
//		driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
//		driver.findElement(By.xpath("//button[@Class='radius']")).click();
//	}

//		@When("User enters {string} and {string}")
//		public void user_enters_and(String strUser, String strPwd) {
//			driver.findElement(By.name("username")).sendKeys(strUser);
//			driver.findElement(By.name("password")).sendKeys(strPwd);
//			driver.findElement(By.xpath("//button[@Class='radius']")).click();
//		}

//		@When("User enters login credentials")
//		public void user_enters_login_credentials(DataTable userData) {
//			List<List<String>> data = userData.asLists();
//			String StrUser = data.get(0).get(0);
//			String StrPwd = data.get(0).get(1);
//			driver.findElement(By.name("username")).sendKeys(StrUser);
//			driver.findElement(By.name("password")).sendKeys(StrPwd);
//			driver.findElement(By.xpath("//button[@Class='radius']")).click();
//		}

	@When("User enters login credentials")
	public void user_enters_login_credentials(DataTable userData) {
		// List<List<String>> data = userData.asLists();
		// String StrUser = data.get(0).get(0);
		// String StrPwd = data.get(0).get(1);
		List<Map<String, String>> data = userData.asMaps();
		String StrUser = data.get(0).get("username");
		String StrPwd = data.get(0).get("password");
		driver.findElement(By.name("username")).sendKeys(StrUser);
		driver.findElement(By.name("password")).sendKeys(StrPwd);
		driver.findElement(By.xpath("//button[@Class='radius']")).click();
	}

	@Then("User enters home page")
	public void user_enters_home_page() {
		boolean isValid = driver.findElement(By.cssSelector(".success")).isDisplayed();
		Assert.assertTrue(isValid);
		// driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// driver.close();
	}

}
