package com.faceBook.stepDefinition;

import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.faceBook.baseClass.BaseClass;
import com.faceBook.objectRepository.FacebookLocators;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount  extends BaseClass{
	FacebookLocators locators = new FacebookLocators();
	BaseClass base = new BaseClass();
	static WebDriver driver;
	static WebDriverWait wait;
	static Actions action;

	@Given("Launch the Facebook Application  {string}")
	public void launch_the_facebook_application(String Url) {
		base.launchApplication(Url);
		driver = base.driver;
		action = base.action;
		wait = (WebDriverWait) base.wait;
	}

	@Then("Validate the Launched Application  {string}")
	public void validate_the_launched_application(String Url) {
	String currentUrl = base.currentUrl();
	if (currentUrl.startsWith(Url)) {
		System.out.println("APPLICATION IS LAUNCHED");
		
	}
	else {
		System.out.println("APPLICATION IS NOT LAUNCHED");
	}

	}

	@When("User Clicks on Create Account")
	public void user_clicks_on_create_account() {
	base.waits(locators.getCreate());
	base.button(locators.getCreate());
	}

	@When("User enters the information with one dim list")
	public void user_enters_the_information_with_one_dim_list(DataTable dataTable) {
	base.ss("beforelist");
	List<String> list = dataTable.asList();
	String firstValue = list.get(0);
	base.waits(locators.getFirstName());
	base.sendText(locators.getFirstName(), firstValue);

	String SurValue = list.get(1);
	base.waits(locators.getSurName());
	base.sendText(locators.getSurName(),SurValue);

	String mobileValue = list.get(2);
	base.waits(locators.getMobileNumber());
	base.sendText(locators.getMobileNumber(), mobileValue);

	String passvalue = list.get(3);
	base.waits(locators.getPassName());
	base.sendText(locators.getPassName(), passvalue); 

	String date = list.get(4);
	base.button(locators.getDate1());
	base.button(locators.getDateName());
	base.waits(locators.getDateName());
	

	String month = list.get(5);
	base.button(locators.getMonth1());
	base.button(locators.getMonthName());
	base.waits(locators.getMonthName());
	
	String year = list.get(6);
	base.button(locators.getYear1());
	base.button(locators.getYearName());
	base.waits(locators.getYearName());
	

	String gender = list.get(7);
	base.button(locators.getGender1());  
	base.waits(locators.getGender1());
	 
	}
	@When("User Clicks on Sign-up list")
	public void user_clicks_on_sign_up_list() {
	base.button(locators.getSignUp());

	base.waits(locators.getErrorBox());
	base.ss("afterlist");
	}

	@When("User enters the information with one dim map")
	public void user_enters_the_information_with_one_dim_map(DataTable dataTable) throws Throwable  {
	base.ss("beforemap");
	Map<String, String> map = dataTable.asMap(String.class, String.class);
	String firstValue = map.get("username");
	base.waits(locators.getFirstName1());
	base.sendText(locators.getFirstName1(), firstValue);

	String SurValue = map.get("surname");
	base.waits(locators.getSurName1());
	base.sendText(locators.getSurName1(), SurValue);

	String mobileValue = map.get("mobilenumber");
	base.waits(locators.getMobileNum());
	base.sendText(locators.getMobileNum(), mobileValue);

	String password = map.get("passwd");
	base.waits(locators.getPass());
	base.sendText(locators.getPass(), password);

	String date = map.get("date");
	base.button(locators.getDate2());
	base.button(locators.getDateName1());
	base.waits(locators.getDateName1());
	

	String month = map.get("month");
	base.button(locators.getMonth2());
	base.button(locators.getMonthName1());
	base.waits(locators.getMonthName1());
	
	String year = map.get("year");
	base.button(locators.getYear2());
	base.button(locators.getYearName1());
	base.waits(locators.getYearName1());
	

	String gender = map.get("gender");
	base.button(locators.getGender2());
	base.waits(locators.getGender2());
	


	}
	
	@When("User Clicks on sign-Up map")
	public void user_clicks_on_sign_up_map() {
		base.button(locators.getSignUp1());

		base.waits(locators.getErrorBox1());
		base.ss("aftermap");	 
		}
	@When("user enters information multiple times {string} {string} {string} {string} {string} {string} {string} {string}")
	public void user_enters_information_multiple_times(String firstname, String surname, String mobilenumber, String password, String date, String month, String year, String gender) {
		base.ss("beforeoutline");
		
	    base.waits(locators.getFirstnameElement());
	    base.sendText(locators.getFirstnameElement(), firstname);
	    
	    base.waits(locators.getSurnameElement());
	    base.sendText(locators.getSurnameElement(), surname);
	    
	    base.waits(locators.getMobilenumberElement());
	    base.sendText(locators.getMobilenumberElement(), mobilenumber);
	    
	    base.waits(locators.getPasswordElement());
	    base.sendText(locators.getPasswordElement(), password);
	    
	    
	    base.button(locators.getDateElement());
	    base.button(locators.getDateElement2());
	    base.waits(locators.getDateElement2());
	   
	    
	    base.button(locators.getMonthElement());
	    base.button(locators.getMonthElement2());
	    base.waits(locators.getMonthElement2());
	   
	    
	    
	    base.button(locators.getYearElement());
	    base.button(locators.getYearElement2());
	    base.waits(locators.getYearElement2());
	   
	    base.button(locators.getGenderElement());
	    base.waits(locators.getGenderElement());
	    
	}
	

	
	   
	}
	
	    
	


