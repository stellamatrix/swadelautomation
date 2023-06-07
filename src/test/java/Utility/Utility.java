package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utility {
	
	public String datafetcher(String key) throws IOException {
		String location = System.getProperty("user.dir");
		FileInputStream fis = new FileInputStream(location+"\\src\\test\\resources\\propertyfile\\datasaver.properties");
		Properties reader = new Properties();
		reader.load(fis);
		String value = (String) reader.getProperty(key);
		return value;
		
	}
	
}
