package com.macy;
import com.macycom.sehelper;

public class test {
public static homepage h;
public static searchpage sp;
//public static commonmethods c;
//public static waitblockpage w;
public static sehelper s;
public static addtocartpage acp;
public static cartpage cp;
public static guestcheckoutpage gcp;
public static shippingpage esp;
public static billingpage bp;
public static orderreviewpage op;
public static updatevalidate uv;
   @SuppressWarnings("static-access")

   
   public static void main(String[] args) {
	s.accessmacy();
	h.search();
	//h.menuitems();
	sp.bagselection();
	acp.addtobag();
	//cp.itemdetailvalidation();
	cp.checkout();
	
	
	cp.bag();
	//cp.validateorder();
	//cp.validatecost();
	gcp.checkout();	
	esp.entershippingdetails();
	esp.clickcontinue();
	//esp.updateshippingdetails();
	   bp.billingdetails();
	   op.validatebill();
	bp.updatebillingdetails();
	uv.updatebill();
	   //  op.validategiftmsg();
	   //op.validateship();
	  // esp.updateshippingdetails();
	   
//	   
	   
}
	
}
