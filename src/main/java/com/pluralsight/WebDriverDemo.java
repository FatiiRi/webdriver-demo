package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverDemo {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver", "C:\\devtools\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		//driver.get("http://www.pluralsight.com");
		driver.get("http://www.google.com");
		WebElement searchField = driver.findElement(By.name("q"));
		searchField.sendKeys("PluralSight");
		//clear, click, findElement, finElements, getAttribute , get CssValue, sendKeys, submit
		//isDisplayed, isEnabled, getLocation , isSelected, getSize, getTagName, getText
		searchField.submit();
		
		WebElement imagesLink = driver.findElements(By.linkText("Images")).get(0);
		imagesLink.click();
		
		WebElement imageElement = driver.findElements(By.cssSelector("a[class = gb_D]")).get(0);
		WebElement imageLink = imageElement.findElements(By.tagName("img")).get(0);
		imageLink.click();
		
		//driver.getPageSource().contains("String i want to search for");
		
	}

}
