package cucumber.framework.runner.siloam.formreturnpage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.FormReturnPage;
import cucumber.framework.utils.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/*
created_by : Adit
created_date : 02/10/2022
updated_by : -
updated_date : -
*/


public class TestFormReturnFilter {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private FormReturnPage formReturnPage = new FormReturnPage();
	
	public TestFormReturnFilter() {
		driver = FormReturnHooks.driver;
		extentTest = FormReturnHooks.extentTest;
	}
	
	@When("Siloam085 Sales Sudah Login Dan Berada Di Halaman Form Return Complete")
	public void siloam085_sales_sudah_login_dan_berada_di_halaman_form_return_complete() {
		driver.get(Constants.URL_SILOAM);
		formReturnPage.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		formReturnPage.btnLogin();
		formReturnPage.btnNew();
	    extentTest.log(LogStatus.PASS, "Siloam085 Admin Sudah Login Dan Berada Di Dalam Halaman View Dan Export");
	}

	@And("Siloam085 Sales Input Start Date Complete")
	public void siloam085_sales_input_start_date_complete() {
	    formReturnPage.btnStartDate();
	    formReturnPage.btnBackBulan();
	    formReturnPage.btnPilihTanggalStart();
	    extentTest.log(LogStatus.PASS, "Siloam085 Sales Input Start Date Complete");
	}

	@And("Siloam085 Sales Input End Date Complete")
	public void siloam085_sales_input_end_date_complete() {
		formReturnPage.btnEndDate();
	    formReturnPage.btnPilihTanggalEnd();
	    extentTest.log(LogStatus.PASS, "Siloam085 Sales Input End Date Complete");
	}

	@And("Siloam085 Sales Input Status Complete")
	public void siloam085_sales_input_status_complete() {
	    formReturnPage.filterComplete("complete");
	    extentTest.log(LogStatus.PASS, "Siloam085 Sales Input Status Complete");
	}

	@And("Siloam085 Sales Tekan Tombol Filter Complete")
	public void siloam085_sales_tekan_tombol_filter_complete() {
	    formReturnPage.btnFilter();
	    extentTest.log(LogStatus.PASS, "Siloam085 Sales Tekan Tombol Filter Complete");
	}

	@Then("Siloam085 Validasi data complete tampil pada halaman form return")
	public void siloam085_validasi_data_complete_tampil_pada_halaman_form_return() {
		String txtExpected = "1";
		assertEquals(formReturnPage.getTxtSuccessFilter(), txtExpected);
		extentTest.log(LogStatus.PASS, "Siloam085 Validasi data complete tampil pada halaman form return");
	}
	
	
	@Given("Siloam085 Sales Sudah Login Dan Sudah Input Start Date End Date Status Dan Tekan Tilter")
	public void siloam085_sales_sudah_login_dan_sudah_input_start_date_end_date_status_dan_tekan_tilter() {
		driver.get(Constants.URL_SILOAM);
		formReturnPage.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		formReturnPage.btnLogin();
		formReturnPage.btnNew();
		formReturnPage.inputStartEndDate();
		formReturnPage.filterComplete("complete");
		formReturnPage.btnFilter();
	    extentTest.log(LogStatus.PASS, "Siloam085 Sales Sudah Login Dan Sudah Input Start Date End Date Status Dan Tekan Tilter");
	}

	@When("Siloam085 Sales Menekan Tombol Reset Complete")
	public void siloam085_sales_menekan_tombol_reset_complete() {
	    formReturnPage.btnReset();
	    extentTest.log(LogStatus.PASS, "Siloam085 Sales Menekan Tombol Reset Complete");
	}

	@Then("Siloam085 Validasi Start Date End Date Kosong")
	public void siloam085_validasi_start_date_end_date_kosong() {
		String txtExpected = "";
		String txtExpectedDua = "";
		assertTrue(formReturnPage.getTxtStartDate().contains(txtExpected));
		assertTrue(formReturnPage.getTxtEndDate().contains(txtExpectedDua));
		extentTest.log(LogStatus.PASS, "Siloam085 Validasi Sukses Export Start End Date Empty");
	}
	
	
	@Given("Siloam085 Sales Sudah Login Dan Berada Di Halaman Form Return Pending")
	public void siloam085_sales_sudah_login_dan_berada_di_halaman_form_return_pending() {
		driver.get(Constants.URL_SILOAM);
		formReturnPage.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		formReturnPage.btnLogin();
		formReturnPage.btnNew();
	    extentTest.log(LogStatus.PASS, "Siloam085 Admin Sudah Login Dan Berada Di Dalam Halaman View Dan Export");
	}

	@And("Siloam085 Sales Input Start Date Pending")
	public void siloam085_sales_input_start_date_pending() {
		formReturnPage.btnStartDate();
	    formReturnPage.btnBackBulan();
	    formReturnPage.btnPilihTanggalStart();
	    extentTest.log(LogStatus.PASS, "Siloam085 Sales Input Start Date Complete");
	}

	@And("Siloam085 Sales Input End Date Pending")
	public void siloam085_sales_input_end_date_pending() {
		formReturnPage.btnEndDate();
	    formReturnPage.btnPilihTanggalEnd();
	    extentTest.log(LogStatus.PASS, "Siloam085 Sales Input End Date Complete");
	}

	@And("Siloam085 Sales Input Status Pending")
	public void siloam085_sales_input_status_pending() {
		formReturnPage.filterPending("pending");
	    extentTest.log(LogStatus.PASS, "Siloam085 Sales Input Status Complete");
	}

	@And("Siloam085 Sales Tekan Tombol Filter Pending")
	public void siloam085_sales_tekan_tombol_filter_pending() {
		formReturnPage.btnFilter();
	    extentTest.log(LogStatus.PASS, "Siloam085 Sales Tekan Tombol Filter Complete");
	}

	@Then("Siloam085 Validasi Data Pending Tampil Pada Halaman Form Return")
	public void siloam085_validasi_data_pending_tampil_pada_halaman_form_return() {
		String txtExpected = "1";
		assertEquals(formReturnPage.getTxtSuccessFilter(), txtExpected);
		extentTest.log(LogStatus.PASS, "Siloam085 Validasi Data Pending Tampil Pada Halaman Form Return");
	}
	
	@Given("Siloam085 Sales Sudah Login Dan Sudah Input Start Date End Date Status Dan Tekan Filter Pending")
	public void siloam085_sales_sudah_login_dan_sudah_input_start_date_end_date_status_dan_tekan_filter_pending() {
		driver.get(Constants.URL_SILOAM);
		formReturnPage.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		formReturnPage.btnLogin();
		formReturnPage.btnNew();
		formReturnPage.inputStartEndDate();
		formReturnPage.filterComplete("pending");
		formReturnPage.btnFilter();
	    extentTest.log(LogStatus.PASS, "Siloam085 Sales Sudah Login Dan Sudah Input Start Date End Date Status Dan Tekan Filter Pending");
	}

	@When("Siloam085 Sales Menekan Tombol Reset Pending")
	public void siloam085_sales_menekan_tombol_reset_pending() {
		formReturnPage.btnReset();
	    extentTest.log(LogStatus.PASS, "Siloam085 Sales Menekan Tombol Reset Pending");
	}

	@Then("Siloam085 Validasi Start Date End Date Kosong Pending")
	public void siloam085_validasi_start_date_end_date_kosong_pending() {
		String txtExpected = "";
		String txtExpectedDua = "";
		assertTrue(formReturnPage.getTxtStartDate().contains(txtExpected));
		assertTrue(formReturnPage.getTxtEndDate().contains(txtExpectedDua));
		extentTest.log(LogStatus.PASS, "Siloam085 Validasi Start Date End Date Kosong Pending");
	}
	
	
	@Given("Siloam085 Sales Sudah Login Dan Berada Di Halaman Form Return Pilih")
	public void siloam085_sales_sudah_login_dan_berada_di_halaman_form_return_pilih() {
		driver.get(Constants.URL_SILOAM);
		formReturnPage.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		formReturnPage.btnLogin();
		formReturnPage.btnNew();
	    extentTest.log(LogStatus.PASS, "Siloam085 Sales Sudah Login Dan Berada Di Halaman Form Return Pilih");
	}

	@When("Siloam085 Sales Input Start Date Pilih")
	public void siloam085_sales_input_start_date_pilih() {
		formReturnPage.btnStartDate();
	    formReturnPage.btnBackBulan();
	    formReturnPage.btnPilihTanggalStart();
	    extentTest.log(LogStatus.PASS, "Siloam085 Sales Input Start Date Pilih");
	}

	@And("Siloam085 Sales Input End Date Pilih")
	public void siloam085_sales_input_end_date_pilih() {
		formReturnPage.btnEndDate();
	    formReturnPage.btnPilihTanggalEnd();
	    extentTest.log(LogStatus.PASS, "Siloam085 Sales Input End Date Pilih");
	}

	@And("Siloam085 Sales Tekan Tombol Filter Pilih")
	public void siloam085_sales_tekan_tombol_filter_pilih() {
		formReturnPage.btnFilter();
	    extentTest.log(LogStatus.PASS, "Siloam085 Sales Tekan Tombol Filter Pilih");
	}

	@Then("Siloam085 Validasi Data Pilih Tampil Pada Halaman Form Return")
	public void siloam085_validasi_data_pilih_tampil_pada_halaman_form_return() {
		String txtExpected = "1";
		assertEquals(formReturnPage.getTxtSuccessFilter(), txtExpected);
		extentTest.log(LogStatus.PASS, "Siloam085 Validasi Data Pilih Tampil Pada Halaman Form Return");
	}
	
	@Given("Siloam085 Sales Sudah Login Dan Sudah Input Start Date End Date Status Dan Tekan Filter Pilih")
	public void siloam085_sales_sudah_login_dan_sudah_input_start_date_end_date_status_dan_tekan_filter_pilih() {
		driver.get(Constants.URL_SILOAM);
		formReturnPage.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		formReturnPage.btnLogin();
		formReturnPage.btnNew();
		formReturnPage.inputStartEndDate();
		formReturnPage.btnFilter();
	    extentTest.log(LogStatus.PASS, "Siloam085 Sales Sudah Login Dan Sudah Input Start Date End Date Status Dan Tekan Filter Pilih");
	}

	@When("Siloam085 Sales Menekan Tombol Reset Pilih")
	public void siloam085_sales_menekan_tombol_reset_pilih() {
		formReturnPage.btnReset();
	    extentTest.log(LogStatus.PASS, "Siloam085 Sales Menekan Tombol Reset Pilih");
	}

	@Then("Siloam085 Validasi Start Date End Date Kosong Pilih")
	public void siloam085_validasi_start_date_end_date_kosong_pilih() {
		String txtExpected = "";
		String txtExpectedDua = "";
		assertTrue(formReturnPage.getTxtStartDate().contains(txtExpected));
		assertTrue(formReturnPage.getTxtEndDate().contains(txtExpectedDua));
		extentTest.log(LogStatus.PASS, "Siloam085 Validasi Start Date End Date Kosong Pilih");
	}
}
