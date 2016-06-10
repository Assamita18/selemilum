package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPageObject {

//		Create driver
	public String mainPageUrl = "http://store.demoqa.com";
	static WebDriver driverPO;
			
//		Class constructor
	
	public MainPageObject(WebDriver driverFromTestClass){
		driverPO = driverFromTestClass;
		
	}
	
//		Mapping
		
	static By searchBoxLocator = By.cssSelector(".search");
	
	
//		get WebElements
	
	
	public static WebElement getSearchBox(){
		WebElement searchBox = driverPO.findElement (searchBoxLocator);
		return searchBox;
	}
	
	
//	Basic Functions
	public static void typeProduct(String productFromTestClass){
		getSearchBox().sendKeys(productFromTestClass);
	}
	
	
	
//	Complex functions
	
	public static void searchProduct (String productFromTestClass){
		typeProduct(productFromTestClass);
		getSearchBox().submit();
		
	}
}
