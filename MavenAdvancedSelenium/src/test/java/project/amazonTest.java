package project;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class amazonTest {
	@Test
	public void testcase2()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		}
}
