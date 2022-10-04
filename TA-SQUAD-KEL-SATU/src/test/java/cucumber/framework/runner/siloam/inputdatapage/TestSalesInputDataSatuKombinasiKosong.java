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
import cucumber.framework.utils.Utils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TestSalesInputDataSatuKombinasiKosong {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private InputDataPage inputDataPage = new InputDataPage();
	private boolean isNamaEmpty;
	private boolean isNoBpjsEmpty;
	private boolean isNoKTPEmpty;
	private boolean isAlamatEmpty;
	private boolean isKotaKTPEmpty;
	private boolean isFaskesAwalEmpty;
	private boolean isFaskesTujuanEmpty;
	private boolean isAlasanEmpty;
	
	public TestSalesInputDataSatuKombinasiKosong() {
		driver = InputDataOutlineHooks.driver;
		extentTest = InputDataOutlineHooks.extentTest;
		
		this.isNamaEmpty = true;
		this.isNoBpjsEmpty = true;
		this.isNoKTPEmpty = true;
		this.isAlamatEmpty = true;
		this.isKotaKTPEmpty = true;
		this.isFaskesAwalEmpty = true;
		this.isFaskesTujuanEmpty = true;
		this.isAlasanEmpty = true;
	}
	
	@When("^Siloam320 Sales input data (.*), (.*), (.*), (.*), (.*), (.*), (.*), dan (.*) salah satu kosong$")
	public void siloam320_sales_input_data_nama_nomor_bpjs_nomor_ktp_address_kota_ktp_faskes_awal_faskes_tujuan_dan_alasan_salah_satu_kosong(String nama, String nomorBPJS, String nomorKTP, String address, String kotaKTP, String faskesAwal, String faskesTujuan, String alasan) throws AWTException {
		if(!nama.equals("")) {
			this.isNamaEmpty = false;
		}
		if(!nomorBPJS.equals("")) {
			this.isNoBpjsEmpty = false;
		} 
		if(!nomorKTP.equals("")) {
			this.isNoKTPEmpty = false;
		}
		if(!address.equals("")) {
			this.isAlamatEmpty = false;
		}
		if(!kotaKTP.equals("")) {
			this.isKotaKTPEmpty = false;
		}
		if(!faskesAwal.equals("")) {
			this.isFaskesAwalEmpty = false;
		}
		if(!faskesTujuan.equals("")) {
			this.isFaskesTujuanEmpty = false;
		}
		if(!alasan.equals("")) {
			this.isAlasanEmpty = false;
		}
		
		inputDataPage.inputData(nama,nomorBPJS,nomorKTP,address,kotaKTP,faskesAwal,faskesTujuan,alasan);
		extentTest.log(LogStatus.PASS, "Siloam320 Sales input semua data valid kecuali salah satu kosong");
	}

	@When("Siloam320 Sales tekan tombol simpan data invalid")
	public void siloam320_sales_tekan_tombol_simpan_data_invalid() {
		inputDataPage.clickSubmit();
		extentTest.log(LogStatus.PASS, "Siloam320 Sales tekan tombol simpan data invalid");
	}

	@Then("Siloam320 Validasi pesan isi data")
	public void siloam320_validasi_pesan_isi_data() {
		if(this.isNamaEmpty) {
			assertTrue(inputDataPage.isHaveRequired(inputDataPage.getName()));
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
			System.out.println("MASUK NAMA");
		} 
		if (this.isNoBpjsEmpty) {
			assertTrue(inputDataPage.isHaveRequired(inputDataPage.getNomBPJS()));
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
			System.out.println("MASUK BPJS");
		}
		if (this.isNoKTPEmpty) {
			assertTrue(inputDataPage.isHaveRequired(inputDataPage.getNomKTP()));
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
			System.out.println("MASUK KTP");
		}
		if (this.isAlamatEmpty) {
			String txtExpected = "Field Alamat Harus Diisi";
			assertTrue(inputDataPage.msgErrorAlamat().contains(txtExpected));
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
			System.out.println("MASUK ALAMAT");
		}
		if (this.isKotaKTPEmpty) {
			assertTrue(inputDataPage.isHaveRequired(inputDataPage.getSelectKotaKTP()));
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
			System.out.println("MASUK KOTA KTP");
		}
		if (this.isFaskesAwalEmpty) {
			assertTrue(inputDataPage.isHaveRequired(inputDataPage.getFaskesAwal()));
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
			System.out.println("MASUK FASKES AWAL");
		}
		if (this.isFaskesTujuanEmpty) {
			assertTrue(inputDataPage.isHaveRequired(inputDataPage.getSelectFaskesTujuan()));
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
			System.out.println("MASUK FASKES TUJUAN");
		}
		if (this.isAlasanEmpty) {
			String txtExpected = "Field Alasan Harus Diisi";
			assertTrue(inputDataPage.msgErrorAlasan().contains(txtExpected));
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
			System.out.println("MASUK ALASAN");
		}
		
		extentTest.log(LogStatus.PASS, "Siloam320 Validasi pesan isi data");
	}

}
