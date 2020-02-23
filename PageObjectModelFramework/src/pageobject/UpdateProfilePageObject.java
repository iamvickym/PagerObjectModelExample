package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpdateProfilePageObject {

	public static WebElement myprofile(WebDriver driver) {
		return driver.findElement(By.xpath("//a[contains(text(),'My Profile')]"));
	}
	
	public static WebElement phonenumber(WebDriver driver) {
		return driver.findElement(By.name("phone"));
	}
	
	public static WebElement city(WebDriver driver) {
		return driver.findElement(By.name("city"));
	}
	
	public static WebElement submit(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@class='btn btn-block updateprofile btn-primary']"));
	}
}
