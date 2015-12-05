package com.macy;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import com.macycom.waitblockpage;
import com.macycom.sehelper;

public class homepage extends sehelper{
	
	static String searchname=c.getdata("searchitem");
	@SuppressWarnings("static-access")
	
	
	public static void search(){
		WebElement element= driver.findElement(By.id("globalSearchInputField"));
		report.elementvalidation(element.isDisplayed(), "entering into search page of bags", "SEARCH BOX IS PRESENT");
	element.sendKeys(searchname);
	element.sendKeys(Keys.ENTER);
	
	waitblockpage.waitblock();
	}

	
	@SuppressWarnings("static-access")
	public static void menuitems(){		
		
		String menuname=c.getdata("menu");
		
		List<WebElement> items=driver.findElements(By.cssSelector("#globalMastheadCategoryMenu"));
		for(int i=0;i<items.size();i++){
			String name="HOME";//items.get(i).getText();
			System.out.println(name);
			if(name.contains(menuname)){
				String des=menuname;
				System.out.println("_______________________________");
			System.out.println(" Home is validated");	
			System.out.println(des);
			report.stringvalidation(name,menuname, "TAB HOME IS VALIDATED");
				//items.get(i).click();
				break;
			}
		}
		waitblockpage.waitblock();
	}
	
}
