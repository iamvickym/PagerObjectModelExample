package phptravelcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageobject.LoginPageObject;
import pageobject.UpdateProfilePageObject;

public class UpdateProfileTestCase {

	public void updateprofile() {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.phptravels.net/login");
		
		LoginPageObject.username(driver).sendKeys("user@phptravels.com");;
		LoginPageObject.password(driver).sendKeys("demouser");;
		LoginPageObject.loginbutton(driver).click();;
		
		UpdateProfilePageObject.myprofile(driver).click();;
		UpdateProfilePageObject.phonenumber(driver).sendKeys("Coimbatore");;
		UpdateProfilePageObject.city(driver).sendKeys("7904988346");;
		UpdateProfilePageObject.submit(driver).click();
		
	}

}
