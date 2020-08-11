package stepDefinitions;

import core.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.facebook;

public class facebookStepDefinitions extends Base {

	facebook face = new facebook();

@Given("^user is in facebook webstie$")
public void user_is_in_facebook_webstie() throws Throwable {
    Base.initializeDriver();
}

@When("^user enter the username'(.+)'$")
public void user_enter_the_username_far_adj_yahoo_com(String username) throws Throwable {
	
    face.username(username);
}

@When("^user enter the password '(.+)'$")
public void user_enter_the_password_f_l_a_j(String pass) throws Throwable {
    face.password(pass);
}

@When("^user click on login button$")
public void user_click_on_login_button() throws Throwable {
    face.loginbutton();
    
}

@When("^user click in Fardin in the top of the page$")
public void user_click_in_Fardin_in_the_top_of_the_page() throws Throwable {

  face.clickfardin();
  
 
}

@When("^user go all the way down to the Eid Mubarak post$")
public void user_go_all_the_way_down_to_the_Eid_Mubarak_post() throws Throwable {
	 driver.switchTo().alert().accept();
    face.godown();
    Thread.sleep(2000);
}

@When("^user should check is the like button is display$")
public void user_should_check_is_the_like_button_is_display() throws Throwable {
    face.like();
}

@When("^user click on care icon$")
public void user_click_on_care_icon() throws Throwable {
   face.carebutton();
   Thread.sleep(2000);
}

@When("^user click in comment icon$")
public void user_click_in_comment_icon() throws Throwable {
   face.clickcomment();
}

@When("^user type ' (.+) ' on comment field$")
public void user_type_nice_on_comment_field(String comment) throws Throwable {
   face.writecomment(comment);
   Thread.sleep(2000);
}

@When("^user come to massenger and choose Basel$")
public void user_come_to_massenger_and_choose_Basel() throws Throwable {
   face.clickbasel();
}

@When("^user write a massage ' (.+) '$")
public void user_write_a_massage_I_LOVE_YOU(String message) throws Throwable {
   face.typgmessage(message);
   Thread.sleep(2000);
}
@When("^user click in send key$")
public void user_click_in_send_key() {
	face.enterTosend();
}

@When("^user click in close icon to close the massage window$")
public void user_click_in_close_icon_to_close_the_massage_window() throws Throwable {
   face.clickclose();
}

@When("^user click in array icon on top of the page$")
public void user_click_in_array_icon_on_top_of_the_page() throws Throwable {
   face.clickarrey();
   Thread.sleep(2000);
}

@Then("^user click in log out and get of from page$")
public void user_click_in_log_out_and_get_of_from_page() throws Throwable {
   face.clicklogout();
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
