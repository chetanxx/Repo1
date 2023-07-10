
package JavaScriptExecutorDemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.openqa.selenium.JavascriptExecutor;
public class JavaScriptExecutorScrolldown {
	@Test
	public void login() {
	
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com");
		js.executeAsyncScript("window.scrollBy(0,document.body.scrollHeight)");
	} 
}