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


public class TestUploadDokumenBeforeValid {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private TandaTanganDigitalPage ttdPage = new TandaTanganDigitalPage();
	
	public TestUploadDokumenBeforeValid() {
		driver = TandaTanganDigitalOutlineHooks.driver;
		extentTest = TandaTanganDigitalOutlineHooks.extentTest;
	}
	
	@When("Siloam385001 Sales login dan masuk ke halaman upload dokumen")
	public void siloam385001_sales_login_dan_masuk_ke_halaman_upload_dokumen() {
		driver.get(Constants.URL_SILOAM);
		ttdPage.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		ttdPage.btnLogin();
		driver.get(Constants.URL_SILOAM_TTD_DIGITAL_DELETE_AND_UPLOAD);
		Utils.scrollByVisibleElement(ttdPage.getlblUploadDokumenTitle(), driver);
	    extentTest.log(LogStatus.PASS, "Siloam385001 Sales login dan masuk ke halaman upload dokumen");
	}

	@When("Siloam385001 Sales tekan tombol modal upload foto before")
	public void siloam385001_sales_tekan_tombol_modal_upload_foto_before() {
		ttdPage.clickBtnUpdateBefore();
		extentTest.log(LogStatus.PASS, "Siloam385001 Sales tekan tombol modal upload foto before");
	}

	@Then("Siloam385001 Validasi judul modal upload foto before")
	public void siloam385001_validasi_judul_modal_upload_foto_before() {
		String txtExpected = "Upload Foto Before";
		assertTrue(ttdPage.getModalTitle().contains(txtExpected)); 
		extentTest.log(LogStatus.PASS, "Siloam385001 Validasi judul modal upload foto before");
	}

	@When("Siloam385002 Sales tekan tombol cancel modal upload foto before")
	public void siloam385002_sales_tekan_tombol_cancel_modal_upload_foto_before() {
		ttdPage.clickBtnCancelTTDDigital();
		extentTest.log(LogStatus.PASS, "Siloam385002 Sales tekan tombol cancel modal upload foto before");
	}

	@Then("Siloam385002 Validasi judul upload dokumen")
	public void siloam385002_validasi_judul_upload_dokumen() {
		String txtExpected = "Upload Dokumen";
		assertTrue(ttdPage.getUploadDokumenTitle().contains(txtExpected));
		extentTest.log(LogStatus.PASS, "Siloam385002 Validasi judul upload dokumen");
	}

	@When("Siloam385003 Sales tekan tombol modal upload foto before")
	public void siloam385003_sales_tekan_tombol_modal_upload_foto_before() {
		ttdPage.clickBtnUpdateBefore();
		extentTest.log(LogStatus.PASS, "Siloam385003 Sales tekan tombol modal upload foto before");
	}

	@When("Siloam385003 Sales tekan tombol keluar modal upload foto before")
	public void siloam385003_sales_tekan_tombol_keluar_modal_upload_foto_before() {
		ttdPage.clickBtnKeluarTTDDigital();
		extentTest.log(LogStatus.PASS, "Siloam385003 Sales tekan tombol keluar modal upload foto before");
	}

	@Then("Siloam385003 Validasi judul upload dokumen")
	public void siloam385003_validasi_judul_upload_dokumen() {
		String txtExpected = "Upload Dokumen";
		assertTrue(ttdPage.getUploadDokumenTitle().contains(txtExpected));
		extentTest.log(LogStatus.PASS, "Siloam385003 Validasi judul upload dokumen");
	}

	@When("Siloam385004 Sales tekan tombol modal upload foto before")
	public void siloam385004_sales_tekan_tombol_modal_upload_foto_before() {
		ttdPage.clickBtnUpdateBefore();
		extentTest.log(LogStatus.PASS, "Siloam385004 Sales tekan tombol modal upload foto before");
	}

	@When("Siloam385004 Sales memilih foto before")
	public void siloam385004_sales_memilih_foto_before() {
		String path = System.getProperty("user.dir") + "\\data\\testing-file\\Upload Foto Faskes Awal.jpg";
		ttdPage.fileUpload(path);
		extentTest.log(LogStatus.PASS, "Siloam385004 Sales memilih foto before");
	}

	@Then("Siloam385004 Validasi preview foto")
	public void siloam385004_validasi_preview_foto() {
		String txtExpectedPath = "https://dev.ptdika.com/siloam/new_assets/noimage.png";
		assertFalse(ttdPage.txtSrcPreview(ttdPage.getPreviewImgModal()).equals(txtExpectedPath));
		extentTest.log(LogStatus.PASS, "Siloam385004 Validasi preview foto");
	}

	@When("Siloam385005 Sales tekan tombol cancel modal upload foto before")
	public void siloam385005_sales_tekan_tombol_cancel_modal_upload_foto_before() {
		ttdPage.clickBtnCancelTTDDigital();
		extentTest.log(LogStatus.PASS, "Siloam385005 Sales tekan tombol cancel modal upload foto before");
	}

	@Then("Siloam385005 Validasi judul upload dokumen")
	public void siloam385005_validasi_judul_upload_dokumen() {
		String txtExpected = "Upload Dokumen";
		assertTrue(ttdPage.getUploadDokumenTitle().contains(txtExpected));
		extentTest.log(LogStatus.PASS, "Siloam385005 Validasi judul upload dokumen");
	}

	@When("Siloam385006 Sales tekan tombol modal upload foto before")
	public void siloam385006_sales_tekan_tombol_modal_upload_foto_before() {
		ttdPage.clickBtnUpdateBefore();
		extentTest.log(LogStatus.PASS, "Siloam385006 Sales tekan tombol modal upload foto before");
	}

	@When("Siloam385006 Sales memilih foto before")
	public void siloam385006_sales_memilih_foto_before() {
		String path = System.getProperty("user.dir") + "\\data\\testing-file\\Upload Foto Faskes Awal.jpg";
		ttdPage.fileUpload(path);
		extentTest.log(LogStatus.PASS, "Siloam385006 Sales memilih foto before");
	}

	@When("Siloam385006 Sales klik tombol keluar modal upload foto before")
	public void siloam385006_sales_klik_tombol_keluar_modal_upload_foto_before() {
		ttdPage.clickBtnKeluarTTDDigital();
		extentTest.log(LogStatus.PASS, "Siloam385006 Sales klik tombol keluar modal upload foto before");
	}

	@Then("Siloam385006 Validasi judul upload dokumen")
	public void siloam385006_validasi_judul_upload_dokumen() {
		String txtExpected = "Upload Dokumen";
		assertTrue(ttdPage.getUploadDokumenTitle().contains(txtExpected));
		extentTest.log(LogStatus.PASS, "Siloam385006 Validasi judul upload dokumen");
	}

	@When("Siloam385007 Sales tekan tombol modal upload foto before")
	public void siloam385007_sales_tekan_tombol_modal_upload_foto_before() {
		ttdPage.clickBtnUpdateBefore();
		extentTest.log(LogStatus.PASS, "Siloam385007 Sales tekan tombol modal upload foto before");
	}

	@When("Siloam385007 Sales memilih foto before")
	public void siloam385007_sales_memilih_foto_before() {
		String path = System.getProperty("user.dir") + "\\data\\testing-file\\Upload Foto Faskes Awal.jpg";
		ttdPage.fileUpload(path);
		extentTest.log(LogStatus.PASS, "Siloam385007 Sales memilih foto before");
	}

	@When("Siloam385007 Sales tekan tombol simpan foto before pada modal upload foto before")
	public void siloam385007_sales_tekan_tombol_simpan_foto_before_pada_modal_upload_foto_before() {
		ttdPage.clickBtnSaveTTDDigital();
		extentTest.log(LogStatus.PASS, "Siloam385007 Sales tekan tombol simpan foto before pada modal upload foto before");
	}

	@When("Siloam385007 Sales tekan tombol ok pada modal upload foto before berhasil")
	public void siloam385007_sales_tekan_tombol_ok_pada_modal_upload_foto_before_berhasil() {
		ttdPage.clickOK();
		extentTest.log(LogStatus.PASS, "Siloam385007 Sales tekan tombol ok pada modal upload foto before berhasil");
	}

	@Then("Siloam385007 Validasi judul halaman ttd digital")
	public void siloam385007_validasi_judul_halaman_ttd_digital() {
		String txtExpectedTitle = "TTD Digital";
		assertTrue(ttdPage.getTTDDigitalTitle().contains(txtExpectedTitle));
		extentTest.log(LogStatus.PASS, "Siloam385007 Validasi judul halaman ttd digital");
	}

}
