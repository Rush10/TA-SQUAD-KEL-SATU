package cucumber.framework.runner.siloam.formreturnpage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.FormReturnPage;
import cucumber.framework.utils.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


/*
created_by : Adit
created_date : 02/10/2022
updated_by : -
updated_date : -
*/

public class TestFormReturnShowPage {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private FormReturnPage formReturnPage = new FormReturnPage();
	
	public TestFormReturnShowPage() {
		driver = FormReturnHooks.driver;
		extentTest = FormReturnHooks.extentTest;
	}

	
//SHOW PAGE 10
	
	@When("Siloam090 Sales Sudah Login Dan Berada Di Halaman Form Return Show Page Sepuluh")
	public void siloam090_sales_sudah_login_dan_berada_di_halaman_form_return_show_page_sepuluh() {
		driver.get(Constants.URL_SILOAM);
		formReturnPage.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		formReturnPage.btnLogin();
		formReturnPage.btnNew();
	    extentTest.log(LogStatus.PASS, "Siloam090 Sales Sudah Login Dan Berada Di Halaman Form Return Show Page Sepuluh");
	}

	@And("Siloam090 Sales Tekan Tombol Show Sepuluh")
	public void siloam090_sales_tekan_tombol_show_sepuluh() {
	    formReturnPage.btnShow();
	    extentTest.log(LogStatus.PASS, "Siloam090 Sales Tekan Tombol Show Sepuluh");
	}

	@And("Siloam090 Sales Pilih Sepuluh")
	public void siloam090_sales_pilih_sepuluh() {
		String page = "10";
	    formReturnPage.pilihSepuluh(page);
	    extentTest.log(LogStatus.PASS, "Siloam090 Sales Pilih Sepuluh");
	}

	@Then("Siloam090 Validasi Angka Sepuluh")
	public void siloam090_validasi_angka_sepuluh() {
		String txtExpected = "10";
		assertEquals(formReturnPage.getTxtSepuluh(), txtExpected);
		extentTest.log(LogStatus.PASS, "Siloam090 Validasi Angka Sepuluh");
	}
	

//Next Show Sepuluh
	
	@When("Siloam090 Sales Sudah Login Berada Di Halaman Form Return Dan Pilih Show Page Sepuluh")
	public void siloam090_sales_sudah_login_berada_di_halaman_form_return_dan_pilih_show_page_sepuluh() {
		driver.get(Constants.URL_SILOAM);
		formReturnPage.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		formReturnPage.btnLogin();
		formReturnPage.btnNew();
		formReturnPage.btnShow();
		
		String page = "10";
		
		formReturnPage.pilihSepuluh(page);
	    extentTest.log(LogStatus.PASS, "Siloam090 Sales Sudah Login Berada Di Halaman Form Return Dan Pilih Show Page Sepuluh");
	}

	@And("Siloam090 Sales Tekan Tombol Show Sepuluh Next")
	public void siloam090_sales_tekan_tombol_show_sepuluh_next() {
	    Utils.scrollDownToButtom(driver);
	    formReturnPage.btnNext();
	    extentTest.log(LogStatus.PASS, "Siloam090 Sales Tekan Tombol Show Sepuluh Next");
	}

	@Then("Siloam090 Validasi Angka Sebelas")
	public void siloam090_validasi_angka_sebelas() {
		String txtExpected = "11";
		assertEquals(formReturnPage.getTxtSebelas(), txtExpected);
		extentTest.log(LogStatus.PASS, "Siloam090 Validasi Angka Sepuluh");
	}
	
// Previous Show Sepuluh
	
	@When("Siloam090 Sales Sudah Login Berada Di Halaman Form Return Pilih Show Page Sepuluh Dan Next")
	public void siloam090_sales_sudah_login_berada_di_halaman_form_return_pilih_show_page_sepuluh_dan_next() {
		driver.get(Constants.URL_SILOAM);
		formReturnPage.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		formReturnPage.btnLogin();
		formReturnPage.btnNew();
		formReturnPage.btnShow();
		
		String page = "10";
		
		formReturnPage.pilihSepuluh(page);
		Utils.scrollDownToButtom(driver);
	    formReturnPage.btnNext();
	    extentTest.log(LogStatus.PASS, "Siloam090 Sales Sudah Login Berada Di Halaman Form Return Pilih Show Page Sepuluh Dan Next");
	}

	@And("Siloam090 Sales Tekan Tombol Show Sepuluh Previous")
	public void siloam090_sales_tekan_tombol_show_sepuluh_previous() {
	    formReturnPage.btnPrevious();
	    extentTest.log(LogStatus.PASS, "Siloam090 Sales Tekan Tombol Show Sepuluh Previous");
	}

	@Then("Siloam090 Validasi Angka Sepuluh Previous")
	public void siloam090_validasi_angka_sepuluh_previous() {
		String txtExpected = "10";
		assertEquals(formReturnPage.getTxtSepuluhPrevious(), txtExpected);
		extentTest.log(LogStatus.PASS, "Siloam090 Validasi Angka Sepuluh Previous");
	}
	
//Show Page Dua Puluh Lima
	
	@When("Siloam090 Sales Sudah Login Dan Berada Di Halaman Form Return Show Page Dua Puluh Lima")
	public void siloam090_sales_sudah_login_dan_berada_di_halaman_form_return_show_page_dua_puluh_lima() {
		driver.get(Constants.URL_SILOAM);
		formReturnPage.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		formReturnPage.btnLogin();
		formReturnPage.btnNew();
	    extentTest.log(LogStatus.PASS, "Siloam090 Sales Sudah Login Dan Berada Di Halaman Form Return Show Page Dua Puluh Lima");
	}

	@When("Siloam090 Sales Tekan Tombol Show Dua Puluh Lima")
	public void siloam090_sales_tekan_tombol_show_dua_puluh_lima() {
		formReturnPage.btnShow();
	    extentTest.log(LogStatus.PASS, "Siloam090 Sales Tekan Tombol Show Dua Puluh Lima");
	}

	@When("Siloam090 Sales Pilih Dua Puluh Lima")
	public void siloam090_sales_pilih_dua_puluh_lima() {
		String page = "25";
		formReturnPage.pilihDuaLima(page);
		extentTest.log(LogStatus.PASS, "Siloam090 Sales Pilih Dua Puluh Lima");
	}

	@Then("Siloam090 Validasi Angka Dua Puluh Lima")
	public void siloam090_validasi_angka_dua_puluh_lima() {
		String txtExpected = "25";
		assertEquals(formReturnPage.getTxtDuaLima(), txtExpected);
		extentTest.log(LogStatus.PASS, "Siloam090 Validasi Angka Dua Puluh Lima");
	}

	
//Next Show Dua Puluh Lima
	
	@When("Siloam090 Sales Sudah Login Berada Di Halaman Form Return Dan Pilih Show Page Dua Puluh Lima")
	public void siloam090_sales_sudah_login_berada_di_halaman_form_return_dan_pilih_show_page_dua_puluh_lima() {
		driver.get(Constants.URL_SILOAM);
		formReturnPage.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		formReturnPage.btnLogin();
		formReturnPage.btnNew();
		formReturnPage.btnShow();
		
		String page = "25";
		
		formReturnPage.pilihDuaLima(page);
	    extentTest.log(LogStatus.PASS, "Siloam090 Sales Sudah Login Berada Di Halaman Form Return Dan Pilih Show Page Dua Puluh Lima");
	}

	@When("Siloam090 Sales Tekan Tombol Show Dua Puluh Lima Next")
	public void siloam090_sales_tekan_tombol_show_dua_puluh_lima_next() {
		Utils.scrollDownToButtom(driver);
	    formReturnPage.btnNext();
	    extentTest.log(LogStatus.PASS, "Siloam090 Sales Tekan Tombol Show Dua Puluh Lima Next");
	}

	@Then("Siloam090 Validasi Angka Dua Puluh Enam")
	public void siloam090_validasi_angka_dua_puluh_enam() {
		String txtExpected = "26";
		assertEquals(formReturnPage.getTxtDuaEnam(), txtExpected);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		extentTest.log(LogStatus.PASS, "Siloam090 Validasi Angka Dua Puluh Enam");
	}

	
//Previous Show Dua Puluh Lima
	
	@When("Siloam090 Sales Sudah Login Berada Di Halaman Form Return Pilih Show Page Dua Puluh Lima Dan Next")
	public void siloam090_sales_sudah_login_berada_di_halaman_form_return_pilih_show_page_dua_puluh_lima_dan_next() {
		driver.get(Constants.URL_SILOAM);
		formReturnPage.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		formReturnPage.btnLogin();
		formReturnPage.btnNew();
		formReturnPage.btnShow();
		
		String page = "25";
		
		formReturnPage.pilihDuaLima(page);
		Utils.scrollDownToButtom(driver);
	    formReturnPage.btnNext();
	    extentTest.log(LogStatus.PASS, "Siloam090 Sales Sudah Login Berada Di Halaman Form Return Pilih Show Page Dua Puluh Lima Dan Next");
	}

	@When("Siloam090 Sales Tekan Tombol Show Dua Puluh Lima Previous")
	public void siloam090_sales_tekan_tombol_show_dua_puluh_lima_previous() {
	    formReturnPage.btnPrevious();
	    extentTest.log(LogStatus.PASS, "Siloam090 Sales Tekan Tombol Show Dua Puluh Lima Previous");
	}

	@Then("Siloam090 Validasi Angka Dua Puluh Lima Previous")
	public void siloam090_validasi_angka_dua_puluh_lima_previous() {
		String txtExpected = "25";
		assertEquals(formReturnPage.getTxtDuaLimaPrevious(), txtExpected);
		extentTest.log(LogStatus.PASS, "Siloam090 Validasi Angka Dua Puluh Lima Previous");
	}
	
	
//SHOW PAGE 50
	
	@When("Siloam090 Sales Sudah Login Dan Berada Di Halaman Form Return Show Page Lima Puluh")
	public void siloam090_sales_sudah_login_dan_berada_di_halaman_form_return_show_page_lima_puluh() {
		driver.get(Constants.URL_SILOAM);
		formReturnPage.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		formReturnPage.btnLogin();
		formReturnPage.btnNew();
	    extentTest.log(LogStatus.PASS, "Siloam090 Sales Sudah Login Dan Berada Di Halaman Form Return Show Page Lima Puluh");
	}

	@When("Siloam090 Sales Tekan Tombol Show Lima Puluh")
	public void siloam090_sales_tekan_tombol_show_lima_puluh() {
		formReturnPage.btnShow();
	    extentTest.log(LogStatus.PASS, "Siloam090 Sales Tekan Tombol Show Lima Puluh");
	}

	@When("Siloam090 Sales Pilih Lima Puluh")
	public void siloam090_sales_pilih_lima_puluh() {
		String page = "50";
	    formReturnPage.pilihLimaPuluh(page);
	    extentTest.log(LogStatus.PASS, "Siloam090 Sales Pilih Lima Puluh");
	}

	@Then("Siloam090 Validasi Angka Lima Puluh")
	public void siloam090_validasi_angka_lima_puluh() {
		String txtExpected = "50";
		assertEquals(formReturnPage.getTxtLimaPuluh(), txtExpected);
		extentTest.log(LogStatus.PASS, "Siloam090 Validasi Angka Lima Puluh");
	}

	
// NEXT SHOW 50	
	@When("Siloam090 Sales Sudah Login Berada Di Halaman Form Return Dan Pilih Show Page Lima Puluh")
	public void siloam090_sales_sudah_login_berada_di_halaman_form_return_dan_pilih_show_page_lima_puluh() {
		driver.get(Constants.URL_SILOAM);
		formReturnPage.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		formReturnPage.btnLogin();
		formReturnPage.btnNew();
		formReturnPage.btnShow();
		
		String page = "50";
		
		formReturnPage.pilihLimaPuluh(page);
	    extentTest.log(LogStatus.PASS, "Siloam090 Sales Sudah Login Berada Di Halaman Form Return Dan Pilih Show Page Dua Puluh Lima");
	}

	@When("Siloam090 Sales Tekan Tombol Show Lima Puluh Next")
	public void siloam090_sales_tekan_tombol_show_lima_puluh_next() {
		Utils.scrollDownToButtom(driver);
	    formReturnPage.btnNext();
	    extentTest.log(LogStatus.PASS, "Siloam090 Sales Tekan Tombol Show Lima Puluh Next");
	}

	@Then("Siloam090 Validasi Angka Lima Puluh Satu")
	public void siloam090_validasi_angka_lima_puluh_satu() {
		String txtExpected = "51";
		assertEquals(formReturnPage.getTxtLimaPuluhSatu(), txtExpected);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		extentTest.log(LogStatus.PASS, "Siloam090 Validasi Angka Lima Puluh Satu");
	}

	
	
//PREVIOUS SHOW 50	
	@When("Siloam090 Sales Sudah Login Berada Di Halaman Form Return Pilih Show Page Lima Puluh Dan Next")
	public void siloam090_sales_sudah_login_berada_di_halaman_form_return_pilih_show_page_lima_puluh_dan_next() {
		driver.get(Constants.URL_SILOAM);
		formReturnPage.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		formReturnPage.btnLogin();
		formReturnPage.btnNew();
		formReturnPage.btnShow();
		
		String page = "50";
		
		formReturnPage.pilihLimaPuluh(page);
		Utils.scrollDownToButtom(driver);
	    formReturnPage.btnNext();
	    extentTest.log(LogStatus.PASS, "Siloam090 Sales Sudah Login Berada Di Halaman Form Return Pilih Show Page Lima Puluh Dan Next");
	}

	@When("Siloam090 Sales Tekan Tombol Show Lima Puluh Previous")
	public void siloam090_sales_tekan_tombol_show_lima_puluh_previous() {
	    formReturnPage.btnPrevious();
	    extentTest.log(LogStatus.PASS, "Siloam090 Sales Tekan Tombol Show Lima Puluh Previous");
	}
	
	@Then("Siloam090 Validasi Angka Lima Puluh Previous")
	public void siloam090_validasi_angka_lima_puluh_previous() {
		String txtExpected = "50";
		assertEquals(formReturnPage.getTxtLimaPuluhPrevious(), txtExpected);
		extentTest.log(LogStatus.PASS, "Siloam090 Validasi Angka Lima Puluh Previous");
	}
	
	
// SHOW PAGE 100	
	
	@When("Siloam090 Sales Sudah Login Dan Berada Di Halaman Form Return Show Page Seratus")
	public void siloam090_sales_sudah_login_dan_berada_di_halaman_form_return_show_page_seratus() {
		driver.get(Constants.URL_SILOAM);
		formReturnPage.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		formReturnPage.btnLogin();
		formReturnPage.btnNew();
	    extentTest.log(LogStatus.PASS, "Siloam090 Sales Sudah Login Dan Berada Di Halaman Form Return Show Page Seratus");
	}

	@And("Siloam090 Sales Tekan Tombol Show Seratus")
	public void siloam090_sales_tekan_tombol_show_seratus() {
	    formReturnPage.btnShow();
	    extentTest.log(LogStatus.PASS, "Siloam090 Sales Tekan Tombol Show Seratus");
	}

	@And("Siloam090 Sales Pilih Seratus")
	public void siloam090_sales_pilih_seratus() {
		String page = "100";
	    formReturnPage.pilihSeratus(page);
	    extentTest.log(LogStatus.PASS, "Siloam090 Sales Pilih Seratus");
	}

	@Then("Siloam090 Validasi Angka Seratus")
	public void siloam090_validasi_angka_seratus() {
		String txtExpected = "100";
		assertEquals(formReturnPage.getTxtSeratus(), txtExpected);
		extentTest.log(LogStatus.PASS, "Siloam090 Validasi Angka Seratus");
	}

	
//NEXT SHOW 100	
	@When("Siloam090 Sales Sudah Login Berada Di Halaman Form Return Dan Pilih Show Page Seratus")
	public void siloam090_sales_sudah_login_berada_di_halaman_form_return_dan_pilih_show_page_seratus() {
		driver.get(Constants.URL_SILOAM);
		formReturnPage.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		formReturnPage.btnLogin();
		formReturnPage.btnNew();
		formReturnPage.btnShow();
		
		String page = "100";
		
		formReturnPage.pilihSeratus(page);
	    extentTest.log(LogStatus.PASS, "Siloam090 Sales Sudah Login Berada Di Halaman Form Return Dan Pilih Show Page Seratus");
	}

	@And("Siloam090 Sales Tekan Tombol Show Seratus Next")
	public void siloam090_sales_tekan_tombol_show_seratus_next() {
		Utils.scrollDownToButtom(driver);
	    formReturnPage.btnNext();
	    extentTest.log(LogStatus.PASS, "Siloam090 Sales Tekan Tombol Show Seratus Next");
	}

	@Then("Siloam090 Validasi Angka Seratus Satu")
	public void siloam090_validasi_angka_seratus_satu() {
		String txtExpected = "101";
		assertEquals(formReturnPage.getTxtSeratusSatu(), txtExpected);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		extentTest.log(LogStatus.PASS, "Siloam090 Validasi Angka Seratus Satu");
	}

	
//PREVIOUS SHOW 100
	
	@When("Siloam090 Sales Sudah Login Berada Di Halaman Form Return Pilih Show Page Seratus Dan Next")
	public void siloam090_sales_sudah_login_berada_di_halaman_form_return_pilih_show_page_seratus_dan_next() {
		driver.get(Constants.URL_SILOAM);
		formReturnPage.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		formReturnPage.btnLogin();
		formReturnPage.btnNew();
		formReturnPage.btnShow();
		
		String page = "100";
		
		formReturnPage.pilihSeratus(page);
		Utils.scrollDownToButtom(driver);
	    formReturnPage.btnNext();
	    extentTest.log(LogStatus.PASS, "Siloam090 Sales Sudah Login Berada Di Halaman Form Return Pilih Show Page Seratus Dan Next");
	}

	@And("Siloam090 Sales Tekan Tombol Show Seratus Previous")
	public void siloam090_sales_tekan_tombol_show_seratus_previous() {
		 formReturnPage.btnPrevious();
		 extentTest.log(LogStatus.PASS, "Siloam090 Sales Tekan Tombol Show Seratus Previous");
	}

	@Then("Siloam090 Validasi Angka Seratus Previous")
	public void siloam090_validasi_angka_seratus_previous() {
		String txtExpected = "100";
		assertEquals(formReturnPage.getTxtSeratusPrevious(), txtExpected);
		extentTest.log(LogStatus.PASS, "Siloam090 Validasi Angka Lima Puluh Previous");
	}
}
