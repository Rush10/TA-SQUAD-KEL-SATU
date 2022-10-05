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


public class TestUploadDokumenFaskesAwalValid {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private UploadDokumenPage uploadDokumenPage = new UploadDokumenPage();
	
	public TestUploadDokumenFaskesAwalValid() {
		driver = UploadDokumenOutlineHooks.driver;
		extentTest = UploadDokumenOutlineHooks.extentTest;
	}
	
	@When("Siloam335001 Sales login dan masuk ke halaman upload dokumen")
	public void siloam335001_sales_login_dan_masuk_ke_halaman_upload_dokumen() {
		driver.get(Constants.URL_SILOAM);
		uploadDokumenPage.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		uploadDokumenPage.btnLogin();
		driver.get(Constants.URL_SILOAM_DATA_UPLOAD_DOC_VALID);
	    extentTest.log(LogStatus.PASS, "Siloam335001 Sales login dan masuk ke halaman upload dokumen");
	}

	@When("Siloam335001 Sales tekan tombol modal upload foto faskes awal")
	public void siloam335001_sales_tekan_tombol_modal_upload_foto_faskes_awal() {
		uploadDokumenPage.clickUploadDocImgAwal();
		extentTest.log(LogStatus.PASS, "Siloam335001 Sales tekan tombol modal upload foto faskes awal");
	}

	@Then("Siloam335001 Validasi judul modal upload foto faskes awal")
	public void siloam335001_validasi_judul_modal_upload_foto_faskes_awal() {
		String txtExpected = "Upload Foto Before";
		assertTrue(uploadDokumenPage.txtModalTitle().contains(txtExpected));
		extentTest.log(LogStatus.PASS, "Siloam335001 Validasi judul modal upload foto faskes awal");
	}

	@When("Siloam335002 Sales tekan tombol cancel modal upload foto faskes awal")
	public void siloam335002_sales_tekan_tombol_cancel_modal_upload_foto_faskes_awal() {
		uploadDokumenPage.clickCancel();
		extentTest.log(LogStatus.PASS, "Siloam335002 Sales tekan tombol cancel modal upload foto faskes awal");
	}

	@Then("Siloam335002 Validasi judul halaman upload dokumen")
	public void siloam335002_validasi_judul_halaman_upload_dokumen() {
		String txtExpected = "Upload Document";
		assertTrue(uploadDokumenPage.txtTitleUploadDocument().contains(txtExpected));
		extentTest.log(LogStatus.PASS, "Siloam335002 Validasi judul halaman upload dokumen");
	}

	@When("Siloam335003 Sales tekan tombol modal upload foto faskes awal")
	public void siloam335003_sales_tekan_tombol_modal_upload_foto_faskes_awal() {
		uploadDokumenPage.clickUploadDocImgAwal();
		extentTest.log(LogStatus.PASS, "Siloam335003 Sales tekan tombol modal upload foto faskes awal");
	}

	@When("Siloam335003 Sales tekan tombol keluar modal upload foto faskes awal")
	public void siloam335003_sales_tekan_tombol_keluar_modal_upload_foto_faskes_awal() {
		uploadDokumenPage.clickKeluar();
		extentTest.log(LogStatus.PASS, "Siloam335003 Sales tekan tombol keluar modal upload foto faskes awal");
	}

	@Then("Siloam335003 Validasi judul halaman upload dokumen")
	public void siloam335003_validasi_judul_halaman_upload_dokumen() {
		String txtExpected = "Upload Document";
		assertTrue(uploadDokumenPage.txtTitleUploadDocument().contains(txtExpected));
		extentTest.log(LogStatus.PASS, "Siloam335003 Validasi judul halaman upload dokumen");
	}

	@When("Siloam335004 Sales tekan tombol modal upload foto faskes awal")
	public void siloam335004_sales_tekan_tombol_modal_upload_foto_faskes_awal() {
		uploadDokumenPage.clickUploadDocImgAwal();
		extentTest.log(LogStatus.PASS, "Siloam335004 Sales tekan tombol modal upload foto faskes awal");
	}

	@When("Siloam335004 Sales memilih foto faskes awal")
	public void siloam335004_sales_memilih_foto_faskes_awal() {
		String path = System.getProperty("user.dir") + "\\data\\testing-file\\Upload Foto Faskes Awal.jpg";
		uploadDokumenPage.fileUpload(path);
		extentTest.log(LogStatus.PASS, "Siloam335004 Sales memilih foto faskes awal");
	}

	@Then("Siloam335004 Validasi preview foto")
	public void siloam335004_validasi_preview_foto() {
		String txtExpectedPath = "https://dev.ptdika.com/siloam/new_assets/noimage.png";
		assertFalse(uploadDokumenPage.txtSrcPreview(uploadDokumenPage.getPreviewImgModal()).equals(txtExpectedPath));
		extentTest.log(LogStatus.PASS, "Siloam335004 Validasi preview foto");
	}

	@When("Siloam335005 Sales tekan tombol cancel modal upload foto faskes awal")
	public void siloam335005_sales_tekan_tombol_cancel_modal_upload_foto_faskes_awal() {
		uploadDokumenPage.clickCancel();
		extentTest.log(LogStatus.PASS, "Siloam335005 Sales tekan tombol cancel modal upload foto faskes awal");
	}

	@Then("Siloam335005 Validasi judul halaman upload dokumen dan preview foto")
	public void siloam335005_validasi_judul_halaman_upload_dokumen_dan_preview_foto() {
		String txtExpected = "Upload Document";
		assertTrue(uploadDokumenPage.txtTitleUploadDocument().contains(txtExpected));
//		String txtExpectedPath = "https://dev.ptdika.com/siloam/new_assets/noimage.png";
//		assertTrue(uploadDokumenPage.txtSrcPreview(uploadDokumenPage.getPreviewImgAwal()).equals(txtExpectedPath));
		extentTest.log(LogStatus.PASS, "Siloam335005 Validasi judul halaman upload dokumen dan preview foto");
	}

	@When("Siloam335006 Sales tekan tombol modal upload foto faskes awal")
	public void siloam335006_sales_tekan_tombol_modal_upload_foto_faskes_awal() {
		uploadDokumenPage.clickUploadDocImgAwal();
		extentTest.log(LogStatus.PASS, "Siloam335006 Sales tekan tombol modal upload foto faskes awal");
	}

	@When("Siloam335006 Sales memilih foto faskes awal")
	public void siloam335006_sales_memilih_foto_faskes_awal() {
		String path = System.getProperty("user.dir") + "\\data\\testing-file\\Upload Foto Faskes Awal.jpg";
		uploadDokumenPage.fileUpload(path);
		extentTest.log(LogStatus.PASS, "Siloam335006 Sales memilih foto faskes awal");
	}

	@When("Siloam335006 Sales klik tombol keluar modal upload foto faskes awal")
	public void siloam335006_sales_klik_tombol_keluar_modal_upload_foto_faskes_awal() {
		uploadDokumenPage.clickKeluar();
		extentTest.log(LogStatus.PASS, "Siloam335006 Sales klik tombol keluar modal upload foto faskes awal");
	}

	@Then("Siloam335006 Validasi judul halaman upload dokumen dan preview foto")
	public void siloam335006_validasi_judul_halaman_upload_dokumen_dan_preview_foto() {
		String txtExpected = "Upload Document";
		assertTrue(uploadDokumenPage.txtTitleUploadDocument().contains(txtExpected));
//		String txtExpectedPath = "https://dev.ptdika.com/siloam/new_assets/noimage.png";
//		assertTrue(uploadDokumenPage.txtSrcPreview(uploadDokumenPage.getPreviewImgAwal()).equals(txtExpectedPath));
		extentTest.log(LogStatus.PASS, "Siloam335006 Validasi judul halaman upload dokumen dan preview foto");
	}

	@When("Siloam335007 Sales tekan tombol modal upload foto faskes awal")
	public void siloam335007_sales_tekan_tombol_modal_upload_foto_faskes_awal() {
		uploadDokumenPage.clickUploadDocImgAwal();
		extentTest.log(LogStatus.PASS, "Siloam335007 Sales tekan tombol modal upload foto faskes awal");
	}

	@When("Siloam335007 Sales memilih foto faskes awal")
	public void siloam335007_sales_memilih_foto_faskes_awal() {
		String path = System.getProperty("user.dir") + "\\data\\testing-file\\Upload Foto Faskes Awal.jpg";
		uploadDokumenPage.fileUpload(path);
		extentTest.log(LogStatus.PASS, "Siloam335007 Sales memilih foto faskes awal");
	}

	@When("Siloam335007 Sales tekan tombol simpan foto faskes awal pada modal upload foto faskes awal")
	public void siloam335007_sales_tekan_tombol_simpan_foto_faskes_awal_pada_modal_upload_foto_faskes_awal() {
		uploadDokumenPage.clickSave();
		extentTest.log(LogStatus.PASS, "Siloam335007 Sales tekan tombol simpan foto faskes awal pada modal upload foto faskes awal");
	}

	@When("Siloam335007 Sales tekan tombol ok pada modal upload foto faskes awal berhasil")
	public void siloam335007_sales_tekan_tombol_ok_pada_modal_upload_foto_faskes_awal_berhasil() {
		uploadDokumenPage.clickOK();
		extentTest.log(LogStatus.PASS, "Siloam335007 Sales tekan tombol ok pada modal upload foto faskes awal berhasil");
	}

	@Then("Siloam335007 Validasi judul halaman upload dokumen dan preview foto")
	public void siloam335007_validasi_judul_halaman_upload_dokumen_dan_preview_foto() {
		String txtExpected = "Upload Document";
		String txtExpectedPath = "https://dev.ptdika.com/siloam/new_assets/noimage.png";
		assertTrue(uploadDokumenPage.txtTitleUploadDocument().contains(txtExpected));
		assertFalse(uploadDokumenPage.txtSrcPreview(uploadDokumenPage.getPreviewImgAwal()).equals(txtExpectedPath));
		extentTest.log(LogStatus.PASS, "Siloam335007 Validasi judul halaman upload dokumen dan preview foto");
	}

}
