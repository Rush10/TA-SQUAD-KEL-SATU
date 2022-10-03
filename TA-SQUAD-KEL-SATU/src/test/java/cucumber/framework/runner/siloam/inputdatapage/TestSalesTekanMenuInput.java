package cucumber.framework.runner.siloam.inputdatapage;

/*
created_by : Novri
created_date : 03/10/2022
updated_by : -
updated_date : -
*/

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.InputDataPage;
import cucumber.framework.page.siloam.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TestSalesTekanMenuInput {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private InputDataPage inputDataPage = new InputDataPage();
	
	public TestSalesTekanMenuInput() {
		driver = InputDataOutlineHooks.driver;
		extentTest = InputDataOutlineHooks.extentTest;
	}
	
	@When("Siloam299 Sales login dan masuk ke halaman home")
	public void siloam299_sales_login_dan_masuk_ke_halaman_home() {
		driver.get(Constants.URL_SILOAM);
		inputDataPage.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		inputDataPage.btnLogin();
		extentTest.log(LogStatus.PASS, "Siloam299 Sales login dan masuk ke halaman home");
	}

	@When("Siloam299 Sales tekan tombol menu input")
	public void siloam299_sales_tekan_tombol_menu_input() {
		inputDataPage.clickInputDataMenu();
		extentTest.log(LogStatus.PASS, "Siloam299 Sales tekan tombol menu input");
	}

	@Then("Siloam299 Validasi judul halaman input")
	public void siloam299_validasi_judul_halaman_input() {
		String txtExpected = "Input Data";
		assertTrue(inputDataPage.getInputDataTitle().contains(txtExpected));
		extentTest.log(LogStatus.PASS, "Siloam299 Validasi judul halaman input");
	}

}
