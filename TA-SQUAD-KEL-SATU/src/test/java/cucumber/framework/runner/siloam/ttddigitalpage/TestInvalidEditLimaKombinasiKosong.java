package cucumber.framework.runner.siloam.ttddigitalpage;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

/*
created_by : Adit
created_date : 05/10/2022
updated_by : -
updated_date : -
*/

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.TandaTanganDigitalPage;
import cucumber.framework.utils.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestInvalidEditLimaKombinasiKosong {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private TandaTanganDigitalPage ttdDigital = new TandaTanganDigitalPage();
	private boolean isNamaEmpty;
	private boolean isBpjsEmpty;
	private boolean isNoKTPEmpty;
	private boolean isAlamatEmpty;
	private boolean isKotaKTPEmpty;
	private boolean isFaskesAwalEmpty;
	private boolean isFaskesTujuanEmpty;
	private boolean isAlasanEmpty;
	private String strUpdateName;
	private String strUpdateBpjs;
	private String strUpdateNoKTP;
	private String strUpdateAlamat;
	private String strUpdateKotaKTP;
	private String strUpdateFaskesAwal;
	private String strUpdateFaskesTujuan;
	private String strUpdateAlasan;
	
	public TestInvalidEditLimaKombinasiKosong() {
		driver = TandaTanganDigitalOutlineHooks.driver;
		extentTest = TandaTanganDigitalOutlineHooks.extentTest;
		this.isNamaEmpty = true;
		this.isBpjsEmpty = true;
		this.isNoKTPEmpty = true;
		this.isAlamatEmpty = true;
		this.isKotaKTPEmpty = true;
		this.isFaskesAwalEmpty = true;
		this.isFaskesTujuanEmpty = true;
		this.isAlasanEmpty = true;
	}
	
	
//	@When("Siloam145 Sales Mengakses Halaman Website")
//	public void siloam145_sales_mengakses_halaman_website() {
//		driver.get(Constants.URL_SILOAM);
//		ttdDigital.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
//		ttdDigital.btnLogin();
//		extentTest.log(LogStatus.PASS, "Siloam145 Sales Mengakses Halaman Website");
//	}
//
//	@Then("Siloam145 Validasi Sales Masuk Ke Halaman TTD Digital")
//	public void siloam145_validasi_sales_masuk_ke_halaman_ttd_digital() {
//		extentTest.log(LogStatus.PASS, "Siloam145 Validasi Sales Masuk Ke Halaman TTD Digital");
//	}

	@When("Siloam145 Sales Tekan Tombol Edit")
	public void siloam145_sales_tekan_tombol_edit() {
		driver.get(Constants.URL_SILOAM_TTD_DIGITAL_EDIT_INVALID);
		ttdDigital.btnEdit();
		extentTest.log(LogStatus.PASS, "Siloam145 Sales Tekan Tombol Edit");
	}

	@And("^Siloam145 Sales Melakukan Update Pada (.*), (.*), (.*), (.*), (.*), (.*), (.*), dan (.*)$")
	public void siloam145_sales_melakukan_update_pada_nama_nomor_bpjs_nomor_ktp_address_kota_ktp_faskes_awal_faskes_tujuan_dan_alasan(String nama, String nomBpjs,String nomKtp, String address, String kotaKTP, String faskesAwal, String faskesTujuan, String alasan) throws AWTException {
		if(!nama.equals("")) {
			this.isNamaEmpty = false;
		}
		if(!nomBpjs.equals("")) {
			this.isBpjsEmpty = false;
		} 
		if(!nomKtp.equals("")) {
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
		
		strUpdateName = nama;
		strUpdateBpjs = nomBpjs;
		strUpdateNoKTP = nomKtp;
		strUpdateAlamat = address;
		strUpdateKotaKTP = kotaKTP;
		strUpdateFaskesAwal = faskesAwal;
		strUpdateFaskesTujuan = faskesTujuan;
		strUpdateAlasan = alasan;
		
		
		ttdDigital.updateInvalid(nama, nomBpjs, nomKtp, address, kotaKTP, faskesAwal, faskesTujuan, alasan);
		extentTest.log(LogStatus.PASS, "Siloam145 Sales Melakukan Update Pada nama, nomorBPJS, nomorKTP, address, kotaKTP, faskesAwal, faskesTujuan, dan alasan");
	}

	@And("Siloam145 Sales tekan tombol Simpan")
	public void siloam145_sales_tekan_tombol_simpan() {
		ttdDigital.btnUpdate();
		extentTest.log(LogStatus.PASS, "Siloam145 Sales tekan tombol Simpan");
	}

	@Then("Siloam145 Validasi Pesan Harus Isi Field")
	public void siloam145_validasi_pesan_harus_isi_field() {
		String txtExpectedNoBPJS = "The Nomor BPJS already exist.";
		String txtExpectedNoKTP = "Field Nomor KTP Harus Diisi!";
		String txtExpectedAlamat = "Field Alamat Harus Diisi!";
		String txtExpectedFaskesAwal = "Field Faskes Asal Harus Diisi!";
		String txtExpectedAlasan = "Field Alasan Harus Diisi!";
		
		if (this.isBpjsEmpty) {
			assertTrue(ttdDigital.msgInvalidNoBPJS().contains(txtExpectedNoBPJS));
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		}
		if (this.isNoKTPEmpty) {
			assertTrue(ttdDigital.msgInvalidNoKTP().contains(txtExpectedNoKTP));
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		}

		if (this.isAlamatEmpty) {
			assertTrue(ttdDigital.msgInvalidAlamat().contains(txtExpectedAlamat));
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		}
		if (this.isFaskesAwalEmpty) {
			assertTrue(ttdDigital.msgInvalidFaskesAwal().contains(txtExpectedFaskesAwal));
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		}
		if (this.isAlasanEmpty) {
			assertTrue(ttdDigital.msgInvalidAlasan().contains(txtExpectedAlasan));
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		}
		extentTest.log(LogStatus.PASS, "Siloam145 Validasi Pesan Harus Isi Field");
	}
}
