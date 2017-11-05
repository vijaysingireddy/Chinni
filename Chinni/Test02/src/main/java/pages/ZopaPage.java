package pages;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;






public class ZopaPage{


	private WebDriver driver;
	private final static String BaseUrl = "https://www.zopa.com";
	
	public ZopaPage(WebDriver driver){
		 this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(css="#homepage-hero > div > div > div > div.twoBlock__blockOne.twoBlock__blockOne--button > a")
	WebElement getZopaLoanButton;
	
	@FindBy(css="#header > div > div.header__navPrimary > ul > li.header__mainNavListItem.header__mainNavListItem--active > a")
	WebElement getZopaLoan;
	
	@FindBy(id="submit-loan-button")
	WebElement personalisedRates;
	
	@FindBy(css="#content > div > div.section > div > h1")
	WebElement applicationFormPage;
	
	@FindBy(xpath="//*[@id='member_email']")
	WebElement email;

	@FindBy(css=".radiocheck block-label")
	List<WebElement> titleList;
	
	@FindBy(id="applications_loan_apply_first_name")
	WebElement firstname;
	
	@FindBy(id="applications_loan_apply_last_name")
	WebElement lastname;
	
	@FindBy(id="applications_loan_apply_home_phone")
	WebElement phoneNo;
	
	@FindBy(id="date_of_birth_day")
	WebElement day;
	
	@FindBy(id="date_of_birth_month")
	WebElement month;
	
	@FindBy(id="date_of_birth_year")
	WebElement year;
	
	@FindBy(css=".radiocheck")
	List<WebElement> loanReasonButton;
	
	@FindBy(xpath="//*[@id='address_postcode']")
	WebElement postcode;
	
	@FindBy(xpath="//*[@id='address-lookup']/p[2]/input")
	WebElement address;
	
	@FindBy(xpath="//*[@id='content']/div/div[1]/div/form/fieldset[2]/div/div/p[1]/label")
	WebElement list;

	@FindBy(xpath="//*[@id='address_possible_address']/option[3]")
	WebElement selection;
	
	@FindBy(xpath="//*[@id='address_from_2i']")
	WebElement moveinmonth;
	
	@FindBy(xpath="//*[@id='address_from_1i']")
	WebElement moveinyear;
	
	@FindBy(xpath="//*[@id='content']/div/div[1]/div/form/fieldset[3]/div[1]/p/span[2]/label")
	WebElement employmentStatus;
	
	@FindBy(xpath="//*[@id='applications_loan_apply_salary']")
	WebElement annualIncome;
	
	@FindBy(xpath="//*[@id='content']/div/div[1]/div/form/fieldset[3]/div[3]/p[1]/span[4]/label")
	WebElement house;
	
	@FindBy(id="applications_loan_apply_rent")
	WebElement mortgage;
	
	@FindBy(xpath="//*[@id='member_password']")
	WebElement password;
	
	
	
	public void NavigateToHomePage(){
		
		driver.get(BaseUrl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	
	public void ClickOnLoanButton(){
		
		getZopaLoanButton.click();
	}
	
	public void verifyZopaLoanPage(){
		
		Assert.assertEquals("Get a Zopa loan", getZopaLoan.getText());
		System.out.println(getZopaLoan.getText());
	}
	
	
	public void clickrates() {
		scrollDown();
		personalisedRates.click();
	}
	
	
	public void landOnApplicationPage(){
		
		Assert.assertTrue(applicationFormPage.isDisplayed());
		System.out.println(applicationFormPage.getText());
	}


	public String generateRandomString(int length){
		return RandomStringUtils.randomAlphabetic(length);
	}

	public String generateRandomNumbers(int length){
		return RandomStringUtils.randomNumeric(length);
	}


	public void scrollDown(){
		JavascriptExecutor jsx = (JavascriptExecutor)driver;
		jsx.executeScript("window.scrollBy(0,450)", "");
	}

	public void scrollTo(WebElement ele){
		Actions action = new Actions(driver);
		action.moveToElement(ele);
		action.build().perform();
	}

	public void enterDetails(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7){


		email.sendKeys(generateRandomString(10)+ arg1);
		scrollDown();
		firstname.sendKeys(arg2 + generateRandomString(6));
		lastname.sendKeys(arg3 + generateRandomString(6));
		phoneNo.sendKeys(arg4 + generateRandomNumbers(8));
		day.sendKeys(arg5 + generateRandomNumbers(1));
		month.sendKeys(arg6);
		year.sendKeys(arg7);
		scrollDown();
	}

	public void selectTitle() {
		
		Random rand = new Random();
		int title = rand.nextInt(titleList.size());
		titleList.get(title).click();
	}
	
	public void selectReasonForLoan() {

//		Random rand = new Random();
//		int size = rand.nextInt(loanReasonButton.size());
//		loanReasonButton.get(size).click();

	}
	
	public void enterPostcode(String arg1) {
		postcode.sendKeys(arg1);
	}
	
	public void clickOnLookUpAdress() {
		address.click();
	}
	
	public void adressList() {
		Assert.assertTrue(list.isDisplayed());
		
	}
	
	public void selectAddress() {
		selection.click();
	}
	
	public void enterMoveInDate(String arg1, String arg2){

		scrollDown();
		moveinmonth.sendKeys(arg1);
		moveinyear.sendKeys(arg2);
	}
	
	public void selectEmploymentStatus() {
		scrollDown(); employmentStatus.click();
	}
	
	public void enterAnnualIncome(String arg1) {
		annualIncome.sendKeys(arg1);
	}
	
	public void selectHouseOption() {
		house.click();
	}
	
	public void enterMortgage(String arg1) {
		mortgage.sendKeys(arg1);
	}
	public void enterPassword(String arg1) {
		password.sendKeys(arg1);
	}	
	
	
}
