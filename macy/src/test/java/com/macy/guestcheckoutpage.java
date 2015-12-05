package com.macy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.macycom.sehelper;
import com.macycom.waitblockpage;

public class guestcheckoutpage extends sehelper {
	
	public static void checkout(){
		WebElement element= driver.findElement(By.cssSelector("#isWithoutProfile"));
		element.click();
		waitblockpage.waitblock();
	}
	

}
