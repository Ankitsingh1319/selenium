package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import generic.utility_methods;

public class Base_page extends utility_methods  {
	
	public Base_page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
}
