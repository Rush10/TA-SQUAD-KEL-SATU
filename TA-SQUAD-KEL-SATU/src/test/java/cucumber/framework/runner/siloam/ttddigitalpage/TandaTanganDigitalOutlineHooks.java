package cucumber.framework.runner.siloam.ttddigitalpage;

//#created_by : Alamanda
//#created_date : 31/09/2022
//#updated_by : Alamanda
//#updated_date : 3/10/2022

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.connection.DriverSingleton;
import cucumber.framework.constant.Constants;
//import cucumber.framework.scenariotest.siloam.SiloamLogin;
import cucumber.framework.scenariotest.siloam.SiloamTTDDigital;
import cucumber.framework.utils.Utils;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class TandaTanganDigitalOutlineHooks {
	
	public static WebDriver driver;
	public static ExtentTest extentTest;
	public static ExtentReports reports = new ExtentReports("target/siloam/extentreport/siloam-ttd-digital-outline-outline.html");
	private static SiloamTTDDigital[] tests = SiloamTTDDigital.values();	
	private static final int[] DATA_OUTLINE = {1,1,1,1,1,1,8,28,56,70,56,5,10,10,5,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};//semua

//	private static final int[] DATA_OUTLINE = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};//semua delete & upload valid invalid
//	private static final int[] DATA_OUTLINE = {9,5,10,10,5,1,1,1,1,1,1,1,1,1,1};//semua adit
//	private static final int[] DATA_OUTLINE = {1,1,1,1,1,1,1};//semua adit
//	private static final int[] DATA_OUTLINE = {1};//submit
//	private static final int[] DATA_OUTLINE = {1,1,1,1,1,1};//hapus
//	private static final int[] DATA_OUTLINE = {1,1,1,1,1,1,1}; //upload valid
//	private static final int[] DATA_OUTLINE = {1,1,1,1}; ////upload invalid
//	private static final int[] DATA_OUTLINE = {1,1,1}; ////preview
	
//	private static final int[] DATA_OUTLINE = {9,28,56,70,56}; ////kombinasi valid edit
	
	private String testReport = "";
	
	@Before
	public void setUp() {		
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		testReport = tests[Utils.testCount].getTestName();
		extentTest = reports.startTest(testReport);
//		System.out.println("COUNT OUTLINE VALUE : "+Utils.countOutline+" TEST COUNT VALUE : "+Utils.testCount+" NILAI INDEX : "+DATA_OUTLINE VALUE [Utils.testCount]);		
		if(Utils.countOutline==DATA_OUTLINE[Utils.testCount])
		{
			Utils.countOutline=0;
			Utils.testCount++;
		}
		Utils.countOutline++;
	}
	
	@AfterStep
	public void getResultStatus(Scenario scenario) throws IOException {
		if(scenario.isFailed()) {
			String screenshotPath = Utils.getScreenshot(driver, "Siloam_TandaTanganDigitalOutlineHooks"+scenario.getName().replace(" ", "_"));
			extentTest.log(LogStatus.FAIL, scenario.getName()+"\n"
					+extentTest.addScreenCapture(screenshotPath));;
		}
	}
	
	@After
	public void closeObject() {
		reports.endTest(extentTest);
		reports.flush();
	}
	
//	@AfterTest
	@AfterAll
	public static void closeBrowser() {
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		DriverSingleton.closeObjectInstance();
	}

}
