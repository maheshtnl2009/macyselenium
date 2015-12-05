package com.macy;
import com.macycom.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class addtocartpage extends sehelper {
	
	
	
	public static void addtobag(){

		WebElement element= driver.findElement(By.xpath(".//*[@id='sizeList1629900']/li[3]/span"));
		element.click();
		waitblockpage.waitblock();
		
		WebElement element1= driver.findElement(By.cssSelector("#addToBagButton1629900"));
		element1.click();
		waitblockpage.waitblock();
	}

public static void addtolist(){
	WebElement element= driver.findElement(By.cssSelector("#addToWishlistBtn1629900"));
	element.click();
	waitblockpage.waitblock();
	}


}
