package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOut1Page {
	
	 WebDriver driver;
		
		public CheckOut1Page(WebDriver driver) {
			
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		
		@FindBy(css="button[class='btn btn-default']")
		private WebElement continueShopping;
		
		public void continueShop() {

			continueShopping.click();
			
		}
		
}
