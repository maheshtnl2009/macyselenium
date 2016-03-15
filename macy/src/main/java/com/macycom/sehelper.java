package com.macycom;
import org.openqa.selenium.chrome.ChromeDriver;

import com.macycom.commonmethods;

import org.openqa.selenium.WebDriver;

import com.macycom.testreport;

public class sehelper {
	
	public static WebDriver driver;
	public static testreport report;
	public static commonmethods c=new commonmethods();
	
	@SuppressWarnings("static-access")
	public static void accessmacy(){
		
		String s=c.getdata("url");
		System.setProperty("webdriver.chrome.driver",
				"E:ohio/erp/selenium/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		report.logstep("Access macy homepage");
		driver.get(s);   //http://www.macys.com/
		}
	
	
	

}
