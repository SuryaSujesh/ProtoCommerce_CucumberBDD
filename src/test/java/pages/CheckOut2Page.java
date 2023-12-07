package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOut2Page {
	
     WebDriver driver;
	
	public CheckOut2Page(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//tbody/tr[1]/td[5]/button[1]")
	private WebElement remove;
	
	
	@FindBy(css="button[class='btn btn-success']")
	private WebElement finalCheckout;
	
	public void removeButton() {

		remove.click();
	}

	public void finalCheckout() {
		finalCheckout.click();
	}
	
}
