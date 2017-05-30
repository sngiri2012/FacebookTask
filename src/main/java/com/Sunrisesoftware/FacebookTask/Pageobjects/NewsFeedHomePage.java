package com.Sunrisesoftware.FacebookTask.Pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.Sunrisesoftware.FacebookTask.BaseClass;

public class NewsFeedHomePage extends BaseClass{

	public NewsFeedHomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.CSS, using = "._3652 a")
	private List<WebElement> trends;
	
	@FindBy(how = How.CSS, using = "[data-testid='remove_suggestion']")
	private List<WebElement> allRemoveButtons;
	
	public void clickOnTrends(){
		waitForPageLoad();
		Actions action = new Actions(driver);
		action.moveToElement(trends.get(1)).click().build().perform();
	}
	
	public void removeFirstInTheList(){
		wait.until(ExpectedConditions.elementToBeClickable(allRemoveButtons.get(0))).click();
	}

	public String getTitle() {
		waitForPageLoad();
		return driver.getTitle();
	}
}
