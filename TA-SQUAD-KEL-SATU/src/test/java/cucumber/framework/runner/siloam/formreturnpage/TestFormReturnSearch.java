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

public class TestFormReturnSearch {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private FormReturnPage formReturnPage = new FormReturnPage();
	
	public TestFormReturnSearch() {
		driver = FormReturnHooks.driver;
		extentTest = FormReturnHooks.extentTest;
	}
	
	
// SEARCH NAMA
	
	@When("Siloam093 Sales Sudah Login Dan Berada Di Halaman Form Return Search Nama")
	public void siloam093_sales_sudah_login_dan_berada_di_halaman_form_return_search_nama() {
		driver.get(Constants.URL_SILOAM);
		formReturnPage.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		formReturnPage.btnLogin();
		formReturnPage.btnNew();
	    extentTest.log(LogStatus.PASS, "Siloam093 Sales Sudah Login Dan Berada Di Halaman Form Return Search Nama");
	}

	@And("Siloam093 Sales Tekan Field Search Dan Input Nama")
	public void siloam093_sales_tekan_field_search_dan_input_nama() {
	    formReturnPage.klikSearch();
	    
	    String nama = "GILBERT";
	    
	    formReturnPage.inputSearch(nama);
	    extentTest.log(LogStatus.PASS, "Siloam093 Sales Tekan Field Search Dan Input Nama");
	}

	@And("Siloam093 Sales Tekan Search Nama")
	public void siloam093_sales_tekan_search_nama() {
	    formReturnPage.btnSearch();
	    extentTest.log(LogStatus.PASS, "Siloam093 Sales Tekan Search Nama");
	}

	@Then("Siloam093 Validasi Nama")
	public void siloam093_validasi_nama() {
	    String txtExpected = "GILBERT";
	    assertTrue(formReturnPage.getTxtValidCariNama().contains(txtExpected));
	    extentTest.log(LogStatus.PASS, "Siloam093 Validasi Nama");
	}
	
	
//RESET NAMA
	
	@When("Siloam093 Sales Tekan TOmbol Reset Nama")
	public void siloam093_sales_tekan_t_ombol_reset_nama() {
	    formReturnPage.btnResetSearch();
	    extentTest.log(LogStatus.PASS, "Siloam093 Sales Tekan TOmbol Reset Nama");
	}

	@Then("Siloam093 Validasi Reset Nama")
	public void siloam093_validasi_reset_nama() {
		String txtExpected = "";
	    assertTrue(formReturnPage.getTxtValidReset().contains(txtExpected));
	    extentTest.log(LogStatus.PASS, "Siloam093 Validasi Reset Nama");
	}
	

//SEARCH NOMOR BPJS
	
	@When("Siloam093 Sales Tekan Field Search Dan Input Nomor BPJS")
	public void siloam093_sales_tekan_field_search_dan_input_nomor_bpjs() {
		formReturnPage.klikSearch();
	    
	    String noBpjs = "2312324139999";
	    
	    formReturnPage.inputSearch(noBpjs);
	    extentTest.log(LogStatus.PASS, "Siloam093 Sales Tekan Field Search Dan Input Nomor BPJS");
	}

	@And("Siloam093 Sales Tekan Search Nomor BPJS")
	public void siloam093_sales_tekan_search_nomor_bpjs() {
	    formReturnPage.btnSearch();
	    extentTest.log(LogStatus.PASS, "Siloam093 Sales Tekan Search Nomor BPJS");
	}

	@Then("Siloam093 Validasi Nomor BPJS")
	public void siloam093_validasi_nomor_bpjs() {
		String txtExpected = "2312324139999";
	    assertTrue(formReturnPage.getTxtValidCariNoBPJS().contains(txtExpected));
	    extentTest.log(LogStatus.PASS, "Siloam093 Validasi Nomor BPJS");
	}
	
//RESET NOMOR BPJS
	
	@When("Siloam093 Sales Tekan Tombol Reset Nomor BPJS")
	public void siloam093_sales_tekan_tombol_reset_nomor_bpjs() {
		formReturnPage.btnResetSearch();
	    extentTest.log(LogStatus.PASS, "Siloam093 Sales Tekan Tombol Reset Nomor BPJS");
	}

	@Then("Siloam093 Validasi Reset Nomor BPJS")
	public void siloam093_validasi_reset_nomor_bpjs() {
		String txtExpected = "";
	    assertTrue(formReturnPage.getTxtValidReset().contains(txtExpected));
	    extentTest.log(LogStatus.PASS, "Siloam093 Validasi Reset Nomor BPJS");
	}
	
	
//SEARCH KOTA KTP
	
	@When("Siloam093 Sales Tekan Field Search Dan Input kota KTP")
	public void siloam093_sales_tekan_field_search_dan_input_kota_ktp() {
		formReturnPage.klikSearch();
	    
	    String kotaKTP = "KABUPATEN ACEH SINGKIL";
	    
	    formReturnPage.inputSearch(kotaKTP);
	    extentTest.log(LogStatus.PASS, "Siloam093 Sales Tekan Field Search Dan Input kota KTP");
	}

	@And("Siloam093 Sales Tekan Search kota KTP")
	public void siloam093_sales_tekan_search_kota_ktp() {
		formReturnPage.btnSearch();
	    extentTest.log(LogStatus.PASS, "Siloam093 Sales Tekan Search kota KTP");
	}

	@Then("Siloam093 Validasi kota KTP")
	public void siloam093_validasi_kota_ktp() {
		String txtExpected = "KABUPATEN ACEH SINGKIL";
		System.out.println(formReturnPage.getTxtValidCariKota());
	    assertTrue(formReturnPage.getTxtValidCariKotaKTP().contains(txtExpected));
	    extentTest.log(LogStatus.PASS, "Siloam093 Validasi kota KTP");
	}
	

//RESET KOTA KTP
	
	@When("Siloam093 Sales Tekan Tombol Reset kota KTP")
	public void siloam093_sales_tekan_tombol_reset_kota_ktp() {
		formReturnPage.btnResetSearch();
	    extentTest.log(LogStatus.PASS, "Siloam093 Sales Tekan Tombol Reset kota KTP");
	}

	@Then("Siloam093 Validasi Reset kota KTP")
	public void siloam093_validasi_reset_kota_ktp() {
		String txtExpected = "";
	    assertTrue(formReturnPage.getTxtValidReset().contains(txtExpected));
	    extentTest.log(LogStatus.PASS, "Siloam093 Validasi Reset kota KTP");
	}
	
	
//SEARCH FASKES AWAL
	
	@When("Siloam093 Sales Tekan Field Search Dan Input Faskes Awal")
	public void siloam093_sales_tekan_field_search_dan_input_faskes_awal() {
		formReturnPage.klikSearch();
	    
	    String fksAwal = "Bekasi";
	    
	    formReturnPage.inputSearch(fksAwal);
	    extentTest.log(LogStatus.PASS, "Siloam093 Sales Tekan Field Search Dan Input Faskes Awal");
	}

	@And("Siloam093 Sales Tekan Search Faskes Awal")
	public void siloam093_sales_tekan_search_faskes_awal() {
		formReturnPage.btnSearch();
	    extentTest.log(LogStatus.PASS, "Siloam093 Sales Tekan Search Faskes Awal");
	}

	@Then("Siloam093 Validasi Faskes Awal")
	public void siloam093_validasi_faskes_awal() {
		String txtExpected = "Bekasi";
	    assertTrue(formReturnPage.getTxtValidCariFaskesAwal().contains(txtExpected));
	    extentTest.log(LogStatus.PASS, "Siloam093 Validasi Faskes Awal");
	}
	
	
//RESET FASKES AWAL
	
	@When("Siloam093 Sales Tekan Tombol Reset Faskes Awal")
	public void siloam093_sales_tekan_tombol_reset_faskes_awal() {
		formReturnPage.btnResetSearch();
	    extentTest.log(LogStatus.PASS, "Siloam093 Sales Tekan Tombol Reset Faskes Awal");
	}

	@Then("Siloam093 Validasi Reset Faskes Awal")
	public void siloam093_validasi_reset_faskes_awal() {
		String txtExpected = "";
	    assertTrue(formReturnPage.getTxtValidReset().contains(txtExpected));
	    extentTest.log(LogStatus.PASS, "Siloam093 Validasi Reset Faskes Awal");
	}
	
	
//SEARCH FASKES TUJUAN
	
	@When("Siloam093 Sales Tekan Field Search Dan Input Faskes Tujuan")
	public void siloam093_sales_tekan_field_search_dan_input_faskes_tujuan() {
		formReturnPage.klikSearch();
	    
	    String fksTujuan = "Clinic Bona Indah";
	    
	    formReturnPage.inputSearch(fksTujuan);
	    extentTest.log(LogStatus.PASS, "Siloam093 Sales Tekan Field Search Dan Input Faskes Tujuan");
	}

	@And("Siloam093 Sales Tekan Search Faskes Tujuan")
	public void siloam093_sales_tekan_search_faskes_tujuan() {
		formReturnPage.btnSearch();
	    extentTest.log(LogStatus.PASS, "Siloam093 Sales Tekan Search Faskes Tujuan");
	}

	@Then("Siloam093 Validasi Faskes Tujuan")
	public void siloam093_validasi_faskes_tujuan() {
		String txtExpected = "Clinic Bona Indah";
	    assertTrue(formReturnPage.getTxtValidCariFaskesTujuan().contains(txtExpected));
	    extentTest.log(LogStatus.PASS, "Siloam093 Validasi Faskes Tujuan");
	}
	
	
//RESET FASKES TUJUAN
	
	@When("Siloam093 Sales Tekan Tombol Reset Faskes Tujuan")
	public void siloam093_sales_tekan_tombol_reset_faskes_tujuan() {
		formReturnPage.btnResetSearch();
	    extentTest.log(LogStatus.PASS, "Siloam093 Sales Tekan Tombol Reset Faskes Tujuan");
	}

	@Then("Siloam093 Validasi Reset Faskes Tujuan")
	public void siloam093_validasi_reset_faskes_tujuan() {
		String txtExpected = "";
	    assertTrue(formReturnPage.getTxtValidReset().contains(txtExpected));
	    extentTest.log(LogStatus.PASS, "Siloam093 Validasi Reset Faskes Tujuan");
	}
	
}
