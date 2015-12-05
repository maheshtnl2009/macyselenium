package com.macy;

import java.util.List;




import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.macycom.*;

public class orderreviewpage extends sehelper {
	 static String fn=c.getdata("fn");
	 static String ln=c.getdata("ln");
	 static 	String addr=c.getdata("add");
	 static String ci=c.getdata("city");
	 static String st=c.getdata("state");
	 static 	String zip=c.getdata("postalcode");
	 static String ph=c.getdata("phone");
	

	@SuppressWarnings("static-access")
	public static void validateship() {
		
		
		
		
		List<WebElement> add = driver.findElements(By
				.xpath(".//*[@id='rc-at-shipping-address']"));
		for (int i = 0; i < add.size(); i++) {
			String x = add.get(i).getText();
			if (x.contains(fn)) {
				String test=fn;
				report.stringvalidation(test, fn, "firstname is validated");
				System.out.println("firstname is validated");
			}
			if (x.contains(ln)) {
				String test=ln;
				report.stringvalidation(test, ln, "lastname is validated");
				System.out.println("last name is validated");
			}
			if (x.contains(addr)) {
				String test=addr;
				report.stringvalidation(test, addr, "address is validated");
				System.out.println("door number is validated");
			}
			if (x.contains(ci)) {
				String test=ci;
				report.stringvalidation(test, ci, "city is validated");
				System.out.println("city is validated");
			}
			if (x.contains(st)) {
				String test=st;
				report.stringvalidation(test, st, "state is validated");
				System.out.println("state  is validated");
			}
			if (x.contains(zip)) {
				String test=zip;
				report.stringvalidation(test, zip, "zipcode is validated");
				System.out.println("zipcode is validated");
			}
			if (x.contains(ph)) {
				String test=ph;
				report.stringvalidation(test, ph, "phone is validated");
				System.out.println("phonenumber is validated");
			}

		}   
	}

	@SuppressWarnings("static-access")
	public static void validategiftmsg() {
		String g1=c.getdata("gm1");
		String g2=c.getdata("gm2");
		String g3=c.getdata("gm3");
		String g4=c.getdata("gm4");
		
		List<WebElement> msg = driver.findElements(By
				.cssSelector("#rc-at-gift-options"));
		for (int i = 0; i < msg.size(); i++) {
			String x = msg.get(i).getText();
			if (x.contains(g1)) {
				String gm1=g1;
				report.stringvalidation(gm1, g1, "1 line gift is validated");
				System.out.println("msg1 is validated");
			}
			if (x.contains(g2)) {
				String gm2=g2;
				report.stringvalidation(gm2, g2, "2 line gift is validated");
				System.out.println("msg2  is validated");
			}
			if (x.contains(g3)) {
				String gm3=g3;
				report.stringvalidation(gm3, g3, "3 line gift is validated");
				System.out.println("msg3  is validated");
			}
			if (x.contains(g4)) {
				String gm4=g4;
				report.stringvalidation(gm4, g4, "hide prices is validated");
				
				
				System.out.println("hiding price is validated");
			}
		}
	}
 @SuppressWarnings("static-access")
public static void validatebill(){
	 String m=c.getdata("mail");
	 WebElement ele=driver.findElement(By.xpath(".//*[@id='rc-payment-summary']/div/div[2]/p[1]"));
	 String mail=ele.getText();
	 System.out.println(m);
	 System.out.println(mail);
	 report.stringvalidation(mail, m, "mail is validated");
	 
	 String p=c.getdata("billphone");
	 WebElement ele1=driver.findElement(By.xpath(".//*[@id='rc-payment-summary']/div/div[2]/p[2]"));
	 String ph=ele1.getText();
	System.out.println(p);
	System.out.println(ph);
	  report.stringvalidation(ph,p,"phone number is validated");
	 
	 
//		edit.click();
//		waitblockpage.waitblock();
//		WebElement firstname1=driver.findElement(By.id("rc-payment-firstName"));
//		WebElement lastname=driver.findElement(By.id("rc-payment-lastName"));
//		WebElement addfield1=driver.findElement(By.id("rc-payment-line1"));
//		WebElement cityfield=driver.findElement(By.id("rc-payment-city"));
//		WebElement statefield=driver.findElement(By.id("rc-payment-state"));
//		WebElement postalfield=driver.findElement(By.id("rc-payment-zipCode"));
//		WebElement phonenumber=driver.findElement(By.id("rc-payment-phone"));
//		WebElement mailid=driver.findElement(By.id("rc-payment-email"));
		 
		
//	 String f=firstname1.getText();
//		System.out.println(f);
//	 if(f.contentEquals("mahesh")){
//		 System.out.println("bill firstname is valideted");
//		  }else{
//			  System.out.println("not validated");
//		  }
//	 
 }
}
