package com.macy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.macycom.sehelper;
import com.macycom.waitblockpage;

public class cartpage extends sehelper {
	static String wid=c.getdata("webnum");
	 static String ip=c.getdata("itemprice");
	 static String sp=c.getdata("shiprice");
	 static String tv=c.getdata("taxval");
	 static String tp=c.getdata("totprice");
	
	public static void checkout(){
		WebElement element= driver.findElement(By.cssSelector("#btnCheckout"));
		element.click();
		waitblockpage.waitblock();
	}
	@SuppressWarnings("static-access")
	public static void validateorder(){
		
		WebElement element= driver.findElement(By.cssSelector("#webID_1629900"));
		String webid=element.getText();
		if (webid.contains(wid)){
			System.out.println("web id is validated in the checkout next page before bag page");
			report.stringvalidation(webid,wid,"id number is validated");
		}
		WebElement element2= driver.findElement(By.cssSelector("#bag_salesPrice33045329"));
		String price=element2.getText();
		if (price.contains(ip)){
			System.out.println("price is validated in the checkout next page before bag page");
			report.stringvalidation(price,ip,"item price is validated");
		waitblockpage.waitblock();
		}
//		WebElement element3= driver.findElement(By.xpath(".//*[@id='qtySelect_33045329_2']"));
//		String totq=element3.getText();
//		if (totq.contains("1")){
//			System.out.println("quantity is validated in the checkout next page before bag page");
//		}
	}
	
	@SuppressWarnings("static-access")
	public static void validatecost(){
		WebElement element= driver.findElement(By.cssSelector("#bagMerchandiseTotal"));
		String ordersubtot=element.getText();
		if (ordersubtot.contains(ip)){
			System.out.println("order subtotal is validated in the checkout next page before bag page");
			report.stringvalidation(ordersubtot,ip,"order subtotalprice is validated");
		}
		WebElement element2= driver.findElement(By.cssSelector("#bagEstimatedShippingTotal"));
		String estshiptot=element2.getText();
		if (estshiptot.contains(sp)){
			System.out.println("shipping total is validated in the checkout next page before bag page");
			report.stringvalidation(estshiptot,sp," ship totalprice is validated");
		}
		WebElement element3= driver.findElement(By.cssSelector("#bagEstimatedTaxes"));//
		String estsaltax=element3.getText();
		if (estsaltax.contains(tv)){
			System.out.println("tax is validated in the checkout next page before bag page");
			report.stringvalidation(estsaltax,tv," sales  tax price is validated");
		}
		WebElement element4= driver.findElement(By.cssSelector("#bagTotal"));//
		String bagtotal=element4.getText();
		if (bagtotal.contains(tp)){
			System.out.println("bagtotal is validated in the checkout next page before bag page");
			report.stringvalidation(bagtotal,tp,"total price is validated");
		}
	}
	
	
	public static void bag(){
		
		WebElement element= driver.findElement(By.cssSelector("#continueCheckout"));
		element.click();
		waitblockpage.waitblock();
	}
	
	@SuppressWarnings("static-access")
	public static void itemdetailvalidation(){
		
		String itemname=c.getdata("searchname");
		String itemsize=c.getdata("size");
		String itemcolour=c.getdata("colour");
		
		WebElement element= driver.findElement(By.cssSelector(".addToBagPageLineItemName>a"));
		String name=element.getText();
		if(name.contains(itemname)){
			System.out.println("name is validated in cart page");
			report.stringvalidation(name,itemname,"NAME IS VALIDATED IN CART PAGE.");
		}
		WebElement element1= driver.findElement(By.xpath(".//*[@id='atbPageProductSummary']/div/div[2]/div[1]/div[3]/div[2]"));
		String size=element1.getText();
		System.out.println(size);
		if(size.contains(itemsize)){
			System.out.println("size is validated in cart page");
			report.stringvalidation(size,itemsize,"size is validated in cart page.");
		}
		WebElement element2= driver.findElement(By.xpath(".//*[@id='atbPageProductSummary']/div/div[2]/div[1]/div[2]/div[2]"));
		String colour=element2.getText();
		System.out.println(colour);
		if(colour.contains(itemcolour)){
			System.out.println("COLOUR is validated in cart page");
			report.stringvalidation(colour,itemcolour,"COLOUR IS VALIDATED IN CART PAGE.");
		}
		
		
		
		
		
		
		
//		List<WebElement> c= driver.findElements(By.cssSelector(".addToBagPageProductFeatureValue"));
//		
//		for(int i=0;i<cs.size();i++){
//		String colursize=cs.get(i).getText();
//		if (colursize.contains(itemsize)){
//			report.stringvalidation(Actval, itemsize, "size M is validated");
//			System.out.println("size is validated in cart page");
//		}
//		if(colursize.contains("White")){
//			System.out.println("colour is validted in cart page");
//		}
//		}
//		
		
	}

}
