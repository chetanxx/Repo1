package JavaScriptExecutorDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class JavaScriptExecutor {

    public static void main(String[] args) {

        
        WebDriver driver = new ChromeDriver();
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        driver.get("https://www.nopcommerce.com/en/demo");
        driver.manage().window().maximize();
        
        // Execute JavaScript code to display an alert box with message 'Hello World'
        js.executeScript("alert('Hi Chetans');");
        
    
    }
}
