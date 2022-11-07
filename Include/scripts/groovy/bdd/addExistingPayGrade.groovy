package bdd
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



class addExistingPayGrade {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I navigate to Admin Add Pay Grade page")
	def I_navigate_to_admin_add_pay_grade_page() {
		WebUI.click(findTestObject('0_Common/0.2_Sidebar/SidebarLink_Admin'))
		WebUI.click(findTestObject('4_Admin_Page/4.1_Admin_Topbar_Navlinks/List_Job'))
		WebUI.click(findTestObject('Object Repository/4_Admin_Page/4.1_Admin_Topbar_Navlinks/4.1.2_Job_ListOptions/ListOption_PayGrades'))
	}

	@When("I click Add button to add an existing pay grade")
	def I_click_add_button_to_add_an_existing_pay_grade() {
		WebUI.click(findTestObject('4_Admin_Page/4.4_Admin_Job_PayGrades_Page/4.4.1_PayGrades_Section/Button_Add_PayGrades'))
	}

	@And("I enter the existing pay grade name (.*)")
	def I_enter_the_existing_pay_grade_name(String gradeName) {
		WebUI.setText(findTestObject('Object Repository/4_Admin_Page/4.4_Admin_Job_PayGrades_Page/4.4.2_AddPayGrade_Section/Input_Grade_Name'),gradeName)
	}

	@And("I try to save the existing pay grade name")
	def I_try_to_save_the_existing_pay_grade_name() {
		WebUI.click(findTestObject('4_Admin_Page/4.4_Admin_Job_PayGrades_Page/4.4.2_AddPayGrade_Section/Button_Save_AddPayGrade'))
	}

	@Then("I verify the (.*) message on the input and verify the input error attributes")
	def I_verify_invalid_msg_and_error_attr(String invalidPayGradeNameMsg) {
		WebUI.verifyElementText(findTestObject('4_Admin_Page/4.4_Admin_Job_PayGrades_Page/4.4.1_PayGrades_Section/Span_AlreadyExists_PayGrade_InvalidMsg'), invalidPayGradeNameMsg)
		WebUI.verifyElementAttributeValue(findTestObject('4_Admin_Page/4.4_Admin_Job_PayGrades_Page/4.4.2_AddPayGrade_Section/Input_Grade_Name'),
				'class', 'oxd-input oxd-input--active oxd-input--error', 2)
		WebUI.closeBrowser()
	}
}