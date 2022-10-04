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


public class TestSalesInputDataDuaKombinasiKosong {
	
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
	
	public TestSalesInputDataDuaKombinasiKosong() {
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
	
	@When("^Siloam325 Sales input data (.*), (.*), (.*), (.*), (.*), (.*), (.*), dan (.*) dua kosong$")
	public void siloam325_sales_input_data_nama_nomor_bpjs_nomor_ktp_address_kota_ktp_faskes_awal_faskes_tujuan_dan_alasan_dua_kosong(String nama, String nomorBPJS, String nomorKTP, String address, String kotaKTP, String faskesAwal, String faskesTujuan, String alasan) throws AWTException {
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
		if(!kotaKTP.equals("kota")) {
			this.isKotaKTPEmpty = false;
		}
		if(!faskesAwal.equals("")) {
			this.isFaskesAwalEmpty = false;
		}
		if(!faskesTujuan.equals("faskes")) {
			this.isFaskesTujuanEmpty = false;
		}
		if(!alasan.equals("")) {
			this.isAlasanEmpty = false;
		}
		
		inputDataPage.inputData(nama,nomorBPJS,nomorKTP,address,kotaKTP,faskesAwal,faskesTujuan,alasan);
		extentTest.log(LogStatus.PASS, "Siloam325 Sales input semua data valid kecuali dua kosong");
	}

	@When("Siloam325 Sales tekan tombol simpan data invalid")
	public void siloam325_sales_tekan_tombol_simpan_data_invalid() {
		inputDataPage.clickSubmit();
		extentTest.log(LogStatus.PASS, "Siloam325 Sales tekan tombol simpan data invalid");
	}

	@Then("Siloam325 Validasi pesan isi data")
	public void siloam325_validasi_pesan_isi_data() {
		if(this.isNamaEmpty) {
			assertTrue(inputDataPage.isHaveRequired(inputDataPage.getName()));
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		} 
		if (this.isNoBpjsEmpty) {
			assertTrue(inputDataPage.isHaveRequired(inputDataPage.getNomBPJS()));
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		}
		if (this.isNoKTPEmpty) {
			assertTrue(inputDataPage.isHaveRequired(inputDataPage.getNomKTP()));
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		}
		if (this.isAlamatEmpty) {
			if(!this.isNamaEmpty && !this.isNoBpjsEmpty && !this.isNoKTPEmpty && !this.isKotaKTPEmpty && !this.isFaskesAwalEmpty && !this.isFaskesTujuanEmpty) {
				String txtExpected = "Field Alamat Harus Diisi";
				assertTrue(inputDataPage.msgErrorAlamat().contains(txtExpected));
				Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
			}
		}
		if (this.isKotaKTPEmpty) {
			assertTrue(inputDataPage.isHaveRequired(inputDataPage.getSelectKotaKTP()));
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		}
		if (this.isFaskesAwalEmpty) {
			assertTrue(inputDataPage.isHaveRequired(inputDataPage.getFaskesAwal()));
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		}
		if (this.isFaskesTujuanEmpty) {
			assertTrue(inputDataPage.isHaveRequired(inputDataPage.getSelectFaskesTujuan()));
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		}
		if (this.isAlasanEmpty) {
			if(!this.isNamaEmpty && !this.isNoBpjsEmpty && !this.isNoKTPEmpty && !this.isKotaKTPEmpty && !this.isFaskesAwalEmpty && !this.isFaskesTujuanEmpty) { //&& !this.isAlamatEmpty
				String txtExpected = "Field Alasan Harus Diisi";
				assertTrue(inputDataPage.msgErrorAlasan().contains(txtExpected));
				Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);				
			}
		}
		
		extentTest.log(LogStatus.PASS, "Siloam325 Validasi pesan isi data");
	}

}
