package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class Bank extends Base {

	public Bank() {
		
		PageFactory.initElements(driver, this);
	}
		
	@FindBy (how = How.XPATH, using ="//span[text()='APPLY FOR A MORTGAGE LOAN']")
	private WebElement button;
	@FindBy(how = How .XPATH, using ="//label[text()='Monthly HOA']")
	private WebElement godown;
//	@FindBy (how = How. XPATH, using = "//div[@class='mcalc-half mcwp-down-payment']")
//	private WebElement silder;
	@FindBy (how = How. XPATH, using ="//div[@aria-valuenow='5']")
	private WebElement sourcePayment;
	@FindBy (how = How. XPATH, using =	"//div[@aria-valuenow='21']")
	private WebElement targetPayment;
	@FindBy (how = How. XPATH, using ="//div[@style='right: 0px; width: 95%;']")	
	private WebElement sourceAnnal;
	@FindBy (how = How. XPATH, using ="//div[@style='right: 0px; width: 77.5%;']")
	private WebElement targetAnnal ;
	@FindBy (how = How. XPATH, using ="//div[@aria-valuenow='5']")
	private WebElement sourecInterest;
	@FindBy(how = How . XPATH, using ="//div[@aria-valuenow='7.75']")
	private WebElement targetInterest;
	
	public void clickbutton() {
		button.click();
	}
	public void godown() {
		Actions action = new Actions(driver);
		action.moveToElement(godown).build().perform();
	}
//	public void silder() {
//		silder.isDisplayed();
//		
//	}
	public void droppayment() {
	Actions action = new Actions(driver);
	action.dragAndDrop(sourcePayment, targetPayment);
	}
	
	public void sourecA() {
		Actions action = new Actions(driver);
		action.dragAndDrop(sourceAnnal, targetAnnal);
		
	}
	public void sourceinterest() {
		Actions action= new Actions (driver);
		action.dragAndDrop(sourecInterest, targetInterest);
	}
	
	
}
