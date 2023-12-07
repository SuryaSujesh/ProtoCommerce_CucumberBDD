package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutHomePage {
	
	WebDriver driver;
	
	public CheckOutHomePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='nav-link btn btn-primary']")
	private WebElement emptyCheckOut;
	
	@FindBy(xpath="//app-card[1]//div[1]//div[2]//button[1]")
	private WebElement addButton1;
	
	@FindBy(xpath="//app-card[2]//div[1]//div[2]//button[1]")
	private WebElement addButton2;
	
	@FindBy(xpath="//a[@class='nav-link btn btn-primary']")
	private WebElement checkoutButton1;

	public CheckOut1Page emptyCheckOut() {

		emptyCheckOut.click();
		return new CheckOut1Page(driver);
	}

	
	public void clickOnButton1() {

		addButton1.click();
	}

	public void clickOnButton2() {
		addButton2.click();
		
	}

	public CheckOut2Page checkOut() {

		checkoutButton1.click();
		return new CheckOut2Page(driver);
		
	}
	 


	

}
