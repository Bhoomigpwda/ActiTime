package Sample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage001 {

	
		@FindBy(id="APjFqb")
		private WebElement googleSearchEdt;
		public void LoginPage(WebDriver driver)
		{
			PageFactory.initElements( driver,this);
			
		}
		public WebElement getGoogleSearchEdt() {
			return googleSearchEdt;
		}
		
			public void ClickOnSearch(String name) {
				googleSearchEdt.sendKeys(name);
		

	}

}
