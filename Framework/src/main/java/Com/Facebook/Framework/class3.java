package Com.Facebook.Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


	public class class3 {
		WebDriver driver;
		
		@FindBy(xpath="//input[@id='ap_email']")
		WebElement Email;

		@FindBy(xpath="//input[@id='ap_password']")
		WebElement password;
		@FindBy(id="signInSubmit")
		WebElement button;
		@FindBy(xpath="//*[@class='a-list-item']")
		WebElement error;
		
		public class3 (WebDriver driver) {
		this.driver= driver;
			PageFactory.initElements(driver, this);
		}
		
		public void Email(String enteremail){
		Email.sendKeys(enteremail);
		
		}
	    public void pass(String pass) {
	    	password.sendKeys(pass);

	    }

	    public void click1() {
	    	button.click();
	    }
	    
	    public void empty() {
	    Email.clear();	
	    	
	    }
	    
	    public String message() {
	    	String error3 = error.getText();
	    	return error3;
	    
	    }	
	}


