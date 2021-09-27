package com.urbanladder.uistore;

import org.openqa.selenium.By;

public class LoginPageUI {
	
	public static By email = By.xpath("//input[@placeholder='Email Address']");
	
	public static By password = By.xpath("//input[@placeholder='Password']");
	
	public static By login = By.id("ul_site_login");
	
	public static By loginclick = By.cssSelector("button._3Haew._1fVSi.action-button._1njbS._1XfDi._3J6Eb._1tgY9");

}
