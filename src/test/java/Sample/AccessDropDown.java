package Sample;

 

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.support.ui.Select;

 

import io.github.bonigarcia.wdm.WebDriverManager;

 

import org.openqa.selenium.By;

public class AccessDropDown{

    

	 public static void main(String[] args) {

		 System.setProperty("edgedriver.edge.driver","D:\\EdgeDriver\\chromedriver.exe");  

		 WebDriver driver=WebDriverManager.edgedriver().create();  

	     //Maximize the browser  

	    

 

		    String baseURL = "https://www.calculator.net/interest-calculator.html";

		    WebDriver driver1 = new EdgeDriver();

			driver1.get(baseURL);

 

			Select dropcompound = new Select(driver1.findElement(By.name("ccompound")));

			dropcompound.selectByVisibleText("daily");

 

			

	 }

	}

	

	