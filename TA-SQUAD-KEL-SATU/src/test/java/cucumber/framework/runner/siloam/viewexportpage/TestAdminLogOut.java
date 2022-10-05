package cucumber.framework.runner.siloam.viewexportpage;

/*
created_by : Adit
created_date : 04/10/2022
updated_by : -
updated_date : -
*/

import static org.testng.Assert.assertThrows;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.ViewExportPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestAdminLogOut {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private ViewExportPage viewExportPage = new ViewExportPage();
	
	public TestAdminLogOut() {
		driver = ViewExportHooksOutline.driver;
		extentTest = ViewExportHooksOutline.extentTest;
	}
	
	@When("Siloam200 Admin Sudah Login")
	public void siloam200_admin_sudah_login() {
		driver.get(Constants.URL_SILOAM);
		viewExportPage.login(Constants.USERNAME_ADMIN_SILOAM, Constants.PASSWORD_ADMIN_SILOAM);
	    viewExportPage.btnLogin();
	    extentTest.log(LogStatus.PASS, "Siloam200 Admin Sudah Login");
	}

	@And("Siloam200 Admin Menekan Tombol Akun Di Pojok Kanan Atas")
	public void siloam200_admin_menekan_tombol_akun_di_pojok_kanan_atas() {
	    viewExportPage.btnAkun();
	    extentTest.log(LogStatus.PASS, "Siloam200 Admin Menekan Tombol Akun Di Pojok Kanan Atas");
	}

	@And("Siloam200 Admin Menekan LogOut")
	public void siloam200_admin_menekan_log_out() {
	    viewExportPage.btnLogOut();
	    extentTest.log(LogStatus.PASS, "Siloam200 Admin Menekan LogOut");
	}

	@Then("Siloam200 Validasi Admin LogOut Berhasil")
	public void siloam200_validasi_admin_log_out_berhasil() {
	    String txtExpected = "DIKA";
	    assertTrue(viewExportPage.getTxtValidLogOut().contains(txtExpected));
	    extentTest.log(LogStatus.PASS, "Siloam200 Validasi Admin LogOut Berhasil");
	}
}
