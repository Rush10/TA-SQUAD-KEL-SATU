package cucumber.framework.page.siloam;

import java.awt.AWTException;

/*
created_by : Manda
created_date : 30/09/2022
updated_by : -
updated_date : -
*/ 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.framework.connection.DriverSingleton;
import cucumber.framework.constant.Constants;
import cucumber.framework.utils.Utils;

//#created_by : Alamanda
//#created_date : 31/09/2022
//#updated_by : Alamanda
//#updated_date : 03/10/2022

public class TandaTanganDigitalPage extends LoginPage{
	
private WebDriver driver;
	
	public TandaTanganDigitalPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	// NOVRI//////////////////////////////
	@FindBy(xpath = "//a[@class='nav-link active']//span[@class='d-sm-block d-none']")
	private WebElement lblTTDDigitalTitle;
	
	@FindBy(xpath = "//h4[@class='panel-title'][normalize-space()='Upload Dokumen']")
	private WebElement lblUploadDokumenTitle;
	
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/a[1]")
	private WebElement previewUploadDokumenBefore;
	
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/div[1]/a[1]")
	private WebElement previewUploadDokumenAfter;
	
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[1]/table[1]/tbody[1]/tr[3]/td[3]/div[1]/a[1]")
	private WebElement previewUploadDokumenTTD;
	
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/a[2]")
	private WebElement btnDeleteBefore;
	
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/div[1]/a[2]")
	private WebElement btnDeleteAfter;
	
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[1]/table[1]/tbody[1]/tr[3]/td[3]/div[1]/a[2]")
	private WebElement btnDeleteTTD;
	
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/a[1]")
	private WebElement btnUpdateBefore;
	
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[1]/table[1]/tbody[1]/tr[2]/td[4]/a[1]")
	private WebElement btnUpdateAfter;
	
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[1]/table[1]/tbody[1]/tr[3]/td[4]/a[1]")
	private WebElement btnUpdateTTDDigital;
	
	@FindBy(xpath = "//div[@role='alert']")
	private WebElement lblAlert;
	
	@FindBy(xpath = "//button[@id='btnSaveFoto']")
	private WebElement btnSaveTTDDigital;
	
	@FindBy(xpath = "//button[@class='btn btn-danger pull-left']")
	private WebElement btnCancelTTDDigital;
	  
	@FindBy(xpath = "//span[normalize-space()='×']")
	private WebElement btnKeluarTTDDigital;
	
	@FindBy(xpath = "//h4[@class='modal-title']")
	private WebElement lblModalTitle;
	
	@FindBy(xpath = "//img[@id='previewing_pelamar']")
	private WebElement previewImgModal;
	
	@FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
	private WebElement btnOK;
	
	@FindBy(xpath = "//input[@id='file']")
	private WebElement file;
	
	@FindBy(xpath = "//div[@id='message']")
	private WebElement msgErrorSave; 
	
	@FindBy(xpath = "//p[@id='error']")
	private WebElement msgErrorChooseFile; 
	
	@FindBy(xpath = "//span[@id='error_message']")
	private WebElement noteErrorChooseFile; 
	
	//IMGOnline
	@FindBy(xpath = "//input[@name='uploadfile']")
	private WebElement fileImg1;
	
	@FindBy(xpath = "//input[@name='uploadfile2']")
	private WebElement fileImg2;
	
	@FindBy(xpath = "//input[@value='OK']")
	private WebElement btnOKImgonline;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[4]/span[1]")
	private WebElement lblResult;
	
	// NOVRI//////////////////////////////
	
	public WebElement getPreviewUploadDokumenBefore() {		
		return this.previewUploadDokumenBefore;
	}
	
	public WebElement getPreviewUploadDokumenAfter() {		
		return this.previewUploadDokumenAfter;
	}
	
	public WebElement getPreviewUploadDokumenTTD() {		
		return this.previewUploadDokumenTTD;
	}
	
	public WebElement getBtnDeleteBefore() {		
		return this.btnDeleteBefore;
	}
	
	public WebElement getBtnDeleteAfter() {		
		return this.btnDeleteAfter;
	}
	
	public WebElement getBtnDeleteTTD() {		
		return this.btnDeleteTTD;
	}
	
	public WebElement getBtnUpdateBefore() {		
		return this.btnUpdateBefore;
	}
	
	public WebElement getBtnUpdateAfter() {		
		return this.btnUpdateAfter;
	}
	
	public WebElement getBtnUpdateTTDDigital() {		
		return this.btnUpdateTTDDigital;
	}
	
	public WebElement getBtnSaveTTDDigital() {
		return this.btnSaveTTDDigital;
	}
	
	public WebElement getBtnCancelTTDDigital() {
		return this.btnCancelTTDDigital;
	}
	
	public WebElement getBtnKeluarTTDDigital() {
		return this.btnKeluarTTDDigital;
	}
	
	public WebElement getBtnOK() {
		return this.btnOK;
	}
	
	public WebElement getPreviewImgModal() {
		return this.previewImgModal;
	}
	
	public WebElement getlblTTDDigitalTitle() {
		return this.lblTTDDigitalTitle;
	}
	
	public WebElement getlblUploadDokumenTitle() {
		return this.lblUploadDokumenTitle;
	}
	
	public String txtSrcPreview(WebElement element) {
		//	src="https://dev.ptdika.com/siloam/new_assets/noimage.png"
		return element.getAttribute("src");
	}
	
	public void clickOK() {
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		getBtnOK().click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void rightClickPreviewUploadDokumenBefore() {
		Utils.rightClick(getPreviewUploadDokumenBefore(), driver);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void rightClickPreviewUploadDokumenAfter() {
		Utils.rightClick(getPreviewUploadDokumenAfter(), driver);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void rightClickPreviewUploadDokumenTTD() {
		Utils.rightClick(getPreviewUploadDokumenTTD(), driver);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickBtnDeleteBefore() {
		getBtnDeleteBefore().click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickBtnDeleteAfter() {
		getBtnDeleteAfter().click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickBtnDeleteTTD() {
		getBtnDeleteTTD().click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickBtnSaveTTDDigital() {
		getBtnSaveTTDDigital().click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickBtnCancelTTDDigital() {
		getBtnCancelTTDDigital().click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickBtnKeluarTTDDigital() {
		getBtnKeluarTTDDigital().click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickBtnUpdateBefore() {
		Utils.elementClick(getBtnUpdateBefore(), driver);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickBtnUpdateAfter() {
		Utils.elementClick(getBtnUpdateAfter(), driver);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickBtnUpdateTTDDigital() {
		Utils.elementClick(getBtnUpdateTTDDigital(), driver);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public String getTTDDigitalTitle() {
		//TTD Digital
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, getlblTTDDigitalTitle());
	}
	
	public String getUploadDokumenTitle() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, getlblUploadDokumenTitle());
	}
	
	public String getMsgAlert() {
		//berhasil didelete
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, this.lblAlert);
	}
	
	public String getModalTitle() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, this.lblModalTitle);
	}
	
	public String txtErrorSave() {
		//Upload error: You did not select a file to upload.
		//Upload error: The filetype you are attempting to upload is not allowed.
		//Upload error: The file you are attempting to upload is larger than the permitted size.
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, this.msgErrorSave);
	}
	
	public String txtErrorChooseFileMsg() {
		//Please Select A valid Image File
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, this.msgErrorChooseFile);
	}
	
	public String txtErrorChooseFileNote() {
		//Only jpeg, jpg and png Images type allowed
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, this.noteErrorChooseFile);
	}
	
	public void fileUpload(String path) {
		file.sendKeys(path);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	//IMGOnline
	public void fileUploadImg1(String path) {
		fileImg1.sendKeys(path);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void fileUploadImg2(String path) {
		fileImg2.sendKeys(path);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickBtnOKImgOnline() {
		Utils.elementClick(this.btnOKImgonline, driver);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public String txtResult() {
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, lblResult);
	}

}
