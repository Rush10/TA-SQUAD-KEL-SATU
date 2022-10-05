package cucumber.framework.runner.siloam.ttddigitalpage;

/*
created_by : Novri
created_date : 05/10/2022
updated_by : -
updated_date : -
*/

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.TandaTanganDigitalPage;
import cucumber.framework.runner.siloam.ttddigitalpage.TandaTanganDigitalOutlineHooks;
import cucumber.framework.utils.Utils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestHapusFileUploadBefore {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private TandaTanganDigitalPage ttdDigitalPage = new TandaTanganDigitalPage();
	
	public TestHapusFileUploadBefore() {
		driver = TandaTanganDigitalOutlineHooks.driver;
		extentTest = TandaTanganDigitalOutlineHooks.extentTest;
	}
	
	@When("Siloam370001 Sales login dan masuk ke halaman ttd digital")
	public void siloam370001_sales_login_dan_masuk_ke_halaman_ttd_digital() {
		driver.get(Constants.URL_SILOAM);
		ttdDigitalPage.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		ttdDigitalPage.btnLogin();
		driver.get(Constants.URL_SILOAM_TTD_DIGITAL_DELETE_UPLOAD);
		Utils.scrollByVisibleElement(ttdDigitalPage.getDeleteBefore(), driver);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	    extentTest.log(LogStatus.PASS, "Siloam370001 Sales login dan masuk ke halaman ttd digital");
	}

	@When("Siloam370001 Sales tekan tombol hapus file upload before")
	public void siloam370001_sales_tekan_tombol_hapus_file_upload_before() {
		Utils.elementClick(ttdDigitalPage.getDeleteBefore(), driver);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		extentTest.log(LogStatus.PASS, "Siloam370001 Sales tekan tombol hapus file upload before");
	}

	@When("Siloam370001 Klik cancel di alert konfirmasi hapus file upload before")
	public void siloam370001_klik_cancel_di_alert_konfirmasi_hapus_file_upload_before() throws AWTException {
		Utils.tabEnter(1,1);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		extentTest.log(LogStatus.PASS, "Siloam370001 Klik cancel di alert konfirmasi hapus file upload before");
	}

	@Then("Siloam370001 Validasi judul halaman ttd digital")
	public void siloam370001_validasi_judul_halaman_ttd_digital() {
		String txtExpected = "Upload Dokumen";
		assertTrue(ttdDigitalPage.getUploadDokumenTitle().contains(txtExpected));
		extentTest.log(LogStatus.PASS, "Siloam370001 Validasi judul halaman ttd digital");
	}

	@When("Siloam370002 Sales tekan tombol hapus file upload before")
	public void siloam370002_sales_tekan_tombol_hapus_file_upload_before() {
		Utils.elementClick(ttdDigitalPage.getDeleteBefore(), driver);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		extentTest.log(LogStatus.PASS, "Siloam370002 Sales tekan tombol hapus file upload before");
	}

	@When("Siloam370002 Klik ok di alert konfirmasi hapus file upload before")
	public void siloam370002_klik_ok_di_alert_konfirmasi_hapus_file_upload_before() throws AWTException {
		Utils.tabEnter(0,1);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		extentTest.log(LogStatus.PASS, "Siloam370002 Klik ok di alert konfirmasi hapus file upload before");
	}

	@Then("Siloam370002 Validasi judul halaman ttd digital dan pesan dokumen berhasil dihapus")
	public void siloam370002_validasi_judul_halaman_ttd_digital_dan_pesan_dokumen_berhasil_dihapus() {
		String txtExpectedTitle = "TTD Digital";
		assertTrue(ttdDigitalPage.getTTDDigitalTitle().contains(txtExpectedTitle));
		String txtExpectedMsg = "berhasil didelete";
		assertTrue(ttdDigitalPage.getMsgAlert().contains(txtExpectedMsg));
		extentTest.log(LogStatus.PASS, "Siloam370002 Validasi judul halaman ttd digital dan pesan dokumen berhasil dihapus");
	}
	
}
