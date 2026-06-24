package com.amazon.utils;

import java.time.Duration;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomWait {

	
	private WebDriver driver;
	private WebDriverWait wait;
	
	public CustomWait(WebDriver driver,Duration Timeout) {
		this.driver=driver;
		this.wait =new WebDriverWait(driver,Timeout);
		
	}
	
	//wait for An element To Be Visible
	
	public void waitForVisibilityOfElement(WebElement element) {
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
		
		}
		catch(TimeoutException e) {
			e.printStackTrace();
			System.err.println("element is not visibel after waiting"+e.getMessage());
		}
		
		
		}
	
	//wait for An Elemnt To Be Visibel 
	
	public void waitForElemntToBeClickable(WebElement element) {
		try{
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}catch(TimeoutException e) {
			
			e.printStackTrace();
            System.err.println("elemnt is not clickable after waiting"+e.getMessage());
		}
		
	}
	
	//wait Until Element IS invisibble
	
	public void waitForInvisibilityOFElemnt(WebElement element) {
		
		try {
			wait.until(ExpectedConditions.invisibilityOf(element));
		}catch(TimeoutException e) {
			e.printStackTrace();
         System.err.println("Elemnt Is Visibel After Waiting");
		}
			
		}
	}

	

