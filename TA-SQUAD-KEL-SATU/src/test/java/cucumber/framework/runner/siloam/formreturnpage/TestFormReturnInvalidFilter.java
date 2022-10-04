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

public class TestFormReturnInvalidFilter {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private FormReturnPage formReturnPage = new FormReturnPage();
	
	public TestFormReturnInvalidFilter() {
		driver = FormReturnHooks.driver;
		extentTest = FormReturnHooks.extentTest;
	}

// INVALID DATA PENDING EMPTY	
	
	@When("Siloam099 Sales Sudah Login Dan Berada Di Halaman Form Return Invalid Filter Pending")
	public void siloam099_sales_sudah_login_dan_berada_di_halaman_form_return_invalid_filter_pending() {
		driver.get(Constants.URL_SILOAM);
		formReturnPage.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		formReturnPage.btnLogin();
		formReturnPage.btnNew();
	    extentTest.log(LogStatus.PASS, "Siloam099 Sales Sudah Login Dan Berada Di Halaman Form Return Invalid Filter Pending");
	}

	@And("Siloam099 Sales Input Start Date Dan End Date Untuk Empty Data Pending")
	public void siloam099_sales_input_start_date_dan_end_date_untuk_empty_data_pending() {
	    formReturnPage.pilihStartEndDateInvalidPending();
	    extentTest.log(LogStatus.PASS, "Siloam099 Sales Input Start Date Dan End Date Untuk Empty Data Pending");
	}

	@And("Siloam099 Sales Pilih Status Pending")
	public void siloam099_sales_pilih_status_pending() {
		String strStatus = "pending";
	    formReturnPage.filterPending(strStatus);
	    extentTest.log(LogStatus.PASS, "Siloam099 Sales Pilih Status Pending");
	}

	@And("Siloam099 Sales Tekan Filter Pending")
	public void siloam099_sales_tekan_filter_pending() {
	    formReturnPage.btnFilter();
	    extentTest.log(LogStatus.PASS, "Siloam099 Sales Tekan Filter Pending");
	}

	@Then("Siloam099 Validasi Data Status Pending Tidak Ada")
	public void siloam099_validasi_data_status_pending_tidak_ada() {
		String txtExpected = "No data available in table";
	    assertTrue(formReturnPage.getTxtInvalidSearch().contains(txtExpected));
	    extentTest.log(LogStatus.PASS, "Siloam099 Validasi Data Status Pending Tidak Ada");
	}
	
	
// INVALID DATA COMPLETE EMPTY
	
	@When("Siloam099 Sales Tekan Reset Data Pending")
	public void siloam099_sales_tekan_reset_data_pending() {
	    formReturnPage.btnReset();
	    extentTest.log(LogStatus.PASS, "Siloam099 Sales Tekan Reset Data Pending");
	}

	@And("Siloam099 Sales Input Start Date Dan End Date Untuk Empty Data Complete")
	public void siloam099_sales_input_start_date_dan_end_date_untuk_empty_data_complete() {
		formReturnPage.pilihStartEndDateInvalidComplete();
	    extentTest.log(LogStatus.PASS, "Siloam099 Sales Input Start Date Dan End Date Untuk Empty Data Complete");
	}

	@And("Siloam099 Sales Pilih Status Complete")
	public void siloam099_sales_pilih_status_complete() {
		String strStatus = "complete";
	    formReturnPage.filterComplete(strStatus);
	    extentTest.log(LogStatus.PASS, "Siloam099 Sales Pilih Status Complete");
	}

	@And("Siloam099 Sales Tekan Filter Complete")
	public void siloam099_sales_tekan_filter_complete() {
		formReturnPage.btnFilter();
	    extentTest.log(LogStatus.PASS, "Siloam099 Sales Tekan Filter Complete");
	}

	@Then("Siloam099 Validasi Data Status Complete Tidak Ada")
	public void siloam099_validasi_data_status_complete_tidak_ada() {
		String txtExpected = "No data available in table";
	    assertTrue(formReturnPage.getTxtInvalidSearch().contains(txtExpected));
	    extentTest.log(LogStatus.PASS, "Siloam099 Validasi Data Status Complete Tidak Ada");
	}
	
}
