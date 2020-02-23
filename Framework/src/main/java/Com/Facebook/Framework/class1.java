package Com.Facebook.Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


	public class class1 {
		
		WebDriver driver;
		
		@FindBy(linkText="Try Prime")
		WebElement Prime;
		
		public class1 (WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
			}
			

			public void click() {
			Prime.click();
			
		}
		
	}

