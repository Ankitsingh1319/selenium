package generic;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Base_Test extends utility_methods {
	@BeforeSuite
	public void connectserver()
	{
		Reporter.log("connecting to the server",true);
		}
	@BeforeTest
	public void connectDatabase()
	{
		Reporter.log("connecting to the database",true);
		}
	@BeforeClass
    public void beforeclass() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demowebshop.tricentis.com/");
}
	@AfterClass
	public void afterclass()
	{
		driver.quit();
	}
	@AfterTest
	public void disconnectDatabase()
	{
		Reporter.log("disconnecting to the database",true);
		}
	@AfterSuite
	public void disconnectserver()
	{
		Reporter.log("disconnecting the server",true);
		}
}
