package cucumber.framework.page.siloam;

/*
created_by : Adit
created_date : 29/09/2022
updated_by : -
updated_date : -
*/


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import cucumber.framework.connection.DriverSingleton;
import cucumber.framework.constant.Constants;
import cucumber.framework.utils.Utils;

public class FormReturnPage extends ViewExportPage{

private WebDriver driver;
	
	
	public FormReturnPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//span[normalize-space()='New']
	@FindBy(xpath = "//span[normalize-space()='New']")
	private WebElement btnNew;
	
	@FindBy(xpath = "//input[@id='tgl']")
	private WebElement startDate;
	
	@FindBy(xpath = "//td[@class='day'][normalize-space()='3']")
	private WebElement pilihTanggalStart;
	
	@FindBy(xpath = "//input[@id='tgl2']")
	private WebElement endDate;
	
	@FindBy(xpath = "//span[@id='select2-status-container']")
	private WebElement status;
	
	@FindBy(xpath = "//td[normalize-space()='27']")
	private WebElement pilihTanggalEnd;
	
	
	@FindBy(id = "btn-reset")
	private WebElement reset;
	
	@FindBy(id = "btn-filter")
	private WebElement filter;
	
	@FindBy(xpath = "//td[normalize-space()='1']")
	private WebElement txtValidasiFilter;
	
	//input[@id='tgl']
	
	@FindBy(xpath = "//select[@name='table_length']")
	private WebElement show;
	
	@FindBy(xpath = "//a[normalize-space()='Next']")
	private WebElement next;
	
	@FindBy(xpath = "//a[normalize-space()='Previous']")
	private WebElement previous;
	
	@FindBy(xpath = "//td[normalize-space()='11']")
	private WebElement txtValidNextSepuluh;
	
	@FindBy(xpath = "//td[normalize-space()='10']")
	private WebElement txtValidShowSepuluh;
	
	@FindBy(xpath = "//td[normalize-space()='25']")
	private WebElement txtValidShowDuaLima;
	
	@FindBy(xpath = "//td[normalize-space()='26']")
	private WebElement txtValidNextDualima;
	
	@FindBy(xpath = "//td[normalize-space()='50']")
	private WebElement txtValidShowLimaPuluh;
	
	@FindBy(xpath = "//td[normalize-space()='51']")
	private WebElement txtValidNextLimaPuluh;
	
	@FindBy(xpath = "//td[normalize-space()='100']")
	private WebElement txtValidShowSeratus;
	
	@FindBy(xpath = "//td[normalize-space()='101']")
	private WebElement txtValidNextSeratus;
	
	@FindBy(xpath = "//input[@type='search']")
	private WebElement search;
	
	@FindBy(xpath = "//span[@id='btnSearch']")
	private WebElement btnSearch;
	
	@FindBy(xpath = "//i[@class='fa fa-history']")
	private WebElement refresh;
	
	
	
	public void filterPending(String pending)
	{
		btnStartDate();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		btnPilihTanggalStart();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		btnEndDate();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		btnPilihTanggalEnd();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		btnStatus();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		
		Select sPending = new Select(status);
		sPending.selectByValue(pending);
		
		btnFilter();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void filterComplete(String complete)
	{
//		btnStartDate();
//		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
//		btnPilihTanggalStart();
//		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
//		btnEndDate();
//		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
//		btnPilihTanggalEnd();
//		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		btnStatus();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		
		Select sComplete = new Select(status);
		sComplete.selectByValue(complete);
		
		btnFilter();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void filterPilih(String pilih)
	{
		btnStartDate();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		btnPilihTanggalStart();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		btnEndDate();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		btnPilihTanggalEnd();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		btnStatus();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		
		Select sPilih = new Select(status);
		sPilih.selectByValue(pilih);
		
		btnFilter();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btnStartDate()
	{
		this.startDate.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btnNew()
	{
		this.btnNew.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void inputStartDate(String start)
	{
		this.startDate.sendKeys(start);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btnEndDate()
	{
		this.endDate.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void inputEndDate(String end)
	{
		this.endDate.sendKeys(end);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btnPilihTanggalStart()
	{
		this.pilihTanggalStart.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btnPilihTanggalEnd()
	{
		this.pilihTanggalEnd.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btnStatus()
	{
		this.status.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btnFilter()
	{
		this.filter.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btnReset()
	{
		this.reset.click();
	}
	
	public String getTxtSuccessFilter() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtValidasiFilter);
	}
	
	public String getTxtStartDate() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, startDate);
	}
	
	public String getTxtEndDate() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, endDate);
	}

}
