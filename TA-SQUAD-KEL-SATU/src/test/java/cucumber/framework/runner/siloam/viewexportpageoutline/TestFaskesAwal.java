package cucumber.framework.runner.siloam.viewexportpageoutline;


/*
created_by : Adit
created_date : 30/09/2022
updated_by : Novri
updated_date : 02/10/2022
*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.siloam.ViewExportPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestFaskesAwal {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private ViewExportPage viewExportPage = new ViewExportPage();
	
	public TestFaskesAwal() {
		driver = ViewExportHooksOutline.driver;
		extentTest = ViewExportHooksOutline.extentTest;
	}
	
	@Given("Siloam055 Admin Berada Di Halaman View Export Dan Sudah Tekan Filter")
	public void siloam055_admin_berada_di_halaman_view_export_dan_sudah_tekan_filter() {
		driver.get(Constants.URL_SILOAM);
		viewExportPage.login(Constants.USERNAME_ADMIN_SILOAM,Constants.PASSWORD_ADMIN_SILOAM);
	    viewExportPage.btnLogin();
	    viewExportPage.btnViewExport();
	    
	    String startDate = "2022-09-14";
	    String endDate = "2022-09-18";
	    
	    viewExportPage.filter(startDate,endDate);
	    extentTest.log(LogStatus.PASS, "Siloam055 Admin Berada Di Halaman View Export Dan Sudah Tekan Filter");
	}

	@When("Siloam055 Admin Tekan Link Faskes Awal")
	public void siloam055_admin_tekan_link_faskes_awal() {
		viewExportPage.btnFaskesAwal();
		
//		Actions actions = new Actions(driver);
//		WebElement elementLocator = driver.findElement(By.cssSelector("img[src='https://dev.ptdika.com/siloam/upload/dokumen/350/350_Before_c89e27a00e06626438c07e03607a94ed.png']"));
//		actions.contextClick(elementLocator).perform();
		
		extentTest.log(LogStatus.PASS, "Siloam055 Admin Tekan Link Faskes Awal");
	}

	@Then("Siloam055 Validasi Gambar Faskes Awal")
	public void siloam055_validasi_gambar_faskes_awal() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}
}
