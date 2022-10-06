package cucumber.framework.runner.siloam.ttddigitalpage;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.TandaTanganDigitalPage;
import cucumber.framework.utils.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestTTDDigitalFiturFileUpload {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private static TandaTanganDigitalPage ttdPage = new TandaTanganDigitalPage();
	
	public TestTTDDigitalFiturFileUpload() {
		driver = TandaTanganDigitalOutlineHooks.driver;
		extentTest = TandaTanganDigitalOutlineHooks.extentTest;
	}
	
//BEFORE
	
	@When("Siloam215 Sales Sudah Login Dan Berada Di Halaman TTD Digital Fitur File Upload")
	public void siloam215_sales_sudah_login_dan_berada_di_halaman_ttd_digital_fitur_file_upload() {
		driver.get(Constants.URL_SILOAM);
		ttdPage.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		ttdPage.btnLogin();
		driver.get(Constants.URL_SILOAM_TTD_DIGITAL_PREVIEW_UPLOAD_DOK);
		extentTest.log(LogStatus.PASS, "Siloam215 Sales Sudah Login Dan Berada Di Halaman TTD Digital Fitur File Upload");
	}

	@And("Siloam215 Sales Menekan Gambar Before Fitur File Upload")
	public void siloam215_sales_menekan_gambar_before_fitur_file_upload() throws AWTException {
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		Utils.scrollByVisibleElement(ttdPage.getlblUploadDokumenTitle(), driver);
		
		ttdPage.rightClickPreviewUploadDokumenBefore();
		
		Utils.tabEnterDown(0, 8, 2);
		
//	    ttdDigital.btnBeforeFileUpload();
	    extentTest.log(LogStatus.PASS, "Siloam215 Sales Menekan Gambar Before Fitur File Upload");
	}

	@Then("Siloam215 Validasi Gambar Before Fitur File Upload")
	public void siloam215_validasi_gambar_before_fitur_file_upload() {
		////
		extentTest.log(LogStatus.PASS, "Siloam215 Validasi Gambar Before Fitur File Upload");
	}
	
//AFTER
	
	@When("Siloam215 Sales Sudah Login Dan Berada Di Halaman TTD Digital Fitur File Upload After")
	public void siloam215_sales_sudah_login_dan_berada_di_halaman_ttd_digital_fitur_file_upload_after() {
		driver.get(Constants.URL_SILOAM);
		ttdPage.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		ttdPage.btnLogin();
		driver.get(Constants.URL_SILOAM_TTD_DIGITAL_PREVIEW_UPLOAD_DOK);
		extentTest.log(LogStatus.PASS, "Siloam215 Sales Sudah Login Dan Berada Di Halaman TTD Digital Fitur File Upload After");
	}

	@And("Siloam215 Sales Menekan Gambar After Fitur File Upload")
	public void siloam215_sales_menekan_gambar_after_fitur_file_upload() throws AWTException {
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		Utils.scrollByVisibleElement(ttdPage.getlblUploadDokumenTitle(), driver);
		
		ttdPage.rightClickPreviewUploadDokumenAfter();
		
		Utils.tabEnterDown(0, 8, 2);
		
//	    ttdDigital.btnAfterFileUpload();
	    extentTest.log(LogStatus.PASS, "Siloam215 Sales Menekan Gambar After Fitur File Upload");
	}

	@Then("Siloam215 Validasi Gambar After Fitur File Upload")
	public void siloam215_validasi_gambar_after_fitur_file_upload() {
		////
		extentTest.log(LogStatus.PASS, "Siloam215 Validasi Gambar After Fitur File Upload");
	}
	
	
//TTD DIGITAL
	
	@When("Siloam215 Sales Sudah Login Dan Berada Di Halaman TTD Digital Fitur File Upload TTD Digital")
	public void siloam215_sales_sudah_login_dan_berada_di_halaman_ttd_digital_fitur_file_upload_ttd_digital() {
		driver.get(Constants.URL_SILOAM);
		ttdPage.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		ttdPage.btnLogin();
		driver.get(Constants.URL_SILOAM_TTD_DIGITAL_PREVIEW_UPLOAD_DOK);
		extentTest.log(LogStatus.PASS, "Siloam215 Sales Sudah Login Dan Berada Di Halaman TTD Digital Fitur File Upload TTD Digital");
	}

	@And("Siloam215 Sales Menekan Gambar TTD Digital Fitur File Upload")
	public void siloam215_sales_menekan_gambar_ttd_digital_fitur_file_upload() throws AWTException {
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		Utils.scrollByVisibleElement(ttdPage.getlblUploadDokumenTitle(), driver);
		
		ttdPage.rightClickPreviewUploadDokumenTTD();
		
		Utils.tabEnterDown(0, 8, 2);
		
//	    ttdDigital.btnTTDDigitalFileUpload();
	    extentTest.log(LogStatus.PASS, "Siloam215 Sales Menekan Gambar TTD Digital Fitur File Upload");
	}

	@Then("Siloam215 Validasi Gambar TTD Digital Fitur File Upload")
	public void siloam215_validasi_gambar_ttd_digital_fitur_file_upload() {
		////
		extentTest.log(LogStatus.PASS, "Siloam215 Validasi Gambar TTD Digital Fitur File Upload");
	}
}
