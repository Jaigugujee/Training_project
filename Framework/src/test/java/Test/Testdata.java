package Test;

import org.testng.annotations.Test;

import Com.Facebook.Framework.class1;
import Com.Facebook.Framework.class2;
import Com.Facebook.Framework.class3;
import Commons.Browsers;

import org.testng.annotations.DataProvider;

public class Testdata extends Browsers {
	
	 @Test(priority = 1)
	  
	  public void HOME() {
		  class1 home=new class1(driver);
		  home.click();
	  } 
		@Test(priority = 2)  
		  public void LOGIN() {
		  class2 home=new class2(driver);
		  home.button(); 
		}
	
	
  @Test(priority = 3,dataProvider = "signin")
  public void f(String n, String s) throws InterruptedException {
	  
	  
			class3 home= new class3(driver);
			home.Email(n);
			home.pass(s);
			home.click1();
			home.empty();
			Thread.sleep(4000);
	  
	  
  }

  @DataProvider
  public Object[][] signin() {
    return new Object[][] {
      new Object[] { "sumit@gmail.com", "a" },
      new Object[] { "sminocha10@gmail.com", "b" },
      new Object[] { "empty10@gmail.com", "c" },
    };
  }
}
