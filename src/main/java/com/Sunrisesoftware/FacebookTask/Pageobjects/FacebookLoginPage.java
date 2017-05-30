package com.Sunrisesoftware.FacebookTask.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.Sunrisesoftware.FacebookTask.BaseClass;

public class FacebookLoginPage extends BaseClass{

	public FacebookLoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how = How.ID, using = "email")
	private WebElement username;
	
	@FindBy(how = How.ID, using = "pass")
	private WebElement password;
	
	@FindBy(how = How.ID, using = "loginbutton")
	private WebElement loginButton;
	
	public void enterUserName(String user){
		wait.until(ExpectedConditions.elementToBeClickable(username)).clear();
		wait.until(ExpectedConditions.elementToBeClickable(username)).sendKeys(user);
	}
	
	public void enterPassword(String userPassword){
		wait.until(ExpectedConditions.elementToBeClickable(password)).clear();
		wait.until(ExpectedConditions.elementToBeClickable(password)).sendKeys(userPassword);
	}
	
	public void login(){
		wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
	}
	
	public String getTitle(){
		waitForPageLoad();
		
	    return driver.getTitle();  
	}


}
