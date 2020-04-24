package com.pluralsight;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import fritouni.starter.tests.CreateTaskTest;
import fritouni.starter.tests.DeleteTaskTest;
import fritouni.starter.tests.UpdateTaskTest;
import fritouni.starter.tests.ViewTaskTest;

public class TodoListTests {
	
	private static WebDriver driver;
	private static CreateTaskTest createTaskTest; 
	private static DeleteTaskTest deleteTaskTest;
	private static UpdateTaskTest updateTaskTest;
	private static ViewTaskTest viewTaskTest;

	public static void main(String[] args) {
		
		driver = new FirefoxDriver();
		createTaskTest = new CreateTaskTest(driver); 
		deleteTaskTest = new DeleteTaskTest(driver); 
		updateTaskTest = new UpdateTaskTest(driver); 
		viewTaskTest = new ViewTaskTest(driver); 
		
		driver.get("http://localhost:4200");
		
		try {
			createTaskTest.createTask();
			Thread.sleep(4000);
			updateTaskTest.updateTask();
			Thread.sleep(4000);
			viewTaskTest.viewTask();
			Thread.sleep(4000);
			deleteTaskTest.deleteTask();

			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

	}
}
