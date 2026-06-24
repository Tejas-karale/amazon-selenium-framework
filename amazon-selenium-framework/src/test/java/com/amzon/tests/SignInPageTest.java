package com.amzon.tests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.basetest.BaseTest;

public class SignInPageTest extends BaseTest {

	
	@BeforeMethod (alwaysRun=true)
	public void setUpPage() {
		//open the Registration Page from Home Page Of Amazon
		homepage.openRegistrationpage();
		homepage.openSignInpage();
		
	}
	
	@Test
	public void isLogoPresentTest() {
		Assert.assertTrue(signInPage.verifyLogo(),"Error ---Logo IS nOt Present");
	}
	
	@Test
	public void pageTitleTest() {
		assertEquals(signInPage.getTitleOfThePage(),"Sign in PAge","Amazon Registration Page title Doesnot Match");
		//assertEquals(registrationPage.getTitleOfThePage(), "Amazon Registration","Page Title Does Not Matched expected Page Title"+registrationPage.getTitle());
	}
	
	
	/*
	 * back And Forth Scenario Navigate BAck and Verify Prevoius Page Naviage back
	 * And Verify The Sign In Page Refresh The PAge And Verify if We Anvigate TO
	 * Same page
	 */
	
	
	@Test
	public void backAndForthScenarioTest() {
		basepage.navigateToBack();
		{
			Assert.assertEquals(homepage.getTitleOfThePage(), "Online Shoping title");
		}
		basepage.naviagetToForward();
		Assert.assertEquals(signInPage.getTitleOfThePage(), "Amazon Sing page title");
		basepage.refresh();
		Assert.assertEquals(signInPage.getTitleOfThePage(), "Amazon Sing page title");
		
	}

	//Sign In with Unregistered Email Id
	
	@Test
	public void signInwithUnregisteredEmailId() {
		signInPage.enterEmailId("Abc@gamial.com");
		signInPage.clickOnContinueButton();
		Assert.assertEquals(signInPage.getUnregisteredEmailIdError(), "We Can Not Find the aacount With The email");
		
	}
	
	//Sign In With inValid Email id test
	@Test
	public void signInWithInvalidEmailIdTest() {
		signInPage.enterEmailId("Ivalid Email");
		signInPage.clickOnContinueButton();
        Assert.assertEquals(signInPage.getInvalidEmailIdError(), "Invalid Email Id Error");
	}
	
	//sign in With Avlid Credentials
	
	@Test (groups = {"regression"})
	public void signInwithValidCredentialsTest() {
		signInPage.signInwithValidCredentials("Id","Password");
		//Assert sign In successfullay
	}
	
	//Verify the fiels/links/buttons Inthe Home PAge
	@Test
	public void fieldsOnthePagetest() {
		signInPage.verfyPrecenceOfElementsOnthePage();
	}
	
	
}
