package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.base.BasePage;

public class RegistrationPage extends BasePage {
	
	//Locators on registration PAge Make it private
	
//	@FindBy(xpath="//i[@role=\"img\"]")
//    private WebElement logo;
	
	@FindBy(xpath="//h1[contains(text(),\"Sign in or create account\")]")
	private WebElement SignInOrCreateAccount_txt;
	
	@FindBy(xpath="//div[normalize-space()='Enter your mobile number or email']")
	private WebElement EnterYourMobileNumber_Msg;
	
	@FindBy(xpath="//input[@id=\"ap_email_login\"]")
	private WebElement email_inpt;
	
	@FindBy(id="continue-announce")
	private WebElement Continue_btn;
	
	@FindBy(xpath="//span[@id=\"intention-submit-button-announce\"]")
	private WebElement procedToCreateAnAccount_btn;
	
	@FindBy(xpath="//a[@id=\"ab-registration-ingress-link\"]")
	private WebElement CreateAnFreeBussinessAccount_lnk;
	
	//sub Page OF registrauion Page
	
	@FindBy(xpath="//span[@id=\"intention-submit-button-announce\"]")
	WebElement ProceedToCreateAnAccont_btn;
	
	@FindBy(xpath="//input[@id=\"ap_phone_number\"]")
	WebElement MobileNumber_inpt;
	
	@FindBy(xpath="//input[@id=\"ap_customer_name\"]")
	WebElement FirstNAdLastName_inpt;
	
	@FindBy(xpath="//input[@id=\"continue\"]")
	WebElement VerifyMobileNumber_btn;
	
	
	
	//Getters Methods**************++++++++++++++++++++++++++++++++++++++++++++++++++
	
		public WebElement getProceedToCreateAnAccont_btn() {
			wait.waitForVisibilityOfElement(procedToCreateAnAccount_btn);
		return ProceedToCreateAnAccont_btn;
	}

//		public WebElement getLogo() {
//			wait.waitForVisibilityOfElement(logo);
//		return logo;
//	}

	public WebElement getSignInOrCreateAccount_txt() {
		wait.waitForVisibilityOfElement(SignInOrCreateAccount_txt);
		return SignInOrCreateAccount_txt;
	}

	public WebElement getEnterYourMobileNumber_Msg() {
		wait.waitForVisibilityOfElement(EnterYourMobileNumber_Msg);
		return EnterYourMobileNumber_Msg;
	}

	public WebElement getEmail_inpt() {
		wait.waitForVisibilityOfElement(email_inpt);
		return email_inpt;
	}

	public WebElement getContinue_btn() {
		wait.waitForVisibilityOfElement(Continue_btn);
		return Continue_btn;
	}

	public WebElement getProcedToCreateAnAccount_btn() {
		wait.waitForVisibilityOfElement(procedToCreateAnAccount_btn);
		return procedToCreateAnAccount_btn;
	}

	public WebElement getCreateAnFreeBussinessAccount_lnk() {
		wait.waitForVisibilityOfElement(CreateAnFreeBussinessAccount_lnk);
		return CreateAnFreeBussinessAccount_lnk;
	}
	
	public WebElement getMobileNumber_inpt() {
		wait.waitForVisibilityOfElement(MobileNumber_inpt);
		return MobileNumber_inpt;
	}

	public WebElement getFirstNAdLastName_inpt() {
		wait.waitForVisibilityOfElement(FirstNAdLastName_inpt);
		return FirstNAdLastName_inpt;
	}

	public WebElement getVerifyMobileNumber_btn() {
		wait.waitForElemntToBeClickable(VerifyMobileNumber_btn);
		return VerifyMobileNumber_btn;
	}

//consstructor+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
		public RegistrationPage(WebDriver driver) {
			super(driver);
			PageFactory.initElements(driver, this);
		}
//*******************************************************************************
	    public void verifyEmailAddress(String email) {
	    	 getEmail_inpt().sendKeys(email);
	    	getContinue_btn().click();
	    }
		
		public void verifyMobileNumberFuncationality(String mobilenumber,String name) {
		enterMobileNumber(mobilenumber);
		enterNAmeAndLastanme( name);
		clickOnVerifyMobileNumberBtn();
		
		// TODO Auto-generated method stub
		
	}

	

	public void clickOnsighInlink() {
		// TODO Auto-generated method stub
		
	}

//	public void createBussinessAccountTest() {
//		// TODO Auto-generated method stub
//		
//	}

	public void verfyPrecenceOfElementsOnthePage() {
		// TODO Auto-generated method stub
		
	}
		//Actions***************************************
		
	//Enter Email Address
		public void enterEmailAdress(String  email) {
			getEmail_inpt().sendKeys(email);
		}
		
		//Click On Continue Button
		public void clickOnContinueButton() {
			getContinue_btn().click();
		}
		
		// Click on Create An free Bussiness Accpount Link
		
		public void clickOnCreateBussinessAccountLink() {
			getCreateAnFreeBussinessAccount_lnk().click();
		}
		
		public void clickOnProceedToCreateAnAccont_btn() {
			getProceedToCreateAnAccont_btn().click();
		}
		
		public void enterMobileNumber(String mobileNumber) {
			getFirstNAdLastName_inpt().sendKeys(mobileNumber);
			
		}
		
		public void enterNAmeAndLastanme(String name) {
			getFirstNAdLastName_inpt().sendKeys(name);
		}
		
		public void clickOnVerifyMobileNumberBtn() {
			getVerifyMobileNumber_btn().click();
		}
	}


