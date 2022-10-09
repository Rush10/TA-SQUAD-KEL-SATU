package cucumber.framework.runner.siloam.viewexportpage;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;

/*
created_by : Adit
created_date : 30/09/2022
updated_by : Novri
updated_date : 02/10/2022
*/


import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.ViewExportPage;
import cucumber.framework.utils.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestFaskesTujuan {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private ViewExportPage viewExportPage = new ViewExportPage();
	private String getNamePic;
	
	public TestFaskesTujuan() {
		driver = ViewExportHooksOutline.driver;
		extentTest = ViewExportHooksOutline.extentTest;
	}
	
	@Given("Siloam060 Admin Berada Di Halaman View Export Dan Sudah Tekan Filter")
	public void siloam060_admin_berada_di_halaman_view_export_dan_sudah_tekan_filter() {
		driver.get(Constants.URL_SILOAM);
		viewExportPage.login(Constants.USERNAME_ADMIN_SILOAM,Constants.PASSWORD_ADMIN_SILOAM);
	    viewExportPage.btnLogin();
	    viewExportPage.btnViewExport();
	    
	    String startDate = "2022-10-08";
	    String endDate = "2022-10-08";
	    
	    viewExportPage.filter(startDate,endDate);
	    extentTest.log(LogStatus.PASS, "Siloam060 Admin Berada Di Halaman View Export Dan Sudah Tekan Filter");
	}

	@When("Siloam060 Admin Tekan Link Faskes Tujuan")
	public void siloam060_admin_tekan_link_faskes_tujuan() throws IOException, AWTException {
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		
		String txtSrc = viewExportPage.txtHrefPreview(viewExportPage.getFaskesTujuan());
		String[] arrOfStr = txtSrc.split("/");
		this.getNamePic = arrOfStr[arrOfStr.length-1];
//		this.getNamePic = txtSrc.substring(txtSrc.length()-46,txtSrc.length());
		System.out.println(this.getNamePic);
		Utils.deleteFile("C:\\Users\\" + Constants.USER_COMPUTER_NAME + "\\Downloads\\" + this.getNamePic);
		
		viewExportPage.rightClickFaskesTujuan();
		
		Utils.tabEnterDown(0, 4, 2);
		extentTest.log(LogStatus.PASS, "Siloam060 Admin Tekan Link Faskes Tujuan");
	}

	@Then("Siloam060 Validasi Gambar Faskes Tujuan")
	public void siloam060_validasi_gambar_faskes_tujuan() {
		String pathWebPicTujuan = "C:\\Users\\" + Constants.USER_COMPUTER_NAME + "\\Downloads\\" + this.getNamePic;
		String pathRealPicTujuan = System.getProperty("user.dir") + "\\data\\testing-file\\Upload Foto Faskes Tujuan.jpg";
		
		driver.get(Constants.URL_IMG_ONLINE);
		Utils.scrollDownToButtom(driver);
		
		viewExportPage.inputChooseFileSatu(pathWebPicTujuan);
		viewExportPage.inputChooseFileDua(pathRealPicTujuan);
		viewExportPage.btnOK();
		
		int charSpace = viewExportPage.txtResult().indexOf(" "); 
		String sub = viewExportPage.txtResult().substring(0,charSpace+1);
		double dNum = Double.parseDouble(sub);
		System.out.println(dNum);
		
		assertTrue(dNum > 90);
	}
}
