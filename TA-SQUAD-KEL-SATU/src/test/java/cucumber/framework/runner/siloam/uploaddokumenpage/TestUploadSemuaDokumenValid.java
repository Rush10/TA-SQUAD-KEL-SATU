package cucumber.framework.runner.siloam.uploaddokumenpage;

/*
created_by : Novri
created_date : 04/10/2022
updated_by : -
updated_date : -
*/

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.UploadDokumenPage;
import cucumber.framework.utils.Utils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TestUploadSemuaDokumenValid {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private UploadDokumenPage uploadDokumenPage = new UploadDokumenPage();
	
	public TestUploadSemuaDokumenValid() {
		driver = UploadDokumenOutlineHooks.driver;
		extentTest = UploadDokumenOutlineHooks.extentTest;
	}
	
	@When("Siloam350001 Sales login dan masuk ke halaman upload dokumen")
	public void siloam350001_sales_login_dan_masuk_ke_halaman_upload_dokumen() {
		driver.get(Constants.URL_SILOAM);
		uploadDokumenPage.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		uploadDokumenPage.btnLogin();
		driver.get(Constants.URL_SILOAM_DATA_UPLOAD_DOC);
	    extentTest.log(LogStatus.PASS, "Siloam350001 Sales login dan masuk ke halaman upload dokumen");
	}

	@When("Siloam350001 Sales tekan tombol selanjutnya")
	public void siloam350001_sales_tekan_tombol_selanjutnya() {
		uploadDokumenPage.clickSelanjutnya();
		extentTest.log(LogStatus.PASS, "Siloam350001 Sales tekan tombol selanjutnya");
	}

	@When("Siloam350001 Klik cancel di alert lanjut ke tahap selanjutnya")
	public void siloam350001_klik_cancel_di_alert_lanjut_ke_tahap_selanjutnya() throws AWTException {
		Utils.tabEnter(1, 1);
		extentTest.log(LogStatus.PASS, "Siloam350001 Klik cancel di alert lanjut ke tahap selanjutnya");
	}

	@Then("Siloam350001 Validasi judul halaman upload dokumen")
	public void siloam350001_validasi_judul_halaman_upload_dokumen() {
		String txtExpected = "Upload Document";
		assertTrue(uploadDokumenPage.txtTitleUploadDocument().contains(txtExpected));
		extentTest.log(LogStatus.PASS, "Siloam350001 Validasi judul halaman upload dokumen");
	}

	@When("Siloam350002 Sales tekan tombol selanjutnya")
	public void siloam350002_sales_tekan_tombol_selanjutnya() {
		uploadDokumenPage.clickSelanjutnya();
		extentTest.log(LogStatus.PASS, "Siloam350002 Sales tekan tombol selanjutnya");
	}

	@When("Siloam350002 Klik ok di alert lanjut ke tahap selanjutnya")
	public void siloam350002_klik_ok_di_alert_lanjut_ke_tahap_selanjutnya() throws AWTException {
		Utils.tabEnter(0, 1);
		extentTest.log(LogStatus.PASS, "Siloam350002 Klik ok di alert lanjut ke tahap selanjutnya");
	}

	@Then("Siloam350002 Validasi judul halaman ttd digital")
	public void siloam350002_validasi_judul_halaman_ttd_digital() {
		String txtExpected = "TTD Digital";
		assertTrue(uploadDokumenPage.txtTitleTTDDigital().contains(txtExpected));
		extentTest.log(LogStatus.PASS, "Siloam350002 Validasi judul halaman ttd digital");
	}

}
