package cucumber.framework.runner.siloam.inputdatapage;

import static org.junit.Assert.assertFalse;

/*
created_by : Novri
created_date : 03/10/2022
updated_by : -
updated_date : -
*/

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.InputDataPage;
import cucumber.framework.page.siloam.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TestInputDataSalahFormat {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private InputDataPage inputDataPage = new InputDataPage();
	
	public TestInputDataSalahFormat() {
		driver = InputDataOutlineHooks.driver;
		extentTest = InputDataOutlineHooks.extentTest;
	}
	
	@When("Siloam310001 Sales Mengakses Halaman Website")
	public void siloam310001_sales_mengakses_halaman_website() {
		driver.get(Constants.URL_SILOAM);
		inputDataPage.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		inputDataPage.btnLogin();
		inputDataPage.clickInputDataMenu();
		extentTest.log(LogStatus.PASS, "Siloam310-001 Sales Mengakses Halaman Website dan masuk ke halaman input");
	}

	@When("^Siloam310001 Sales input data (.*), (.*), (.*), (.*), (.*), (.*), (.*), dan (.*) nomor bpjs format invalid$")
	public void siloam310001_sales_input_data_nama_nomor_bpjs_nomor_ktp_address_kota_ktp_faskes_awal_faskes_tujuan_dan_alasan_nomor_bpjs_format_invalid(String nama, String nomorBPJS, String nomorKTP, String address, String kotaKTP, String faskesAwal, String faskesTujuan, String alasan) throws AWTException {
		inputDataPage.inputData(nama,nomorBPJS,nomorKTP,address,kotaKTP,faskesAwal,faskesTujuan,alasan);
		extentTest.log(LogStatus.PASS, "Siloam310-001 Sales input semua data karyawan valid kecuali nomor bpjs format invalid");
	}

	@When("Siloam310001 Sales tekan tombol simpan data invalid")
	public void siloam310001_sales_tekan_tombol_simpan_data_invalid() {
		inputDataPage.clickSubmit();
		extentTest.log(LogStatus.PASS, "Siloam310-001 Sales tekan tombol simpan data invalid");
	}
	
	@Then("Siloam310001 Validasi pesan error nomor BPJS angka harus tiga belas")
	public void siloam310001_validasi_pesan_error_nomor_bpjs_angka_harus_tiga_belas() {
		assertTrue(inputDataPage.msgErrorBPJSCharacter());
		extentTest.log(LogStatus.PASS, "Siloam310-001 Validasi pesan error nomor BPJS angka harus tiga belas");
	}

	@When("^Siloam310002 Sales input data (.*), (.*), (.*), (.*), (.*), (.*), (.*), dan (.*) nomor ktp format invalid$")
	public void siloam310002_sales_input_data_nama_nomor_bpjs_nomor_ktp_address_kota_ktp_faskes_awal_faskes_tujuan_dan_alasan_nomor_ktp_format_invalid(String nama, String nomorBPJS, String nomorKTP, String address, String kotaKTP, String faskesAwal, String faskesTujuan, String alasan) throws AWTException {
		inputDataPage.inputData(nama,nomorBPJS,nomorKTP,address,kotaKTP,faskesAwal,faskesTujuan,alasan);
		extentTest.log(LogStatus.PASS, "Siloam310-002 Sales input semua data karyawan valid kecuali nomor ktp format invalid");
	}

	@When("Siloam310002 Sales tekan tombol simpan data invalid")
	public void siloam310002_sales_tekan_tombol_simpan_data_invalid() {
		inputDataPage.clickSubmit();
		extentTest.log(LogStatus.PASS, "Siloam310-002 Sales tekan tombol simpan data invalid");
	}
	
	@Then("Siloam310002 Validasi pesan error nomor KTP angka harus enam belas")
	public void siloam310002_validasi_pesan_error_nomor_ktp_angka_harus_enam_belas() {
		assertTrue(inputDataPage.msgErrorNoKTPCharacter());
		extentTest.log(LogStatus.PASS, "Siloam310-002 Validasi pesan error nomor KTP angka harus enam belas");
	}


}
