package com.macycom;

import org.testng.Assert;

import org.testng.Reporter;
import com.macycom.commonmethods;
public class testreport {
	public static commonmethods a=new commonmethods();

	public static void logstep(String Message) {
		Reporter.log(Message);

	}
	public static void stringvalidation(String Actval, String Expval,String Message) {
		Assert.assertEquals(Actval, Expval);
		Reporter.log(Message);
		
	}
	public static void booleanvalidaion(String Actval, String Expval,String Message) {
		Assert.assertEquals(Actval, Expval);
		Reporter.log(Message);
	}
	public static void intvalidation(String Actval, String Expval,String Message) {
		Assert.assertEquals(Actval, Expval);
		Reporter.log(Message);
	}
	public static void elementvalidation(boolean actval,String message,String Message){
		Assert.assertTrue(actval, message);
		Reporter.log(Message);
		Reporter.log(message);
		
		
	}
}
