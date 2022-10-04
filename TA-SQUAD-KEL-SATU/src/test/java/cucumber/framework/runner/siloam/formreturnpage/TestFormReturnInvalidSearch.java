package cucumber.framework.runner.siloam.formreturnpage;

/*
created_by : Adit
created_date : 02/10/2022
updated_by : -
updated_date : -
*/

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.FormReturnPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestFormReturnInvalidSearch {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private FormReturnPage formReturnPage = new FormReturnPage();
	
	public TestFormReturnInvalidSearch() {
		driver = FormReturnHooks.driver;
		extentTest = FormReturnHooks.extentTest;
	}
	
//INVALID NAMA
	
	@When("Siloam095 Sales Sudah Login Dan Berada Di Halaman Form Return Search Nama Invalid")
	public void siloam095_sales_sudah_login_dan_berada_di_halaman_form_return_search_nama_invalid() {
		driver.get(Constants.URL_SILOAM);
		formReturnPage.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		formReturnPage.btnLogin();
		formReturnPage.btnNew();
	    extentTest.log(LogStatus.PASS, "Siloam093 Sales Sudah Login Dan Berada Di Halaman Form Return Search Nama");
	}

	@And("Siloam095 Sales Tekan Field Search Dan Input Nama Invalid")
	public void siloam095_sales_tekan_field_search_dan_input_nama_invalid() {
		formReturnPage.klikSearch();
	    
	    String nama = "Judika";
	    
	    formReturnPage.inputSearch(nama);
	    extentTest.log(LogStatus.PASS, "Siloam095 Sales Tekan Field Search Dan Input Nama Invalid");
	}

	@And("Siloam095 Sales Tekan Search Nama Invalid")
	public void siloam095_sales_tekan_search_nama_invalid() {
		formReturnPage.btnSearch();
	    extentTest.log(LogStatus.PASS, "Siloam095 Sales Tekan Search Nama Invalid");
	}

	@Then("Siloam095 Validasi Nama Invalid")
	public void siloam095_validasi_nama_invalid() {
		String txtExpected = "No data available in table";
	    assertTrue(formReturnPage.getTxtInvalidSearch().contains(txtExpected));
	    extentTest.log(LogStatus.PASS, "Siloam095 Validasi Nama Invalid");
	}
	
	
//INVALID NOMOR BPJS
	
	@When("Siloam095 Sales Tekan Tombol Reset Nama")
	public void siloam095_sales_tekan_tombol_reset_nama() {
		formReturnPage.btnResetSearch();
	    extentTest.log(LogStatus.PASS, "Siloam095 Sales Tekan Tombol Reset Nama");
	}

	@And("Siloam095 Sales Tekan Field Search Dan Input Nomor BPJS Invalid")
	public void siloam095_sales_tekan_field_search_dan_input_nomor_bpjs_invalid() {
		formReturnPage.klikSearch();
	    
	    String noBpjs = "89876567894876";
	    
	    formReturnPage.inputSearch(noBpjs);
	    extentTest.log(LogStatus.PASS, "Siloam095 Sales Tekan Field Search Dan Input Nomor BPJS Invalid");
	}

	@And("Siloam095 Sales Tekan Search Nomor BPJS Invalid")
	public void siloam095_sales_tekan_search_nomor_bpjs_invalid() {
		formReturnPage.btnSearch();
	    extentTest.log(LogStatus.PASS, "Siloam095 Sales Tekan Search Nomor BPJS Invalid");
	}

	@Then("Siloam095 Validasi Nomor BPJS Invalid")
	public void siloam095_validasi_nomor_bpjs_invalid() {
		String txtExpected = "No data available in table";
	    assertTrue(formReturnPage.getTxtInvalidSearch().contains(txtExpected));
	    extentTest.log(LogStatus.PASS, "Siloam095 Validasi Nama Invalid");
	}
	
	
//INVALID KOTA KTP
	
	@When("Siloam095 Sales Tekan Tombol Reset Nomor BPJS")
	public void siloam095_sales_tekan_tombol_reset_nomor_bpjs() {
		formReturnPage.btnResetSearch();
	    extentTest.log(LogStatus.PASS, "Siloam095 Sales Tekan Tombol Reset Nomor BPJS");
	}

	@And("Siloam095 Sales Tekan Field Search Dan Input Kota KTP Invalid")
	public void siloam095_sales_tekan_field_search_dan_input_kota_ktp_invalid() {
		formReturnPage.klikSearch();
	    
	    String KotaKTP = "Delanggu";
	    
	    formReturnPage.inputSearch(KotaKTP);
	    extentTest.log(LogStatus.PASS, "Siloam095 Sales Tekan Field Search Dan Input Kota KTP Invalid");
	}

	@And("Siloam095 Sales Tekan Search Kota KTP Invalid")
	public void siloam095_sales_tekan_search_kota_ktp_invalid() {
		formReturnPage.btnSearch();
	    extentTest.log(LogStatus.PASS, "Siloam095 Sales Tekan Search Nomor BPJS Invalid");
	}

	@Then("Siloam095 Validasi Kota KTP Invalid")
	public void siloam095_validasi_kota_ktp_invalid() {
		String txtExpected = "No data available in table";
	    assertTrue(formReturnPage.getTxtInvalidSearch().contains(txtExpected));
	    extentTest.log(LogStatus.PASS, "Siloam095 Validasi Kota KTP Invalid");
	}
	
	
//INVALID FASKES AWAL
	
	@When("Siloam095 Sales Tekan Tombol Reset Kota KTP")
	public void siloam095_sales_tekan_tombol_reset_kota_ktp() {
		formReturnPage.btnResetSearch();
	    extentTest.log(LogStatus.PASS, "Siloam095 Sales Tekan Tombol Reset Kota KTP");
	}

	@And("Siloam095 Sales Tekan Field Search Dan Input Faskes Awal Invalid")
	public void siloam095_sales_tekan_field_search_dan_input_faskes_awal_invalid() {
		formReturnPage.klikSearch();
	    
	    String fksAwal = "Pakis";
	    
	    formReturnPage.inputSearch(fksAwal);
	    extentTest.log(LogStatus.PASS, "Siloam095 Sales Tekan Field Search Dan Input Faskes Awal Invalid");
	}

	@And("Siloam095 Sales Tekan Search Faskes Awal Invalid")
	public void siloam095_sales_tekan_search_faskes_awal_invalid() {
		formReturnPage.btnSearch();
	    extentTest.log(LogStatus.PASS, "Siloam095 Sales Tekan Search Faskes Awal Invalid");
	}

	@Then("Siloam095 Validasi Faskes Awal Invalid")
	public void siloam095_validasi_faskes_awal_invalid() {
		String txtExpected = "No data available in table";
	    assertTrue(formReturnPage.getTxtInvalidSearch().contains(txtExpected));
	    extentTest.log(LogStatus.PASS, "Siloam095 Validasi Faskes Awal Invalid");
	}
	
	
//INVALID FASKES TUJUAN
	
	@When("Siloam095 Sales Tekan Tombol Reset Faskes Awal")
	public void siloam095_sales_tekan_tombol_reset_faskes_awal() {
		formReturnPage.btnResetSearch();
	    extentTest.log(LogStatus.PASS, "Siloam095 Sales Tekan Tombol Reset Faskes Awal");
	}

	@And("Siloam095 Sales Tekan Field Search Dan Input Faskes Tujuan Invalid")
	public void siloam095_sales_tekan_field_search_dan_input_faskes_tujuan_invalid() {
		formReturnPage.klikSearch();
	    
	    String fksTujuan = "Ceper";
	    
	    formReturnPage.inputSearch(fksTujuan);
	    extentTest.log(LogStatus.PASS, "Siloam095 Sales Tekan Field Search Dan Input Faskes Tujuan Invalid");
	}

	@And("Siloam095 Sales Tekan Search Faskes Tujuan Invalid")
	public void siloam095_sales_tekan_search_faskes_tujuan_invalid() {
		formReturnPage.btnSearch();
	    extentTest.log(LogStatus.PASS, "Siloam095 Sales Tekan Search Faskes Tujuan Invalid");
	}

	@Then("Siloam095 Validasi Faskes Tujuan Invalid")
	public void siloam095_validasi_faskes_tujuan_invalid() {
		String txtExpected = "No data available in table";
	    assertTrue(formReturnPage.getTxtInvalidSearch().contains(txtExpected));
	    extentTest.log(LogStatus.PASS, "Siloam095 Validasi Faskes Tujuan Invalid");
	}
}
