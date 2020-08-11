package stepDefinitions;



import org.testng.Assert;

import core.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.hotel;

public class hotelStepDefinition extends Base{
		
	hotel hotelobj = new hotel();
		
	
	@Given("^user is in Hotel webstie page$")
	public void user_is_in_Hotel_webstie_page() throws Throwable {
	    Base.initializeDriver();
	}

	@When("^user click in option button which is locate it in left side of the page$")
	public void user_click_in_option_button_which_is_locate_it_in_left_side_of_the_page() throws Throwable {
		hotelobj.clicklefticon();
	}

	@When("^user click on Hotel icon$")
	public void user_click_on_Hotel_icon() throws Throwable {
		hotelobj.clickhotel();
	}

	@When("^user click on signin button$")
	public void user_click_on_signin_button() throws Throwable {
		hotelobj.clicksignin();
	}

	@When("^user enter the user name '(.+)' and password '(.+)'$")
	public void user_enter_the_user_name_far_adj_yahoo_com_and_password(String email, String password) throws Throwable {
		hotelobj.email(email);
		hotelobj.password(password);
	}

	@When("^user click in login button$")
	public void user_click_in_login_button() throws Throwable {
		hotelobj.clickSbutton();
	}

	@Then("^user login in Hotel page$")
	public void user_login_in_Hotel_page() throws Throwable {
		String expectedtitle = "Login - Hotel";
		String actualtitle = hotelobj.gettitle();
		//hotelobj.gettitle();
		Assert.assertEquals(expectedtitle, actualtitle);
	} 
	
	
	
}
