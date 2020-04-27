package fritouni.starter.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TaskTest {
	
	public WebDriver driver;

	public void backToList() {
		WebElement backToListButton = driver.findElement(By.id("backToListBtn")); 
		backToListButton.click();
	}

	public TaskTest(WebDriver driver) {
		this.driver = driver;
	}
	
	
}
