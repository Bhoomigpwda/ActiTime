package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class LoginClass {
	
	WebDriver driver = null;
	
	//Constructor, as every page needs a WebDriver to find elements
	public  LoginClass(WebDriver driver){
			this.driver=driver;
		}
		
	//Locating the userName text box
	@FindAll({
		@FindBy(id="wrapper"),
		@FindBy(id="userName")
	})
	WebElement username;
	
	//Locating the password text box
	@FindBy(id="password")
	WebElement pswd;
	
	//Locating Login Button
	@FindBy(id="login")
	WebElement loginBtn;
	
	
	//Method that performs login action using the web elements
	public void LogIn_Action(String uName, String pwd){
		username.sendKeys(uName);
		pswd.sendKeys(pwd);
		loginBtn.click();
	}
}