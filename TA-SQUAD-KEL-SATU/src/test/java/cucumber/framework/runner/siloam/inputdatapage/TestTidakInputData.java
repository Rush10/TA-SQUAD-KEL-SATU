package cucumber.framework.runner.siloam.inputdatapage;

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


public class TestTidakInputData {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private InputDataPage inputDataPage = new InputDataPage();
	
	public TestTidakInputData() {
		driver = InputDataOutlineHooks.driver;
		extentTest = InputDataOutlineHooks.extentTest;
	}

	@When("Siloam305001 Sales tekan tombol simpan data invalid")
	public void siloam305001_sales_tekan_tombol_simpan_data_invalid() {
		inputDataPage.clickInputDataMenu();
		inputDataPage.clickSubmit();
		extentTest.log(LogStatus.PASS, "Siloam305-001 Sales tekan tombol simpan data invalid");
	}

	@Then("Siloam305001 Validasi pesan error isi input nama")
	public void siloam305001_validasi_pesan_error_isi_input_nama() {
		assertTrue(inputDataPage.isHaveRequired(inputDataPage.getName()));
		extentTest.log(LogStatus.PASS, "Siloam305-001 Validasi pesan error isi input nama");
	}

	@When("^Siloam305002 Sales input data (.*), (.*), (.*), (.*), (.*), (.*), (.*), dan (.*) valid$")
	public void siloam305002_sales_input_data_nama_nomor_bpjs_nomor_ktp_address_kota_ktp_faskes_awal_faskes_tujuan_dan_alasan_valid(String nama, String nomorBPJS, String nomorKTP, String address, String kotaKTP, String faskesAwal, String faskesTujuan, String alasan) throws AWTException {
		inputDataPage.inputData(nama,nomorBPJS,nomorKTP,address,kotaKTP,faskesAwal,faskesTujuan,alasan);
		extentTest.log(LogStatus.PASS, "Siloam305-002 Sales input semua data karyawan valid");
	}

	@When("Siloam305002 Sales tekan tombol simpan data invalid")
	public void siloam305002_sales_tekan_tombol_simpan_data_invalid() {
		inputDataPage.clickSubmit();
		extentTest.log(LogStatus.PASS, "Siloam305-002 Sales tekan tombol simpan data invalid");
	}

	@Then("Siloam305002 Validasi pesan error isi input nama")
	public void siloam305002_validasi_pesan_error_isi_input_nama() {
		assertTrue(inputDataPage.isHaveRequired(inputDataPage.getName()));
		extentTest.log(LogStatus.PASS, "Siloam305-002 Validasi pesan error isi input nama");
	}

}
