package coreUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHandle extends GlobalConstants {

	public static Properties prop;
	public static WebDriver driver;

	public static String getProp(String key) {

		String value = null;

		try {
			if (prop == null) {

				File f = new File(propFilePath);
				FileInputStream fis = new FileInputStream(f);
				prop = new Properties();
				prop.load(fis);
				System.out.println("properties file loaded successfully");
			}

			value = prop.getProperty(key);
		} catch (FileNotFoundException e) {
			System.out.println("unable to locate the properties file at +" + propFilePath);
		} catch (IOException e) {

		}
		return value;
	}

	public static WebDriver getDriver() throws InterruptedException {
		String browser = getProp("browser");
		if (browser != null) {
			if (driver == null) {

				switch (browser) {

				case "CH":
					System.setProperty("webdriver.chrome.driver", chromeEXEpath);
					driver = new ChromeDriver();
					Thread.sleep(3000);
					break;
				case "FF":
					System.setProperty("webdriver.firefox.driver", FFEXEpath);
					driver = new ChromeDriver();
					Thread.sleep(3000);
					break;	
					
				}
			}

		} else {

			System.out.println("Terminating the execution as no value found for broswser");
		}

		return driver;
	}

	// commonly used

	public static void clickOnButton(WebElement element) {

		element.click();
	}

	public static void typeIn(WebElement element, String value) {
		element.sendKeys(value);

	}

	public static String readText(WebElement element) {

		String value = element.getText();
		return value;

	}

	public static void operUrl(String url) throws InterruptedException {
		
		getDriver().get(prop.getProperty(url));
	}

}
