package cucumber.framework.runner.siloam.viewexportpageoutline;

/*
created_by : Adit
created_date : 30/09/2022
updated_by : Novri
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

public class TestBack {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private ViewExportPage viewExportPage = new ViewExportPage();
	
	public TestBack() {
		driver = ViewExportHooksOutline.driver;
		extentTest = ViewExportHooksOutline.extentTest;
	}
	
	@Given("Siloam045 Admin Sudah Login Dan Berada Di Halaman View Data")
	public void siloam045_admin_sudah_login_dan_berada_di_halaman_view_data() {
		driver.get(Constants.URL_SILOAM);
		viewExportPage.login(Constants.USERNAME_ADMIN_SILOAM,Constants.PASSWORD_ADMIN_SILOAM);
	    viewExportPage.btnLogin();
	    driver.get(Constants.URL_SILOAM_VIEW_ADMIN);
	    extentTest.log(LogStatus.PASS, "Siloam045 Admin Sudah Login Dan Berada Di Halaman View Data");
	}

	@When("Siloam045 Admin Tekan Tombol Back")
	public void siloam045_admin_tekan_tombol_back() {
		viewExportPage.btnBack();
	    extentTest.log(LogStatus.PASS, "Siloam045 Admin Tekan Tombol Back");
	}

	@Then("Siloam045 Validasi Kembali ke Halaman Sebelumnya")
	public void siloam045_validasi_kembali_ke_halaman_sebelumnya() {
		String txtExpected = "View & Export";
		assertEquals(viewExportPage.getTxtSuccessRefresh(), txtExpected);
		extentTest.log(LogStatus.PASS, "Siloam045 Validasi Kembali ke Halaman Sebelumnya");
	}
}
