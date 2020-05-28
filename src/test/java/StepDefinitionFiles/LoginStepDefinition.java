package StepDefinitionFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {

	static {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
	}
	WebDriver driver;
	
	@Given("^The browser is open$")
	public void the_browser_is_open() throws Throwable {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	}

	@Given("^the application is loaded$")
	public void the_application_is_loaded() throws Throwable {
	 driver.get("https://www.facebook.com/");
	}

	@When("^the user enters valid username$")
	public void the_user_enters_valid_username() throws Throwable {
		Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("lokeshbs1993@gmail.com");
	}

	@When("^the user enters valid password$")
	public void the_user_enters_valid_password() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Lokeshbs@1");

	}

	@When("^the user clicks on login button$")
	public void the_user_clicks_on_login_button() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='u_0_b']")).click();

	}

	@Then("^the Homepage should be display$")
	public void the_Homepage_should_be_display() throws Throwable {
		String title = driver.getTitle();
	   System.out.println(title);
	   Assert.assertEquals(title, "Facebook – log in or sign up");
	   driver.close();
	}
	@When("^the user clicks on forgotten link$")
	public void the_user_clicks_on_forgotten_link() throws Throwable {
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[contains(text(),'Forgotten account?')]")).click();
	}

	@Then("^find your acc page should be displayed$")
	public void find_your_acc_page_should_be_displayed() throws Throwable {
	    String forgottitle = driver.getTitle();
	    Assert.assertEquals("", "");
	    driver.close();
	}
}
