package fritouni.starter.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateTaskTest extends TaskTest{
	
	public CreateTaskTest(WebDriver driver) {
		super(driver);
	}

	public String createTask() {

			WebElement createTaskButton = driver.findElement(By.id("createTaskBtn"));
			createTaskButton.click();

			WebElement nameField = driver.findElement(By.name("taskName"));
			nameField.sendKeys("Selenuim task name");
			
			WebElement descriptionField = driver.findElement(By.name("description"));
			descriptionField.sendKeys("description written by Selenuim");
			
			WebElement userLoginField = driver.findElement(By.name("userLogin"));
			userLoginField.sendKeys("Selenuim");
			
			WebElement createdOnField = driver.findElement(By.name("createdOn"));
			createdOnField.sendKeys("2020-04-24");						
						 
			WebElement submitButton = driver.findElement(By.id("submitBtn")); 
			submitButton.click();
		
			WebElement validationMessage = driver.findElement(By.id("validationMsg"));
			
			return validationMessage.getText();
	}

}
