package Test;

import org.testng.annotations.Test;

import Com.Facebook.Framework.class1;
import Com.Facebook.Framework.class2;
import Com.Facebook.Framework.class3;
import Commons.Browsers;

public class TestNG  extends Browsers{
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
	@Test(priority = 3)
	public void SUBMIT() {
	class3 home= new class3(driver);
	home.Email("sumit@yahoo.com");
	home.pass("123");
	home.click1();

}
}