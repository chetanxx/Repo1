package JavaScriptExecutorDemo;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class JavascriptScreenshot {

    public static void main(String[] args) throws IOException {
     

        // Create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to Flipkart's website
        driver.get("https://www.flipkart.com/");

        // Locate the logo element
        WebElement logoElement = driver.findElement(By.xpath("//img[@alt='Flipkart']"));

        // Add a border to the logo element
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border='3px solid red'", logoElement);

        // Take a screenshot of the logo element
        File screenshotFile = logoElement.getScreenshotAs(OutputType.FILE);

        // Save the screenshot to a file
        File destinationFile = new File("C:\\screenshot");
        FileHandler.copy(screenshotFile, destinationFile);

    }
}