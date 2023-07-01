package seleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandelingDate {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.makemytrip.com/";
		String year ="2023";
		String month="October" ;
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);

		// click on calendar link
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/label/span")).click();
		// Next Button
		WebElement next=driver.findElement(By.xpath("//span[contains(@class,'DayPicker-NavButton DayPicker-NavButton--next')]"));
		
		//Retrieve the month and year text
		WebElement date = driver.findElement(By.className("DayPicker-Caption"));
		String currentYear=date.getText();
		System.out.println(currentYear);

		// click on next arrow until we get the desire year
		if(!currentYear.contains(year))
		{
			do
			{
				next.click();
			}while(!date.getText().contains(year));
			System.out.println("The Year is selected:"+year);
		}
		// click on next arrow until we get the desire month
		String currentmonth=date.getText();
		System.out.println(currentmonth );
				if(!currentmonth.contains(month))
				{
					do
					{
						next.click();
					}while(!date.getText().contains(month));
					System.out.println("The Month is selected:"+month);
				}


	}

}
