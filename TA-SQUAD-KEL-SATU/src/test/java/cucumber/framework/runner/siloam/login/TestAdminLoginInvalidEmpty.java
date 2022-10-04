package cucumber.framework.runner.siloam.login;

/*
created_by : Manda
created_date : 30/09/2022
updated_by : Novri
updated_date : 04/10/2022
*/

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestAdminLoginInvalidEmpty {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private LoginPage loginPage = new LoginPage();
	private boolean isUserEmpty;
	private boolean isPassEmpty;
	
	public TestAdminLoginInvalidEmpty() {
		driver = LoginOutlineHooks.driver;
		extentTest = LoginOutlineHooks.extentTest;
		
		this.isUserEmpty = true;
		this.isPassEmpty = true;
	}
	
	@When("Siloam015 Admin Mengakses Halaman Website")
	public void siloam015_admin_mengakses_halaman_website() {
		driver.get(Constants.URL_SILOAM);
		extentTest.log(LogStatus.PASS, "Siloam015 Sales Mengakses Halaman Website Siloam");
	}

	@When("^Siloam015 Admin Memasukan (.*) dan (.*) Salah$")
	public void siloam015_admin_memasukan_username_dan_password_salah(String username, String password) {
//		System.out.println("admin_memasukan_username_dan_password_salah : "+username+" pwd : "+password);
		
		if(!username.equals("")) {
			this.isUserEmpty = false;
		} 
		
		if(!password.equals("")) {
			this.isPassEmpty = false;
		}
		
		loginPage.login(username, password);
		extentTest.log(LogStatus.PASS, "Siloam015 Admin Memasukan username dan password Salah");
	}

	@When("Siloam015 Admin Menekan Tombol Login")
	public void siloam015_admin_menekan_tombol_login() {
		loginPage.btnLogin();;
		extentTest.log(LogStatus.PASS, "Siloam015 Admin Menekan Tombol Login");
	}

	@Then("Siloam015 Validasi pesan pada halaman login")
	public void siloam015_validasi_pesan_pada_halaman_login() {
		if(this.isUserEmpty) {
			assertTrue(loginPage.isHaveRequired(loginPage.getInputUsername()));
		}
		
		if(this.isPassEmpty) {
			assertTrue(loginPage.isHaveRequired(loginPage.getInputPassword()));
		} 
		
		extentTest.log(LogStatus.PASS, "Siloam015 Validasi pesan pada halaman login");
	}

}
