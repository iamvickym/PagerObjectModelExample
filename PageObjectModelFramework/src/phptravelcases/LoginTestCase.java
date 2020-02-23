package phptravelcases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageobject.LoginPageObject;

public class LoginTestCase {

	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Selenium\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.phptravels.net/login");
		Thread.sleep(3000);
		
		LoginPageObject.username(driver).sendKeys("user@phptravels.com");;
		LoginPageObject.password(driver).sendKeys("demouser");;
		LoginPageObject.loginbutton(driver).click();;
		
		
		
		
	}
}
