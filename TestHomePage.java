package tests;
import static org.junit.Assert.*;


import org.junit.Test;
import org.openqa.selenium.By;


import pageObjects.MainPageObject;
import config.BaseTest;



public class TestHomePage extends BaseTest {
	

	@Test
	
	public void searchAny (){
		MainPageObject.searchProduct ("any");
		String element = driver.findElement(By.cssSelector("#meta > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)")).getText();
		
		assertEquals (element, "Register");
		
				
		
	}


	
}
