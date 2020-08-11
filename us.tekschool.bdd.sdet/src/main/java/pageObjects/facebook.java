package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class facebook extends Base{

 public facebook() {
	 
	 PageFactory.initElements(driver, this);
 }
	
 	@FindBy(how = How .XPATH, using ="//input[@id='email']")
	private WebElement userName;
 	@FindBy(how = How .XPATH, using ="//input[@id='pass']")
 	private WebElement password;
 	@FindBy(how = How .XPATH, using =" //input[@id='u_0_b']")
 	private WebElement login;
 	@FindBy(how = How .XPATH, using ="//span[@class='_1vp5 f_click']")
 	private WebElement fardin ;
 	@FindBy(how = How .XPATH, using ="//form[@id='u_fetchstream_9_u']")
 	private WebElement godown;
 	@FindBy(how = How .XPATH, using ="//form[@id='u_ps_fetchstream_4_5_5']")
 	private WebElement likebutton;
 	@FindBy(how = How .XPATH, using ="//span[contains(@class,'_iuw _iuy')]")
 	private WebElement carebutton;
 	@FindBy(how = How .XPATH, using ="//form[@id='u_ps_fetchstream_4_5_5']")
 	private WebElement comment ;
 	@FindBy(how = How .XPATH, using ="//form[@id='u_ps_fetchstream_4_5_5']")
 	private WebElement writecomment;
 	@FindBy (how = How . XPATH, using =" //div[contains(@class,'_55lr')][contains(text(),'Basel Queen')]")
 	private WebElement basel;
 	@FindBy (how = How . XPATH, using ="//div[contains(@class,'_5rp7 _5rp8')]")
 	private WebElement typing;
 	@FindBy (how = How.XPATH, using ="//*[name()='path' and contains(@d,'M11,8.3L2.')]")
 	private WebElement enter;
 	@FindBy (how = How . XPATH, using ="//div[contains(@class,'close')]")
 	private WebElement close;
 	@FindBy (how = How . XPATH, using ="//div[@id='userNavigationLabel']")
 	private WebElement arrey;
 	@FindBy (how = How . XPATH, using ="//span[contains(text(),'Log Out')]")
 	private WebElement logout;
 	
 	public void username (String username ) {
 		userName.clear();
 		userName.sendKeys(username);
 	}
 	public void password (String pass) {
 		password.clear();
 		password.sendKeys(pass);
 	}
 	public void loginbutton () {
 		login.click();
 		
 	}
 	public void alert() {
 	 driver.switchTo().alert().accept();
 	}
 	
 	public void clickfardin () {
 		fardin.click();
 	}
 	public void godown() {
 		Actions action = new Actions(driver);
 		action.moveToElement(godown).build().perform();
 	}
 	public boolean like() {
 		if (likebutton.isDisplayed()) {
 			return true;
 		}else {
 			return false;
 		}
 	}
 	public void carebutton () {
 		carebutton.click();
 	}
 	public void clickcomment () {
 		comment.click();
 	}
 	public void writecomment (String comment) {
 		writecomment.sendKeys(comment);
 	}
 	
 	public void clickbasel() {
 		basel.click();
 	}
 	
 	public void typgmessage(String message) {
 		typing.sendKeys(message);
 	}
 	public void enterTosend () {
 		enter.click();
 	}
 	public void clickclose() {
 		close.click();
 	}
 	public void clickarrey() {
 		arrey.click();
 	}
 	public void clicklogout() {
 		logout.click();
 	}
 	
 	
 	
 	
}
