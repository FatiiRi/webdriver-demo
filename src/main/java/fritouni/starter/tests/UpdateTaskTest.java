package fritouni.starter.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpdateTaskTest extends TaskTest{

	public UpdateTaskTest(WebDriver driver) {
		super(driver);
	}
	
	public String updateTask() {
		
		WebElement updateTaskButton = driver.findElement(By.id("updateTaskBtn"));
		updateTaskButton.click();
		
		WebElement nameField = driver.findElement(By.name("taskName"));
		nameField.sendKeys(" Updated");
		
		WebElement descriptionField = driver.findElement(By.name("description"));
		descriptionField.sendKeys(" Updated");
		
		WebElement isDoneCheckBox = driver.findElement(By.name("isDone"));
		isDoneCheckBox.click();		
		 
		WebElement submitButton = driver.findElement(By.id("submitBtn")); 
		submitButton.click();
		
		WebElement validationMessage = driver.findElement(By.id("validationMsg"));
	
		return validationMessage.getText();
				
	}

}
