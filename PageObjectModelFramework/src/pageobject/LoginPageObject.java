package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {

	//USername, Password and Submit button
		
	public static WebElement username(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='username']"));
	}
	
	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='password']"));
	}
	
	public static WebElement loginbutton(WebDriver driver) {
		return driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
	}
}
 