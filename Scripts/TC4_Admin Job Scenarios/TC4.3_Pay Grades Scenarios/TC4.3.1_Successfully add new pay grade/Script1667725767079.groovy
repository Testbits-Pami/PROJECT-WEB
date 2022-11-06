import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('TC1_Login Scenarios/TC1.1_Successfully login to Orange HRM'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('0_Common/0.2_Sidebar/SidebarLink_Admin'))

WebUI.click(findTestObject('4_Admin_Page/4.1_Admin_Topbar_Navlinks/List_Job'))

WebUI.click(findTestObject('Object Repository/4_Admin_Page/4.1_Admin_Topbar_Navlinks/4.1.2_Job_ListOptions/ListOption_PayGrades'))

WebUI.click(findTestObject('Page_OrangeHRM/Button_Add_PayGrades'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/Input_Grade_Name'), gradeName)

WebUI.click(findTestObject('Page_OrangeHRM/Button_Save_AddPayGrade'))

WebUI.waitForElementVisible(findTestObject('0_Common/0.3_Toast/Toast_SuccessfullySaved'), 2)

WebUI.click(findTestObject('Page_OrangeHRM/Button_Add_Currencies'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/Span_ListOption_Default_Currencies_Select'))

WebUI.scrollToElement(findTestObject('Page_OrangeHRM/Span_ListOptions_Currencies_MYR'), 0)

WebUI.click(findTestObject('Page_OrangeHRM/Span_ListOptions_Currencies_MYR'))

WebUI.setText(findTestObject('Page_OrangeHRM/Input_MinSalary'), minSalary)

WebUI.setText(findTestObject('Page_OrangeHRM/Input_MaxSalary'), maxSalary)

WebUI.click(findTestObject('Page_OrangeHRM/Button_Save_AddCurrencies'))

WebUI.waitForElementVisible(findTestObject('0_Common/0.3_Toast/Toast_SuccessfullySaved'), 2)

WebUI.verifyElementText(findTestObject('Page_OrangeHRM/Saved_Record_MYR_Currency'), verifyCurrency)

WebUI.click(findTestObject('Page_OrangeHRM/Button_Cancel_EditPayGrade'))

WebUI.scrollToElement(findTestObject('Page_OrangeHRM/Saved_Record_PayGrade', [('gradeName') : gradeName]), 0)

