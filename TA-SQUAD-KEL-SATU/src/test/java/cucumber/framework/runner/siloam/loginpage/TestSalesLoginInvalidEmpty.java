package cucumber.framework.runner.siloam.loginpage;

/*
created_by : Manda
created_date : 30/09/2022
updated_by : Novri
updated_date : 02/10/2022
*/

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSalesLoginInvalidEmpty {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private LoginPage loginPage = new LoginPage();
	private boolean isUserEmpty;
	private boolean isPassEmpty;
	
	public TestSalesLoginInvalidEmpty() {
		driver = LoginOutlineHooks.driver;
		extentTest = LoginOutlineHooks.extentTest;
		
		this.isUserEmpty = true;
		this.isPassEmpty = true;
	}
	
	@When("Siloam019 Sales Mengakses Halaman Website")
	public void siloam019_sales_mengakses_halaman_website() {
		driver.get(Constants.URL_SILOAM);
		extentTest.log(LogStatus.PASS, "Siloam019 Sales Mengakses Halaman Website");
	}

	@When("^Siloam019 Sales Memasukan (.*) dan (.*) Salah$")
	public void siloam019_sales_memasukan_username_dan_password_salah(String username, String password) {
		if(!username.equals("")) {
			this.isUserEmpty = false;
		} 
		
		if(!password.equals("")) {
			this.isPassEmpty = false;
		}
		
		loginPage.login(username, password);
		extentTest.log(LogStatus.PASS, "Siloam019 Sales Memasukan username dan password Salah");
	}

	@When("Siloam019 Sales Menekan Tombol Login")
	public void siloam019_sales_menekan_tombol_login() {
		loginPage.btnLogin();;
		extentTest.log(LogStatus.PASS, "Siloam019 Sales Menekan Tombol Login");
	}

	@Then("Siloam019 Validasi pesan pada halaman login")
	public void siloam019_validasi_pesan_pada_halaman_login() {
		if(this.isUserEmpty) {
			assertTrue(loginPage.isHaveRequired(loginPage.getInputUsername()));
		}
		
		if(this.isPassEmpty) {
			assertTrue(loginPage.isHaveRequired(loginPage.getInputPassword()));
		} 
		
		extentTest.log(LogStatus.PASS, "Siloam019 Validasi pesan pada halaman login");
	}

}
