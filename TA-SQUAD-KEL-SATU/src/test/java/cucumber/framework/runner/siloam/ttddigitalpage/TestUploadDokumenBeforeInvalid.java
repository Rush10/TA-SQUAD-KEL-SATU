package cucumber.framework.runner.siloam.ttddigitalpage;

/*
created_by : Novri
created_date : 06/10/2022
updated_by : -
updated_date : -
*/

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.net.UnknownHostException;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.TandaTanganDigitalPage;
import cucumber.framework.utils.Utils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TestUploadDokumenBeforeInvalid {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private TandaTanganDigitalPage ttdPage = new TandaTanganDigitalPage();
	
	public TestUploadDokumenBeforeInvalid() {
		driver = TandaTanganDigitalOutlineHooks.driver;
		extentTest = TandaTanganDigitalOutlineHooks.extentTest;
	}

	@When("Siloam400001 Sales login dan masuk ke halaman ttd digital")
	public void siloam400001_sales_login_dan_masuk_ke_halaman_ttd_digital() {
		driver.get(Constants.URL_SILOAM);
		ttdPage.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		ttdPage.btnLogin();
		driver.get(Constants.URL_SILOAM_TTD_DIGITAL_DELETE_UPLOAD);
		Utils.scrollByVisibleElement(ttdPage.getlblUploadDokumenTitle(), driver);
	    extentTest.log(LogStatus.PASS, "Siloam400001 Sales login dan masuk ke halaman ttd digital");
	}

	@When("Siloam400001 Sales tekan tombol simpan foto before invalid")
	public void siloam400001_sales_tekan_tombol_simpan_foto_before_invalid() {
		ttdPage.clickBtnUpdateBefore();
		ttdPage.clickBtnSaveTTDDigital();
		extentTest.log(LogStatus.PASS, "Siloam400001 Sales tekan tombol simpan foto before invalid");
	}

	@Then("Siloam400001 Validasi pesan error belum memilih foto before")
	public void siloam400001_validasi_pesan_error_belum_memilih_foto_before() {
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		String txtExpected = "You did not select a file to upload";
		assertTrue(ttdPage.txtErrorSave().contains(txtExpected));
		extentTest.log(LogStatus.PASS, "Siloam400001 Validasi pesan error belum memilih foto before");
	}
	
	@When("Siloam400002 Sales memilih file before yang tidak sesuai ekstensi")
	public void siloam400002_sales_memilih_file_before_yang_tidak_sesuai_ekstensi() {
		String path = System.getProperty("user.dir") + "\\data\\testing-file\\testing.xls";
		ttdPage.fileUpload(path);
		extentTest.log(LogStatus.PASS, "Siloam400002 Sales memilih file before yang tidak sesuai ekstensi");
	}

	@Then("Siloam400002 Validasi catatan error")
	public void siloam400002_validasi_catatan_error() {
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		String txtExpectedMsg = "Please Select A valid Image File";
		assertTrue(ttdPage.txtErrorChooseFileMsg().contains(txtExpectedMsg));
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		String txtExpectedNote = "Only jpeg, jpg and png Images type allowed";
		assertTrue(ttdPage.txtErrorChooseFileNote().contains(txtExpectedNote));
		extentTest.log(LogStatus.PASS, "Siloam400002 Validasi catatan error");
	}
	
	@When("Siloam400003 Sales tekan tombol simpan foto before invalid")
	public void siloam400003_sales_tekan_tombol_simpan_foto_before_invalid() {
		ttdPage.clickBtnSaveTTDDigital();
		extentTest.log(LogStatus.PASS, "Siloam400003 Sales tekan tombol simpan foto before invalid");
	}

	@Then("Siloam400003 Validasi pesan error")
	public void siloam400003_validasi_pesan_error() {
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		String txtExpected = "The filetype you are attempting to upload is not allowed";
		assertTrue(ttdPage.txtErrorSave().contains(txtExpected));
		extentTest.log(LogStatus.PASS, "Siloam400003 Validasi pesan error");
	}
	
	@When("Siloam400004 Sales memilih file before dengan size lima mb")
	public void siloam400004_sales_memilih_file_before_dengan_size_lima_mb() {
		String path = System.getProperty("user.dir") + "\\data\\testing-file\\Big File Size.jpg";
		ttdPage.fileUpload(path);
		extentTest.log(LogStatus.PASS, "Siloam355004 Sales memilih file faskes awal dengan size lima mb");
	}

	@When("Siloam400004 Sales tekan tombol simpan foto before invalid")
	public void siloam400004_sales_tekan_tombol_simpan_foto_before_invalid() {
		ttdPage.clickBtnSaveTTDDigital();
		extentTest.log(LogStatus.PASS, "Siloam400004 Sales tekan tombol simpan foto before invalid");
	}

	@Then("Siloam400004 Validasi pesan error")
	public void siloam400004_validasi_pesan_error() {
		Utils.delay(10, Constants.GLOB_PARAM_DELAY);
		String txtExpected = "The file you are attempting to upload is larger than the permitted size";
		assertTrue(ttdPage.txtErrorSave().contains(txtExpected));
		extentTest.log(LogStatus.PASS, "Siloam400004 Validasi pesan error");
	}

}
