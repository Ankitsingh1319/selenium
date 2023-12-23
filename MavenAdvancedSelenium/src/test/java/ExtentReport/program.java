package ExtentReport;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.io.Files;

public class program {
@Test
public void report() throws Exception
{
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.flipkart.com/");
	TakesScreenshot ts=(TakesScreenshot)driver;
	 String screen_shot = ts.getScreenshotAs(OutputType.BASE64);
	 
	ExtentSparkReporter esp=new ExtentSparkReporter("EXTENTREPORT//ExtentReport.html");
	ExtentReports er=new ExtentReports();
	er.attachReporter(esp);
	ExtentTest test = er.createTest("program");
	test.log(Status.INFO, "report of testcase is generated");
	
	test.addScreenCaptureFromBase64String(screen_shot);
	er.flush();
	
}
}
