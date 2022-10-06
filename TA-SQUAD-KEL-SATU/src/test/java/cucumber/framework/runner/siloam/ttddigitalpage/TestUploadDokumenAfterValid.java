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


public class TestUploadDokumenAfterValid {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private TandaTanganDigitalPage ttdPage = new TandaTanganDigitalPage();
	
	public TestUploadDokumenAfterValid() {
		driver = TandaTanganDigitalOutlineHooks.driver;
		extentTest = TandaTanganDigitalOutlineHooks.extentTest;
	}
	
	@When("Siloam390001 Sales login dan masuk ke halaman upload dokumen")
	public void siloam390001_sales_login_dan_masuk_ke_halaman_upload_dokumen() {
		driver.get(Constants.URL_SILOAM);
		ttdPage.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		ttdPage.btnLogin();
		driver.get(Constants.URL_SILOAM_TTD_DIGITAL_DELETE_AND_UPLOAD);
		Utils.scrollByVisibleElement(ttdPage.getlblUploadDokumenTitle(), driver);
	    extentTest.log(LogStatus.PASS, "Siloam390001 Sales login dan masuk ke halaman upload dokumen");
	}

	@When("Siloam390001 Sales tekan tombol modal upload foto after")
	public void siloam390001_sales_tekan_tombol_modal_upload_foto_after() {
		ttdPage.clickBtnUpdateAfter();
		extentTest.log(LogStatus.PASS, "Siloam390001 Sales tekan tombol modal upload foto after");
	}

	@Then("Siloam390001 Validasi judul modal upload foto after")
	public void siloam390001_validasi_judul_modal_upload_foto_after() {
		String txtExpected = "Upload Foto After";
		assertTrue(ttdPage.getModalTitle().contains(txtExpected)); 
		extentTest.log(LogStatus.PASS, "Siloam390001 Validasi judul modal upload foto after");
	}
	
	@When("Siloam390002 Sales tekan tombol cancel modal upload foto after")
	public void siloam390002_sales_tekan_tombol_cancel_modal_upload_foto_after() {
		ttdPage.clickBtnCancelTTDDigital();
		extentTest.log(LogStatus.PASS, "Siloam390002 Sales tekan tombol cancel modal upload foto after");
	}

	@Then("Siloam390002 Validasi judul upload dokumen")
	public void siloam390002_validasi_judul_upload_dokumen() {
		String txtExpected = "Upload Dokumen";
		assertTrue(ttdPage.getUploadDokumenTitle().contains(txtExpected));
		extentTest.log(LogStatus.PASS, "Siloam390002 Validasi judul upload dokumen");
	}
	
	@When("Siloam390003 Sales tekan tombol modal upload foto after")
	public void siloam390003_sales_tekan_tombol_modal_upload_foto_after() {
		ttdPage.clickBtnUpdateAfter();
		extentTest.log(LogStatus.PASS, "Siloam390003 Sales tekan tombol modal upload foto after");
	}

	@When("Siloam390003 Sales tekan tombol keluar modal upload foto after")
	public void siloam390003_sales_tekan_tombol_keluar_modal_upload_foto_after() {
		ttdPage.clickBtnKeluarTTDDigital();
		extentTest.log(LogStatus.PASS, "Siloam390003 Sales tekan tombol keluar modal upload foto after");
	}

	@Then("Siloam390003 Validasi judul upload dokumen")
	public void siloam390003_validasi_judul_upload_dokumen() {
		String txtExpected = "Upload Dokumen";
		assertTrue(ttdPage.getUploadDokumenTitle().contains(txtExpected));
		extentTest.log(LogStatus.PASS, "Siloam390003 Validasi judul upload dokumen");
	}
	
	@When("Siloam390004 Sales tekan tombol modal upload foto after")
	public void siloam390004_sales_tekan_tombol_modal_upload_foto_after() {
		ttdPage.clickBtnUpdateAfter();
		extentTest.log(LogStatus.PASS, "Siloam390004 Sales tekan tombol modal upload foto after");
	}

	@When("Siloam390004 Sales memilih foto after")
	public void siloam390004_sales_memilih_foto_after() {
		String path = System.getProperty("user.dir") + "\\data\\testing-file\\Upload Foto Faskes Tujuan.jpg";
		ttdPage.fileUpload(path);
		extentTest.log(LogStatus.PASS, "Siloam390004 Sales memilih foto after");
	}

	@Then("Siloam390004 Validasi preview foto")
	public void siloam390004_validasi_preview_foto() {
		String txtExpectedPath = "https://dev.ptdika.com/siloam/new_assets/noimage.png";
		assertFalse(ttdPage.txtSrcPreview(ttdPage.getPreviewImgModal()).equals(txtExpectedPath));
		extentTest.log(LogStatus.PASS, "Siloam390004 Validasi preview foto");
	}
	
	@When("Siloam390005 Sales tekan tombol cancel modal upload foto after")
	public void siloam390005_sales_tekan_tombol_cancel_modal_upload_foto_after() {
		ttdPage.clickBtnCancelTTDDigital();
		extentTest.log(LogStatus.PASS, "Siloam390005 Sales tekan tombol cancel modal upload foto after");
	}

	@Then("Siloam390005 Validasi judul upload dokumen")
	public void siloam390005_validasi_judul_upload_dokumen() {
		String txtExpected = "Upload Dokumen";
		assertTrue(ttdPage.getUploadDokumenTitle().contains(txtExpected));
		extentTest.log(LogStatus.PASS, "Siloam390005 Validasi judul upload dokumen");
	}
	
	@When("Siloam390006 Sales tekan tombol modal upload foto after")
	public void siloam390006_sales_tekan_tombol_modal_upload_foto_after() {
		ttdPage.clickBtnUpdateAfter();
		extentTest.log(LogStatus.PASS, "Siloam390006 Sales tekan tombol modal upload foto after");
	}

	@When("Siloam390006 Sales memilih foto after")
	public void siloam390006_sales_memilih_foto_after() {
		String path = System.getProperty("user.dir") + "\\data\\testing-file\\Upload Foto Faskes Tujuan.jpg";
		ttdPage.fileUpload(path);
		extentTest.log(LogStatus.PASS, "Siloam390006 Sales memilih foto after");
	}

	@When("Siloam390006 Sales klik tombol keluar modal upload foto after")
	public void siloam390006_sales_klik_tombol_keluar_modal_upload_foto_after() {
		ttdPage.clickBtnKeluarTTDDigital();
		extentTest.log(LogStatus.PASS, "Siloam390006 Sales klik tombol keluar modal upload foto after");
	}

	@Then("Siloam390006 Validasi judul upload dokumen")
	public void siloam390006_validasi_judul_upload_dokumen() {
		String txtExpected = "Upload Dokumen";
		assertTrue(ttdPage.getUploadDokumenTitle().contains(txtExpected));
		extentTest.log(LogStatus.PASS, "Siloam390006 Validasi judul upload dokumen");
	}
	
	@When("Siloam390007 Sales tekan tombol modal upload foto after")
	public void siloam390007_sales_tekan_tombol_modal_upload_foto_after() {
		ttdPage.clickBtnUpdateAfter();
		extentTest.log(LogStatus.PASS, "Siloam390007 Sales tekan tombol modal upload foto after");
	}

	@When("Siloam390007 Sales memilih foto after")
	public void siloam390007_sales_memilih_foto_after() {
		String path = System.getProperty("user.dir") + "\\data\\testing-file\\Upload Foto Faskes Tujuan.jpg";
		ttdPage.fileUpload(path);
		extentTest.log(LogStatus.PASS, "Siloam390007 Sales memilih foto after");
	}

	@When("Siloam390007 Sales tekan tombol simpan foto after pada modal upload foto after")
	public void siloam390007_sales_tekan_tombol_simpan_foto_after_pada_modal_upload_foto_after() {
		ttdPage.clickBtnSaveTTDDigital();
		extentTest.log(LogStatus.PASS, "Siloam390007 Sales tekan tombol simpan foto after pada modal upload foto after");
	}

	@When("Siloam390007 Sales tekan tombol ok pada modal upload foto after berhasil")
	public void siloam390007_sales_tekan_tombol_ok_pada_modal_upload_foto_after_berhasil() {
		ttdPage.clickOK();
		extentTest.log(LogStatus.PASS, "Siloam390007 Sales tekan tombol ok pada modal upload foto after berhasil");
	}

	@Then("Siloam390007 Validasi judul halaman ttd digital")
	public void siloam390007_validasi_judul_halaman_ttd_digital() {
		String txtExpectedTitle = "TTD Digital";
		assertTrue(ttdPage.getTTDDigitalTitle().contains(txtExpectedTitle));
		extentTest.log(LogStatus.PASS, "Siloam390007 Validasi judul halaman ttd digital");
	}
}
