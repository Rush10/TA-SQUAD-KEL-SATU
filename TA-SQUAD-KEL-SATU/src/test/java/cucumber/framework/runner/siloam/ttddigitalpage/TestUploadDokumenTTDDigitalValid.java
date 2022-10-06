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

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.TandaTanganDigitalPage;
import cucumber.framework.utils.Utils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TestUploadDokumenTTDDigitalValid {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private TandaTanganDigitalPage ttdPage = new TandaTanganDigitalPage();
	
	public TestUploadDokumenTTDDigitalValid() {
		driver = TandaTanganDigitalOutlineHooks.driver;
		extentTest = TandaTanganDigitalOutlineHooks.extentTest;
	}
	
	@When("Siloam395001 Sales login dan masuk ke halaman upload dokumen")
	public void siloam395001_sales_login_dan_masuk_ke_halaman_upload_dokumen() {
		driver.get(Constants.URL_SILOAM);
		ttdPage.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		ttdPage.btnLogin();
		driver.get(Constants.URL_SILOAM_TTD_DIGITAL_DELETE_AND_UPLOAD);
		Utils.scrollByVisibleElement(ttdPage.getlblUploadDokumenTitle(), driver);
	    extentTest.log(LogStatus.PASS, "Siloam395001 Sales login dan masuk ke halaman upload dokumen");
	}

	@When("Siloam395001 Sales tekan tombol modal upload foto ttd digital")
	public void siloam395001_sales_tekan_tombol_modal_upload_foto_ttd_digital() {
		ttdPage.clickBtnUpdateTTDDigital();
		extentTest.log(LogStatus.PASS, "Siloam395001 Sales tekan tombol modal upload foto ttd digital");
	}

	@Then("Siloam395001 Validasi judul modal upload foto ttd digital")
	public void siloam395001_validasi_judul_modal_upload_foto_ttd_digital() {
		String txtExpected = "Upload Foto TTD";
		assertTrue(ttdPage.getModalTitle().contains(txtExpected)); 
		extentTest.log(LogStatus.PASS, "Siloam395001 Validasi judul modal upload foto ttd digital");
	}
	
	@When("Siloam395002 Sales tekan tombol cancel modal upload foto ttd digital")
	public void siloam395002_sales_tekan_tombol_cancel_modal_upload_foto_ttd_digital() {
		ttdPage.clickBtnCancelTTDDigital();
		extentTest.log(LogStatus.PASS, "Siloam395002 Sales tekan tombol cancel modal upload foto ttd digital");
	}

	@Then("Siloam395002 Validasi judul upload dokumen")
	public void siloam395002_validasi_judul_upload_dokumen() {
		String txtExpected = "Upload Dokumen";
		assertTrue(ttdPage.getUploadDokumenTitle().contains(txtExpected));
		extentTest.log(LogStatus.PASS, "Siloam395002 Validasi judul upload dokumen");
	}
	
	@When("Siloam395003 Sales tekan tombol modal upload foto ttd digital")
	public void siloam395003_sales_tekan_tombol_modal_upload_foto_ttd_digital() {
		ttdPage.clickBtnUpdateTTDDigital();
		extentTest.log(LogStatus.PASS, "Siloam395003 Sales tekan tombol modal upload foto ttd digital");
	}

	@When("Siloam395003 Sales tekan tombol keluar modal upload foto ttd digital")
	public void siloam395003_sales_tekan_tombol_keluar_modal_upload_foto_ttd_digital() {
		ttdPage.clickBtnKeluarTTDDigital();
		extentTest.log(LogStatus.PASS, "Siloam395003 Sales tekan tombol keluar modal upload foto ttd digital");
	}

	@Then("Siloam395003 Validasi judul upload dokumen")
	public void siloam395003_validasi_judul_upload_dokumen() {
		String txtExpected = "Upload Dokumen";
		assertTrue(ttdPage.getUploadDokumenTitle().contains(txtExpected));
		extentTest.log(LogStatus.PASS, "Siloam395003 Validasi judul upload dokumen");
	}
	
	@When("Siloam395004 Sales tekan tombol modal upload foto ttd digital")
	public void siloam395004_sales_tekan_tombol_modal_upload_foto_ttd_digital() {
		ttdPage.clickBtnUpdateTTDDigital();
		extentTest.log(LogStatus.PASS, "Siloam395004 Sales tekan tombol modal upload foto ttd digital");
	}

	@When("Siloam395004 Sales memilih foto ttd digital")
	public void siloam395004_sales_memilih_foto_ttd_digital() {
		String path = System.getProperty("user.dir") + "\\data\\testing-file\\Upload Foto TTD.jpg";
		ttdPage.fileUpload(path);
		extentTest.log(LogStatus.PASS, "Siloam395004 Sales memilih foto ttd digital");
	}

	@Then("Siloam395004 Validasi preview foto")
	public void siloam395004_validasi_preview_foto() {
		String txtExpectedPath = "https://dev.ptdika.com/siloam/new_assets/noimage.png";
		assertFalse(ttdPage.txtSrcPreview(ttdPage.getPreviewImgModal()).equals(txtExpectedPath));
		extentTest.log(LogStatus.PASS, "Siloam395004 Validasi preview foto");
	}
	
	@When("Siloam395005 Sales tekan tombol cancel modal upload foto ttd digital")
	public void siloam395005_sales_tekan_tombol_cancel_modal_upload_foto_ttd_digital() {
		ttdPage.clickBtnCancelTTDDigital();
		extentTest.log(LogStatus.PASS, "Siloam395005 Sales tekan tombol cancel modal upload foto ttd digital");
	}

	@Then("Siloam395005 Validasi judul upload dokumen")
	public void siloam395005_validasi_judul_upload_dokumen() {
		String txtExpected = "Upload Dokumen";
		assertTrue(ttdPage.getUploadDokumenTitle().contains(txtExpected));
		extentTest.log(LogStatus.PASS, "Siloam395005 Validasi judul upload dokumen");
	}
	
	@When("Siloam395006 Sales tekan tombol modal upload foto ttd digital")
	public void siloam395006_sales_tekan_tombol_modal_upload_foto_ttd_digital() {
		ttdPage.clickBtnUpdateTTDDigital();
		extentTest.log(LogStatus.PASS, "Siloam395006 Sales tekan tombol modal upload foto ttd digital");
	}

	@When("Siloam395006 Sales memilih foto ttd digital")
	public void siloam395006_sales_memilih_foto_ttd_digital() {
		String path = System.getProperty("user.dir") + "\\data\\testing-file\\Upload Foto TTD.jpg";
		ttdPage.fileUpload(path);
		extentTest.log(LogStatus.PASS, "Siloam395006 Sales memilih foto ttd digital");
	}

	@When("Siloam395006 Sales klik tombol keluar modal upload foto ttd digital")
	public void siloam395006_sales_klik_tombol_keluar_modal_upload_foto_ttd_digital() {
		ttdPage.clickBtnKeluarTTDDigital();
		extentTest.log(LogStatus.PASS, "Siloam395006 Sales klik tombol keluar modal upload foto ttd digital");
	}

	@Then("Siloam395006 Validasi judul upload dokumen")
	public void siloam395006_validasi_judul_upload_dokumen() {
		String txtExpected = "Upload Dokumen";
		assertTrue(ttdPage.getUploadDokumenTitle().contains(txtExpected));
		extentTest.log(LogStatus.PASS, "Siloam395006 Validasi judul upload dokumen");
	}
	
	@When("Siloam395007 Sales tekan tombol modal upload foto ttd digital")
	public void siloam395007_sales_tekan_tombol_modal_upload_foto_ttd_digital() {
		ttdPage.clickBtnUpdateTTDDigital();
		extentTest.log(LogStatus.PASS, "Siloam395007 Sales tekan tombol modal upload foto ttd digital");
	}

	@When("Siloam395007 Sales memilih foto ttd digital")
	public void siloam395007_sales_memilih_foto_ttd_digital() {
		String path = System.getProperty("user.dir") + "\\data\\testing-file\\Upload Foto TTD.jpg";
		ttdPage.fileUpload(path);
		extentTest.log(LogStatus.PASS, "Siloam395007 Sales memilih foto ttd digital");
	}

	@When("Siloam395007 Sales tekan tombol simpan foto ttd digital pada modal upload foto ttd digital")
	public void siloam395007_sales_tekan_tombol_simpan_foto_ttd_digital_pada_modal_upload_foto_ttd_digital() {
		ttdPage.clickBtnSaveTTDDigital();
		extentTest.log(LogStatus.PASS, "Siloam395007 Sales tekan tombol simpan foto ttd digital pada modal upload foto ttd digital");
	}

	@When("Siloam395007 Sales tekan tombol ok pada modal upload foto ttd digital berhasil")
	public void siloam395007_sales_tekan_tombol_ok_pada_modal_upload_foto_ttd_digital_berhasil() {
		ttdPage.clickOK();
		extentTest.log(LogStatus.PASS, "Siloam395007 Sales tekan tombol ok pada modal upload foto ttd digital berhasil");
	}

	@Then("Siloam395007 Validasi judul halaman ttd digital")
	public void siloam395007_validasi_judul_halaman_ttd_digital() {
		String txtExpectedTitle = "TTD Digital";
		assertTrue(ttdPage.getTTDDigitalTitle().contains(txtExpectedTitle));
		extentTest.log(LogStatus.PASS, "Siloam395007 Validasi judul halaman ttd digital");
	}

}
