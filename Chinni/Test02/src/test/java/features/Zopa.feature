Feature: Zopa SignUp

As a user i should be able to fill the loan application inorder to get a loan

Scenario Outline: Verifying Loan Signup funtionality

Given I am on Homepage
When I click on Get a Zopa loan
Then I should navigate to corresponding Zopa loan page
When I click on Get my personalized rates
Then I should navigate to application form page
When I enter details for "<email_address>" "<firstname>" "<lastname>" "<phone_number>" "<date>" "<month>" and "<year>"
And I select Title
And I select reason for Loan
And I enter "<postcode>" in Address history
And  click on Look up address
Then I should see address list
When I select the address 
And Move in "<Month>" and "<Year>"
And I select Employment status
And I enter "<AnnualIncome>" 
And I select own house quote
And I enter monthly "<mortgage>" 
And I create "<passsword>" to keep details secure


Examples:

| email_address  | firstname | lastname | phone_number | date |  month | year | postcode |  Month   | Year | AnnualIncome | mortgage  | password  |
| @gmail.com     | Zopa	     | Loan	    | 077          | 1    |  12    | 1992 | TW5 0NE  |  June    | 2015 | 40,000       | 1,300     | Vini@123  |
| @gmail.com	 | Vini		 | reddi	| 07234628222  | 09   |  10    | 1990 | UXP 5RQ  |  January | 2016 | 45,000       | 1,500     | Kushi23@v |




