package industrystandardpomprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTestCase {
	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Selenium Automation\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.phptravels.net/login");
		Thread.sleep(3000);
		PageFactory.initElements(driver, LoginPageObjectModel.class);
		LoginPageObjectModel.username.sendKeys("user@phptravels.com");
		LoginPageObjectModel.password.sendKeys("demouser");
		LoginPageObjectModel.submit.click();
	}
}
