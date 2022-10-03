package cucumber.framework.page.siloam;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

/*
created_by : Manda
created_date : 29/09/2022
updated_by : Novri
updated_date : 03/10/2022
*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.framework.connection.DriverSingleton;
import cucumber.framework.constant.Constants;
import cucumber.framework.utils.Utils;

public class InputDataPage extends LoginPage{
	
private WebDriver driver;
	
	public InputDataPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	
	//INPUT DATA
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
	
	@FindBy(xpath = "//select[@id='ktp_city']")
	private WebElement selectKotaKTP;
	
	@FindBy(xpath = "//input[@id='origin_faskes']")
	private WebElement faskesAwal;
	
	@FindBy(xpath = "//span[@id='select2-destination_faskes-container']")
	private WebElement faskesTujuan;
	
	@FindBy(xpath = "//select[@id='destination_faskes']")
	private WebElement selectFaskesTujuan;
	
	@FindBy(xpath = "//input[@role='textbox']")
	private WebElement txtBox;
	
	@FindBy(xpath = "//textarea[@id='reason']")
	private WebElement alasan;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submit;
	
	@FindBy(xpath = "//span[normalize-space()='Input']")
	private WebElement inputDataMenu;
	
	@FindBy(xpath = "//span[normalize-space()='Field Alamat Harus Diisi!']")
	private WebElement msgAlamat;
	
	@FindBy(xpath = "//span[normalize-space()='The Nomor BPJS already exist.']")
	private WebElement msgBPJS;
	
	@FindBy(xpath = "//span[normalize-space()='Field Alasan Harus Diisi!']")
	private WebElement msgAlasan;
	
	@FindBy(xpath = "//div[@role='alert']")
	private WebElement msgValidSave;
	
	@FindBy(xpath = "//a[@class='nav-link active']//span[@class='d-sm-block d-none']")
	private WebElement inputDataTitle;
	
	//INPUT DATA
//	public void inputData(String nama, String nomBpjs,String nomKtp, String address, String kotaKTP, String faskesAwal, String faskesTujuan, String alasan) throws AWTException {
//		Robot robot = new Robot();
//		
//		if(nama != "") {
//			clearName();
//			inputName(nama);
//		}
//		if(nomBpjs != "") {
//			clearNomBpjs();
//			inputNomBPJS(nomBpjs);
//		} 
//		if(nomKtp != "") {
//			clearNomKtp();
//			inputNomKtp(nomKtp);
//		}
//		if(address != "") {
//			clearAddress();
//			inputAddress(address);
//		}
//		if(kotaKTP != "") {
//			clickKotaKtp();
//			inputKotaKTP(kotaKTP);
//			robot.keyPress(KeyEvent.VK_ENTER);
//			robot.keyRelease(KeyEvent.VK_ENTER);
//		}
//		if(faskesAwal != "") {
//			clearFaskesAwal();
//			inputFaskesAwal(faskesAwal);
//		}
//		if(faskesTujuan != "") {
//			clickFaskesTujuan();
//			inputFaskesTujuan(faskesTujuan);
//			robot.keyPress(KeyEvent.VK_ENTER);
//			robot.keyRelease(KeyEvent.VK_ENTER);
//		}
//		if(alasan != "") {
//			clearAlasan();
//			inputAlasan(alasan);
//		}
//		
//	}
	
	public void inputData(String nama, String nomBpjs,String nomKtp, String address, String kotaKTP, String faskesAwal, String faskesTujuan, String alasan) throws AWTException {
		Robot robot = new Robot();
		
		clearName();
		inputName(nama);
		
		clearNomBpjs();
		inputNomBPJS(nomBpjs);
		
		clearNomKtp();
		inputNomKtp(nomKtp);
		
		clearAddress();
		inputAddress(address);
		
		clickKotaKtp();
		inputKotaKTP(kotaKTP);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		clearFaskesAwal();
		inputFaskesAwal(faskesAwal);
		
		clickFaskesTujuan();
		inputFaskesTujuan(faskesTujuan);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		if(!faskesTujuan.equalsIgnoreCase("faskes")) {	
			clearAlasan();
			inputAlasan(alasan);
		}
	}
	
	public void clearName() {
		this.nama.clear();
	}
	
	public void clearNomBpjs() {
		this.nomBpjs.clear();
	}
	
	public void clearNomKtp() {
		this.nomKtp.clear();
	}
	
	public void clearAddress() {
		this.address.clear();
	} 
	
	public void clearAlasan() {
		this.alasan.clear();
	} 
	
	public void clearFaskesAwal() {
		this.faskesAwal.clear();
	} 
	
	public void inputName(String nama) {
		this.nama.sendKeys(nama);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void inputNomBPJS(String nomBpjs) {
		this.nomBpjs.sendKeys(nomBpjs);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void inputNomKtp(String nomKtp) {
		this.nomKtp.sendKeys(nomKtp);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void inputAddress(String address) {
		this.address.sendKeys(address);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void inputKotaKTP(String kotaKTP) {
		this.txtBox.sendKeys(kotaKTP);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void inputFaskesAwal(String faskesAwal) {
		this.faskesAwal.sendKeys(faskesAwal);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void inputFaskesTujuan(String faskesTujuan) {
		this.txtBox.sendKeys(faskesTujuan);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void inputAlasan(String alasan) {
		this.alasan.sendKeys(alasan);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public WebElement getName() {
		return this.nama;
	}
	
	public WebElement getNomBPJS() {
		return this.nomBpjs;
	}
	
	public WebElement getNomKTP() {
		return this.nomKtp;
	}
	
	public WebElement getKotaKTP() {
		return this.kotaKTP;
	}
	
	public WebElement getSelectKotaKTP() {
		return this.selectKotaKTP;
	}
	
	public WebElement getFaskesAwal() {
		return this.faskesAwal;
	}
	
	public WebElement getFaskesTujuan() {
		return this.faskesTujuan;
	}
	
	public WebElement getSelectFaskesTujuan() {
		return this.selectFaskesTujuan;
	}
	
	public void clickSubmit() {
		this.submit.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickInputDataMenu() {
		this.inputDataMenu.click();
	}
	
	public void clickKotaKtp() {
		this.kotaKTP.click();
	}
	
	public void clickFaskesTujuan() {
		this.faskesTujuan.click();
	}
	
	public boolean msgErrorBPJSCharacter() {
		return (nomBpjs.getAttribute("minlength").toString().contains("13"))  && (nomBpjs.getAttribute("maxlength").contains("13"));
	}
	
	public boolean msgErrorNoKTPCharacter() {
		return (nomKtp.getAttribute("minlength").toString().contains("16"))  && (nomKtp.getAttribute("maxlength").contains("16"));
	}
	
	public String msgErrorBPJSReady() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, msgBPJS);
	
	}
	
	public String msgErrorAlamat() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, msgAlamat);
	}
	
	public String msgErrorAlasan() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, msgAlasan);
	}
	
	public String msgAddSuccess() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, msgValidSave);
	}
	
	public String getInputDataTitle() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, inputDataTitle);
	}

}
