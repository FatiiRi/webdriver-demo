package fritouni.starter.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpdateTaskTest {
	private WebDriver driver;

	public UpdateTaskTest(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void updateTask() {
		WebElement updateTaskButton = driver.findElement(By.id("updateTaskBtn"));
		updateTaskButton.click();
		
		WebElement nameField = driver.findElement(By.name("taskName"));
		nameField.sendKeys(" Updated");
		
		WebElement descriptionField = driver.findElement(By.name("description"));
		descriptionField.sendKeys(" Updated");
		
		WebElement isDoneCheckBox = driver.findElement(By.name("isDone"));
		isDoneCheckBox.click();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 
		WebElement submitButton = driver.findElement(By.id("submitBtn")); 
		submitButton.click();
		
		WebElement backToListButton = driver.findElement(By.id("backToListBtn")); 
		backToListButton.click();
		
	}

}
