package cucumber.framework.runner.siloam.ttddigitalpage;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.TandaTanganDigitalPage;
import cucumber.framework.utils.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestTTDDigitalFiturFileUpload {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private static TandaTanganDigitalPage ttdPage = new TandaTanganDigitalPage();
	private String getNamePicBefore;
	private String getNamePicAfter;
	private String getNamePicTTD;
	
	public TestTTDDigitalFiturFileUpload() {
		driver = TandaTanganDigitalOutlineHooks.driver;
		extentTest = TandaTanganDigitalOutlineHooks.extentTest;
	}
	
//BEFORE
	
	@When("Siloam215 Sales Sudah Login Dan Berada Di Halaman TTD Digital Fitur File Upload")
	public void siloam215_sales_sudah_login_dan_berada_di_halaman_ttd_digital_fitur_file_upload() {
		driver.get(Constants.URL_SILOAM);
		ttdPage.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		ttdPage.btnLogin();
		driver.get(Constants.URL_SILOAM_TTD_DIGITAL_PREVIEW_UPLOAD_DOK);
		extentTest.log(LogStatus.PASS, "Siloam215 Sales Sudah Login Dan Berada Di Halaman TTD Digital Fitur File Upload");
	}

	@And("Siloam215 Sales Menekan Gambar Before Fitur File Upload")
	public void siloam215_sales_menekan_gambar_before_fitur_file_upload() throws AWTException, IOException {
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		Utils.scrollByVisibleElement(ttdPage.getlblUploadDokumenTitle(), driver);
		
		//pake split slash
		//https://dev.ptdika.com/siloam/upload/dokumen/570/570_Before_d6afc10be16d20986b0306d476a4b70c.jpg
		String txtSrc = ttdPage.txtSrcPreview(ttdPage.getPreviewUploadDokumenBefore());
		String[] arrOfStr = txtSrc.split("/");
		this.getNamePicBefore = arrOfStr[arrOfStr.length-1];
//		String getNamePic = txtSrc.substring(txtSrc.length()-47,txtSrc.length());
		System.out.println(this.getNamePicBefore);
		Utils.deleteFile("C:\\Users\\" + Constants.USER_COMPUTER_NAME + "\\Downloads\\" + this.getNamePicBefore);
		
		//pake wget
		ttdPage.rightClickPreviewUploadDokumenBefore();
		Utils.tabEnterDown(0, 8, 2);
		
	    extentTest.log(LogStatus.PASS, "Siloam215 Sales Menekan Gambar Before Fitur File Upload");
	}

	@Then("Siloam215 Validasi Gambar Before Fitur File Upload")
	public void siloam215_validasi_gambar_before_fitur_file_upload() {
		String pathWebPicBefore = "C:\\Users\\" + Constants.USER_COMPUTER_NAME + "\\Downloads\\" + this.getNamePicBefore;
		String pathRealPicBefore = System.getProperty("user.dir") + "\\data\\testing-file\\Upload Foto Faskes Awal.jpg";
		
		driver.get(Constants.URL_IMG_ONLINE);
		Utils.scrollDownToButtom(driver);
		
		ttdPage.fileUploadImg1(pathWebPicBefore);
		ttdPage.fileUploadImg2(pathRealPicBefore);
		ttdPage.clickBtnOKImgOnline();
		
		int charSpace = ttdPage.txtResult().indexOf(" "); 
		String sub = ttdPage.txtResult().substring(0,charSpace+1);
		double dNum = Double.parseDouble(sub);
		System.out.println(dNum);
		
		assertTrue(dNum > 90);
		
		extentTest.log(LogStatus.PASS, "Siloam215 Validasi Gambar Before Fitur File Upload");
	}
	
//AFTER
	
	@When("Siloam215 Sales Sudah Login Dan Berada Di Halaman TTD Digital Fitur File Upload After")
	public void siloam215_sales_sudah_login_dan_berada_di_halaman_ttd_digital_fitur_file_upload_after() {
		driver.get(Constants.URL_SILOAM);
		ttdPage.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		ttdPage.btnLogin();
		driver.get(Constants.URL_SILOAM_TTD_DIGITAL_PREVIEW_UPLOAD_DOK);
		extentTest.log(LogStatus.PASS, "Siloam215 Sales Sudah Login Dan Berada Di Halaman TTD Digital Fitur File Upload After");
	}

	@And("Siloam215 Sales Menekan Gambar After Fitur File Upload")
	public void siloam215_sales_menekan_gambar_after_fitur_file_upload() throws AWTException, IOException {
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		Utils.scrollByVisibleElement(ttdPage.getlblUploadDokumenTitle(), driver);
		
		String txtSrc = ttdPage.txtSrcPreview(ttdPage.getPreviewUploadDokumenAfter());
		String[] arrOfStr = txtSrc.split("/");
		this.getNamePicAfter = arrOfStr[arrOfStr.length-1];
//		String getNamePic = txtSrc.substring(txtSrc.length()-46,txtSrc.length());
		System.out.println(this.getNamePicAfter);
		Utils.deleteFile("C:\\Users\\" + Constants.USER_COMPUTER_NAME + "\\Downloads\\" + this.getNamePicAfter);
		
		ttdPage.rightClickPreviewUploadDokumenAfter();
		Utils.tabEnterDown(0, 8, 2);
		
	    extentTest.log(LogStatus.PASS, "Siloam215 Sales Menekan Gambar After Fitur File Upload");
	}

	@Then("Siloam215 Validasi Gambar After Fitur File Upload")
	public void siloam215_validasi_gambar_after_fitur_file_upload() {
		String pathWebPicBefore = "C:\\Users\\" + Constants.USER_COMPUTER_NAME + "\\Downloads\\" + this.getNamePicAfter;
		String pathRealPicBefore = System.getProperty("user.dir") + "\\data\\testing-file\\Upload Foto Faskes Tujuan.jpg";
		
		driver.get(Constants.URL_IMG_ONLINE);
		Utils.scrollDownToButtom(driver);
		
		ttdPage.fileUploadImg1(pathWebPicBefore);
		ttdPage.fileUploadImg2(pathRealPicBefore);
		ttdPage.clickBtnOKImgOnline();
		
		int charSpace = ttdPage.txtResult().indexOf(" "); 
		String sub = ttdPage.txtResult().substring(0,charSpace+1);
		double dNum = Double.parseDouble(sub);
		System.out.println(dNum);
		
		assertTrue(dNum > 90);
		
		extentTest.log(LogStatus.PASS, "Siloam215 Validasi Gambar After Fitur File Upload");
	}
	
	
//TTD DIGITAL
	
	@When("Siloam215 Sales Sudah Login Dan Berada Di Halaman TTD Digital Fitur File Upload TTD Digital")
	public void siloam215_sales_sudah_login_dan_berada_di_halaman_ttd_digital_fitur_file_upload_ttd_digital() {
		driver.get(Constants.URL_SILOAM);
		ttdPage.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		ttdPage.btnLogin();
		driver.get(Constants.URL_SILOAM_TTD_DIGITAL_PREVIEW_UPLOAD_DOK);
		extentTest.log(LogStatus.PASS, "Siloam215 Sales Sudah Login Dan Berada Di Halaman TTD Digital Fitur File Upload TTD Digital");
	}

	@And("Siloam215 Sales Menekan Gambar TTD Digital Fitur File Upload")
	public void siloam215_sales_menekan_gambar_ttd_digital_fitur_file_upload() throws AWTException, IOException {
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		Utils.scrollByVisibleElement(ttdPage.getlblUploadDokumenTitle(), driver);
		
		String txtSrc = ttdPage.txtSrcPreview(ttdPage.getPreviewUploadDokumenTTD());
		String[] arrOfStr = txtSrc.split("/");
		this.getNamePicTTD = arrOfStr[arrOfStr.length-1];
//		String getNamePic = txtSrc.substring(txtSrc.length()-44,txtSrc.length());
		System.out.println(this.getNamePicTTD);
		Utils.deleteFile("C:\\Users\\" + Constants.USER_COMPUTER_NAME + "\\Downloads\\" + this.getNamePicTTD);
		
		ttdPage.rightClickPreviewUploadDokumenTTD();
		Utils.tabEnterDown(0, 8, 2);
		
	    extentTest.log(LogStatus.PASS, "Siloam215 Sales Menekan Gambar TTD Digital Fitur File Upload");
	}

	@Then("Siloam215 Validasi Gambar TTD Digital Fitur File Upload")
	public void siloam215_validasi_gambar_ttd_digital_fitur_file_upload() {
		String pathWebPicBefore = "C:\\Users\\" + Constants.USER_COMPUTER_NAME + "\\Downloads\\" + this.getNamePicTTD;
		String pathRealPicBefore = System.getProperty("user.dir") + "\\data\\testing-file\\Upload Foto TTD.jpg";
		
		driver.get(Constants.URL_IMG_ONLINE);
		Utils.scrollDownToButtom(driver);
		
		ttdPage.fileUploadImg1(pathWebPicBefore);
		ttdPage.fileUploadImg2(pathRealPicBefore);
		ttdPage.clickBtnOKImgOnline();
		
		int charSpace = ttdPage.txtResult().indexOf(" "); 
		String sub = ttdPage.txtResult().substring(0,charSpace+1);
		double dNum = Double.parseDouble(sub);
		System.out.println(dNum);
		
		assertTrue(dNum > 90);
		
		extentTest.log(LogStatus.PASS, "Siloam215 Validasi Gambar TTD Digital Fitur File Upload");
	}
}
