package CS.CS1Hybrid;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import resources.Base;


public class listeners implements ITestListener {
		Base b = new Base();

		public void onTestStart(ITestResult result) {

		}

		public void onTestSuccess(ITestResult result) {
			System.out.println("test successfully passed.");
		}

		public void onTestFailure(ITestResult result) {

			try {
				b.getScreenshot(result.getName());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public void onTestSkipped(ITestResult result) {

		}

		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		}

		public void onTestFailedWithTimeout(ITestResult result) {
			this.onTestFailure(result);
		}

		public void onStart(ITestContext context) {
		}

		public void onFinish(ITestContext context) {

		}

	}



