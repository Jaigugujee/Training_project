package Com.Facebook.Framework;



import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import Commons.Browsers;


public class App extends Browsers implements ITestListener

{

	

	public void onTestSuccess(ITestResult result) {
		try {
			screenshorts();
		} catch (IOException e) {
			 e.printStackTrace();
		}
		
	}

	public void onTestFailure(ITestResult result) {
		try {
			screenshorts();
			}catch (IOException e) {
				 e.printStackTrace();
			
		
		
	}
	
}
}
