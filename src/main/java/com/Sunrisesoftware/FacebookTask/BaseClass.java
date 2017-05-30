package com.Sunrisesoftware.FacebookTask;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	protected WebDriver driver;
	protected WebDriverWait wait;

	public BaseClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 30);
		this.driver = driver;
	}
	
	public void waitForPageLoad(){
		wait.until(ExpectedConditions.jsReturnsValue("return document.readyState==\"complete\";"));
		//wait.until(ExpectedConditions.jsReturnsValue("return jQuery.active==\"0\";"));
		

        //((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");

	}
	
	public WebElement getParent(final WebElement webElement) {
	    return webElement.findElement(By.xpath(".."));
	}
}
