package com.pluralsight;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import fritouni.starter.tests.CreateTaskTest;
import fritouni.starter.tests.DeleteTaskTest;
import fritouni.starter.tests.UpdateTaskTest;
import fritouni.starter.tests.ViewTaskTest;

public class TodoListUnitTests {
	
	private static WebDriver driver;
	private static CreateTaskTest createTaskTest; 
	private static DeleteTaskTest deleteTaskTest;
	private static UpdateTaskTest updateTaskTest;
	private static ViewTaskTest viewTaskTest;
	static String url ="http://localhost:4200";
	static String title = "TodoListUi";
	
	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		createTaskTest = new CreateTaskTest(driver); 
		deleteTaskTest = new DeleteTaskTest(driver); 
		updateTaskTest = new UpdateTaskTest(driver); 
		viewTaskTest = new ViewTaskTest(driver); 
	}

	@Test
	public void toListTest() {
	
		driver.get(url);
		Assert.assertTrue(driver.getTitle().equals(title));
		String createMessage = createTaskTest.createTask();
		assertEquals(createMessage,"Your task has been submitted !");
		createTaskTest.backToList();
		
		String updateMessage = updateTaskTest.updateTask();
		assertEquals(updateMessage,"Your task has been submitted !");
		updateTaskTest.backToList();
		
		viewTaskTest.viewTask();
		driver.getCurrentUrl().contains("view");
		viewTaskTest.backToList();
		
		String deleteMessage = deleteTaskTest.deleteTask();
		assertEquals(deleteMessage, "Your task has been deleted !");
		deleteTaskTest.backToList();
	}
	
	@After
	public void cleanUp() {
		driver.close();	
	}

}
