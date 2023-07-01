package synchronizations;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoFluentWait {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		// fluent wait declaration
		Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofSeconds(30))
				  .pollingEvery(Duration.ofSeconds(5))
				  .ignoring(NoSuchElementException.class);
		
		driver.get("https://www.google.co.in/");
		String gt = driver.getTitle();
		System.out.println(gt);
		driver.manage().window().maximize();
		
		
		 driver.findElement(By.name("q")).sendKeys("Selenium");
		 driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		
		//usages of fluent wait
		
				WebElement element = mywait.until(new Function<WebDriver, WebElement>() {
			  public WebElement apply(WebDriver driver) {
			    return driver.findElement(By.xpath("//h3[text()='Selenium']"));
			  }
			});
				element.click();
			  
		}
	}
		
	

