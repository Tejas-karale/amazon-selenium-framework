package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.base.BasePage;

public class SignInPage extends BasePage {
	
	//Locators  or Web elemnts on sign in page
	
	@FindBy(xpath="//h1[contains(text(),\"Sign in or create account\")]")
	private WebElement SignInOrcreateAccount_txt;
	
	
	@FindBy(xpath="//input[@id=\"ap_email_login\"]")
	private WebElement EnterMobileNumberOremail_txtField;
	
	@FindBy(xpath="//span[@id=\"continue\"]")
	private WebElement Continue_btn;
	
	@FindBy(xpath="//input[@id=\"ap_password\"]")
	private WebElement Password_textfield;
	
	@FindBy(xpath="//input[@id=\"signInSubmit\"]")
	private WebElement Signin_btn;


	
	
	//constructor
			public SignInPage(WebDriver driver) {
				super(driver);
				PageFactory.initElements(driver, this);
			}

	
	
	//Getter Method for sign in page
	public WebElement getSignInOrcreateAccount() {
		wait.waitForVisibilityOfElement(SignInOrcreateAccount_txt);
		return SignInOrcreateAccount_txt;
	}

	public WebElement getEnterMobileNumberOremail() {
		wait.waitForVisibilityOfElement(EnterMobileNumberOremail_txtField);;
		return EnterMobileNumberOremail_txtField;
	}


	public WebElement getContinue_btn() {
		wait.waitForVisibilityOfElement(Continue_btn);
		return Continue_btn;
	}

	public WebElement getPassword_textField() {
		wait.waitForVisibilityOfElement(Password_textfield);
		return Password_textfield;
	}

	public WebElement getSignIn_btn() {
		wait.waitForVisibilityOfElement(Signin_btn);
		return Signin_btn;
	}

	
		//Page Actions
		
		
	public void enterEmailId(String string) {
		getEnterMobileNumberOremail().sendKeys(string);
		getContinue_btn().click();
//		getPassword_textField().sendKeys(password);
//		getSignIn_btn().click();
	
	}

	public void clickOnContinueButton() {
		// TODO Auto-generated method stub
		
	}

	public String getUnregisteredEmailIdError() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getInvalidEmailIdError() {
		// TODO Auto-generated method stub
		return null;
	}

	public void signInwithValidCredentials(String string, String password) {
		// TODO Auto-generated method stub
		getEnterMobileNumberOremail().sendKeys(string);
		getContinue_btn().click();
		getPassword_textField().sendKeys(password);
		getSignIn_btn().click();
		
	}

	public void verfyPrecenceOfElementsOnthePage() {
		// TODO Auto-generated method stub
		
	}

}
