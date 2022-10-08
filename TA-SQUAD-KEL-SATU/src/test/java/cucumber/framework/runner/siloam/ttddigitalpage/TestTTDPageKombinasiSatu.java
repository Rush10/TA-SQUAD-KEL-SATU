package cucumber.framework.runner.siloam.ttddigitalpage;

//#created_by : Alamanda
//#created_date : 31/09/2022
//#updated_by : Novri
//#updated_date : 7/10/2022

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.TandaTanganDigitalPage;
import cucumber.framework.utils.Utils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestTTDPageKombinasiSatu {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private TandaTanganDigitalPage ttdPage = new TandaTanganDigitalPage();
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
	
	
	public TestTTDPageKombinasiSatu() {
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
	
//	@When("Siloam100 Sales Mengakses Halaman Website")
//	public void siloam100_sales_mengakses_halaman_website() {
//		driver.get(Constants.URL_SILOAM);
//		ttdPage.login(Constants.USERNAME_SALES_SILOAM,Constants.PASSWORD_SALES_SILOAM );
//		ttdPage.btnLogin();
//		extentTest.log(LogStatus.PASS, "Siloam100 Sales Mengakses Halaman Website");
//	}
//	
//	@Then("Siloam100 Validasi sales masuk ke halaman ttd digital")
//	public void siloam100_sales_sudah_login_dan_berada_di_halaman_ttd_digital() {
//		String txtExpectedTitle = "TTD Digital";
//		assertTrue(ttdPage.getTTDDigitalTitle().contains(txtExpectedTitle));
//		extentTest.log(LogStatus.PASS, "Siloam100 Validasi sales masuk ke halaman ttd digital");
//	}

	@When("Siloam100 Sales Tekan Tombol Edit")
	public void siloam100_sales_tekan_tombol_edit() {
	   driver.get(Constants.URL_SILOAM_TTD_DIGITAL_EDIT_VALID);
	   ttdPage.btnEdit();
	   extentTest.log(LogStatus.PASS, "Siloam100 Sales Tekan Tombol Edit");
	}
	
//	Siloam100 Sales Melakukan Update Pada nama, nomorBPJS, nomorKTP, alamat, kotaKTP, faskesAwal, faskesTujuan, dan alasan

	@When("^Siloam100 Sales Melakukan Update Pada (.*), (.*), (.*), (.*), (.*), (.*), (.*), dan (.*)$")
	public void siloam100_sales_melakukan_update_pada_nama_nomor_bpjs_nomor_ktp_address_kota_ktp_faskes_awal_faskes_tujuan_dan_alasan(String nama, String nomBpjs,String nomKtp, String address, String kotaKTP, String faskesAwal, String faskesTujuan, String alasan) throws AWTException {
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
		
		
		ttdPage.update(nama, nomBpjs, nomKtp, address, kotaKTP, faskesAwal, faskesTujuan, alasan);
		extentTest.log(LogStatus.PASS, "Siloam100 Sales Melakukan Update Pada nama, nomorBPJS, nomorKTP, address, kotaKTP, faskesAwal, faskesTujuan, dan alasan");
	}

	@When("Siloam100 Sales tekan tombol Simpan")
	public void siloam100_sales_tekan_tombol_simpan() {
		ttdPage.btnUpdate();
		extentTest.log(LogStatus.PASS, "Siloam100 Sales tekan tombol Simpan");
	}

	@Then("Siloam100 Validasi Data tersimpan dan form ter-update")
	public void siloam100_validasi_data_tersimpan_dan_form_ter_update() {
		String txtExpected = "Data berhasil Di Simpan";
		assertTrue(ttdPage.getMsgAlert().contains(txtExpected));
		
		if(!this.isNamaEmpty) {
			assertEquals(ttdPage.getTxtName(), strUpdateName);
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		} 
		if (!this.isBpjsEmpty) {
			assertEquals(ttdPage.getTxtNoBPJS(), strUpdateBpjs);
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		}
		if (!this.isNoKTPEmpty) {
			assertEquals(ttdPage.getTxtNomKtp(), strUpdateNoKTP);
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		}
	
		if (!this.isAlamatEmpty) {
			assertEquals(ttdPage.getTxtAddress(), strUpdateAlamat);
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		}
		if (!this.isKotaKTPEmpty) {
			assertTrue(ttdPage.getTxtKotaKTP().contains(strUpdateKotaKTP));
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		}
		if (!this.isFaskesAwalEmpty) {
			assertEquals(ttdPage.getTxtFaskesAwal(), strUpdateFaskesAwal);
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		}
		if (!this.isFaskesTujuanEmpty) {
			assertTrue(ttdPage.getTxtFaskesTujuan().contains(strUpdateFaskesTujuan));
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		}
		if (!this.isAlasanEmpty) {
			assertEquals(ttdPage.getTxtAlasan(), strUpdateAlasan);
			Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		}
		
		extentTest.log(LogStatus.PASS, "Siloam100 Validasi Data tersimpan dan form ter-update");
	    
	}

}
