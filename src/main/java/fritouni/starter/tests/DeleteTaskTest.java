package fritouni.starter.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeleteTaskTest {
	
	private WebDriver driver;

	public DeleteTaskTest(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void deleteTask() {
		WebElement deleteTaskButton = driver.findElement(By.id("deleteTaskBtn"));
		deleteTaskButton.click();
	}

}
