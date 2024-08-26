package com.faceBook.stepDefinition;

	import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
	import java.util.List;
	import java.util.Map;
import java.util.Properties;

import org.apache.commons.collections4.functors.CatchAndRethrowClosure;
import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.edge.EdgeOptions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Wait;
	import org.openqa.selenium.support.ui.WebDriverWait;

import com.faceBook.baseClass.BaseClass;
import com.faceBook.objectRepository.FacebookLocators;
import com.faceBook.utlis.ExcelUtlis;

import io.cucumber.datatable.DataTable;
	import io.cucumber.java.en.And;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	import io.github.bonigarcia.wdm.WebDriverManager;

	public class CreateAccount1 extends BaseClass{
		FacebookLocators locators = new FacebookLocators();
		BaseClass base = new BaseClass();
		
		@When("user clicks signupoutline")
		public void user_clicks_signupoutline() {
		   base.button(locators.getSignUp3());
		    
		   base.waits(locators.getError());
		   base.ss("afteroutline");
		}
		@When("User enters excel information {string} {string}")
		public void user_enters_excel_information(String car, String sheetname) throws Throwable {
			File f = new File("C:\\Users\\MJ\\eclipse-workspace\\list\\FacebookProject\\src\\test\\resources\\Excelproperty.properties");
			try {
				FileInputStream f1 = new FileInputStream(f);
				Properties prop = new Properties();
				prop.load(f1);
				String s1 = (String) prop.get(car);
				System.out.println(s1);
				List<String> exceldata = ExcelUtlis.excelRead(s1, sheetname);
				for (int i = 0; i <exceldata.size(); i++) {
					Thread.sleep(2000);
					String data = exceldata.get(i);
					System.out.println(data);
					WebElement firstName = CreateAccount.driver.findElement(By.name("firstname"));
					base.waits(firstName);
					base.sendText(firstName, data);
					Thread.sleep(2000);
				}
			}
			catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		   
		}

		@When("User clicks on signup")
		public void user_clicks_on_signup() {
		    base.button(locators.getSignUp4());
		    base.waits(locators.getError1());
			base.ss("afterexcel");
		}

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	    
		





