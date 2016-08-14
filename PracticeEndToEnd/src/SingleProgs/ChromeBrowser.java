package SingleProgs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ChromeBrowser {

	public WebDriver driver;
	@BeforeClass
	public void setup()
	{
		System.out.println("Chrome Browser will be started...");
		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void FacebookLogin()
	{
		System.out.println("Open site");
		driver.get("http://www.yatra.com/");
		driver.findElement(By.xpath(".//*[@id='booking_engine_trains']/span")).click();
		System.out.println("selected Tarin Tab");
				
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	
}
