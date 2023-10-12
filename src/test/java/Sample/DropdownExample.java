package Sample;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.support.ui.Select;

 

public class DropdownExample {

    public static void main(String[] args) {

        // Set the path to the EdgeDriver executable

System.setProperty("webdriver.edge.driver", "path/to/EdgeDriver.exe");

        

        // Create a new instance of the ChromeDriver

        WebDriver driver = new EdgeDriver();

        

        // Navigate to a webpage with a dropdown element

driver.get("http://www.calculator.net/interest-calculator.html");

        

        // Locate the dropdown element by its HTML select tag

WebElement dropdownElement = driver.findElement(By.id("dropdown_id")); // You can use different locators as needed

        

        // Create a Select object from the WebElement

        Select dropdown = new Select(dropdownElement);

        

        // Now you can interact with the dropdown using Select methods

        // Select by visible text

        dropdown.selectByVisibleText("Option 1");

        

        // Select by index (0-based)

        dropdown.selectByIndex(2); // This will select the third option

        

        // Select by value attribute

        dropdown.selectByValue("option_value_3");

        

        // Close the browser

        driver.quit();

    }

}