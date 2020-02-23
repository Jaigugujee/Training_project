package Commons;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Browsers {
	
	
	public static WebDriver driver;
	
  
 
  @BeforeClass
  @Parameters({"url","browser"})
	  public void beforeClass(String Web, String br) {
		  //public void beforeClass() 

			if(br.equalsIgnoreCase("chrome"))
			
		{
			  System.setProperty("webdriver.chrome.driver",  "/Users/shikha/eclipse-workspace/Framework/Drivers/chromedriver 2");
			  driver=new ChromeDriver();
			  driver.get(Web);
			  //driver.get("https://www.facebook.com");
			  driver.manage().window().maximize();
		}
			  
			else if(br.equalsIgnoreCase("firefox")) {
			  System.setProperty("webdriver.gecko.driver", "/Users/shikha/eclipse-workspace/Framework/Drivers/geckodriver");
			  driver = new FirefoxDriver();
			  driver.navigate().to(Web);
			  driver.manage().window().maximize();
			}  
			else {
				System.out.println("Check the  browser");
			}
		  }  
  @AfterClass  
	public void afterClass() throws IOException {

		screenshorts();

	}

	public void screenshorts() throws IOException {
		
		
        File shorts = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(shorts, new File("/Users/shikha/Desktop/Pic/"+ timestamp()+"screenshot.png"));
		//FileUtils.copyFile(shorts, new File(+ timestamp()+"screenshot.png"));
	}
    public String timestamp() {
    
	return new SimpleDateFormat ("yyyy-MM-dd-HH-mm-ss").format(new Date());
	
}
}
  




