package cucumber.framework.page.siloam;

/*
created_by : Adit
created_date : 29/09/2022
updated_by : -
updated_date : -
*/



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.framework.connection.DriverSingleton;
import cucumber.framework.constant.Constants;
import cucumber.framework.utils.Utils;

public class ViewExportPage extends LoginPage{

	private WebDriver driver;
	
	
	public ViewExportPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id = "datepicker")
	private WebElement startDate;
	
	@FindBy(id = "datepicker2")
	private WebElement endDate;
	
	@FindBy(xpath = "//button[normalize-space()='Filter']")
	private WebElement btnFilter;
	
	@FindBy(xpath = "//span[normalize-space()='View & Export']")
	private WebElement viewExport;
	
	@FindBy(xpath = "//button[normalize-space()='Download']")
	private WebElement btnDownload;
	
//	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[7]/a[1]")
//	private WebElement btnFaskesAwal;
	
	@FindBy(linkText = "Foto Faskes Awal")
	private WebElement btnFaskesAwal;
	//tbody/tr[1]/td[8]/a[1]
	
//	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[8]/a[1]")
//	private WebElement btnFaskesTujuan;
	
	@FindBy(linkText = "Foto Faskes Tujuan")
	private WebElement btnFaskesTujuan;
	//tbody/tr[1]/td[8]/a[1]
	
	@FindBy(linkText = "PDF Agreement")
	private WebElement btnPDfAgreement;
	
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/a[1]")
	private WebElement btnView;
	
	@FindBy(xpath = "//a[@title='Refresh']")
	private WebElement btnRefresh;
	
	@FindBy(xpath = "//button[normalize-space()='Export']")
	private WebElement btnExport;
	
	@FindBy(xpath = "//a[@id='preview']")
	private WebElement btnPreviewData;
	
	@FindBy(xpath = "//a[@title='View Image After']//img")
	private WebElement btnAfter;
	
	@FindBy(xpath = "//a[@title='View Image Before']//img")
	private WebElement btnBefore;
	
	@FindBy(id = "title")
	private WebElement txtValidasiPDF;
	
	@FindBy(linkText =  "Back")
	private WebElement back;
//	//a[@class='btn btn-danger']
//	//*[@id="content"]/h1/a
	
	
	@FindBy(xpath = "//h1[@class='page-header']")
	private WebElement txtValidasiBack;
	
	@FindBy(xpath = "//h1[@class='page-header']")
	private WebElement txtValidasiViewExport;
	
	
	@FindBy(xpath = "//tbody/tr[1]/td[1]")
	private WebElement txtValidasiFilter;
	
	@FindBy(xpath = "//h1[@class='page-header']")
	private WebElement txtValidasiRefresh;
	
	@FindBy(xpath = "//h4[normalize-space()='An uncaught Exception was encountered']")
	private WebElement txtValidasiDownload;
	
	@FindBy(xpath = "//strong[normalize-space()='Danger!']")
	private WebElement txtInvalidDownload;
	
	@FindBy(xpath = "//strong[normalize-space()='Danger!']")
	private WebElement txtInvalidExport;
	
	@FindBy(xpath = "//strong[normalize-space()='Danger!']")
	private WebElement txtInvalidDownloadEmpty;
	
	@FindBy(xpath = "//div[@role='alert']")
	private WebElement txtInvalidExportEmpty;
	
	@FindBy(xpath = "//h1[@class='page-header']")
	private WebElement txtValidasiView;
	
	@FindBy(xpath = "//div[@id='sidebar']/div/div/ul/li/a/div[3]")
	private WebElement lblName; //label name setelah login
	
	
	public void filter(String start, String end)
	{
		
		inputStartDate(start);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		inputEndDate(end);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		btnFilter();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void inputStartEndDate(String start, String end)
	{
		
		inputStartDate(start);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		inputEndDate(end);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	
	public void inputStartDate(String date)
	{
		this.startDate.sendKeys(date);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public WebElement getInputStartdate() {
		return this.startDate;
	}
	
	public void inputEndDate(String end)
	{
		this.endDate.sendKeys(end);
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public WebElement getInputEnddate() {
		return this.endDate;
	}
	
	public void btnViewExport()
	{
		this.viewExport.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btnFilter()
	{
		this.btnFilter.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btnRefresh()
	{
		this.btnRefresh.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btnDownload()
	{
		this.btnDownload.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btnExport()
	{
		this.btnExport.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btnView()
	{
		this.btnView.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btnPreviewData()
	{
		this.btnPreviewData.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btnBefore()
	{
		this.btnBefore.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btnAfter()
	{
		this.btnAfter.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btnFaskesAwal()
	{
		this.btnFaskesAwal.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btnFaskesTujuan()
	{
		this.btnFaskesTujuan.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btnPDFAgreement()
	{
		this.btnPDfAgreement.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
	}
	
	public void btnBack()
	{
//		driver.findElement(By.linkText("Back")).click();
		this.back.click();
		Utils.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		
	}
	
	public String getTxtUserInfo() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, lblName);
	}
	
	public String getTxtSuccessViewExport() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtValidasiViewExport);
	}
	
	public String getTxtSuccessFilter() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtValidasiFilter);
	}
	
	public String getTxtSuccessDownload() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtValidasiDownload);
	}
	
	public String getTxtSuccessRefresh() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtValidasiRefresh);
	}
	
	public String getTxtSuccessView() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtValidasiView);
	}
	
	public String getTxtSuccessBack() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtValidasiBack);
	}
	
	public String getTxtInvalidDownload() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtInvalidDownload);
	}
	
	public String getTxtInvalidDownloadEmpty() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtInvalidDownloadEmpty);
	}
	
	public String getTxtInvalidExport() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtInvalidExport);
	}
	
	public String getTxtInvalidExportEmpty() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtInvalidExportEmpty);
	}
	
	public String getTxtValidPDF() {
		return Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtValidasiPDF);
	}
	
	public Boolean isHaveRequired(WebElement element) {
		boolean isHaveRequired = Boolean.parseBoolean(element.getAttribute("required"));
		return isHaveRequired;
	}
}
