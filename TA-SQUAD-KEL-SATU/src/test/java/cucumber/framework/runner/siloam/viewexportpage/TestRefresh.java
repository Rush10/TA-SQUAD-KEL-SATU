package cucumber.framework.runner.siloam.viewexportpage;

/*
created_by : Adit
created_date : 29/09/2022
updated_by : Adit
updated_date : 02/10/2022
*/


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.ViewExportPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestRefresh {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private ViewExportPage viewExportPage = new ViewExportPage();
	
	public TestRefresh() {
		driver = ViewExportHooksOutline.driver;
		extentTest = ViewExportHooksOutline.extentTest;
	}
	
	@Given("Siloam025 Admin Berada Di Halaman View Export Dan Sudah Tekan Filter")
	public void siloam025_admin_berada_di_halaman_view_export_dan_sudah_tekan_filter() {
		driver.get(Constants.URL_SILOAM);
		viewExportPage.login(Constants.USERNAME_ADMIN_SILOAM,Constants.PASSWORD_ADMIN_SILOAM);
	    viewExportPage.btnLogin();
	    viewExportPage.btnViewExport();
	    
	    String startDate = "2022-09-14";
	    String endDate = "2022-09-18";
	    
	    viewExportPage.filter(startDate,endDate);
	    extentTest.log(LogStatus.PASS, "Siloam025 Admin Berada Di Halaman View Export Dan Sudah Tekan Filter");
	}

	@When("Siloam025 Admin Tekan Tombol Refresh")
	public void siloam025_admin_tekan_tombol_refresh() {
	    viewExportPage.btnRefresh();
	    extentTest.log(LogStatus.PASS, "Siloam025 Admin Tekan Tombol Refresh");
	}

	@Then("Siloam025 Validasi view & export pada halaman view & export")
	public void siloam025_validasi_view_export_pada_halaman_view_export() {
		String txtExpected = "View & Export";
		assertEquals(viewExportPage.getTxtSuccessRefresh(), txtExpected);
		extentTest.log(LogStatus.PASS, "Siloam025 Validasi view & export pada halaman view & export");
	}
	
}
