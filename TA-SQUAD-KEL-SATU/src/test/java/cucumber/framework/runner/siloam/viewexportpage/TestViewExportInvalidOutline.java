package cucumber.framework.runner.siloam.viewexportpage;

/*
created_by : Adit
created_date : 01/10/2022
updated_by : Novri
updated_date : 02/10/2022
*/

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.ViewExportPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestViewExportInvalidOutline {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private ViewExportPage viewExportPage = new ViewExportPage();
	private boolean isStartEmpty;
	private boolean isEndEmpty;
	
	public TestViewExportInvalidOutline() {
		driver = ViewExportHooksOutline.driver;
		extentTest = ViewExportHooksOutline.extentTest;
		this.isStartEmpty = true;
		this.isEndEmpty = true;
	}
	
	@When("Siloam070 Admin Sudah Login Dan Berada Di Dalam Halaman View Dan Export")
	public void siloam070_admin_sudah_login_dan_berada_di_dalam_halaman_view_dan_export() {
		driver.get(Constants.URL_SILOAM);
	    viewExportPage.login(Constants.USERNAME_ADMIN_SILOAM,Constants.PASSWORD_ADMIN_SILOAM);
	    viewExportPage.btnLogin();
	    viewExportPage.btnViewExport();
	    extentTest.log(LogStatus.PASS, "Siloam070 Admin Sudah Login Dan Berada Di Dalam Halaman View Dan Export");
	}


	@And("^Siloam070 Admin Memasukkan (.*) (.*)$")
	public void siloam070_admin_memasukkan_start_date_end_date(String startdate, String enddate) {
		if(!startdate.equals("")) {
			this.isStartEmpty = false;
		} 
		
		if(!enddate.equals("")) {
			this.isEndEmpty = false;
		}
		
		viewExportPage.inputStartEndDate(startdate, enddate);
		 extentTest.log(LogStatus.PASS, "Siloam070 Admin Memasukkan Start Date End Date");
	}
	
	@And("Siloam070 Admin Klik Tombol Filter")
	public void siloam070_admin_klik_tombol_filter() {
		 viewExportPage.btnFilter();
		 extentTest.log(LogStatus.PASS, "Siloam070 Admin Klik Tombol Filter");
	}

	@Then("Siloam070 Validasi Start Date End Date Kosong")
	public void siloam070_validasi_start_date_end_date_kosong() {
		if(this.isEndEmpty) {
			assertTrue(viewExportPage.isHaveRequired(viewExportPage.getInputEnddate()));
		}
		
		if(this.isStartEmpty) {
			assertTrue(viewExportPage.isHaveRequired(viewExportPage.getInputStartdate()));
		}
		
		extentTest.log(LogStatus.PASS, "Siloam070 Validasi Start Date End Date Kosong");
	}
}
