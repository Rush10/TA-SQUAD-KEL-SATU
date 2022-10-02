package cucumber.framework.runner.siloam.viewexportpage;

/*
created_by : Adit
created_date : 30/09/2022
updated_by : Novri
updated_date : 02/10/2022
*/


import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.ViewExportPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestFaskesTujuan {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private ViewExportPage viewExportPage = new ViewExportPage();
	
	public TestFaskesTujuan() {
		driver = ViewExportHooks.driver;
		extentTest = ViewExportHooks.extentTest;
	}
	
	@Given("Siloam060 Admin Berada Di Halaman View Export Dan Sudah Tekan Filter")
	public void siloam060_admin_berada_di_halaman_view_export_dan_sudah_tekan_filter() {
		driver.get(Constants.URL_SILOAM);
		viewExportPage.login(Constants.USERNAME_ADMIN_SILOAM,Constants.PASSWORD_ADMIN_SILOAM);
	    viewExportPage.btnLogin();
	    viewExportPage.btnViewExport();
	    
	    String startDate = "2022-09-14";
	    String endDate = "2022-09-18";
	    
	    viewExportPage.filter(startDate,endDate);
	    extentTest.log(LogStatus.PASS, "Siloam060 Admin Berada Di Halaman View Export Dan Sudah Tekan Filter");
	}

	@When("Siloam060 Admin Tekan Link Faskes Tujuan")
	public void siloam060_admin_tekan_link_faskes_tujuan() {
		viewExportPage.btnFaskesTujuan();
		extentTest.log(LogStatus.PASS, "Siloam060 Admin Tekan Link Faskes Tujuan");
	}

	@Then("Siloam060 Validasi Gambar Faskes Tujuan")
	public void siloam060_validasi_gambar_faskes_tujuan() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}
}
