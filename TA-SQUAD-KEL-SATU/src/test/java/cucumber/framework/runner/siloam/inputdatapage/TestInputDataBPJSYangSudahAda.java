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


public class TestInputDataBPJSYangSudahAda {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private InputDataPage inputDataPage = new InputDataPage();
	
	public TestInputDataBPJSYangSudahAda() {
		driver = InputDataOutlineHooks.driver;
		extentTest = InputDataOutlineHooks.extentTest;
	}

	@When("^Siloam315 Sales input data (.*), (.*), (.*), (.*), (.*), (.*), (.*), dan (.*) nomor bpjs sudah ada$")
	public void siloam315_sales_input_data_nama_nomor_bpjs_nomor_ktp_address_kota_ktp_faskes_awal_faskes_tujuan_dan_alasan_nomor_bpjs_sudah_ada(String nama, String nomorBPJS, String nomorKTP, String address, String kotaKTP, String faskesAwal, String faskesTujuan, String alasan) throws AWTException {
		inputDataPage.inputData(nama,nomorBPJS,nomorKTP,address,kotaKTP,faskesAwal,faskesTujuan,alasan);
		extentTest.log(LogStatus.PASS, "Siloam315 Sales input semua data valid kecuali nomor bpjs sudah ada");
	}

	@When("Siloam315 Sales tekan tombol simpan data invalid")
	public void siloam315_sales_tekan_tombol_simpan_data_invalid() {
		inputDataPage.clickSubmit();
		extentTest.log(LogStatus.PASS, "Siloam315 Sales tekan tombol simpan data invalid");
	}

	@Then("Siloam315 Validasi pesan nomor BPJS sudah ada atau dipakai")
	public void siloam315_validasi_pesan_nomor_bpjs_sudah_ada_atau_dipakai() {
		String txtExpected = "Nomor BPJS already exist";
		assertTrue(inputDataPage.msgErrorBPJSReady().contains(txtExpected));
		extentTest.log(LogStatus.PASS, "Siloam315 Validasi pesan nomor BPJS sudah ada atau dipakai");
	}

}
