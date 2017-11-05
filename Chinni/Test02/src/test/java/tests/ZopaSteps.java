package tests;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ZopaPage;




	public class ZopaSteps extends Base{

		
	    ZopaPage ZopaPage = new ZopaPage(driver);
		
		@Given("^I am on Homepage$")
		public void i_am_on_Homepage() throws Throwable {
			
			ZopaPage.NavigateToHomePage();
		}
		
		@When("^I click on Get a Zopa loan$")
		public void i_click_on_Get_a_Zopa_loan() throws Throwable {
			
			ZopaPage.ClickOnLoanButton();
		}

		@Then("^I should navigate to corresponding Zopa loan page$")
		public void i_should_navigate_to_corresponding_Zopa_loan_page() throws Throwable {
			
			ZopaPage.verifyZopaLoanPage();
		}


		@When("^I click on Get my personalized rates$")
		public void click_on_Get_my_personalized_rates() throws Throwable {
			
			ZopaPage.clickrates();
		}

		@Then("^I should navigate to application form page$")
		public void i_should_navigate_to_application_form_page() throws Throwable {
			
			ZopaPage.landOnApplicationPage();
		}

		@When("^I enter details for \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\"$")
		public void i_enter_details_for_and(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) throws Throwable {
		   
			ZopaPage.enterDetails(arg1, arg2, arg3, arg4, arg5, arg6, arg7);
		}


		@And("^I select Title$")
		public void i_select_Title() throws Throwable {
			
			ZopaPage.selectTitle();
		}

		@And("^I select reason for Loan$")
		public void i_select_reason_for_Loan() throws Throwable {
			
			ZopaPage.selectReasonForLoan();
		}
		
		@And("^I enter \"([^\"]*)\" in Address history")
		public void enter_Postcode(String arg1) throws Throwable {
			
			ZopaPage.enterPostcode(arg1);
		}
		
		@And("^click on Look up address$")
		public void click_on_Look_up_address() throws Throwable {
			
			ZopaPage.clickOnLookUpAdress();
		  
		}
		
		@Then("^I should see address list$")
		public void i_should_see_address_list() throws Throwable {
			
			ZopaPage.adressList();
		}
		
		@When("^I select the address$")
		public void i_select_the_address() throws Throwable {
			
			ZopaPage.selectAddress();
		}
		@When("^Move in \"([^\"]*)\" and \"([^\"]*)\"$")
		public void move_in_Date(String arg1, String arg2) throws Throwable {
			
			ZopaPage.enterMoveInDate(arg1, arg2);
		}
		
		@When("^I select Employment status$")
		public void i_select_Employment_details() throws Throwable {
			
			ZopaPage.selectEmploymentStatus();
		}
		
		@When("^I enter \"([^\"]*)\"$")
		public void i_enter_Anuual(String arg1) throws Throwable {
			
			ZopaPage.enterAnnualIncome(arg1);
		}
		
		@When("^I select own house quote$")
		public void i_select_own_house_quote() throws Throwable {
			
			ZopaPage.selectHouseOption();
		}
		
		@When("^I enter monthly \"([^\"]*)\"$")
		public void i_enter_the_rent(String arg1) throws Throwable {
			
			ZopaPage.enterMortgage(arg1);
		}
		@When("^I create \"([^\"]*)\" to keep details secure$")
		public void i_create_to_keep_details_secure(String arg1) throws Throwable {
			
			ZopaPage.enterPassword(arg1);
		}

}
