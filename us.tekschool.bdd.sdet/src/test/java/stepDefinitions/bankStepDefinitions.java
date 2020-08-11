package stepDefinitions;

import core.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.Bank;

public class bankStepDefinitions extends Base {

 Bank bank = new Bank();
 

@Given("^user in the Bank web page$")
public void user_in_the_Bank_web_page() throws Throwable {
   Base.initializeDriver();
}

@When("^user click in Apply for mortgage button$")
public void user_click_in_Apply_for_mortgage_button() throws Throwable {
   bank.clickbutton();
  
}

@When("^user scrolldown to the end of the page$")
public void user_scrolldown_to_the_end_of_the_page() throws Throwable {
    bank.godown();
    Thread.sleep(3000);
}

@When("^user scroll the payment slider from '(.+) %' to the '(.+) %'$")
public void user_scroll_the_payment_slider_from_to_the(int sourcePayment, int targetPayment) throws Throwable {
  bank.droppayment();
}

@When("^user scroll the Annual slider from '(.+) %' to the '(.+)%'$")
public void user_scroll_the_Annual_slider_from_to_the(int sourceAnnal, int targetAnnal) throws Throwable {
   bank.sourecA();
   Thread.sleep(3000);
}

@When("^user scroll the interest slider from' (.+) %' to '(.+) %'$")
public void user_scroll_the_interest_slider_from_to(int sourecInterest, int targetInterest ) throws Throwable {
    bank.sourceinterest();
    Thread.sleep(3000);
}

@Then("^user should make ready the page to buy home$")
public void user_should_make_ready_the_page_to_buy_home() throws Throwable {
	 Thread.sleep(3000);
}


 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
}