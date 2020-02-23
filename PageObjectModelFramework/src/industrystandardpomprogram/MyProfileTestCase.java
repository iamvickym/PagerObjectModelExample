package industrystandardpomprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class MyProfileTestCase {
	@Test
	public void myprofile() throws Exception {
	System.setProperty("webdriver.chrome.driver", 
	"C:\\Selenium Automation\\WebDrivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.phptravels.net/login");
	Thread.sleep(3000);
	
	PageFactory.initElements(driver, LoginPageObjectModel.class);
	LoginPageObjectModel.username.sendKeys("user@phptravels.com");
	LoginPageObjectModel.password.sendKeys("demouser");
	LoginPageObjectModel.submit.click();
	
	PageFactory.initElements(driver, MyProfilePageObjectModel.class); 
	MyProfilePageObjectModel.myprofile.click();
	MyProfilePageObjectModel.phone.sendKeys("7904988346");
	MyProfilePageObjectModel.city.sendKeys("Coimbatore");
	MyProfilePageObjectModel.submit1.click();
	driver.quit();
}
}