package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static Properties prop;
	public static WebDriver driver;
	
	public TestBase() throws IOException{
		 prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream("F:\\Automation\\CuccumberProject_Gustav\\src\\main\\java\\com\\qa\\config\\config.properties");
		prop.load(fis);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void initialization() throws IOException{
		String browser = prop.getProperty("browser");
		if (browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "I:\\Automation\\chromedriver\\New folder\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browser.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "I:\\Automation\\chromedriver\\New folder\\geckodriver.exe"); 
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
	}
}
