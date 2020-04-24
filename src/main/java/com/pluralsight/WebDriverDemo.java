package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		//driver.get("http://www.pluralsight.com");
		driver.get("http://www.google.com");
		WebElement searchField = driver.findElement(By.name("q"));
		searchField.sendKeys("PluralSight");
		searchField.submit();
		
		WebElement imagesLink = driver.findElements(By.linkText("Images")).get(0);
		imagesLink.click();
		
		WebElement imageElement = driver.findElements(By.cssSelector("a[class = gb_D]")).get(0);
		WebElement imageLink = imageElement.findElements(By.tagName("img")).get(0);
		imageLink.click();
	
	}

}
