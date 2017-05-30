package com.Sunrisesoftware.FacebookTask.modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.Sunrisesoftware.FacebookTask.Pageobjects.EventsHomePage;

public class EventCreateModule extends EventsHomePage{

	public EventCreateModule(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how = How.CSS, using = "._3jk input")
	private WebElement upload;
	
	@FindBy(how = How.CSS, using = "input._58al")
	private WebElement eventName;

	public void uploadPhoto(String photoUrl){
		waitForPageLoad();
		wait.until(ExpectedConditions.elementToBeClickable(upload)).sendKeys(photoUrl);
	}
	
	public void enterEventName(String name){
		waitForPageLoad();
		wait.until(ExpectedConditions.elementToBeClickable(eventName)).sendKeys(name);
	}
}
