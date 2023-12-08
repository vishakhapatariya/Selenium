import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "/home/pp-8/Desktop/vishakha/Selenium_Training/Selenium/chrome_driver/chromedriver-linux64/chromedriver");
		
		// Download file in specific path
		String downloadPath = System.getProperty("user.dir");
		System.out.println(downloadPath);
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", System.getProperty("user.dir"));

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		
		
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.ilovepdf.com/pdf_to_jpg");
		
		
		
		
/*		// Autoit Script for windows
		
		// Click on seach field
		ControlFocus("Title","","Class+Instance")
		// Enter File path to Upload
		ControlSetText("Title","","Class+Instance","File_Path")
		// Click on Open
		ControlClick("Title","","Class+Instance")
		
		// Compile autoIt script and create .exe file
		
		
		// Click on select file
		driver.findElement(By.cssSelector("#pickfiles")).click();
		Thread.sleep(3000);
		// Choose file from browser (Execute AutoIt Script)
		Runtime.getRuntime().exec("Script_File_PATH");
		
		// Click on 'Convert to JPG'
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#processTaskTextBtn")));
		driver.findElement(By.cssSelector("#processTaskTextBtn")).click();
		
		
		// Click on download
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#pickfiles")));
		driver.findElement(By.cssSelector("#pickfiles")).click();
		
		// Check whether file is downloaded or not
		Thread.sleep(5000);
		File f = new File(downloadPath+"/ilovepdf_pages-to-jpg.zip");
		if(f.exists()) {
			System.out.println("File found");
			Assert.assertTrue(f.exists());
			if(f.delete()) {
				System.out.println("File Deleted!");
			}
		}
		
		*/
		
		
		
		
		
		// File Download and Validation using Selenium in Ubuntu
		
		
		// Click on select file
		driver.findElement(By.cssSelector("#pickfiles")).click();
		// Choose file from browser
		File uploadFile = new File("/home/pp-8/Downloads/sample.pdf");
		WebElement fileInput = driver.findElement(By.cssSelector("input[type=file]"));
		fileInput.sendKeys(uploadFile.getAbsolutePath());
		
		// Click on 'Convert to JPG'
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#processTaskTextBtn")));
		driver.findElement(By.cssSelector("#processTaskTextBtn")).click();
		
		// Click on download
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#pickfiles")));		
		driver.findElement(By.cssSelector("#pickfiles")).click();

		// Check whether file is downloaded or not
		Thread.sleep(5000);
		File f = new File(downloadPath+"/ilovepdf_pages-to-jpg.zip");
		if(f.exists()) {
			// System.out.println("File found");
			Assert.assertTrue(f.exists());
			if(f.delete()) {
				System.out.println("File Deleted!");
			}
		}
		
		driver.quit();
		
	}

}
