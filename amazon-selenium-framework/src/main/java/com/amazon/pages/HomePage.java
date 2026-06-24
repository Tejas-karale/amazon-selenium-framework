package com.amazon.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.base.BasePage;

public class HomePage extends BasePage{

	private Actions action;
	//Account And List DropDownbutton
	
	@FindBy(xpath="//div//span[contains(text(),\"Account & Lists\")]")
	public WebElement AccountAndLists;
	
	//Sign In Button
	
	@FindBy(xpath="//div[@id=\"nav-flyout-ya-signin\"]")
	public WebElement SignIn_btn;
	
	//newCustomerStrtHere
	
	@FindBy(xpath="//div[@id=\"nav-flyout-ya-newCust\"]")
	public WebElement NewCustomeStartHere_lnk;
	
	//consstructor
	
	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		 action= new Actions(driver);
	}
	
	
	public WebElement getAccountAndLists() {
		wait.waitForVisibilityOfElement(AccountAndLists);
		return AccountAndLists;
	}


	public WebElement getSignIn_btn() {
		wait.waitForInvisibilityOFElemnt(SignIn_btn);
		return SignIn_btn;
	}


	public WebElement getNewCustomeStartHere_lnk() {
		wait.waitForVisibilityOfElement(NewCustomeStartHere_lnk);
		return NewCustomeStartHere_lnk;
	}

//Actions Methods
	//open Registration Page
	public void openRegistrationpage() {
		action.moveToElement(getAccountAndLists()).perform();
		//
	}

	public void openSignInpage() {
		// TODO Auto-generated method stub
		action.moveToElement(getAccountAndLists()).perform();
        SignIn_btn.click();
	}

//	public String getTitleOfThePage() {
//		// TODO Auto-generated method stub
//		return "String";
//        // return driver.getTitle(); ;
//}
}