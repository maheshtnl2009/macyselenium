package com.macy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;

import com.macycom.sehelper;
import com.macycom.waitblockpage;

public class shippingpage extends sehelper {

	public static void entershippingdetails(){
		WebElement firstname1=driver.findElement(By.id("rc-shipping-firstName"));
		WebElement lastname=driver.findElement(By.cssSelector("#rc-shipping-lastName"));
		WebElement addfield1=driver.findElement(By.xpath(".//*[@id='rc-shipping-line1']"));
		WebElement cityfield=driver.findElement(By.cssSelector("#rc-shipping-city"));
		WebElement statefield=driver.findElement(By.xpath(".//*[@id='rc-shipping-state']"));
		WebElement postalfield=driver.findElement(By.xpath(".//*[@id='rc-shipping-postal-code']"));
		WebElement phonenumber=driver.findElement(By.id("rc-shipping-phone"));
		//WebElement premium=driver.findElement(By.cssSelector("#rc-shipping-shipping-method2"));
//		WebElement gift=driver.findElement(By.cssSelector("#rc-giftoption-isgift"));//xpath-.//*[@id='rc-giftoption-isgift']
//		WebElement msgtype=driver.findElement(By.xpath(".//*[@id='rc-giftoption-giftMsg']"));
//		WebElement msgtype1=driver.findElement(By.xpath(".//*[@id='rc-gift-msg1']"));
//		WebElement msgtype2=driver.findElement(By.xpath(".//*[@id='rc-gift-msg2']"));
//		WebElement msgtype3=driver.findElement(By.xpath(".//*[@id='rc-gift-msg3']"));

	String fname=c.getdata("fn");
	String lname=c.getdata("ln");
	String address=c.getdata("add");
	String ci=c.getdata("city");
	String st=c.getdata("state");
	String pcode=c.getdata("postalcode");
	String ph=c.getdata("phone");
//	String g1=c.getdata("gm1");
//	String g2=c.getdata("gm2");
//	String g3=c.getdata("gm3");
	
				
		firstname1.sendKeys(fname);
		lastname.sendKeys(lname);
		addfield1.sendKeys(address);
		cityfield.sendKeys(ci);
		statefield.sendKeys(st);
		postalfield.sendKeys(pcode);
		phonenumber.sendKeys(ph);
		waitblockpage.waitblock();
				//premium.click();
		//waitblockpage.waitblock();
//		gift.click();
//		waitblockpage.waitblock();
//		msgtype.click();
//	//	waitblockpage.waitblock();
//		msgtype1.sendKeys(g1);
//		msgtype2.sendKeys(g2);
//		msgtype3.sendKeys(g3);
		
		
	}
	public static void entergiftmsg(){
//		WebElement firstname1=driver.findElement(By.id("rc-shipping-firstName"));
//		WebElement lastname=driver.findElement(By.cssSelector("#rc-shipping-lastName"));
//		WebElement addfield1=driver.findElement(By.xpath(".//*[@id='rc-shipping-line1']"));
//		WebElement cityfield=driver.findElement(By.cssSelector("#rc-shipping-city"));
//		WebElement statefield=driver.findElement(By.xpath(".//*[@id='rc-shipping-state']"));
//		WebElement postalfield=driver.findElement(By.xpath(".//*[@id='rc-shipping-postal-code']"));
//		WebElement phonenumber=driver.findElement(By.id("rc-shipping-phone"));
		//WebElement premium=driver.findElement(By.cssSelector("#rc-shipping-shipping-method2"));
		WebElement gift=driver.findElement(By.cssSelector("#rc-giftoption-isgift"));//xpath-.//*[@id='rc-giftoption-isgift']
		WebElement msgtype=driver.findElement(By.xpath(".//*[@id='rc-giftoption-giftMsg']"));
		WebElement msgtype1=driver.findElement(By.xpath(".//*[@id='rc-gift-msg1']"));
		WebElement msgtype2=driver.findElement(By.xpath(".//*[@id='rc-gift-msg2']"));
		WebElement msgtype3=driver.findElement(By.xpath(".//*[@id='rc-gift-msg3']"));

//	String fname=c.getdata("fn");
//	String lname=c.getdata("ln");
//	String address=c.getdata("add");
//	String ci=c.getdata("city");
//	String st=c.getdata("state");
//	String pcode=c.getdata("postalcode");
//	String ph=c.getdata("phone");
	String g1=c.getdata("gm1");
	String g2=c.getdata("gm2");
	String g3=c.getdata("gm3");
	
				
//		firstname1.sendKeys(fname);
//		lastname.sendKeys(lname);
//		addfield1.sendKeys(address);
//		cityfield.sendKeys(ci);
//		statefield.sendKeys(st);
//		postalfield.sendKeys(pcode);
//		phonenumber.sendKeys(ph);
//		waitblockpage.waitblock();
//				//premium.click();
//		//waitblockpage.waitblock();
		gift.click();
		waitblockpage.waitblock();
		msgtype.click();
	//	waitblockpage.waitblock();
		msgtype1.sendKeys(g1);
		msgtype2.sendKeys(g2);
		msgtype3.sendKeys(g3);
		
		
	}
	public static void clickcontinue(){
		driver.findElement(By.id("rc-shipping-continue")).click();
		waitblockpage.waitblock();
	}
	
	
	
	public static void updateshippingdetails(){
	
		String fname=c.getdata("ufn");
		String lname=c.getdata("uln");
		String address=c.getdata("uadd");
		String ci=c.getdata("ucity");
		String st=c.getdata("ustate");
		String pcode=c.getdata("upostalcode");
		String ph=c.getdata("uphone");
//		String g1=c.getdata("ugm1");
//		String g2=c.getdata("ugm2");
//		String g3=c.getdata("ugm3");
		WebElement edit=driver.findElement(By.cssSelector("#rc-shipping-edit"));
		edit.click();
		waitblockpage.waitblock();
		WebElement firstname1=driver.findElement(By.id("rc-shipping-firstName"));
		WebElement lastname=driver.findElement(By.cssSelector("#rc-shipping-lastName"));
		WebElement addfield1=driver.findElement(By.xpath(".//*[@id='rc-shipping-line1']"));
		WebElement cityfield=driver.findElement(By.cssSelector("#rc-shipping-city"));
		WebElement statefield=driver.findElement(By.xpath(".//*[@id='rc-shipping-state']"));
		WebElement postalfield=driver.findElement(By.xpath(".//*[@id='rc-shipping-postal-code']"));
		WebElement phonenumber=driver.findElement(By.id("rc-shipping-phone"));
		
//		WebElement msgtype1=driver.findElement(By.xpath(".//*[@id='rc-gift-msg1']"));
//		WebElement msgtype2=driver.findElement(By.xpath(".//*[@id='rc-gift-msg2']"));
//		WebElement msgtype3=driver.findElement(By.xpath(".//*[@id='rc-gift-msg3']"));
			
		firstname1.clear();
		firstname1.sendKeys(fname);
		lastname.clear();
		lastname.sendKeys(lname);
		addfield1.clear();
		addfield1.sendKeys(address);
		cityfield.clear();
		cityfield.sendKeys(ci);
		statefield.sendKeys(st);
		postalfield.clear();
		postalfield.sendKeys(pcode);
		phonenumber.clear();
		phonenumber.sendKeys(ph);
		waitblockpage.waitblock();
//		msgtype1.clear();
//		msgtype1.sendKeys(g1);
//		msgtype2.clear();
//		msgtype2.sendKeys(g2);
//		msgtype3.clear();
//		msgtype3.sendKeys(g3);
		driver.findElement(By.id("rc-shipping-continue")).click();
		waitblockpage.waitblock();
		
			
	}
	

}
