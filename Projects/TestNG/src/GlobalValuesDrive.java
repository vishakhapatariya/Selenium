import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDrive {

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();
		
		// Creating FileInputStream to read the data from file
		FileInputStream fis = new FileInputStream("/home/pp-8/Desktop/vishakha/Selenium_Training/Selenium/Projects/TestNG/src/data.properties");
		prop.load(fis);
		
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		
		// Change the property
		prop.setProperty("browser", "Firefox");
		System.out.println(prop.getProperty("browser"));
		
		// Creating FileOutputStream to write the data into the file
		FileOutputStream fos = new FileOutputStream("/home/pp-8/Desktop/vishakha/Selenium_Training/Selenium/Projects/TestNG/src/data.properties");
		prop.store(fos, null);
	
	}

}
