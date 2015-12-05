package com.macy;
import com.macycom.*;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.macycom.waitblockpage;

public class searchpage extends sehelper{
	
	//String searchname=c.getdata("searchitem");
	
	 
	
	@SuppressWarnings("static-access")
	
	public static void bagselection(){
		String searchitem=c.getdata("searchname");
		List<WebElement> items=driver.findElements(By.xpath(".//*[@id='1629900']/div[1]/div[2]/a"));//.rviDescription
		for(int i=0;i<items.size();i++){
			String name=items.get(i).getText();
			report.logstep(name);
			System.out.println(name);
			if(name.contains(searchitem)){
				//report.elementvalidation(name.is(), "", Message);
				report.stringvalidation(name,searchitem,"respected bags is present and selected");			
				//report.elementvalidation(name.isEmpty(), message, Message);
				items.get(i).click();				
				break;
			}
		}
		waitblockpage.waitblock();
	}

}
