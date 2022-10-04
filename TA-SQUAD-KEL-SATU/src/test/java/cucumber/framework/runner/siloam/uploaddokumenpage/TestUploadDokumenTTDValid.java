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

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.UploadDokumenPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TestUploadDokumenTTDValid {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private UploadDokumenPage uploadDokumenPage = new UploadDokumenPage();
	
	public TestUploadDokumenTTDValid() {
		driver = UploadDokumenOutlineHooks.driver;
		extentTest = UploadDokumenOutlineHooks.extentTest;
	}
	
	@When("Siloam345001 Sales login dan masuk ke halaman upload dokumen")
	public void siloam345001_sales_login_dan_masuk_ke_halaman_upload_dokumen() {
		driver.get(Constants.URL_SILOAM);
		uploadDokumenPage.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		uploadDokumenPage.btnLogin();
		driver.get(Constants.URL_SILOAM_DATA_UPLOAD_DOC);
	    extentTest.log(LogStatus.PASS, "Siloam345001 Sales login dan masuk ke halaman upload dokumen");
	}

	@When("Siloam345001 Sales tekan tombol modal upload foto ttd")
	public void siloam345001_sales_tekan_tombol_modal_upload_foto_ttd() {
		uploadDokumenPage.clickUploadDocImgTTD();
		extentTest.log(LogStatus.PASS, "Siloam345001 Sales tekan tombol modal upload foto ttd");
	}

	@Then("Siloam345001 Validasi judul modal upload foto ttd")
	public void siloam345001_validasi_judul_modal_upload_foto_ttd() {
		String txtExpected = "Upload Foto TTD";
		assertTrue(uploadDokumenPage.txtModalTitle().contains(txtExpected));
		extentTest.log(LogStatus.PASS, "Siloam345001 Validasi judul modal upload foto ttd");
	}
	
	@When("Siloam345002 Sales tekan tombol cancel modal upload foto ttd")
	public void siloam345002_sales_tekan_tombol_cancel_modal_upload_foto_ttd() {
		uploadDokumenPage.clickCancel();
		extentTest.log(LogStatus.PASS, "Siloam345002 Sales tekan tombol cancel modal upload foto ttd");
	}

	@Then("Siloam345002 Validasi judul halaman upload dokumen")
	public void siloam345002_validasi_judul_halaman_upload_dokumen() {
		String txtExpected = "Upload Document";
		assertTrue(uploadDokumenPage.txtTitleUploadDocument().contains(txtExpected));
		extentTest.log(LogStatus.PASS, "Siloam345002 Validasi judul halaman upload dokumen");
	}
	
	@When("Siloam345003 Sales tekan tombol modal upload foto ttd")
	public void siloam345003_sales_tekan_tombol_modal_upload_foto_ttd() {
		uploadDokumenPage.clickUploadDocImgTTD();
		extentTest.log(LogStatus.PASS, "Siloam345003 Sales tekan tombol modal upload foto ttd");
	}

	@When("Siloam345003 Sales tekan tombol keluar modal upload foto ttd")
	public void siloam345003_sales_tekan_tombol_keluar_modal_upload_foto_ttd() {
		uploadDokumenPage.clickKeluar();
		extentTest.log(LogStatus.PASS, "Siloam345003 Sales tekan tombol keluar modal upload foto ttd");
	}

	@Then("Siloam345003 Validasi judul halaman upload dokumen")
	public void siloam345003_validasi_judul_halaman_upload_dokumen() {
		String txtExpected = "Upload Document";
		assertTrue(uploadDokumenPage.txtTitleUploadDocument().contains(txtExpected));
		extentTest.log(LogStatus.PASS, "Siloam345003 Validasi judul halaman upload dokumen");
	}
	
	@When("Siloam345004 Sales tekan tombol modal upload foto ttd")
	public void siloam345004_sales_tekan_tombol_modal_upload_foto_ttd() {
		uploadDokumenPage.clickUploadDocImgTTD();
		extentTest.log(LogStatus.PASS, "Siloam345004 Sales tekan tombol modal upload foto ttd");
	}

	@When("Siloam345004 Sales memilih foto ttd")
	public void siloam345004_sales_memilih_foto_ttd() {
		String path = "C:\\Users\\ROG\\Pictures\\Testing\\TTD.jpg";
		uploadDokumenPage.fileUpload(path);
		extentTest.log(LogStatus.PASS, "Siloam345004 Sales memilih foto ttd");
	}

	@Then("Siloam345004 Validasi preview foto")
	public void siloam345004_validasi_preview_foto() {
		String txtExpectedPath = "https://dev.ptdika.com/siloam/new_assets/noimage.png";
		assertFalse(uploadDokumenPage.txtSrcPreview(uploadDokumenPage.getPreviewImgModal()).equals(txtExpectedPath));
		extentTest.log(LogStatus.PASS, "Siloam345004 Validasi preview foto");
	}
	
	@When("Siloam345005 Sales tekan tombol cancel modal upload foto ttd")
	public void siloam345005_sales_tekan_tombol_cancel_modal_upload_foto_ttd() {
		uploadDokumenPage.clickCancel();
		extentTest.log(LogStatus.PASS, "Siloam345005 Sales tekan tombol cancel modal upload foto ttd");
	}

	@Then("Siloam345005 Validasi judul halaman upload dokumen dan preview foto")
	public void siloam345005_validasi_judul_halaman_upload_dokumen_dan_preview_foto() {
		String txtExpected = "Upload Document";
		assertTrue(uploadDokumenPage.txtTitleUploadDocument().contains(txtExpected));
//		String txtExpectedPath = "https://dev.ptdika.com/siloam/new_assets/noimage.png";
//		assertTrue(uploadDokumenPage.txtSrcPreview(uploadDokumenPage.getPreviewImgTTD()).equals(txtExpectedPath));
		extentTest.log(LogStatus.PASS, "Siloam345005 Validasi judul halaman upload dokumen dan preview foto");
	}
	
	@When("Siloam345006 Sales tekan tombol modal upload foto ttd")
	public void siloam345006_sales_tekan_tombol_modal_upload_foto_ttd() {
		uploadDokumenPage.clickUploadDocImgTTD();
		extentTest.log(LogStatus.PASS, "Siloam345006 Sales tekan tombol modal upload foto ttd");
	}

	@When("Siloam345006 Sales memilih foto ttd")
	public void siloam345006_sales_memilih_foto_ttd() {
		String path = "C:\\Users\\ROG\\Pictures\\Testing\\TTD.jpg";
		uploadDokumenPage.fileUpload(path);
		extentTest.log(LogStatus.PASS, "Siloam345006 Sales memilih foto ttd");
	}

	@When("Siloam345006 Sales klik tombol keluar modal upload foto ttd")
	public void siloam345006_sales_klik_tombol_keluar_modal_upload_foto_ttd() {
		uploadDokumenPage.clickKeluar();
		extentTest.log(LogStatus.PASS, "Siloam345006 Sales klik tombol keluar modal upload foto ttd");
	}

	@Then("Siloam345006 Validasi judul halaman upload dokumen dan preview foto")
	public void siloam345006_validasi_judul_halaman_upload_dokumen_dan_preview_foto() {
		String txtExpected = "Upload Document";
		assertTrue(uploadDokumenPage.txtTitleUploadDocument().contains(txtExpected));
//		String txtExpectedPath = "https://dev.ptdika.com/siloam/new_assets/noimage.png";
//		assertTrue(uploadDokumenPage.txtSrcPreview(uploadDokumenPage.getPreviewImgTTD()).equals(txtExpectedPath));
		extentTest.log(LogStatus.PASS, "Siloam345006 Validasi judul halaman upload dokumen dan preview foto");
	}
	
	@When("Siloam345007 Sales tekan tombol modal upload foto ttd")
	public void siloam345007_sales_tekan_tombol_modal_upload_foto_ttd() {
		uploadDokumenPage.clickUploadDocImgTTD();
		extentTest.log(LogStatus.PASS, "Siloam345007 Sales tekan tombol modal upload foto ttd");
	}

	@When("Siloam345007 Sales memilih foto ttd")
	public void siloam345007_sales_memilih_foto_ttd() {
		String path = "C:\\Users\\ROG\\Pictures\\Testing\\TTD.jpg";
		uploadDokumenPage.fileUpload(path);
		extentTest.log(LogStatus.PASS, "Siloam345007 Sales memilih foto ttd");
	}

	@When("Siloam345007 Sales tekan tombol simpan foto ttd pada modal upload foto ttd")
	public void siloam345007_sales_tekan_tombol_simpan_foto_ttd_pada_modal_upload_foto_ttd() {
		uploadDokumenPage.clickSave();
		extentTest.log(LogStatus.PASS, "Siloam345007 Sales tekan tombol simpan foto ttd pada modal upload foto ttd");
	}

	@When("Siloam345007 Sales tekan tombol ok pada modal upload foto ttd berhasil")
	public void siloam345007_sales_tekan_tombol_ok_pada_modal_upload_foto_ttd_berhasil() {
		uploadDokumenPage.clickOK();
		extentTest.log(LogStatus.PASS, "Siloam345007 Sales tekan tombol ok pada modal upload foto ttd berhasil");
	}

	@Then("Siloam345007 Validasi judul halaman upload dokumen dan preview foto")
	public void siloam345007_validasi_judul_halaman_upload_dokumen_dan_preview_foto() {
		String txtExpected = "Upload Document";
		String txtExpectedPath = "https://dev.ptdika.com/siloam/new_assets/noimage.png";
		assertTrue(uploadDokumenPage.txtTitleUploadDocument().contains(txtExpected));
		assertFalse(uploadDokumenPage.txtSrcPreview(uploadDokumenPage.getPreviewImgTTD()).equals(txtExpectedPath));
		extentTest.log(LogStatus.PASS, "Siloam345007 Validasi judul halaman upload dokumen dan preview foto");
	}

}
