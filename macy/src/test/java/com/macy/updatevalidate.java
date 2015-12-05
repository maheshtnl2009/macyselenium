package com.macy;
import java.util.List;







import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.macycom.*;

public class updatevalidate extends sehelper{
	 static String fn=c.getdata("ufn");
	 static String ln=c.getdata("uln");
	 static 	String addr=c.getdata("uadd");
	 static String ci=c.getdata("ucity");
	 static String st=c.getdata("ustate");
	 static 	String zip=c.getdata("upostalcode");
	 static String ph=c.getdata("uphone");
	
	
	@SuppressWarnings("static-access")
	public static void updateship(){
		
		List<WebElement> add = driver.findElements(By
				.xpath(".//*[@id='rc-at-shipping-address']"));
		for (int i = 0; i < add.size(); i++) {
			String x = add.get(i).getText();
			if (x.contains(fn)) {
				String test=fn;
				report.stringvalidation(test, fn, "U firstname is validated");
				System.out.println("ufirstname is validated");
			}
			if (x.contains(ln)) {
				String test=ln;
				report.stringvalidation(test, ln, "U lastname is validated");
				System.out.println("ulast name is validated");
			}
			if (x.contains(addr)) {
				String test=addr;
				report.stringvalidation(test, addr, "U address is validated");
				System.out.println("udoor number is validated");
			}
			if (x.contains(ci)) {
				String test=ci;
				report.stringvalidation(test, ci, "U city is validated");
				System.out.println("ucity is validated");
			}
			if (x.contains(st)) {
				String test=st;
				report.stringvalidation(test, st, "U state is validated");
				System.out.println("ustate  is validated");
			}
			if (x.contains(zip)) {
				String test=zip;
				report.stringvalidation(test, zip, "U zipcode is validated");
				System.out.println("uzipcode is validated");
			}
			if (x.contains(ph)) {
				String test=ph;
				report.stringvalidation(test, ph, "U phone is validated");
				System.out.println("uphonenumber is validated");
			}

		}   
	}

	@SuppressWarnings("static-access")
	public static void updatebill(){
		 String m=c.getdata("umail");
		 WebElement ele=driver.findElement(By.xpath(".//*[@id='rc-payment-summary']/div/div[2]/p[1]"));
		 String mail=ele.getText();
		 System.out.println(m);
		 System.out.println(mail);
		 report.stringvalidation(mail, m, " u mail is validated");
		 
		 String p=c.getdata("ubillphone");
		 WebElement ele1=driver.findElement(By.xpath(".//*[@id='rc-payment-summary']/div/div[2]/p[2]"));
		 String ph=ele1.getText();
		System.out.println(p);
		System.out.println(ph);
		  report.stringvalidation(ph,p," u phone number is validated");
	}
	
	
}
