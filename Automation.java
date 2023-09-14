package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
	
	public static WebDriver driver = null;
	
	public static void main(String[] args) {
		// Set the path to the ChromeDriver executable
        System.setProperty("chromedriver.exe", "C://Users//suhasr");
        
        driver = new ChromeDriver();
        

        // Step 1: Launch a web browser and navigate to the URL
        driver.get("https://the-internet.herokuapp.com/");
        
        try {
			driver.wait(5000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}

        // Step 2: Click on the "Checkboxes" link
        WebElement checkboxesLink = driver.findElement(By.linkText("Checkboxes"));
        checkboxesLink.click();

        // Step 3: Wait for the "Checkboxes" page to load
        try {
			driver.wait(2000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}

        // Step 4: Identifying the first checkbox element
        WebElement firstbox = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));

        // Step 5: Confirm that the first checkbox is unchecked by default
        if (!firstbox.isSelected()) {
            System.out.println("First checkbox is unchecked by default.");
        } else {
            System.out.println("First checkbox is already checked.");
        }

        // Step 6: Click on the first checkbox to select it
        firstbox.click();

        // Step 7: Confirm that the first checkbox is now checked
        if (firstbox.isSelected()) {
            System.out.println("First checkbox is now checked.");
        } else {
            System.out.println("Failed to check the first checkbox.");
        }

        // Step 8: Identify the second checkbox element
        WebElement secondbox = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));

        // Step 9: Confirm that the second checkbox is unchecked by default
        if (!secondbox.isSelected()) {
            System.out.println("Second checkbox is unchecked by default.");
        } else {
            System.out.println("Second checkbox is already checked.");
        }

        // Step 10: Click on the second checkbox to select it
        secondbox.click();

        // Step 11: Confirm that the second checkbox is now checked
        if (secondbox.isSelected()) {
            System.out.println("Second checkbox is now checked.");
        } else {
            System.out.println("Failed to check the second checkbox.");
        }

        // Step 12: Close the web browser
        driver.quit();
	
		
	}

}
