package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	
	public static Properties initializeProperties() {
		
		Properties prop = new Properties();
			try {
			FileInputStream fis = new FileInputStream("src/test/resources/config/config.properties");
			prop.load(fis);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prop;
		
	}

}
