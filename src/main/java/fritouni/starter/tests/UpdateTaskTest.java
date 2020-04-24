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
		WebElement updateTaskButton = driver.findElement(By.id("deleteTaskBtn"));
		updateTaskButton.click();
	}

}
