package com.faceBook.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.faceBook.baseClass.BaseClass;

public class FacebookLocators extends BaseClass {
	
	public FacebookLocators() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Create new account']")
	private WebElement create;
	
	@FindBy(xpath = "//input[@placeholder='First name']")
	private WebElement firstName;
	
	@FindBy(name = "lastname")
	private WebElement surName;
	
	@FindBy(name = "reg_email__")
	private WebElement mobileNumber;
	
	@FindBy(name = "reg_passwd__")
	private WebElement passName;
	
	@FindBy(xpath = "//select[@id='day']")
	private WebElement date1;
	
	@FindBy(xpath = "//select[@id='day']/option[text()='31']")
	private WebElement dateName;
	
	@FindBy(xpath = "//select[@aria-label='Month']")
	private WebElement month1;
	
	@FindBy(xpath = "//select[@aria-label='Month']/option[text()='Aug']")
	private WebElement monthName;
	
	@FindBy(xpath = "//select[@aria-label='Year']")
	private WebElement year1;
	
	@FindBy(xpath = "//select[@aria-label='Year']/option[text()='1996']")
	private WebElement yearName;
	
	@FindBy(xpath = "//label[text()='Male']")
    private WebElement gender1;
	
	@FindBy(xpath = "//button[text()='Sign Up']")
	private WebElement signUp;
	
	@FindBy(xpath = "//a[text()='No, Create New Account']/parent::div")
	private WebElement errorBox;
	
	@FindBy(name = "firstname")
	private WebElement firstName1;
	
	@FindBy(name = "lastname")
	private WebElement surName1;
	
	@FindBy(name = "reg_email__")
	private WebElement mobileNum;
	
	@FindBy(name = "reg_passwd__")
	private WebElement pass;
	
	@FindBy(xpath = "//select[@id='day']")
	private WebElement date2;
	
	@FindBy(xpath = "//select[@id='day']/option[text()='31']")
	private WebElement dateName1;
	
	@FindBy(xpath = "//select[@aria-label='Month']")
	private WebElement month2;
	
	@FindBy(xpath = "//select[@aria-label='Month']/option[text()='Aug']")
	private WebElement monthName1;
	
	@FindBy(xpath = "//select[@aria-label='Year']")
	private WebElement year2;
	
	@FindBy(xpath = "//select[@aria-label='Year']/option[text()='1996']")
	private WebElement yearName1;
	
	@FindBy(xpath = "//label[text()='Male']")
    private WebElement gender2;
	
	@FindBy(xpath = "//button[text()='Sign Up']")
	private WebElement signUp1;
	
	@FindBy(xpath = "//a[text()='No, Create New Account']/parent::div")
	private WebElement errorBox1;
	
	@FindBy(name = "firstname")
	private WebElement firstnameElement;
	
	@FindBy(name = "lastname")
	private WebElement surnameElement;
	
	@FindBy(name = "reg_email__")
	private WebElement mobilenumberElement;
	
	@FindBy(name = "reg_passwd__")
	private WebElement passwordElement;
	
	@FindBy(xpath = "//select[@id='day']")
	private WebElement dateElement;
	
	@FindBy(xpath = "//select[@id='day']/option[text()='31']")
	private WebElement dateElement2;
	
	@FindBy(xpath = "//select[@aria-label='Month']")
	private WebElement monthElement;
	
	@FindBy(xpath = "//select[@aria-label='Month']/option[text()='Aug']")
	private WebElement monthElement2;
	
	@FindBy(xpath = "//select[@aria-label='Year']")
	private WebElement yearElement;
	
	@FindBy(xpath = "//select[@aria-label='Year']/option[text()='1996']")
	private WebElement yearElement2;
	
	@FindBy(xpath = "//label[text()='Male']")
    private WebElement genderElement;
	
	@FindBy(xpath = "//button[text()='Sign Up']")
	private WebElement signUp3;
	
	@FindBy(xpath = "//a[text()='No, Create New Account']/parent::div")
	private WebElement error;
	
	@FindBy(xpath = "//button[text()='Sign Up']")
	private WebElement signUp4;
	
	@FindBy(xpath = "//a[text()='No, Create New Account']/parent::div")
	private WebElement error1;

	public WebElement getCreate() {
		return create;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getSurName() {
		return surName;
	}
	
	public WebElement getMobileNumber() {
		return mobileNumber;
	}

	public WebElement getPassName() {
		return passName;
	}

	public WebElement getDate1() {
		return date1;
	}

	public WebElement getDateName() {
		return dateName;
	}

	public WebElement getMonth1() {
		return month1;
	}

	public WebElement getMonthName() {
		return monthName;
	}

	public WebElement getYear1() {
		return year1;
	}

	public WebElement getYearName() {
		return yearName;
	}

	public WebElement getGender1() {
		return gender1;
	}

	public WebElement getSignUp() {
		return signUp;
	}

	public WebElement getErrorBox() {
		return errorBox;
	}

	public WebElement getFirstName1() {
		return firstName1;
	}

	public WebElement getSurName1() {
		return surName1;
	}

	public WebElement getMobileNum() {
		return mobileNum;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getDate2() {
		return date2;
	}

	public WebElement getDateName1() {
		return dateName1;
	}

	public WebElement getMonth2() {
		return month2;
	}

	public WebElement getMonthName1() {
		return monthName1;
	}

	public WebElement getYear2() {
		return year2;
	}

	public WebElement getYearName1() {
		return yearName1;
	}

	public WebElement getGender2() {
		return gender2;
	}

	public WebElement getSignUp1() {
		return signUp1;
	}

	public WebElement getErrorBox1() {
		return errorBox1;
	}

	public WebElement getFirstnameElement() {
		return firstnameElement;
	}

	public WebElement getSurnameElement() {
		return surnameElement;
	}

	public WebElement getMobilenumberElement() {
		return mobilenumberElement;
	}

	public WebElement getPasswordElement() {
		return passwordElement;
	}

	public WebElement getDateElement() {
		return dateElement;
	}

	public WebElement getDateElement2() {
		return dateElement2;
	}

	public WebElement getMonthElement() {
		return monthElement;
	}

	public WebElement getMonthElement2() {
		return monthElement2;
	}

	public WebElement getYearElement() {
		return yearElement;
	}

	public WebElement getYearElement2() {
		return yearElement2;
	}

	public WebElement getGenderElement() {
		return genderElement;
	}

	public WebElement getSignUp3() {
		return signUp3;
	}

	public WebElement getError() {
		return error;
	}

	public WebElement getSignUp4() {
		return signUp4;
	}

	public WebElement getError1() {
		return error1;
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
