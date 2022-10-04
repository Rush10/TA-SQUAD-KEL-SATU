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



public class TestSalesLogOut {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private FormReturnPage formReturnPage = new FormReturnPage();
	
	public TestSalesLogOut() {
		driver = FormReturnHooks.driver;
		extentTest = FormReturnHooks.extentTest;
	}
	
	@When("Siloam205 Sales Sudah Login")
	public void siloam205_sales_sudah_login() {
		driver.get(Constants.URL_SILOAM);
		formReturnPage.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		formReturnPage.btnLogin();
		extentTest.log(LogStatus.PASS, "Siloam205 Sales Sudah Login");
	}

	@And("Siloam205 Sales Menekan Tombol Akun Di Pojok Kanan Atas")
	public void siloam205_sales_menekan_tombol_akun_di_pojok_kanan_atas() {
	    formReturnPage.btnAkun();
	    extentTest.log(LogStatus.PASS, "Siloam205 Sales Menekan Tombol Akun Di Pojok Kanan Atas");
	}

	@And("Siloam205 Sales Menekan LogOut")
	public void siloam205_sales_menekan_log_out() {
	    formReturnPage.btnLogOut();
	    extentTest.log(LogStatus.PASS, "Siloam205 Sales Menekan LogOut");
	}

	@Then("Siloam205 Validasi Sales LogOut Berhasil")
	public void siloam205_validasi_sales_log_out_berhasil() {
	    String txtExpected = "DIKA";
	    assertTrue(formReturnPage.getTxtValidLogOut().contains(txtExpected));
	    extentTest.log(LogStatus.PASS, "Siloam205 Validasi Sales LogOut Berhasil");
	}
}
