package cucumber.framework.runner.siloam.viewexportpage;

/*
created_by : Adit
created_date : 30/09/2022
updated_by : Novri
updated_date : 03/10/2022
*/


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.ViewExportPage;
import cucumber.framework.utils.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestPDFAgreement {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private ViewExportPage viewExportPage = new ViewExportPage();
	
	public TestPDFAgreement() throws IOException {
		driver = ViewExportHooksOutline.driver;
		extentTest = ViewExportHooksOutline.extentTest;
		Utils.deleteFile("C:\\Users\\" + Constants.USER_COMPUTER_NAME + "\\Downloads\\350_agreement_1663523732.pdf");
		Utils.deleteFile("C:\\Users\\" + Constants.USER_COMPUTER_NAME + "\\Downloads\\344_agreement_1662635941.pdf");
	}
	
	@Given("Siloam065 Admin Berada Di Halaman View Export Dan Sudah Tekan Filter")
	public void siloam065_admin_berada_di_halaman_view_export_dan_sudah_tekan_filter() {
		driver.get(Constants.URL_SILOAM);
		viewExportPage.login(Constants.USERNAME_ADMIN_SILOAM,Constants.PASSWORD_ADMIN_SILOAM);
	    viewExportPage.btnLogin();
	    viewExportPage.btnViewExport();
	    
	    String startDate = "2022-09-14";
	    String endDate = "2022-09-18";
	    
	    viewExportPage.filter(startDate,endDate);
	    extentTest.log(LogStatus.PASS, "Siloam065 Admin Berada Di Halaman View Export Dan Sudah Tekan Filter");
	}

	@When("Siloam065 Admin Tekan Link PDF Agreement")
	public void siloam060_admin_tekan_link_pdf_agreement() throws AWTException {
		viewExportPage.btnPDFAgreement();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		Utils.tabEnter();
		
		String startDate = "2022-09-8";
	    String endDate = "2022-09-10";
	    
	    viewExportPage.filter(startDate,endDate);
		viewExportPage.btnPDFAgreement();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		Utils.tabEnter();
		extentTest.log(LogStatus.PASS, "Siloam065 Admin Berada Di Halaman View Export Dan Sudah Tekan Filter");
	}

	@Then("Siloam065 Validasi PDF Agreement")
	public void siloam060_validasi_pdf_agreement() {
		String pathSatu = "C:\\Users\\" + Constants.USER_COMPUTER_NAME + "\\Downloads\\350_agreement_1663523732.pdf";
		String pathDua = "C:\\Users\\" + Constants.USER_COMPUTER_NAME + "\\Downloads\\344_agreement_1662635941.pdf";
		assertFalse(Utils.getFileSize(pathSatu) == Utils.getFileSize(pathDua));
		extentTest.log(LogStatus.PASS, "Siloam065 Validasi PDF Agreement");
	}
	
}
