package StepsDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import Utilites.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends Base {
	@Given("User is launching the application")
	public void user_is_launching_the_application() {
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://spos.tecdiary.net/login?m=");

	}

	@When("User login the module using username is {string} and password is {string}")
	public void user_login_the_module_using_username_is_and_password_is(String username, String password) {
		WebElement uname=driver.findElement(By.xpath("//input[@name='identity']"));
		uname.clear();
		uname.sendKeys(username);

		WebElement passw=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		passw.clear();
		passw.sendKeys(password);
		
	}

	@When("User click on Login button")
	public void user_click_on_login_button() throws Exception {
		
		WebElement signIn=driver.findElement(By.cssSelector("button[class='btn btn-primary btn-block btn-flat']"));
		signIn.click();
		Thread.sleep(2000);

	   
	}


}
