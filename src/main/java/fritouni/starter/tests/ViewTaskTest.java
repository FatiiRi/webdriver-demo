package fritouni.starter.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ViewTaskTest {
	private WebDriver driver;

	public ViewTaskTest(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void viewTask() {

		try {
			WebElement viewTaskLink = driver.findElement(By.id("viewTaskLink"));
			viewTaskLink.click();
			Thread.sleep(4000);
			WebElement backToListButton = driver.findElement(By.id("backToListBtn")); 
			backToListButton.click();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
