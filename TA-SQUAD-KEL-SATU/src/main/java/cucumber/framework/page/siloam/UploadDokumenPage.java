package cucumber.framework.page.siloam;

/*
created_by : Manda
created_date : 29/09/2022
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

public class UploadDokumenPage extends LoginPage{
	
private WebDriver driver;
	
	public UploadDokumenPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//UPLOAD DOKUMEN
	@FindBy(xpath = "//a[@class='nav-link active']//span[@class='d-sm-block d-none']")
	private WebElement uploadDocumentTitle;
	
	@FindBy(xpath = "//a[@class='nav-link active']//span[@class='d-sm-block d-none']")
	private WebElement ttdDigitalTitle;
	
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/img[1]")
	private WebElement previewImgAwal;
	
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[2]/tr[1]/td[1]/div[1]/img[1]")
	private WebElement previewImgTujuan;
	
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[3]/tr[1]/td[1]/div[1]/img[1]")
	private WebElement previewImgTTD;
	
	@FindBy(xpath = "//span[normalize-space()='Foto Faskes Awal']")
	private WebElement uploadImgAwal;
	
	@FindBy(xpath = "//span[normalize-space()='Foto Faskes Tujuan']")
	private WebElement uploadImgTujuan;
	
	@FindBy(xpath = "//span[normalize-space()='Tanda Tangan Digital']")
	private WebElement uploadImgTTD;
	
	@FindBy(xpath = "//h4[@class='modal-title']")
//	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[2]/div[1]/div[1]/div[1]/h4[1]")
	private WebElement modalTitle;
	
	@FindBy(xpath = "//img[@id='previewing']")
	private WebElement previewImgModal;
	
	@FindBy(xpath = "//div[@id='message']")
	private WebElement msgErrorSave; 
	
	@FindBy(xpath = "//p[@id='error']")
	private WebElement msgErrorChooseFile; 
	
	@FindBy(xpath = "//span[@id='error_message']")
	private WebElement noteErrorChooseFile; 
	
	@FindBy(xpath = "//input[@id='file']")
	private WebElement file;
	
	@FindBy(xpath = "//button[@id='btnSave']")
	private WebElement save;
	
	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	private WebElement cancel;
	
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[2]/div[1]/div[1]/div[1]/button[1]")
	private WebElement keluar;
	
	@FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
//	@FindBy(xpath = "/html[1]/body[1]/div[7]/div[1]/div[3]/div[1]/button[1]")
	private WebElement ok;
	
	@FindBy(xpath = "//a[@class='btn btn-primary']")
//	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]")
	private WebElement selanjutnya;
	
	//UPLOAD DOKUMEN
	public WebElement btnSave() {
		return save;
	}
	
	public WebElement btnCancel() {
		return cancel;
	}
	
	public WebElement btnKeluar() {
		return keluar;
	}
	
	public WebElement getPreviewImgAwal() {
		return previewImgAwal;
	}
	
	public WebElement getPreviewImgTujuan() {
		return previewImgTujuan;
	}
	
	public WebElement getPreviewImgTTD() {
		return previewImgTTD;
	}
	
	public WebElement getPreviewImgModal() {
		return previewImgModal;
	}
	
	public WebElement getUploadDocImgAwal() {
		return uploadImgAwal;
	}
	
	public WebElement getUploadDocImgTujuan() {
		return uploadImgTujuan;
	}
	
	public WebElement getUploadDocImgTTD() {
		return uploadImgTTD;
	}
	
	public WebElement btnSelanjutnya() {
		return selanjutnya;
	}
	
	public WebElement btnOK() {
		return ok;
	}
	
	public void clickUploadDocImgAwal() {
		getUploadDocImgAwal().click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickUploadDocImgTujuan() {
		getUploadDocImgTujuan().click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickUploadDocImgTTD() {
		getUploadDocImgTTD().click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void fileUpload(String path) {
		file.sendKeys(path);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickSave() {
		btnSave().click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickCancel() {
		btnCancel().click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickKeluar() {
		btnKeluar().click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickSelanjutnya() {
		btnSelanjutnya().click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickOK() {
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		btnOK().click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public String txtErrorSave() {
		//Upload error: You did not select a file to upload.
		//Upload error: The filetype you are attempting to upload is not allowed.
		//Upload error: The file you are attempting to upload is larger than the permitted size.
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, msgErrorSave);
	}
	
	public String txtErrorChooseFileMsg() {
		//Please Select A valid Image File
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, msgErrorChooseFile);
	}
	
	public String txtErrorChooseFileNote() {
		//Only jpeg, jpg and png Images type allowed
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, noteErrorChooseFile);
	}
	
	public String txtTitleUploadDocument() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, uploadDocumentTitle);
	}
	
	public String txtTitleTTDDigital() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, ttdDigitalTitle);
	}
	
	public String txtModalTitle() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, modalTitle);
	}
	 
	public String txtSrcPreview(WebElement element) {
		//	src="https://dev.ptdika.com/siloam/new_assets/noimage.png"
		return element.getAttribute("src");
	}
	

}
