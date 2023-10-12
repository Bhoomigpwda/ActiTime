package Sample;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	private static final By HomePageUserName = null;

	public static void main(String[] args) {
		
		

		    //WebDriver driver;

		    By HomePageUserName = By.xpath("//table//tr[@class='heading3']");}

	 WebDriver driver;
		    

		    public HomePage(WebDriver driver){

		        this.driver = driver;

		    }

		    //Get the User name from Home Page

		    public String getHomePageDashboardUserName(){

		         return    driver.findElement(HomePageUserName).getText();
		        }

		

	}


