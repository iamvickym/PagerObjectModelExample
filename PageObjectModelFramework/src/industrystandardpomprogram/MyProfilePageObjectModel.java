package industrystandardpomprogram;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyProfilePageObjectModel {

	@FindBy(name="username")
	public static WebElement username;
	@FindBy(name="password")
	public static WebElement password;
	@FindBy(xpath="//*[@id='loginfrm']/button")
	public static WebElement submit;
	@FindBy(xpath="//a[contains(text(),'My Profile')]")
	public static WebElement myprofile;
	@FindBy(name="phone")
	public static WebElement phone;
	@FindBy(name="city")
	public static WebElement city;
	@FindBy(xpath="//button[@class='btn btn-block updateprofile btn-primary']")
	public static WebElement submit1;
	
}
