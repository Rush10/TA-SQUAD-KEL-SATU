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
	
	@FindBy(xpath = "//span[normalize-space()='New']")
	private WebElement btnNew;
	
	@FindBy(xpath = "//input[@id='tgl']")
	private WebElement startDate;
	
	@FindBy(xpath = "//th[normalize-space()='October 2022']")
	private WebElement pilihBulan;
	
	@FindBy(xpath = "//span[@class='month active']")
	private WebElement pilihSeptember;

	@FindBy(xpath = "//div[@class='datepicker-days']//th[@class='prev'][normalize-space()='«']")
	private WebElement pilihBack;
	
	@FindBy(xpath = "//td[normalize-space()='14']")
	private WebElement pilihTanggalStart;
	
	@FindBy(xpath = "//td[@class='day'][normalize-space()='9']")
	private WebElement pilihTanggalStartInvalidPending;
	
	@FindBy(xpath = "//td[normalize-space()='11']")
	private WebElement pilihTanggalEndInvalidPending;
	
	@FindBy(xpath = "//td[normalize-space()='17']")
	private WebElement pilihTanggalStartInvalidComplete;
	
	@FindBy(xpath = "//td[normalize-space()='23']")
	private WebElement pilihTanggalEndInvalidComplete;
	
	@FindBy(xpath = "//input[@id='tgl2']")
	private WebElement endDate;
	
	@FindBy(xpath = "//select[@id='status']")
	private WebElement status;
	
	@FindBy(xpath = "//span[@id='select2-status-container']")
	private WebElement btnStatus;
	
	@FindBy(xpath = "//td[normalize-space()='27']")
	private WebElement pilihTanggalEnd;
	
	
	@FindBy(id = "btn-reset")
	private WebElement reset;
	
	@FindBy(id = "btn-filter")
	private WebElement filter;
	
	@FindBy(xpath = "//td[normalize-space()='1']")
	private WebElement txtValidasiFilter;
	
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
	
	@FindBy(xpath = "//span[@id='btnRefresh']")
	private WebElement btnResetSearch;
	
	@FindBy(xpath = "//i[@class='fa fa-history']")
	private WebElement refresh;
	
	@FindBy(xpath = "//table[@id='table']/tbody/tr/td[7]/center/a/span")
	private WebElement aksi;
	
	
	@FindBy(xpath = "//td[normalize-space()='GILBERT']")
	private WebElement txtValidCariNama;
	
	@FindBy(xpath = "//td[normalize-space()='2312324139999']")
	private WebElement txtValidCariNoBPJS;
	
	@FindBy(xpath = "//td[normalize-space()='KABUPATEN ACEH SINGKIL']")
	private WebElement txtValidCariKotaKTP;
	
	@FindBy(xpath = "//td[normalize-space()='Bekasi']")
	private WebElement txtValidCariFaskesAwal;
	
	@FindBy(xpath = "//td[normalize-space()='Clinic Bona Indah']")
	private WebElement txtValidCariFaskesTujuan;
	
	@FindBy(xpath = "//td[@class='dataTables_empty']")
	private WebElement txtInvalidSearch;

	@FindBy(xpath = "//a[@class='nav-link active']//span[@class='d-sm-block d-none']")
	private WebElement txtValidTTDDigital;
	
	@FindBy(xpath = "//a[@class='nav-link active']//span[@class='d-sm-block d-none']")
	private WebElement txtValidUploadDoc;
	
	
//	@FindBy(xpath = "//span[@class='d-none d-md-inline']")
//	private WebElement akunSales;
//	
//	@FindBy(xpath = "//a[@class='dropdown-item']")
//	private WebElement logOut;
	
	
	
//	ZUHDI
	
	public void filterPending(String pending)
	{
		btnStatus();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		
		Select sPending = new Select(status);
		sPending.selectByValue(pending);
		
//		btnFilter();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void filterComplete(String complete)
	{
		btnStatus();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		
		Select sComplete = new Select(status);
		sComplete.selectByValue(complete);
		
//		btnFilter();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void inputStartEndDate()
	{
		btnStartDate();
		btnBackBulan();
		btnPilihTanggalStart();
		btnEndDate();
		btnPilihTanggalEnd();
		btnFilter();
	}
	
	public void filterPilih(String pilih)
	{
		btnStatus();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		
		Select sPilih = new Select(status);
		sPilih.selectByValue(pilih);
		
//		btnFilter();
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
	
	public void btnEndDate()
	{
		this.endDate.click();
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
		this.btnStatus.click();
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
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btnBackBulan()
	{
		this.pilihBack.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
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
	
	
//SHOW PAGE SEPULUH
	
	public void btnShow()
	{
		this.show.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btnNext()
	{
		this.next.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btnPrevious()
	{
		this.previous.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	
	public void pilihSepuluh(String sepuluh)
	{
		btnShow();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		
		Select sPilih = new Select(show);
		sPilih.selectByValue(sepuluh);
		
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void pilihDuaLima(String duaLima)
	{
		btnShow();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		
		Select sPilih = new Select(show);
		sPilih.selectByValue(duaLima);
		
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void pilihLimaPuluh(String limaPuluh)
	{
		btnShow();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		
		Select sPilih = new Select(show);
		sPilih.selectByValue(limaPuluh);
		
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void pilihSeratus(String seratus)
	{
		btnShow();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		
		Select sPilih = new Select(show);
		sPilih.selectByValue(seratus);
		
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	

	
	public String getTxtSepuluh() {
		Utils.scrollDownToButtom(driver);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtValidShowSepuluh);
	}
	
	public String getTxtDuaLima() {
		Utils.scrollDownToButtom(driver);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtValidShowDuaLima);
	}
	
	public String getTxtLimaPuluh() {
		Utils.scrollDownToButtom(driver);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtValidShowLimaPuluh);
	}
	
	public String getTxtSeratus() {
		Utils.scrollDownToButtom(driver);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtValidShowSeratus);
	}
	
	public String getTxtSepuluhPrevious() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtValidShowSepuluh);
	}
	
	public String getTxtDuaLimaPrevious() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtValidShowDuaLima);
	}
	
	public String getTxtLimaPuluhPrevious() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtValidShowLimaPuluh);
	}
	
	public String getTxtSeratusPrevious() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtValidShowSeratus);
	}
	
	public String getTxtSebelas() {
		Utils.scrollByVisibleElement(txtValidNextSepuluh, driver);
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtValidNextSepuluh);
	}
	
	public String getTxtDuaEnam() {
		Utils.scrollByVisibleElement(txtValidNextDualima, driver);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtValidNextDualima);
	}
	
	public String getTxtLimaPuluhSatu() {
		Utils.scrollByVisibleElement(txtValidNextLimaPuluh, driver);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtValidNextLimaPuluh);
	}
	
	public String getTxtSeratusSatu() {
		Utils.scrollByVisibleElement(txtValidNextSeratus, driver);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtValidNextSeratus);
	}
	

	
// FITUR SEARCH
	
	public void btnSearch()
	{
		this.btnSearch.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void klikSearch()
	{
		this.search.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btnResetSearch()
	{
		this.btnResetSearch.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void inputSearch (String cari)
	{
		this.search.sendKeys(cari);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public String getTxtValidCariNama() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtValidCariNama);
	}
	
	public String getTxtValidCariNoBPJS() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtValidCariNoBPJS);
	}
	
	public String getTxtValidCariKotaKTP() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtValidCariKotaKTP);
	}
	
	public String getTxtValidCariKota() {
		return txtValidCariKotaKTP.getAttribute("innerHTML").toString();
	}
	
	public String getTxtValidCariFaskesAwal() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtValidCariFaskesAwal);
	}
	
	public String getTxtValidCariFaskesTujuan() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtValidCariFaskesTujuan);
	}
	
	public String getTxtInvalidSearch() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtInvalidSearch);
	}
	
	public String getTxtValidReset() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, search);
	}
	

//FITUR AKSI
	
	public void btnAksi()
	{
		this.aksi.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public String getTxtValidTTDDigital() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtValidTTDDigital);
	}
	
	public String getTxtValidUploadDoc() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtValidUploadDoc);
	}
	
//INVALID FILTER
	public void pilihStartEndDateInvalidPending()
	{
		this.btnStartDate();
		this.btnPilihTanggalStartInvalidPending();
		this.btnEndDate();
		this.btnPilihTanggalEndInvalidPending();
//		btnFilter();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void pilihStartEndDateInvalidComplete()
	{
		this.btnStartDate();
		this.btnPilihTanggalStartInvalidComplete();
		this.btnEndDate();
		this.btnPilihTanggalEndInvalidComplete();
//		btnFilter();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btnPilihTanggalStartInvalidPending()
	{
		this.pilihTanggalStartInvalidPending.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btnPilihTanggalEndInvalidPending()
	{
		this.pilihTanggalEndInvalidPending.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btnPilihTanggalStartInvalidComplete()
	{
		this.pilihTanggalStartInvalidComplete.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btnPilihTanggalEndInvalidComplete()
	{
		this.pilihTanggalEndInvalidComplete.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}

}
