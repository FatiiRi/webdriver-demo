package fritouni.starter.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ViewTaskTest extends TaskTest{

	public ViewTaskTest(WebDriver driver) {
		super(driver);
	}
	
	public void viewTask() {
		
			WebElement viewTaskLink = driver.findElement(By.id("viewTaskLink"));
			viewTaskLink.click();
		
	}

}
