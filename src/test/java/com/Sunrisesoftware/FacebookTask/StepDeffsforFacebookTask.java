package com.Sunrisesoftware.FacebookTask;

import static org.junit.Assert.assertTrue;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.Sunrisesoftware.FacebookTask.Pageobjects.EventsHomePage;
import com.Sunrisesoftware.FacebookTask.Pageobjects.FacebookHomePage;
import com.Sunrisesoftware.FacebookTask.Pageobjects.FacebookLoginPage;
import com.Sunrisesoftware.FacebookTask.Pageobjects.NewsFeedHomePage;
import com.Sunrisesoftware.FacebookTask.modules.EventCreateModule;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDeffsforFacebookTask {
	
	WebDriver driver = null;
	FacebookLoginPage loginPage ;
	FacebookHomePage facebookHomePage;
	EventsHomePage eventsHomePage;
	EventCreateModule createEvent;
	NewsFeedHomePage newsFeed;
	String username = "muralimanu@yahoo.com";
	String password = "dynamic&tree";
	URL url = getClass().getResource("src/test/resource/assets/event.jpg");
    
	@Before
	public void setup() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--start-maximized");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sreedhar\\Desktop\\Testing\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage = new FacebookLoginPage(driver);
		facebookHomePage = new FacebookHomePage(driver);
		eventsHomePage = new EventsHomePage(driver);
		createEvent = new EventCreateModule(driver);
		newsFeed = new NewsFeedHomePage(driver);
		driver.navigate().to("https://www.facebook.com/");
		
	}
	@After
	public void cleanup() {
		 //driver.quit();
	}
	
	@Given("^the user logs into the facebook application$")
	public void the_user_logs_into_the_facebook_application() throws Throwable {
		
		loginPage.enterUserName(username);
		loginPage.enterPassword(password);
		loginPage.login();
		
		assertTrue(facebookHomePage.getTitle().equals("Facebook"));
	}

	@When("^the user clicks on the signout button$")
	public void the_user_clicks_on_the_signout_button() throws Throwable {
		
		facebookHomePage.logout();
	}

	@Then("^the user should be logged out of the application$")
	public void the_user_should_be_logged_out_of_the_application() throws Throwable {
		
		assertTrue(loginPage.getTitle().equals("Facebook - Log In or Sign Up"));
	}

	@When("^the user clicks on the event link$")
	public void the_user_clicks_on_the_event_link() throws Throwable {
		
		facebookHomePage.clickOnEvent();
	}

	@Then("^the user should be navigated to the event homepage$")
	public void the_user_should_be_navigated_to_the_event_homepage() throws Throwable {
		
		assertTrue(eventsHomePage.getTitle().equals("Events"));
	}
	
	@When("^the user clicks on a dynamic contents$")
	public void the_user_clicks_on_a_dynamic_contents() throws Throwable {
	    facebookHomePage.clickOnNewsFeed();
	    newsFeed.clickOnTrends();
	}

	@Then("^the user should be navigated to the selcted event$")
	public void the_user_should_be_navigated_to_the_selcted_event() throws Throwable {
		assertTrue(newsFeed.getTitle().equals("Facebook"));
	}

}
