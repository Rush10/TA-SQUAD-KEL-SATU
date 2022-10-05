package cucumber.framework.runner.siloam.viewexportpage;

/*
created_by : Adit
created_date : 29/09/2022
updated_by : Novri
updated_date : 02/10/2022
*/


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.ViewExportPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class TestViewExportPage {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private ViewExportPage viewExportPage = new ViewExportPage();
	
	public TestViewExportPage() {
		driver = ViewExportHooksOutline.driver;
		extentTest = ViewExportHooksOutline.extentTest;
	}
	
	@When("Siloam020 Admin Sudah Login Dan Berada Di Dalam Halaman View Dan Export")
	public void siloam020_admin_sudah_login_dan_berada_di_dalam_halaman_view_dan_export() {
		driver.get(Constants.URL_SILOAM);
	    viewExportPage.login(Constants.USERNAME_ADMIN_SILOAM,Constants.PASSWORD_ADMIN_SILOAM);
	    viewExportPage.btnLogin();
	    viewExportPage.btnViewExport();
	    extentTest.log(LogStatus.PASS, "Siloam020 Admin Sudah Login Dan Berada Di Dalam Halaman View Dan Export");
	}

	@And("Siloam020 Admin Memasukkan Start Date")
	public void siloam020_admin_memasukkan_start_date() {
		String startDate = "2022-09-14";
	    
	    viewExportPage.inputStartDate(startDate);
	    extentTest.log(LogStatus.PASS, "Siloam020 Admin Memasukkan Start Date");
	}

	@And("Siloam020 Admin Memasukkan End Date")
	public void siloam020_admin_memasukkan_end_date() {
		String endDate = "2022-09-18";
		
	    viewExportPage.inputEndDate(endDate);
	    extentTest.log(LogStatus.PASS, "Siloam020 Admin Memasukkan End Date");
	}

	@And("Siloam020 Admin Klik Tombol Filter")
	public void siloam020_admin_klik_tombol_filter() {
	    viewExportPage.btnFilter();
	    extentTest.log(LogStatus.PASS, "Siloam020 Admin Klik Tombol Filter");
	}

	@Then("Siloam020 Validasi Tombol Filter")
	public void siloam020_validasi_tombol_filter() {
		String txtExpected = "1";
		assertEquals(viewExportPage.getTxtSuccessFilter(), txtExpected);
		extentTest.log(LogStatus.PASS, "Siloam020 Validasi Tombol Filter");
	}
}
