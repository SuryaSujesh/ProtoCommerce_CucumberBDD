package hooks;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import utils.ConfigReader;

public class Apphooks {
	
	WebDriver driver;
	
    @Before
    public void setUp() throws IOException
    {
    	Properties prop= ConfigReader.initializeProperties();
    	driver=DriverFactory.initializeBrowser(prop.getProperty("browser"));
    	driver.get(prop.getProperty("url"));
    }
    
	@After
	public void tearDown()
	{
	   // driver.quit();
	
	}
	
}
