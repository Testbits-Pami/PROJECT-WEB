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

WebUI.click(findTestObject('0_Common/0.2_Sidebar/SidebarLink_Admin'))

WebUI.click(findTestObject('Page_OrangeHRM/List_Job'))

WebUI.click(findTestObject('Page_OrangeHRM/ListOption_JobTitles'))

WebUI.waitForElementVisible(findTestObject('Page_OrangeHRM/Header_JobTitles'), 0)

WebUI.click(findTestObject('Page_OrangeHRM/Button_AddJobTitle'))

WebUI.waitForElementVisible(findTestObject('Page_OrangeHRM/Header_AddJobTitle'), 0)

WebUI.setText(findTestObject('Page_OrangeHRM/Input_JobTitle'), jobTitle)

WebUI.setText(findTestObject('Page_OrangeHRM/Input_txtArea_JobDescription'), jobDescription)

WebUI.uploadFile(findTestObject('Page_OrangeHRM/Input_File_AddJobTitle'), GlobalVariable.path + file)

WebUI.setText(findTestObject('Page_OrangeHRM/Input_txtArea_JobNote'), jobNote)

WebUI.click(findTestObject('Page_OrangeHRM/Button_SaveJobTitle'))

WebUI.waitForElementVisible(findTestObject('0_Common/0.3_Toast/Toast_SuccessfullySaved'), 0)

WebUI.waitForElementVisible(findTestObject('Page_OrangeHRM/Header_JobTitles'), 0)

WebUI.scrollToElement(findTestObject('Page_OrangeHRM/NearElement_Saved_JobTitle', [('jobTitle') : jobTitle]), 0)

WebUI.verifyElementText(findTestObject('Page_OrangeHRM/Element_Saved_JobTitle', [('jobTitle') : jobTitle]), jobTitle)

