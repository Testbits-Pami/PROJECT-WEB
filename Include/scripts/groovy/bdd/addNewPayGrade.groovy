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



class PayGrade {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I successfully navigate to Pay Grades Page")
	def I_navigate_to_admin_pay_grades_page() {
		WebUI.click(findTestObject('0_Common/0.2_Sidebar/SidebarLink_Admin'))
		WebUI.click(findTestObject('4_Admin_Page/4.1_Admin_Topbar_Navlinks/List_Job'))
		WebUI.click(findTestObject('Object Repository/4_Admin_Page/4.1_Admin_Topbar_Navlinks/4.1.2_Job_ListOptions/ListOption_PayGrades'))
	}

	@When("I click Add button on Pay Grades page to add a new pay grade")
	def I_click_add_button_on_add_pay_grade_page() {
		WebUI.click(findTestObject('4_Admin_Page/4.4_Admin_Job_PayGrades_Page/4.4.1_PayGrades_Section/Button_Add_PayGrades'))
	}

	@And("I enter a new pay grade name (.*)")
	def I_enter_a_new_pay_grade_name(String gradeName) {
		WebUI.setText(findTestObject('Object Repository/4_Admin_Page/4.4_Admin_Job_PayGrades_Page/4.4.2_AddPayGrade_Section/Input_Grade_Name'),
				gradeName)
	}

	@And("I click Save button to save the pay grade name")
	def I_click_save_button_to_save_the_pay_grade_name() {
		WebUI.click(findTestObject('4_Admin_Page/4.4_Admin_Job_PayGrades_Page/4.4.2_AddPayGrade_Section/Button_Save_AddPayGrade'))
	}

	@Then("I successfully add a new pay grade name and bring to edit pay grade page")
	def I_successfully_verify_new_pay_grade_name() {
		WebUI.waitForElementVisible(findTestObject('0_Common/0.3_Toast/Toast_SuccessfullySaved'), 2)
	}

	@When("I click Add button on the currencies section to add a new currency for the pay grade")
	def I_click_add_currency_for_the_pay_grade() {
		WebUI.click(findTestObject('4_Admin_Page/4.4_Admin_Job_PayGrades_Page/4.4.4_Currencies_Section/Button_Add_Currencies'))
	}

	@And("I choose MYR - Malaysian Ringgit for the currency of the pay grade")
	def I_choose_the_currency_code_for_the_pay_grade() {
		WebUI.click(findTestObject('Object Repository/4_Admin_Page/4.4_Admin_Job_PayGrades_Page/4.4.4_Currencies_Section/Span_ListOption_Default_Currencies_Select'))
		WebUI.scrollToElement(findTestObject('4_Admin_Page/4.4_Admin_Job_PayGrades_Page/4.4.4_Currencies_Section/Span_ListOptions_Currencies_MYR'),0)
		WebUI.click(findTestObject('4_Admin_Page/4.4_Admin_Job_PayGrades_Page/4.4.4_Currencies_Section/Span_ListOptions_Currencies_MYR'))
	}

	@And("I enter minimum salary (.*) for the pay grade and I enter maximum salary (.*) for the pay grade")
	def I_enter_min_and_max_salary_for_the_pay_grade(String minSalary, String maxSalary) {
		WebUI.setText(findTestObject('4_Admin_Page/4.4_Admin_Job_PayGrades_Page/4.4.4_Currencies_Section/Input_MinSalary'), minSalary)
		WebUI.setText(findTestObject('4_Admin_Page/4.4_Admin_Job_PayGrades_Page/4.4.4_Currencies_Section/Input_MaxSalary'), maxSalary)
	}

	@And("I click Save button to save the currency for the pay grade")
	def I_click_save_button_for_the_pay_grade_currency_code() {
		WebUI.click(findTestObject('4_Admin_Page/4.4_Admin_Job_PayGrades_Page/4.4.4_Currencies_Section/Button_Save_AddCurrencies'))
	}

	@Then("I successfully added the new currency and verify the currency (.*) in the currency records")
	def I_successfully_added_the_new_currency_and_verify(String verifyCurrency) {
		WebUI.waitForElementVisible(findTestObject('0_Common/0.3_Toast/Toast_SuccessfullySaved'), 2)
		WebUI.verifyElementText(findTestObject('4_Admin_Page/4.4_Admin_Job_PayGrades_Page/4.4.4_Currencies_Section/Saved_Record_MYR_Currency'),verifyCurrency)
	}

	@When("I click Cancel button on the edit pay grade section")
	def I_click_cancel_button_on_edit_pay_grade_section() {
		WebUI.click(findTestObject('4_Admin_Page/4.4_Admin_Job_PayGrades_Page/4.4.3_EditPayGrade_Section/Button_Cancel_EditPayGrade'))
	}
	
	@Then("I verify the new pay grade name (.*) on the pay grade records")
	def I_verify_the_new_pay_grade_on_the_pay_grade_records(String gradeName) {
		WebUI.scrollToElement(findTestObject('4_Admin_Page/4.4_Admin_Job_PayGrades_Page/4.4.1_PayGrades_Section/Saved_Record_PayGrade',
			[('gradeName') : gradeName]), 0)
	}
}