package com.macy.automationtest;
import com.macy.addtocartpage;
import com.macy.billingpage;
import com.macy.cartpage;
import com.macy.guestcheckoutpage;
import com.macy.homepage;
import com.macy.orderreviewpage;
import com.macy.searchpage;
import com.macy.shippingpage;
import com.macy.updatevalidate;
import com.macycom.sehelper;
//import com.macycom.testreport;
import com.macycom.commonmethods;
import com.macycom.quitpage;
import com.macycom.waitblockpage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


public class macysmoke {
	public static homepage h;
	public static searchpage sp;
	public static commonmethods c;
	public static waitblockpage w;
	public static sehelper s;
	public static addtocartpage acp;
	public static cartpage cp;
	public static guestcheckoutpage gcp;
	public static shippingpage esp;
	public static billingpage bp;
	public static orderreviewpage op;
	public static quitpage q;
	public static updatevalidate uv;
	
	@BeforeMethod
	public static void samepletest1(){
		
	}
	
	
	@SuppressWarnings("static-access")
	@Test
	public static void test01(){
		s.accessmacy();
		h.search();
		sp.bagselection();
		acp.addtobag();
		cp.itemdetailvalidation();
		q.quit();
	}
	@SuppressWarnings("static-access")
	@Test
	public static void test02(){
		s.accessmacy();
		h.search();
		sp.bagselection();
		acp.addtobag();
		cp.itemdetailvalidation();
		cp.checkout();
		cp.validateorder();
		cp.validatecost();
		q.quit();
	}	
	@SuppressWarnings("static-access")
	@Test
	public static void test03(){
		s.accessmacy();
		h.search();
		sp.bagselection();
		acp.addtobag();
		cp.checkout();
		cp.bag();
		gcp.checkout();	
		esp.entershippingdetails();
		esp.clickcontinue();
		q.quit();
	}
	@SuppressWarnings("static-access")
	@Test
	public static void test04(){
		s.accessmacy();
		h.search();
		sp.bagselection();
		acp.addtobag();
		cp.checkout();
		cp.bag();
		gcp.checkout();	
		esp.entershippingdetails();
		esp.entergiftmsg();
		esp.clickcontinue();
		q.quit();
	}
	@SuppressWarnings("static-access")
	@Test
	public static void test05(){
		s.accessmacy();
		h.search();
		sp.bagselection();
		acp.addtobag();
		cp.checkout();
		cp.bag();
		gcp.checkout();	
		esp.entershippingdetails();
		esp.clickcontinue();
		 bp.billingdetails();
		 op.validateship();
		 op.validatebill();
		 op.validategiftmsg();
		 q.quit();
		
	}
	@SuppressWarnings("static-access")
	@Test
	public static void test06(){
		s.accessmacy();
		h.search();
		sp.bagselection();
		acp.addtobag();
		cp.checkout();
		cp.bag();
		gcp.checkout();	
		esp.entershippingdetails();
		esp.clickcontinue();
		 bp.billingdetails();
		 esp.updateshippingdetails();
		 uv.updateship();
		 q.quit();
	}
	
	
	@SuppressWarnings("static-access")
	@Test
	public static void test07(){
		s.accessmacy();
		h.search();
		sp.bagselection();
		acp.addtobag();
		cp.checkout();
		cp.bag();
		gcp.checkout();	
		esp.entershippingdetails();
		esp.clickcontinue();
		 bp.billingdetails();
		 bp.updatebillingdetails();
		 uv.updatebill();
		
	}
	
//	@SuppressWarnings("static-access")
//	@Test
//	public static void originaltest(){
//				s.accessmacy();
//		h.search();
//	h.menuitems();
//		sp.bagselection();
//		acp.addtobag();
//	//	cp.itemdetailvalidation();
//		cp.checkout();
//		//cp.validateorder();
//	
//		cp.bag();
//		//cp.validatecost();
//	gcp.checkout();	
//		esp.entershippingdetails();
//		
//		esp.clickcontinue();
//		   bp.billingdetails();
//op.validatebill();
//bp.updatebillingdetails();
//uv.updatebill();
//		   //		   op.validategiftmsg();
////		   op.validateship();
////		  esp.updateshippingdetails();		
////		uv.updateship();
////		bp.updatebillingdetails();
//	}
//	@AfterMethod
//	public static void endtest(){
//		
//	}
//	
//	
//	
//	
	
	
}
