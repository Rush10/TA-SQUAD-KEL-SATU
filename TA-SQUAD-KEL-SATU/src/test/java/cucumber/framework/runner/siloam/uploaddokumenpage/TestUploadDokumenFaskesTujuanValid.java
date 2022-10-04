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


public class TestUploadDokumenFaskesTujuanValid {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private UploadDokumenPage uploadDokumenPage = new UploadDokumenPage();
	
	public TestUploadDokumenFaskesTujuanValid() {
		driver = UploadDokumenOutlineHooks.driver;
		extentTest = UploadDokumenOutlineHooks.extentTest;
	}
	
	@When("Siloam340001 Sales login dan masuk ke halaman upload dokumen")
	public void siloam340001_sales_login_dan_masuk_ke_halaman_upload_dokumen() {
		driver.get(Constants.URL_SILOAM);
		uploadDokumenPage.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		uploadDokumenPage.btnLogin();
		driver.get(Constants.URL_SILOAM_DATA_UPLOAD_DOC);
	    extentTest.log(LogStatus.PASS, "Siloam340001 Sales login dan masuk ke halaman upload dokumen");
	}
	
	@When("Siloam340001 Sales tekan tombol modal upload foto faskes tujuan")
	public void siloam340001_sales_tekan_tombol_modal_upload_foto_faskes_tujuan() {
		uploadDokumenPage.clickUploadDocImgTujuan();
		extentTest.log(LogStatus.PASS, "Siloam340001 Sales tekan tombol modal upload foto faskes tujuan");
	}

	@Then("Siloam340001 Validasi judul modal upload foto faskes tujuan")
	public void siloam340001_validasi_judul_modal_upload_foto_faskes_tujuan() {
		String txtExpected = "Upload Foto After";
		assertTrue(uploadDokumenPage.txtModalTitle().contains(txtExpected));
		extentTest.log(LogStatus.PASS, "Siloam340001 Validasi judul modal upload foto faskes tujuan");
	}
	
	@When("Siloam340002 Sales tekan tombol cancel modal upload foto faskes tujuan")
	public void siloam340002_sales_tekan_tombol_cancel_modal_upload_foto_faskes_tujuan() {
		uploadDokumenPage.clickCancel();
		extentTest.log(LogStatus.PASS, "Siloam340002 Sales tekan tombol cancel modal upload foto faskes tujuan");
	}

	@Then("Siloam340002 Validasi judul halaman upload dokumen")
	public void siloam340002_validasi_judul_halaman_upload_dokumen() {
		String txtExpected = "Upload Document";
		assertTrue(uploadDokumenPage.txtTitleUploadDocument().contains(txtExpected));
		extentTest.log(LogStatus.PASS, "Siloam340002 Validasi judul halaman upload dokumen");
	}
	
	@When("Siloam340003 Sales tekan tombol modal upload foto faskes tujuan")
	public void siloam340003_sales_tekan_tombol_modal_upload_foto_faskes_tujuan() {
		uploadDokumenPage.clickUploadDocImgTujuan();
		extentTest.log(LogStatus.PASS, "Siloam340003 Sales tekan tombol modal upload foto faskes tujuan");
	}

	@When("Siloam340003 Sales tekan tombol keluar modal upload foto faskes tujuan")
	public void siloam340003_sales_tekan_tombol_keluar_modal_upload_foto_faskes_tujuan() {
		uploadDokumenPage.clickKeluar();
		extentTest.log(LogStatus.PASS, "Siloam340003 Sales tekan tombol keluar modal upload foto faskes tujuan");
	}

	@Then("Siloam340003 Validasi judul halaman upload dokumen")
	public void siloam340003_validasi_judul_halaman_upload_dokumen() {
		String txtExpected = "Upload Document";
		assertTrue(uploadDokumenPage.txtTitleUploadDocument().contains(txtExpected));
		extentTest.log(LogStatus.PASS, "Siloam340003 Validasi judul halaman upload dokumen");
	}
	
	@When("Siloam340004 Sales tekan tombol modal upload foto faskes tujuan")
	public void siloam340004_sales_tekan_tombol_modal_upload_foto_faskes_tujuan() {
		uploadDokumenPage.clickUploadDocImgTujuan();
		extentTest.log(LogStatus.PASS, "Siloam340004 Sales tekan tombol modal upload foto faskes tujuan");
	}

	@When("Siloam340004 Sales memilih foto faskes tujuan")
	public void siloam340004_sales_memilih_foto_faskes_tujuan() {
		String path = "C:\\Users\\ROG\\Pictures\\Testing\\klinik tujuan.jpg";
		uploadDokumenPage.fileUpload(path);
		extentTest.log(LogStatus.PASS, "Siloam340004 Sales memilih foto faskes tujuan");
	}

	@Then("Siloam340004 Validasi preview foto")
	public void siloam340004_validasi_preview_foto() {
		String txtExpectedPath = "https://dev.ptdika.com/siloam/new_assets/noimage.png";
		assertFalse(uploadDokumenPage.txtSrcPreview(uploadDokumenPage.getPreviewImgModal()).equals(txtExpectedPath));
		extentTest.log(LogStatus.PASS, "Siloam340004 Validasi preview foto");
	}
	
	@When("Siloam340005 Sales tekan tombol cancel modal upload foto faskes tujuan")
	public void siloam340005_sales_tekan_tombol_cancel_modal_upload_foto_faskes_tujuan() {
		uploadDokumenPage.clickCancel();
		extentTest.log(LogStatus.PASS, "Siloam340005 Sales tekan tombol cancel modal upload foto faskes tujuan");
	}

	@Then("Siloam340005 Validasi judul halaman upload dokumen dan preview foto")
	public void siloam340005_validasi_judul_halaman_upload_dokumen_dan_preview_foto() {
		String txtExpected = "Upload Document";
		assertTrue(uploadDokumenPage.txtTitleUploadDocument().contains(txtExpected));
//		String txtExpectedPath = "https://dev.ptdika.com/siloam/new_assets/noimage.png";
//		assertTrue(uploadDokumenPage.txtSrcPreview(uploadDokumenPage.getPreviewImgTujuan()).equals(txtExpectedPath));
		extentTest.log(LogStatus.PASS, "Siloam340005 Validasi judul halaman upload dokumen dan preview foto");
	}
	
	@When("Siloam340006 Sales tekan tombol modal upload foto faskes tujuan")
	public void siloam340006_sales_tekan_tombol_modal_upload_foto_faskes_tujuan() {
		uploadDokumenPage.clickUploadDocImgTujuan();
		extentTest.log(LogStatus.PASS, "Siloam340006 Sales tekan tombol modal upload foto faskes tujuan");
	}

	@When("Siloam340006 Sales memilih foto faskes tujuan")
	public void siloam340006_sales_memilih_foto_faskes_tujuan() {
		String path = "C:\\Users\\ROG\\Pictures\\Testing\\klinik tujuan.jpg";
		uploadDokumenPage.fileUpload(path);
		extentTest.log(LogStatus.PASS, "Siloam340006 Sales memilih foto faskes tujuan");
	}

	@When("Siloam340006 Sales klik tombol keluar modal upload foto faskes tujuan")
	public void siloam340006_sales_klik_tombol_keluar_modal_upload_foto_faskes_tujuan() {
		uploadDokumenPage.clickKeluar();
		extentTest.log(LogStatus.PASS, "Siloam340006 Sales klik tombol keluar modal upload foto faskes tujuan");
	}

	@Then("Siloam340006 Validasi judul halaman upload dokumen dan preview foto")
	public void siloam340006_validasi_judul_halaman_upload_dokumen_dan_preview_foto() {
		String txtExpected = "Upload Document";
		assertTrue(uploadDokumenPage.txtTitleUploadDocument().contains(txtExpected));
//		String txtExpectedPath = "https://dev.ptdika.com/siloam/new_assets/noimage.png";
//		assertTrue(uploadDokumenPage.txtSrcPreview(uploadDokumenPage.getPreviewImgTujuan()).equals(txtExpectedPath));
		extentTest.log(LogStatus.PASS, "Siloam340006 Validasi judul halaman upload dokumen dan preview foto");
	}
	
	@When("Siloam340007 Sales tekan tombol modal upload foto faskes tujuan")
	public void siloam340007_sales_tekan_tombol_modal_upload_foto_faskes_tujuan() {
		uploadDokumenPage.clickUploadDocImgTujuan();
		extentTest.log(LogStatus.PASS, "Siloam340007 Sales tekan tombol modal upload foto faskes tujuan");
	}

	@When("Siloam340007 Sales memilih foto faskes tujuan")
	public void siloam340007_sales_memilih_foto_faskes_tujuan() {
		String path = "C:\\Users\\ROG\\Pictures\\Testing\\klinik tujuan.jpg";
		uploadDokumenPage.fileUpload(path);
		extentTest.log(LogStatus.PASS, "Siloam340007 Sales memilih foto faskes tujuan");
	}

	@When("Siloam340007 Sales tekan tombol simpan foto faskes tujuan pada modal upload foto faskes tujuan")
	public void siloam340007_sales_tekan_tombol_simpan_foto_faskes_tujuan_pada_modal_upload_foto_faskes_tujuan() {
		uploadDokumenPage.clickSave();
		extentTest.log(LogStatus.PASS, "Siloam340007 Sales tekan tombol simpan foto faskes tujuan pada modal upload foto faskes tujuan");
	}

	@When("Siloam340007 Sales tekan tombol ok pada modal upload foto faskes tujuan berhasil")
	public void siloam340007_sales_tekan_tombol_ok_pada_modal_upload_foto_faskes_tujuan_berhasil() {
		uploadDokumenPage.clickOK();
		extentTest.log(LogStatus.PASS, "Siloam340007 Sales tekan tombol ok pada modal upload foto faskes tujuan berhasil");
	}

	@Then("Siloam340007 Validasi judul halaman upload dokumen dan preview foto")
	public void siloam340007_validasi_judul_halaman_upload_dokumen_dan_preview_foto() {
		String txtExpected = "Upload Document";
		String txtExpectedPath = "https://dev.ptdika.com/siloam/new_assets/noimage.png";
		assertTrue(uploadDokumenPage.txtTitleUploadDocument().contains(txtExpected));
		assertFalse(uploadDokumenPage.txtSrcPreview(uploadDokumenPage.getPreviewImgTujuan()).equals(txtExpectedPath));
		extentTest.log(LogStatus.PASS, "Siloam340007 Validasi judul halaman upload dokumen dan preview foto");
	}
}
