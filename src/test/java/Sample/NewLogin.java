package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewLogin {

	WebDriver driver;
	By user99guruName = By.name("uid");
	By password99guru = By.name("password");
	By titlText = By.className("Barone");
	By login = By.name("btnLogin");
	
	public  NewLogin(WebDriver driver) {
		this.driver = driver;
	}
public void setUserName(String strUserName) {
	driver.findElement(user99guruName).sendKeys(strUserName);
}
}
