package fritouni.starter.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class CreateTaskTest {

	private WebDriver driver;
	
	public CreateTaskTest(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void createTask() {
		try {
			Thread.sleep(4000);
			WebElement createTaskButton = driver.findElement(By.id("createTaskBtn"));
			createTaskButton.click();
			Thread.sleep(2000);
			WebElement nameField = driver.findElement(By.name("taskName"));
			nameField.sendKeys("Selenuim task name");
			
			WebElement descriptionField = driver.findElement(By.name("description"));
			descriptionField.sendKeys("description written by Selenuim");
			
			WebElement userLoginField = driver.findElement(By.name("userLogin"));
			userLoginField.sendKeys("Selenuim");
			
			WebElement createdOnField = driver.findElement(By.name("createdOn"));
			createdOnField.sendKeys("2020-04-24");						
			Thread.sleep(4000);
						 
			WebElement submitButton = driver.findElement(By.id("submitBtn")); 
			submitButton.click();
			
			WebElement validationMessage = driver.findElement(By.id("validationMsg"));
			assertEquals(validationMessage.getText(),"Your task has been submitted !");
			
			WebElement backToListButton = driver.findElement(By.id("backToListBtn")); 
			backToListButton.click();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
