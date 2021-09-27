package com.urbanladder.pageobject;

import org.openqa.selenium.WebDriver;

import com.urbanladder.ReusableComponents.ReusableMethods;
import com.urbanladder.utility.Logging;

public class GiftCardsPage {
	
	private static Boolean flag = null;
	
	public static boolean verifyTitle(WebDriver driver) {
		flag = null;
		try {
			String title = ReusableMethods.getTitle(driver);
			if(title.contains("Gift Card")) {
				flag = true;
				Logging.info("Gift Card Page Opened");
			}
			else {
				flag = false;
				Logging.error("Title Does not match Gift Card");
			}
		}
		catch(Exception e) {
			flag = false;
			Logging.error("Could not open Gift Card Page");
		}
		return flag;
	}

}
