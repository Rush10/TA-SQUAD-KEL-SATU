package cucumber.framework.runner.siloam.viewexportpageoutline;

/*
created_by : Adit
created_date : 29/09/2022
updated_by : Novri
updated_date : 02/10/2022
*/

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

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

public class TestDownload {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private ViewExportPage viewExportPage = new ViewExportPage();
	
	public TestDownload() throws IOException {
		driver = ViewExportHooksOutline.driver;
		extentTest = ViewExportHooksOutline.extentTest;
		Utils.deleteFile("C:\\Users\\" + Constants.USER_COMPUTER_NAME + "\\Downloads\\" + Utils.getCurrentDateWithoutStrip() + ".zip");
		Utils.deleteFile("C:\\Users\\" + Constants.USER_COMPUTER_NAME + "\\Downloads\\" + Utils.getCurrentDateWithoutStrip() + " (1).zip");
	}
	
	@Given("Siloam030 Admin Berada Di Halaman View Export Dan Sudah Tekan Filter")
	public void siloam030_admin_berada_di_halaman_view_export_dan_sudah_tekan_filter() {
		driver.get(Constants.URL_SILOAM);
		viewExportPage.login(Constants.USERNAME_ADMIN_SILOAM,Constants.PASSWORD_ADMIN_SILOAM);
	    viewExportPage.btnLogin();
	    viewExportPage.btnViewExport();
	    
	    String startDate = "2022-09-14";
	    String endDate = "2022-09-18";
	    
	    viewExportPage.filter(startDate,endDate);
	    extentTest.log(LogStatus.PASS, "Siloam030 Admin Berada Di Halaman View Export Dan Sudah Tekan Filter");
	}

	@When("Siloam030 Admin Tekan Tombol Download")
	public void siloam030_admin_tekan_tombol_download() {
		viewExportPage.btnDownload();
		
		String startDate = "2022-09-8";
	    String endDate = "2022-09-10";
	    
		viewExportPage.filter(startDate, endDate);
		viewExportPage.btnDownload();
	    extentTest.log(LogStatus.PASS, "Siloam030 Admin Tekan Tombol Download");
	}

	@Then("Siloam030 Validasi An uncaught Exception was encountered")
	public void siloam030_validasi_an_uncaught_exception_was_encountered() {
		String pathSatu = "C:\\Users\\" + Constants.USER_COMPUTER_NAME + "\\Downloads\\" + Utils.getCurrentDateWithoutStrip() + ".zip";
		String pathDua = "C:\\Users\\" + Constants.USER_COMPUTER_NAME + "\\Downloads\\" + Utils.getCurrentDateWithoutStrip() + " (1).zip";
		assertFalse(Utils.getFileSize(pathSatu) == Utils.getFileSize(pathDua));
		extentTest.log(LogStatus.PASS, "Siloam030 Validasi An uncaught Exception was encountered");
	}
}
