package fritouni.starter.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateTaskTest {

	private WebDriver driver;
	
	public CreateTaskTest(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void createTask() {
		WebElement createTaskButton = driver.findElement(By.id("createTaskBtn"));
		createTaskButton.click();
		
		WebElement nameField = driver.findElement(By.name("taskName"));
		nameField.sendKeys("Selenuim task name");
		
		WebElement descriptionField = driver.findElement(By.name("description"));
		descriptionField.sendKeys("description written by Selenuim");
		
		WebElement userLoginField = driver.findElement(By.name("userLogin"));
		userLoginField.sendKeys("Selenuim");
		
		WebElement createdOnField = driver.findElement(By.name("createdOn"));
		createdOnField.sendKeys("24/04/2020");
	}

}
