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


public class TestInputDataValid {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private InputDataPage inputDataPage = new InputDataPage();
	
	public TestInputDataValid() {
		driver = InputDataOutlineHooks.driver;
		extentTest = InputDataOutlineHooks.extentTest;
	}

	@When("^Siloam300 Sales input data (.*), (.*), (.*), (.*), (.*), (.*), (.*), dan (.*) valid$")
	public void siloam300_sales_input_data_nama_nomor_bpjs_nomor_ktp_address_kota_ktp_faskes_awal_faskes_tujuan_dan_alasan_valid(String nama, String nomorBPJS, String nomorKTP, String address, String kotaKTP, String faskesAwal, String faskesTujuan, String alasan) throws AWTException {
		inputDataPage.inputData(nama,nomorBPJS,nomorKTP,address,kotaKTP,faskesAwal,faskesTujuan,alasan);
		extentTest.log(LogStatus.PASS, "Siloam300 Sales input semua data karyawan valid");
	}

	@When("Siloam300 Sales tekan tombol simpan data valid")
	public void siloam300_sales_tekan_tombol_simpan_data_valid() {
		inputDataPage.clickSubmit();
		extentTest.log(LogStatus.PASS, "Siloam300 Sales tekan tombol simpan data valid");
	}

	@Then("Siloam300 Validasi pesan input data berhasil")
	public void siloam300_validasi_pesan_input_data_berhasil() {
		String txtExpected = "Data berhasil Di Simpan";
		assertTrue(inputDataPage.msgAddSuccess().contains(txtExpected));
		extentTest.log(LogStatus.PASS, "Siloam300 Validasi pesan input data berhasil");
	}

}
