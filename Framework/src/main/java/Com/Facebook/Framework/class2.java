package Com.Facebook.Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class class2 {
	WebDriver driver;
	
	@FindBy(xpath="//input[@class='prime-cta-signup-button-input']")
	WebElement Primepage;
	
	public class2 (WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		}
			
		
			public void button() {
			Primepage.click();
			
		}
		
}

