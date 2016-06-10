package config;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	
	protected static WebDriver driver;
	
	@BeforeClass
	public static void setUp () {
		driver = new FirefoxDriver ();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	}
	
	@AfterClass
	public static void tearDown (){
		driver.close();
	}
	

}
