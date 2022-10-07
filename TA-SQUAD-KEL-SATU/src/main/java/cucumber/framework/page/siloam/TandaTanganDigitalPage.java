package cucumber.framework.page.siloam;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

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
	
	//manda
	//PAGE NEW
	@FindBy(xpath = "//a[@href='https://dev.ptdika.com/siloam/sales/new_data']")
	private WebElement pageNew;
		
	//DATA
	@FindBy(xpath = "//input[@id='name']")
	private WebElement nama;
	
	@FindBy(xpath = "//input[@id='no_bpjs']")
	private WebElement nomBpjs;
	
	@FindBy(xpath = "//input[@id='no_ktp']")
	private WebElement nomKtp;
	
	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement address;
	
	@FindBy(xpath = "//span[@id='select2-ktp_city-container']")
	private WebElement kotaKTP;
	
	@FindBy(xpath = "//input[@role='textbox']")
	private WebElement txtBox;
	
	@FindBy(xpath = "//input[@id='origin_faskes']")
	private WebElement faskesAwal;
	
	@FindBy(xpath = "//span[@id='select2-destination_faskes-container']")
	private WebElement faskesTujuan;
	
	@FindBy(xpath = "//textarea[@id='reason']")
	private WebElement alasan;
	
	@FindBy(xpath = "//button[@id='btnEdit']")
	private WebElement edit;
	
	@FindBy(xpath = "//button[@id='btnUpdate']")
	private WebElement update;
	
	@FindBy(xpath = "//button[@id='btnCancelUpdate']")
	private WebElement cancelUpdate;
	
	//ADIT
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]/img[1]")
	private WebElement previewDokumenBefore;
	
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/a[1]/img[1]")
	private WebElement previewDokumenAfter;
	
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/a[1]/img[1]")
	private WebElement previewDokumenTTD;
	
	@FindBy(xpath = "//a[@class='btn btn-primary']")
	private WebElement submit;
	
	@FindBy(xpath = "//b[normalize-space()='DIKA | SILOAM']")
	private WebElement txtPageLogin;
	
	// INVALID EDIT
	
	@FindBy(xpath = "//span[normalize-space()='The Nomor BPJS already exist.']")
	private WebElement txtInvalidNoBPJS;
	
	@FindBy(xpath = "//span[normalize-space()='Field Nomor KTP Harus Diisi!']")
	private WebElement txtInvalidNoKTP;
	
	@FindBy(xpath = "//span[normalize-space()='Field Alamat Harus Diisi!']")
	private WebElement txtInvalidAlamat;
	
	@FindBy(xpath = "//span[normalize-space()='Field Faskes Asal Harus Diisi!']")
	private WebElement txtInvalidFaskesAwal;
	
	@FindBy(xpath = "//span[normalize-space()='Field Alasan Harus Diisi!']")
	private WebElement txtInvalidAlasan;
		
	// NOVRI//////////////////////////////
	@FindBy(xpath = "//a[@class='nav-link active']//span[@class='d-sm-block d-none']")
	private WebElement lblTTDDigitalTitle;
	
	@FindBy(xpath = "/html[1]/body[1]/div[5]/h1[1]")
	private WebElement lblPageHeader;
	
	@FindBy(xpath = "//h4[@class='panel-title'][normalize-space()='Upload Dokumen']")
	private WebElement lblUploadDokumenTitle;
	
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/a[1]/img[1]")
	private WebElement previewUploadDokumenBefore;
	
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/div[1]/a[1]/img[1]")
	private WebElement previewUploadDokumenAfter;
	
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[1]/table[1]/tbody[1]/tr[3]/td[3]/div[1]/a[1]/img[1]")
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
	
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]")
	private WebElement lblAlertSimpanData;
	
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
	
	public String getFormInputTitle() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, lblPageHeader);
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
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, this.lblAlert);
	}
	
	public String getAlertSimpanData() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, this.lblAlertSimpanData);
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
	
	//MANDA
	public void update(String nama, String nomBpjs,String nomKtp, String address, String srkotaKTP, String faskesAwal, String faskesTujuan, String alasan) throws AWTException {
		Robot robot = new Robot();
		
		if(!nama.equals("")) {
			clearName();
			updateName(nama);
		}
		if(!nomBpjs.equals("")) {
			clearNomBpjs();
			updateNoBPJS(nomBpjs);
		} 
		if(!nomKtp.equals("")) {
			clearNomKtp();
			updateNomKtp(nomKtp);
		}
		if(!address.equals("")) {
			clearAddress();
			updateAddress(address);
		}
		if(!srkotaKTP.equals("")) {
			clickKotaKTP();
			updateKotaKTP(srkotaKTP);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
//			Select skotaKtp = new Select(kotaKTP);
//			skotaKtp.selectByValue(srkotaKTP);
		}
		if(!faskesAwal.equals("")) {
			clearfaskesAwal();
			updateFaskesAwal(faskesAwal);
		}
		if(!faskesTujuan.equals("")) {
			clickFaskesTujuan();
			updateFaskesTujuan(faskesTujuan);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
		if(!alasan.equals("")) {
			clearAlasan();
			updateAlasan(alasan);
		}
		
	}

	
//PAGE NEW
	public void menuNew() {
		this.pageNew.click();
	}
	
//DATA	
	
	//Nama
	public String getTxtName() {		
		return nama.getAttribute("value");
	}
	
	public void clearName() {
		this.nama.clear();
	}
	
	public void updateName(String nama) {
		this.nama.sendKeys(nama);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	//No BPJS
	public void clearNomBpjs() {
		this.nomBpjs.clear();
	} 
	
	public void updateNoBPJS(String nomBpjs) {
		this.nomBpjs.sendKeys(nomBpjs);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public String getTxtNoBPJS() {		
		return nomBpjs.getAttribute("value");
	}
	
	//No KTP
	public void clearNomKtp() {
		this.nomKtp.clear();
	} 
	
	public void updateNomKtp(String nomKtp) {
		this.nomKtp.sendKeys(nomKtp);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public String getTxtNomKtp() {		
		return nomKtp.getAttribute("value");
	}
	
	//Address
	public void clearAddress() {
		this.address.clear();
	} 
	
	public void updateAddress(String address) {
		this.address.sendKeys(address);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public String getTxtAddress() {		
		return address.getAttribute("value");
	}
	
	//Kota KTP
	public String getTxtKotaKTP() {		
		return kotaKTP.getAttribute("title");
	}
	
	public void clickKotaKTP() {
		this.kotaKTP.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	} 
	
	public void updateKotaKTP(String kotaKTP) {
		this.txtBox.sendKeys(kotaKTP);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	//Faskes Awal
	public void clearfaskesAwal() {
		this.faskesAwal.clear();
	} 
	
	public void updateFaskesAwal(String faskesAwal) {
		this.faskesAwal.sendKeys(faskesAwal);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public String getTxtFaskesAwal() {		
		return faskesAwal.getAttribute("value");
	}
	
	//Faskes Tujuan
	public void clickFaskesTujuan() {
		this.faskesTujuan.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void updateFaskesTujuan(String faskesTujuan) {
		this.txtBox.sendKeys(faskesTujuan);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public String getTxtFaskesTujuan() {		
		return faskesTujuan.getAttribute("title");
	}
	
	//Alasan
	public void clearAlasan() {
		this.alasan.clear();
	} 
	
	public void updateAlasan(String alasan) {
		this.alasan.sendKeys(alasan);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public String getTxtAlasan() {		
		return alasan.getAttribute("value");
	}
	
	
	public void btnEdit() {
		this.edit.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btnUpdate() {
		this.update.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btncancelUpdate() {
		this.cancelUpdate.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	//ADIT
	
	public WebElement getPreviewDokumenBefore() {		
		return this.previewDokumenBefore;
	}
	
	public WebElement getPreviewDokumenAfter() {		
		return this.previewDokumenAfter;
	}
	
	public WebElement getPreviewDokumenTTD() {		
		return this.previewDokumenTTD;
	}
	
	public void rightClickPreviewDokumenBefore() {
		Utils.rightClick(getPreviewDokumenBefore(), driver);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void rightClickPreviewDokumenAfter() {
		Utils.rightClick(getPreviewDokumenAfter(), driver);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void rightClickPreviewDokumenTTD() {
		Utils.rightClick(getPreviewDokumenTTD(), driver);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	// INVALID EDIT
	public String msgInvalidNoBPJS() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtInvalidNoBPJS);
	}	
	
	public String msgInvalidNoKTP() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtInvalidNoKTP);
	}
	
	public String msgInvalidAlamat() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtInvalidAlamat);
	}
	
	public String msgInvalidFaskesAwal() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtInvalidFaskesAwal);
	}
	
	public String msgInvalidAlasan() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtInvalidAlasan);
	}
	
	public void updateInvalid(String nama, String nomBpjs,String nomKtp, String address, String srkotaKTP, String faskesAwal, String faskesTujuan, String alasan) throws AWTException {
		Robot robot = new Robot();
		
		if(nama.equals("")) {
			clearName();
			updateName(nama);
		}
		if(nomBpjs.equals("")) {
			clearNomBpjs();
			updateNoBPJS(nomBpjs);
		} 
		if(nomKtp.equals("")) {
			clearNomKtp();
			updateNomKtp(nomKtp);
		}
		if(address.equals("")) {
			clearAddress();
			updateAddress(address);
		}
		if(srkotaKTP.equals("")) {
			clickKotaKTP();
			updateKotaKTP(srkotaKTP);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
//			Select skotaKtp = new Select(kotaKTP);
//			skotaKtp.selectByValue(srkotaKTP);
		}
		if(faskesAwal.equals("")) {
			clearfaskesAwal();
			updateFaskesAwal(faskesAwal);
		}
		if(faskesTujuan.equals("")) {
			clickFaskesTujuan();
			updateFaskesTujuan(faskesTujuan);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
		if(alasan.equals("")) {
			clearAlasan();
			updateAlasan(alasan);
		}
		
	}
	
	public boolean msgErrorBPJSCharacter() {
		return (nomBpjs.getAttribute("minlength").toString().contains("13"))  && (nomBpjs.getAttribute("maxlength").contains("13"));
	}
	
	public boolean msgErrorNoKTPCharacter() {
		return (nomKtp.getAttribute("minlength").toString().contains("16"))  && (nomKtp.getAttribute("maxlength").contains("16"));
	}
	
	//submit 
	public void btnSubmit()
	{
		this.submit.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
}
