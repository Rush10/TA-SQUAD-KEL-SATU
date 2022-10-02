package cucumber.framework.runner.siloam.viewexportpage;

/*
created_by : Adit
created_date : 30/09/2022
updated_by : Novri
updated_date : 02/10/2022
*/


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.ViewExportPage;
import cucumber.framework.utils.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestExport {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private ViewExportPage viewExportPage = new ViewExportPage();
	
	public TestExport() {
		driver = ViewExportHooks.driver;
		extentTest = ViewExportHooks.extentTest;
	}
	
	@Given("Siloam035 Admin Berada Di Halaman View Export Dan Sudah Tekan Filter")
	public void siloam035_admin_berada_di_halaman_view_export_dan_sudah_tekan_filter() {
		driver.get(Constants.URL_SILOAM);
		viewExportPage.login(Constants.USERNAME_ADMIN_SILOAM,Constants.PASSWORD_ADMIN_SILOAM);
	    viewExportPage.btnLogin();
	    viewExportPage.btnViewExport();
	    
	    String startDate = "2022-09-14";
	    String endDate = "2022-09-18";
	    
	    viewExportPage.filter(startDate,endDate);
	    extentTest.log(LogStatus.PASS, "Siloam035 Admin Berada Di Halaman View Export Dan Sudah Tekan Filter");
	}

	@When("Siloam035 Admin Tekan Tombol Export")
	public void siloam035_admin_tekan_tombol_export() {
		viewExportPage.btnExport();
		
		String startDate = "2022-09-8";
	    String endDate = "2022-09-10";
	    
	    viewExportPage.filter(startDate,endDate);
		viewExportPage.btnExport();
	    extentTest.log(LogStatus.PASS, "Siloam035 Admin Tekan Tombol Export");
	}

	@Then("Siloam035 Validasi Sukses Export")
	public void siloam035_validasi_sukses_export() {
		String pathSatu = "C:\\Users\\" + Constants.USER_COMPUTER_NAME + "\\Downloads\\data_export.xls";
		String pathDua = "C:\\Users\\" + Constants.USER_COMPUTER_NAME + "\\Downloads\\data_export (1).xls";
		assertFalse(Utils.getFileSize(pathSatu) == Utils.getFileSize(pathDua));
		extentTest.log(LogStatus.PASS, "Siloam035 Validasi Sukses Export");
	}
}
