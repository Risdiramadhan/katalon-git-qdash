import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class LoginSteps {

	@Given("User Navigates to Qlue Dashboard login page")
	public void user_Navigates_to_Qlue_Dashboard_login_page() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://beta-dashboard.qluework.com/login?email=&redirect_to=')
	}

	@When("User enters email as {string}")
	public void user_enters_email_as(String email) {
		WebUI.click(findTestObject('OR_Login/input_Email Address_email'))
		WebUI.setText(findTestObject('OR_Login/input_Email Address_email'), 'Prodtest@mailinator.com')
		WebUI.delay(2)
	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String password) {
		WebUI.click(findTestObject('OR_Login/input_Password_password'))
		WebUI.setEncryptedText(findTestObject('OR_Login/input_Password_password'), 'zv7tNTLfY0SaJ855zYDWHw==')
		WebUI.delay(2)
	}

	@When("Click on Log in button")
	public void click_on_Log_in_button() {
		WebUI.click(findTestObject('OR_Login/button_Log in'))
	}

	@Then("User navigated to homepage")
	public void user_navigated_to_homepage() {
		WebUI.verifyElementPresent(findTestObject('OR_Login/Verify Login successfully/div_Analytic'), 2)
	}
}