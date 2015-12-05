package com.macycom;

public class waitblockpage {
	
	public static void waitblock() {
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
