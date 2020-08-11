package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class hotel extends Base {
	
	public  hotel () {
		
		PageFactory.initElements(driver, this);
	}
	
			@FindBy(how = How.XPATH,using = "//button[@id='menu-icon']")
			private WebElement button;
			@FindBy(how = How.XPATH,using ="//div[@id='evt-mbl-menu']//a[contains(text(),'Hotel')]")
			private WebElement hotelicon;
			
			@FindBy(how = How.XPATH,using ="//span[@class='hide_xs']")
			private WebElement signin;
			
			@FindBy(how = How.XPATH,using ="//input[@id='email']")
			private WebElement Email;
			
			@FindBy(how = How.XPATH,using ="//input[@id='passwd']")
			private WebElement pass;
			
			@FindBy(how = How.XPATH,using ="//span[contains(text(),'Sign in')]")
			private WebElement singbutton;
			
			public void clicklefticon() {
				button.click();
			}
			
			public void clickhotel() {
				hotelicon.click();
			}
			public void clicksignin() {
				signin.click();
			}
			public void email(String email) {
				Email.clear();
				Email.sendKeys(email);
			}
			public void password(String password) {
				pass.sendKeys(password);
			}
			public void clickSbutton () {
				singbutton.click();
			}
			
			 public String gettitle() {
				 String pagetitle = driver.getTitle();
				 return pagetitle;
			 }
			
			
	
	
	
	
	
	
	
	
	
	
	
}
