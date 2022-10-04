package cucumber.framework.runner.siloam.formreturnpage;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.FormReturnPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/*
created_by : Adit
created_date : 02/10/2022
updated_by : -
updated_date : -
*/

public class TestFormReturnTekanAksi {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private FormReturnPage formReturnPage = new FormReturnPage();
	
	public TestFormReturnTekanAksi() {
		driver = FormReturnHooks.driver;
		extentTest = FormReturnHooks.extentTest;
	}
	
// TEKAN AKSI MENUJU PAGE TTD DIGITAL
	
	@When("Siloam097 Sales Sudah Login Dan Berada Di Halaman Form Return Case Satu")
	public void siloam097_sales_sudah_login_dan_berada_di_halaman_form_return_case_satu() {
		driver.get(Constants.URL_SILOAM);
		formReturnPage.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		formReturnPage.btnLogin();
		formReturnPage.btnNew();
	    extentTest.log(LogStatus.PASS, "Siloam097 Sales Sudah Login Dan Berada Di Halaman Form Return Case Satu");
	}

	@And("Siloam097 Sales Tekan Field Search Dan Input Nama Dan Tekan Search")
	public void siloam097_sales_tekan_field_search_dan_input_nama_dan_tekan_search() {
		formReturnPage.klikSearch();
	    
	    String nama = "THAT SMILE ON YOUR FACE";
	    
	    formReturnPage.inputSearch(nama);
	    formReturnPage.btnSearch();
	    extentTest.log(LogStatus.PASS, "Siloam097 Sales Tekan Field Search Dan Input Nama Dan Tekan Search");
	}

	@And("Siloam097 Sales Tekan Aksi")
	public void siloam097_sales_tekan_aksi() {
	    formReturnPage.btnAksi();
	    extentTest.log(LogStatus.PASS, "Siloam097 Sales Tekan Aksi");
	}

	@Then("Siloam097 Validasi tampil kata TTD DIgital pada halaman TTD Digital")
	public void siloam097_validasi_tampil_kata_ttd_d_igital_pada_halaman_ttd_digital() {
		String txtExpected = "TTD Digital";
	    assertTrue(formReturnPage.getTxtValidTTDDigital().contains(txtExpected));
	    extentTest.log(LogStatus.PASS, "Siloam097 Validasi tampil kata TTD DIgital pada halaman TTD Digital");
	}
	

//TEKAN AKSI MENUJU UPLOAD DOCUMENT
	
	@When("Siloam097 Sales Sudah Login Dan Berada Di Halaman Form Return Case Dua")
	public void siloam097_sales_sudah_login_dan_berada_di_halaman_form_return_case_dua() {
		driver.get(Constants.URL_SILOAM);
		formReturnPage.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		formReturnPage.btnLogin();
		formReturnPage.btnNew();
	    extentTest.log(LogStatus.PASS, "Siloam097 Sales Sudah Login Dan Berada Di Halaman Form Return Case Satu");
	}

	@And("Siloam097 Sales Tekan Field Search Dan Input Nama Dan Tekan Search Case Dua")
	public void siloam097_sales_tekan_field_search_dan_input_nama_dan_tekan_search_case_dua() {
		formReturnPage.klikSearch();
	    
	    String nama = "ZUHDI";
	    
	    formReturnPage.inputSearch(nama);
	    formReturnPage.btnSearch();
	    extentTest.log(LogStatus.PASS, "Siloam097 Sales Tekan Field Search Dan Input Nama Dan Tekan Search Case Dua");
	}

	@And("Siloam097 Sales Tekan Aksi Case Dua")
	public void siloam097_sales_tekan_aksi_case_dua() {
		formReturnPage.btnAksi();
	    extentTest.log(LogStatus.PASS, "Siloam097 Sales Tekan Aksi Case Dua");
	}

	@Then("Siloam097 Validasi tampil kata Upload Document pada halaman Upload Document")
	public void siloam097_validasi_tampil_kata_upload_document_pada_halaman_upload_document() {
		String txtExpected = "Upload Document";
	    assertTrue(formReturnPage.getTxtValidUploadDoc().contains(txtExpected));
	    extentTest.log(LogStatus.PASS, "Siloam097 Validasi tampil kata Upload Document pada halaman Upload Document");
	}
	
}
