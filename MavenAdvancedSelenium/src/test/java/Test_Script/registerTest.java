package Test_Script;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.read_excel;
import generic.utility_methods;
import pom.Base_page;
import pom.register_page;

public class registerTest extends Base_Test {
	
	
@DataProvider(name = "ram")
public static Object[][] fetchexcel() throws Exception
{
	return read_excel.fetch_excel();
	}
@Test(dataProvider = "ram")
public void testcase(String s1,String s2,String s3, String s4, String s5)
{
	driver.findElement(By.linkText("Register")).click();
	register_page r=new register_page(driver);
	r.getGender().click();
	r.getFirstname().sendKeys(s1);
	r.getLastname().sendKeys(s2);
	r.getEmail().sendKeys(s3);
	r.getPassword().sendKeys(s4);
	r.getConfirmpassword().sendKeys(s5);
	r.getRegister().click();
	}
}
