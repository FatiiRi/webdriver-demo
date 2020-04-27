package fritouni.starter.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeleteTaskTest extends TaskTest {
	
	public DeleteTaskTest(WebDriver driver) {
		super(driver);
	}
	
	public String deleteTask() {
		WebElement deleteTaskButton = driver.findElements(By.id("deleteTaskBtn")).get(0);
		deleteTaskButton.click();
		
		WebElement validationMessage = driver.findElement(By.id("validationMsg"));
		return validationMessage.getText();
	}

}
