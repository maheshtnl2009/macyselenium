package com.macy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.macycom.sehelper;
import com.macycom.waitblockpage;

public class billingpage extends sehelper {
	
	public static void billingdetails (){
		
		WebElement cardtype=driver.findElement(By.id("rc-payment-card-type"));
		WebElement cardnumber=driver.findElement(By.id("rc-payment-card-number"));
		WebElement cardmonth=driver.findElement(By.id("rc-payment-card-month"));
		WebElement cardyear=driver.findElement(By.id("rc-payment-card-year"));
		WebElement cvvcode=driver.findElement(By.id("rc-payment-scode"));
		
		String ct=c.getdata("ctype");
		String cn=c.getdata("cnum");
		String cm=c.getdata("cmonth");
		String cy=c.getdata("cyear");
		String c3=c.getdata("c3");		
		
		cardtype.sendKeys(ct);
		cardnumber.sendKeys(cn);
		cardmonth.sendKeys(cm);
		cardyear.sendKeys(cy);
		cvvcode.sendKeys(c3);
		
		WebElement firstname1=driver.findElement(By.id("rc-payment-firstName"));
		WebElement lastname=driver.findElement(By.id("rc-payment-lastName"));
		WebElement addfield1=driver.findElement(By.id("rc-payment-line1"));
		WebElement cityfield=driver.findElement(By.id("rc-payment-city"));
		WebElement statefield=driver.findElement(By.id("rc-payment-state"));
		WebElement postalfield=driver.findElement(By.id("rc-payment-zipCode"));
		WebElement phonenumber=driver.findElement(By.id("rc-payment-phone"));
		WebElement mailid=driver.findElement(By.id("rc-payment-email"));
		
		String bfn=c.getdata("bilfn");		
		String bln=c.getdata("billn");		
		String badd=c.getdata("billadd");		
		String bcity=c.getdata("billcity");		
		String bstate=c.getdata("billstate");		
		String bzip=c.getdata("billzip");		
		String bphone=c.getdata("billphone");	
		String bmail=c.getdata("mail");
		
		
		
		firstname1.sendKeys(bfn);
		lastname.sendKeys(bln);
		addfield1.sendKeys(badd);
		cityfield.sendKeys(bcity);
		statefield.sendKeys(bstate);
		postalfield.sendKeys(bzip);
		phonenumber.sendKeys(bphone);
		mailid.sendKeys(bmail);
		waitblockpage.waitblock();
		driver.findElement(By.id("rc-payment-continue")).click();
		waitblockpage.waitblock();
			
		
		//driver.findElement(By.id("rc-payment-phone")).sendKeys("1234567890");
		//driver.findElement(By.id("rc-payment-email")).sendKeys("mv@selenium.org");
		//driver.findElement(By.cssSelector("#billingSubmit")).click();
		
		//driver.switchTo().defaultContent();
	
		
	}

	public static void updatebillingdetails(){
		
		WebElement edit=driver.findElement(By.cssSelector("#rc-payment-edit"));
		edit.click();
		waitblockpage.waitblock();
//		WebElement cardtype=driver.findElement(By.id("rc-payment-card-type"));
//		WebElement cardnumber=driver.findElement(By.id("rc-payment-card-number"));
//		WebElement cardmonth=driver.findElement(By.id("rc-payment-card-month"));
//		WebElement cardyear=driver.findElement(By.id("rc-payment-card-year"));
		WebElement cvvcode=driver.findElement(By.id("rc-payment-scode"));
		
//		String ct=c.getdata("uctype");
//		String cn=c.getdata("ucnum");
//		String cm=c.getdata("ucmonth");
//		String cy=c.getdata("ucyear");
		String c3=c.getdata("uc3");		
		
//		cardtype.sendKeys(ct);
//		cardnumber.clear();
//		cardnumber.sendKeys(cn);
//		cardmonth.sendKeys(cm);
//		cardyear.sendKeys(cy);
		cvvcode.sendKeys(c3);
		
		WebElement firstname1=driver.findElement(By.id("rc-payment-firstName"));
		WebElement lastname=driver.findElement(By.id("rc-payment-lastName"));
		WebElement addfield1=driver.findElement(By.id("rc-payment-line1"));
		WebElement cityfield=driver.findElement(By.id("rc-payment-city"));
		WebElement statefield=driver.findElement(By.id("rc-payment-state"));
		WebElement postalfield=driver.findElement(By.id("rc-payment-zipCode"));
		WebElement phonenumber=driver.findElement(By.id("rc-payment-phone"));
		WebElement mailid=driver.findElement(By.id("rc-payment-email"));
		
		String bfn=c.getdata("ubilfn");		
		String bln=c.getdata("ubilln");		
		String badd=c.getdata("ubilladd");		
		String bcity=c.getdata("ubillcity");		
		String bstate=c.getdata("ubillstate");		
		String bzip=c.getdata("ubillzip");		
		String bphone=c.getdata("ubillphone");	
		String bmail=c.getdata("umail");
		
		
		firstname1.clear();
		firstname1.sendKeys(bfn);
		lastname.clear();
		lastname.sendKeys(bln);
		addfield1.clear();
		addfield1.sendKeys(badd);
		cityfield.clear();
		cityfield.sendKeys(bcity);
		statefield.sendKeys(bstate);
		postalfield.clear();
		postalfield.sendKeys(bzip);
		phonenumber.clear();
		phonenumber.sendKeys(bphone);
		mailid.clear();
		mailid.sendKeys(bmail);
		waitblockpage.waitblock();
		driver.findElement(By.id("rc-payment-continue")).click();
		waitblockpage.waitblock();
	}
	
}
