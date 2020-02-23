package pagefactorywithoutannotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginwithouFindBy {

	public static WebElement txtUsername;
	public static WebElement txtPassword;
	public static WebElement btnLogin;
	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Selenium Automation\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver
		.get("https://opensource-demo.orangehrmlive.com"
				+ "/index.php/auth/validateCredentials");
		PageFactory.initElements(driver, LoginwithouFindBy.class);
		txtUsername.sendKeys("Admin");
		txtPassword.sendKeys("admin123");
		btnLogin.click();
		
	}
}
