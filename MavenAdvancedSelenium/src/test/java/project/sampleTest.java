package project;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class sampleTest {
@Test
public void testcase()
{
	Reporter.log("Hellooooo world",true);
	}
@Test
public void testcase1()
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://mvnrepository.com/");
	}
@Test
public void testcase2()
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	}
@Test
public void testcase3()
{
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
}
}
