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

import java.net.UnknownHostException;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.UploadDokumenPage;
import cucumber.framework.utils.Utils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TestUploadDokumenFaskesAwalInvalid {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private UploadDokumenPage uploadDokumenPage = new UploadDokumenPage();
	
	public TestUploadDokumenFaskesAwalInvalid() {
		driver = UploadDokumenOutlineHooks.driver;
		extentTest = UploadDokumenOutlineHooks.extentTest;
	}
	
	@When("Siloam355001 Sales login dan masuk ke halaman upload dokumen")
	public void siloam355001_sales_login_dan_masuk_ke_halaman_upload_dokumen() {
		driver.get(Constants.URL_SILOAM);
		uploadDokumenPage.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		uploadDokumenPage.btnLogin();
		driver.get(Constants.URL_SILOAM_DATA_UPLOAD_DOC_INVALID);
	    extentTest.log(LogStatus.PASS, "Siloam355001 Sales login dan masuk ke halaman upload dokumen");
	}

	@When("Siloam355001 Sales tekan tombol simpan foto faskes awal invalid")
	public void siloam355001_sales_tekan_tombol_simpan_foto_faskes_awal_invalid() {
		uploadDokumenPage.clickUploadDocImgAwal();
		uploadDokumenPage.clickSave();
		extentTest.log(LogStatus.PASS, "Siloam355001 Sales tekan tombol simpan foto faskes awal invalid");
	}

	@Then("Siloam355001 Validasi pesan error belum memilih foto faskes awal")
	public void siloam355001_validasi_pesan_error_belum_memilih_foto_faskes_awal() {
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		String txtExpected = "You did not select a file to upload";
		assertTrue(uploadDokumenPage.txtErrorSave().contains(txtExpected));
		extentTest.log(LogStatus.PASS, "Siloam355001 Validasi pesan error belum memilih foto faskes awal");
	}
	
	@When("Siloam355002 Sales memilih file faskes awal yang tidak sesuai ekstensi")
	public void siloam355002_sales_memilih_file_faskes_awal_yang_tidak_sesuai_ekstensi() {
		String path = System.getProperty("user.dir") + "\\data\\testing-file\\testing.xls";
		uploadDokumenPage.fileUpload(path);
		extentTest.log(LogStatus.PASS, "Siloam355002 Sales memilih file faskes awal yang tidak sesuai ekstensi");
	}

	@Then("Siloam355002 Validasi catatan error")
	public void siloam355002_validasi_catatan_error() {
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		String txtExpectedMsg = "Please Select A valid Image File";
		assertTrue(uploadDokumenPage.txtErrorChooseFileMsg().contains(txtExpectedMsg));
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		String txtExpectedNote = "Only jpeg, jpg and png Images type allowed";
		assertTrue(uploadDokumenPage.txtErrorChooseFileNote().contains(txtExpectedNote));
		extentTest.log(LogStatus.PASS, "Siloam355002 Validasi catatan error");
	}
	
	@When("Siloam355003 Sales tekan tombol simpan foto faskes awal invalid")
	public void siloam355003_sales_tekan_tombol_simpan_foto_faskes_awal_invalid() {
		uploadDokumenPage.clickSave();
		extentTest.log(LogStatus.PASS, "Siloam355003 Sales tekan tombol simpan foto faskes awal invalid");
	}

	@Then("Siloam355003 Validasi pesan error")
	public void siloam355003_validasi_pesan_error() {
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		String txtExpected = "The filetype you are attempting to upload is not allowed";
		assertTrue(uploadDokumenPage.txtErrorSave().contains(txtExpected));
		extentTest.log(LogStatus.PASS, "Siloam355003 Validasi pesan error");
	}
	
	@When("Siloam355004 Sales memilih file faskes awal dengan size lima mb")
	public void siloam355004_sales_memilih_file_faskes_awal_dengan_size_lima_mb(){
		String path = System.getProperty("user.dir") + "\\data\\testing-file\\Big File Size.jpg";
		uploadDokumenPage.fileUpload(path);
		extentTest.log(LogStatus.PASS, "Siloam355004 Sales memilih file faskes awal dengan size lima mb");
	}

	@When("Siloam355004 Sales tekan tombol simpan foto faskes awal invalid")
	public void siloam355004_sales_tekan_tombol_simpan_foto_faskes_awal_invalid() {
		uploadDokumenPage.clickSave();
		extentTest.log(LogStatus.PASS, "Siloam355004 Sales tekan tombol simpan foto faskes awal invalid");
	}

	@Then("Siloam355004 Validasi pesan error")
	public void siloam355004_validasi_pesan_error() {
		Utils.delay(10, Constants.GLOB_PARAM_DELAY);
		String txtExpected = "The file you are attempting to upload is larger than the permitted size";
		assertTrue(uploadDokumenPage.txtErrorSave().contains(txtExpected));
		extentTest.log(LogStatus.PASS, "Siloam355004 Validasi pesan error");
	}

}
