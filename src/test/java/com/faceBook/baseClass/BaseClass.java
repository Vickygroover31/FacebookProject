package com.faceBook.baseClass;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass implements IBaseClass{
	
	public static WebDriver driver;
	public static Wait wait;
	public static Actions action;
	public  static Select select;
	public static JavascriptExecutor js;
	

	@Override
	public void browserLaunch() {
		WebDriverManager.edgedriver().setup();
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--start-maximized");
		driver = new EdgeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		action = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));


		
	}

	@Override
	public void browserClose() {
		driver.close();
		
	}

	@Override
	public void launchApplication(String url) {
		driver.get(url);
		
	}

	@Override
	public String currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	@Override
	public String title() {
		String title = driver.getTitle();
		return title;
	}

	@Override
	public void forward() {
		driver.navigate().forward();
		
	}

	@Override
	public void backward() {
		driver.navigate().back();
		
	}

	@Override
	public void refresh() {
		driver.navigate().refresh();
		
	}

	@Override
	public void button(WebElement ele) {
		ele.click();
		
	}

	@Override
	public void sendText(WebElement ele, String inputText) {
		ele.sendKeys(inputText);
		
	}

	@Override
	public String extractText(WebElement ele) {
		String text = ele.getText();
		return text;
		
	}

	@Override
	public String extractAttribute(WebElement ele, String attribute) {
		String attribute2 = ele.getAttribute(attribute);
		return attribute2;
		
	}

	@Override
	public boolean displayed(WebElement ele) {
	boolean displayed = ele.isDisplayed();
		return displayed;
	}

	@Override
	public void mouseOver(WebElement ele) {
		action.moveToElement(ele).build().perform();
		
	}

	@Override
	public void sendText(String inputText, WebElement ele) {
		action.sendKeys(ele, inputText).build().perform();
		
	}

	@Override
	public void button(WebElement ele, int i) {
		action.click(ele).build().perform();
	}

	@Override
	public void button(int i, WebElement ele) {
		js.executeScript("arguments[0].click()", ele);
		
	}

	@Override
	public void sendText(String inputText, WebElement ele, int i) {
		js.executeScript("arguments[0].setAttribute('value', '"+inputText+"'", ele);
	}

	@Override
	public void selectVisibilityText(WebElement ele, String visibleText) {
	select = new Select(ele);
	select.selectByVisibleText(visibleText);
		
	}

	@Override
	public void selectIndex(WebElement ele, int index) {
		select = new Select(ele);
		select.selectByIndex(index);
		
	}

	@Override
	public void selectValue(WebElement ele, String value) {
		select = new Select(ele);
		select.selectByValue(value);
	}

	@Override
	public void ss(String imgName) {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\MJ\\eclipse-workspace\\list\\FacebookProject\\target\\"+imgName+".png");
		try {
			FileUtils.copyFile(source, f);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void deselectVisibilityText(WebElement ele, String visibleText) {
		select = new Select(ele);
		select.deselectByVisibleText(visibleText);
		
	}

	@Override
	public void deselectIndex(WebElement ele, int i) {
		select = new Select(ele);
		select.deselectByIndex(i);
		
	}

	@Override
	public void deselectValue(WebElement ele, String value) {
		select = new Select(ele);
		select.deselectByValue(value);
		
	}

	@Override
	public void waits(WebElement ele) {
	wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOf(ele));
		
	}

	@Override
	public boolean isMultiple(WebElement ele) {
		boolean multiple = select.isMultiple();
		return multiple;
	}

}
