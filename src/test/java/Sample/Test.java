package Sample;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

 

import io.github.bonigarcia.wdm.WebDriverManager;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

				WebDriverManager.edgedriver().setup();

				WebDriver driver = new EdgeDriver();

				driver.manage().window().maximize();

				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				

				driver.get("https://www.amazon.in/");

				

				String url = driver.getCurrentUrl();

				String title = driver.getTitle();

				

				System.out.println(url);

				System.out.println(title);

				

				driver.close();

				

		 

			}

		 

		}

	


