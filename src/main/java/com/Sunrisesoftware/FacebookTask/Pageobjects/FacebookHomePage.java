package com.Sunrisesoftware.FacebookTask.Pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.Sunrisesoftware.FacebookTask.BaseClass;


public class FacebookHomePage extends BaseClass{

	public FacebookHomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.ID, using = "userNavigationLabel")
	private WebElement navigationLabel;
	

	@FindBy(how = How.CSS, using = "._54nh")
	private List<WebElement> allNaviagtionMenuLabels;
	
	@FindBy(css = "[title='News Feed']")
	private WebElement newsFeed;
	
	@FindBy(css = "[title='Profile']")
	private WebElement profile;
	
	@FindBy(css = "[title='Events']")
	private WebElement event;
	
	public String getTitle(){
		waitForPageLoad();
		return driver.getTitle();
	}
	
	public void clickOnProfile(){
		wait.until(ExpectedConditions.elementToBeClickable(profile)).click();
	}
	
	public void clickOnEvent(){
		wait.until(ExpectedConditions.elementToBeClickable(event)).click();
	}
	
	public void logout() throws Exception{
		wait.until(ExpectedConditions.elementToBeClickable(navigationLabel)).click();
		wait.until(ExpectedConditions.elementToBeClickable(signout())).click();
	}
	 
	
	public void clickOnNewsFeed(){
		wait.until(ExpectedConditions.elementToBeClickable(newsFeed)).click();
	}
	
	/*
	 * This method will get the WebElement for signout
	 */
	private WebElement signout() throws Exception{
		Thread.sleep(2000);
		for(WebElement ele : allNaviagtionMenuLabels){
			if (ele.getText().contains("Log out")){
				return ele;
			}
		}
		throw new Exception("Unable to find the logout button");
	}
}
