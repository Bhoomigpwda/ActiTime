package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo001 {

	public static void main(String[] args) {
		WebDriver driver = WebDriverManager.edgedriver().create();
		
		driver.manage().window().maximize(); 
		driver.get("https://www.google.com");
		driver.findElement(By.id("APjFqb")).sendKeys("https://www.synechron.com");
		
	}

}
