package cucumber.framework.runner.siloam.ttddigitalpage;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.TandaTanganDigitalPage;
import cucumber.framework.utils.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.opentelemetry.sdk.metrics.View;

public class TestTTDDigitalFiturDocument {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private static TandaTanganDigitalPage ttdDigital = new TandaTanganDigitalPage();
	private String getNamePicBefore;
	private String getNamePicAfter;
	private String getNamePicTTD;
	
	public TestTTDDigitalFiturDocument() {
		driver = TandaTanganDigitalOutlineHooks.driver;
		extentTest = TandaTanganDigitalOutlineHooks.extentTest;
	}
	
//BEFORE
	
	@When("Siloam210 Sales Sudah Login Dan Berada Di Halaman TTD Digital Fitur Document")
	public void siloam210_sales_sudah_login_dan_berada_di_halaman_ttd_digital_fitur_document() {
		driver.get(Constants.URL_SILOAM);
		ttdDigital.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		ttdDigital.btnLogin();
		driver.get(Constants.URL_SILOAM_TTD_DIGITAL_PREVIEW_UPLOAD_DOK);
		extentTest.log(LogStatus.PASS, "Siloam210 Sales Sudah Login Dan Berada Di Halaman TTD Digital Fitur Document");
	}

	@And("Siloam210 Sales Menekan Gambar Before Fitur Document")
	public void siloam210_sales_menekan_gambar_before_fitur_document() throws AWTException, IOException {
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		
		String txtSrc = ttdDigital.txtSrcPreview(ttdDigital.getPreviewDokumenBefore());
		String[] arrOfStr = txtSrc.split("/");
		this.getNamePicBefore = arrOfStr[arrOfStr.length-1];
//		String getNamePic = txtSrc.substring(txtSrc.length()-47,txtSrc.length());
		System.out.println(this.getNamePicBefore);
		Utils.deleteFile("C:\\Users\\" + Constants.USER_COMPUTER_NAME + "\\Downloads\\" + this.getNamePicBefore);
		
		ttdDigital.rightClickPreviewDokumenBefore();
		Utils.tabEnterDown(0, 8, 2);
	    extentTest.log(LogStatus.PASS, "Siloam210 Sales Menekan Gambar Before Fitur Document");
	}

	@Then("Siloam210 Validasi Gambar Before Fitur Document")
	public void siloam210_validasi_gambar_before_fitur_document() throws IOException {
		String pathWebPicBefore = "C:\\Users\\" + Constants.USER_COMPUTER_NAME + "\\Downloads\\" + this.getNamePicBefore;
		String pathRealPicBefore = System.getProperty("user.dir") + "\\data\\testing-file\\Upload Foto Faskes Awal.jpg";
		
		driver.get(Constants.URL_IMG_ONLINE);
		
		ttdDigital.fileUploadImg1(pathWebPicBefore);
		ttdDigital.fileUploadImg2(pathRealPicBefore);
		ttdDigital.clickBtnOKImgOnline();
		
		int charSpace = ttdDigital.txtResult().indexOf(" "); 
		String sub = ttdDigital.txtResult().substring(0,charSpace+1);
		double dNum = Double.parseDouble(sub);
		System.out.println(dNum);
		
		assertTrue(dNum > 90);
		extentTest.log(LogStatus.PASS, "Siloam210 Validasi Gambar Before Fitur Document");
	}
	
	
//AFTER
	
	@When("Siloam210 Sales Sudah Login Dan Berada Di Halaman TTD Digital Fitur Document After")
	public void siloam210_sales_sudah_login_dan_berada_di_halaman_ttd_digital_fitur_document_after() {
		driver.get(Constants.URL_SILOAM);
		ttdDigital.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		ttdDigital.btnLogin();
		driver.get(Constants.URL_SILOAM_TTD_DIGITAL_PREVIEW_UPLOAD_DOK);
		extentTest.log(LogStatus.PASS, "Siloam210 Sales Sudah Login Dan Berada Di Halaman TTD Digital Fitur Document");
	}

	@And("Siloam210 Sales Menekan Gambar After Fitur Document")
	public void siloam210_sales_menekan_gambar_after_fitur_document() throws AWTException, IOException {
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		
		String txtSrc = ttdDigital.txtSrcPreview(ttdDigital.getPreviewDokumenAfter());
		String[] arrOfStr = txtSrc.split("/");
		this.getNamePicAfter = arrOfStr[arrOfStr.length-1];
//		String getNamePic = txtSrc.substring(txtSrc.length()-46,txtSrc.length());
		System.out.println(this.getNamePicAfter);
		Utils.deleteFile("C:\\Users\\" + Constants.USER_COMPUTER_NAME + "\\Downloads\\" + this.getNamePicAfter);
		
		ttdDigital.rightClickPreviewDokumenAfter();
		Utils.tabEnterDown(0, 8, 2);
	    extentTest.log(LogStatus.PASS, "Siloam210 Sales Menekan Gambar After Fitur Document");
	}

	@Then("Siloam210 Validasi Gambar After Fitur Document")
	public void siloam210_validasi_gambar_after_fitur_document() throws IOException {
		String pathWebPicAfter = "C:\\Users\\" + Constants.USER_COMPUTER_NAME + "\\Downloads\\" + this.getNamePicAfter;
		String pathRealPicAfter = System.getProperty("user.dir") + "\\data\\testing-file\\Upload Foto Faskes Tujuan.jpg";
		
		driver.get(Constants.URL_IMG_ONLINE);
		
		ttdDigital.fileUploadImg1(pathWebPicAfter);
		ttdDigital.fileUploadImg2(pathRealPicAfter);
		ttdDigital.clickBtnOKImgOnline();
		
		int charSpace = ttdDigital.txtResult().indexOf(" "); 
		String sub = ttdDigital.txtResult().substring(0,charSpace+1);
		double dNum = Double.parseDouble(sub);
		System.out.println(dNum);
		
		assertTrue(dNum > 90);
		extentTest.log(LogStatus.PASS, "Siloam210 Validasi Gambar After Fitur Document");
	}

	
//TTD DIGITAL
	
	@When("Siloam210 Sales Sudah Login Dan Berada Di Halaman TTD Digital Fitur Document TTD Digital")
	public void siloam210_sales_sudah_login_dan_berada_di_halaman_ttd_digital_fitur_document_ttd_digital() {
		driver.get(Constants.URL_SILOAM);
		ttdDigital.login(Constants.USERNAME_SALES_SILOAM, Constants.PASSWORD_SALES_SILOAM);
		ttdDigital.btnLogin();
		driver.get(Constants.URL_SILOAM_TTD_DIGITAL_PREVIEW_UPLOAD_DOK);
		extentTest.log(LogStatus.PASS, "Siloam210 Sales Sudah Login Dan Berada Di Halaman TTD Digital Fitur Document TTD Digital");
	}

	@And("Siloam210 Sales Menekan Gambar TTD Digital Fitur Document")
	public void siloam210_sales_menekan_gambar_ttd_digital_fitur_document() throws AWTException, IOException {
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		
		String txtSrc = ttdDigital.txtSrcPreview(ttdDigital.getPreviewDokumenTTD());
		String[] arrOfStr = txtSrc.split("/");
		this.getNamePicTTD = arrOfStr[arrOfStr.length-1];
//		String getNamePic = txtSrc.substring(txtSrc.length()-44,txtSrc.length());
		System.out.println(this.getNamePicTTD);
		Utils.deleteFile("C:\\Users\\" + Constants.USER_COMPUTER_NAME + "\\Downloads\\" + this.getNamePicTTD);
		
		ttdDigital.rightClickPreviewDokumenTTD();
		Utils.tabEnterDown(0, 8, 2);
	    extentTest.log(LogStatus.PASS, "Siloam210 Sales Menekan Gambar TTD Digital Fitur Document");
	}

	@Then("Siloam210 Validasi Gambar TTD Digital Fitur Document")
	public void siloam210_validasi_gambar_ttd_digital_fitur_document() throws IOException {
		String pathWebPicTTD = "C:\\Users\\" + Constants.USER_COMPUTER_NAME + "\\Downloads\\" + this.getNamePicTTD;
		String pathRealPicTTD = System.getProperty("user.dir") + "\\data\\testing-file\\Upload Foto TTD.jpg";;
		
		driver.get(Constants.URL_IMG_ONLINE);
		
		ttdDigital.fileUploadImg1(pathWebPicTTD);
		ttdDigital.fileUploadImg2(pathRealPicTTD);
		ttdDigital.clickBtnOKImgOnline();
		
		int charSpace = ttdDigital.txtResult().indexOf(" "); 
		String sub = ttdDigital.txtResult().substring(0,charSpace+1);
		double dNum = Double.parseDouble(sub);
		System.out.println(dNum);
		
		assertTrue(dNum > 90);
		extentTest.log(LogStatus.PASS, "Siloam210 Validasi Gambar After Fitur Document");
	}

}
