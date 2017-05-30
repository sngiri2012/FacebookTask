package com.Sunrisesoftware.FacebookTask.Pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.Sunrisesoftware.FacebookTask.BaseClass;

public class EventsHomePage extends BaseClass{

	public EventsHomePage(WebDriver driver) {
		super(driver);
	
	}
	@FindBy(css = "[title='Profile']")
	private WebElement profile;
	
	@FindBy(how = How.CSS, using = "._55pe")
	private WebElement addEvent;
	
	@FindBy(how = How.CSS, using = "._b1b")
	private WebElement privateEvent;
	
	public String getTitle(){
		waitForPageLoad();
		return driver.getTitle();
	}
	
	public void clickOnProfile(){
		wait.until(ExpectedConditions.elementToBeClickable(profile)).click();
	}

	public void createAPrivateEvent(){
		wait.until(ExpectedConditions.elementToBeClickable(addEvent)).click();
		wait.until(ExpectedConditions.elementToBeClickable(privateEvent)).click();
	}
}
