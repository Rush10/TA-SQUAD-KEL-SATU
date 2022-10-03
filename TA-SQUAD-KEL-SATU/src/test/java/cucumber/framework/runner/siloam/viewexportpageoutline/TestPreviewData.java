package cucumber.framework.runner.siloam.viewexportpageoutline;

import static org.junit.Assert.assertFalse;

/*
created_by : Adit
created_date : 30/09/2022
updated_by : Adit
updated_date : 02/10/2022
*/


import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;

import com.mongodb.util.Util;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.ViewExportPage;
import cucumber.framework.utils.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestPreviewData {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private ViewExportPage viewExportPage = new ViewExportPage();
	
	public TestPreviewData() {
		driver = ViewExportHooksOutline.driver;
		extentTest = ViewExportHooksOutline.extentTest;
	}
	
	@Given("Siloam050 Admin Sudah Login Dan Berada Di Halaman View Data")
	public void siloam050_admin_sudah_login_dan_berada_di_halaman_view_data() {
		driver.get(Constants.URL_SILOAM);
		viewExportPage.login(Constants.USERNAME_ADMIN_SILOAM,Constants.PASSWORD_ADMIN_SILOAM);
	    viewExportPage.btnLogin();
	    driver.get(Constants.URL_SILOAM_VIEW_ADMIN);
	    extentTest.log(LogStatus.PASS, "Siloam050 Admin Sudah Login Dan Berada Di Halaman View Data");
	}

	@When("Siloam050 Admin Tekan Tombol Preview Data")
	public void siloam050_admin_tekan_tombol_preview_data() throws AWTException {
		viewExportPage.btnPreviewData();
		Utils.tabEnter();
		driver.get(Constants.URL_SILOAM_VIEW_ADMIN_DUA);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		viewExportPage.btnPreviewData();
		Utils.tabEnter();
		extentTest.log(LogStatus.PASS, "Siloam050 Admin Sudah Login Dan Berada Di Halaman View Data");
	}

	@Then("Siloam050 Validasi Data Pada Dokumen PDF")
	public void siloam050_validasi_data_pada_dokumen_pdf() {
		String pathSatu = "C:\\Users\\" + Constants.USER_COMPUTER_NAME + "\\Downloads\\mpdf.pdf";
		String pathDua = "C:\\Users\\" + Constants.USER_COMPUTER_NAME + "\\Downloads\\mpdf (1).pdf";
		assertFalse(Utils.getFileSize(pathSatu) == Utils.getFileSize(pathDua));
		extentTest.log(LogStatus.PASS, "Siloam025 Siloam030 Validasi An uncaught Exception was encountered");
	}
}
