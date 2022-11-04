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

WebUI.click(findTestObject('4_Admin_Page/4.1_Admin_Topbar_Navlinks/List_Job'))

WebUI.click(findTestObject('4_Admin_Page/4.1_Admin_Topbar_Navlinks/4.1.2_Job_ListOptions/ListOption_JobTitles'))

WebUI.waitForElementVisible(findTestObject('4_Admin_Page/4.3_Admin_Job_JobTitles_Page/4.3.1_Job Titles Section/Header_JobTitles'), 
    0)

WebUI.click(findTestObject('4_Admin_Page/4.3_Admin_Job_JobTitles_Page/4.3.1_Job Titles Section/Button_AddJobTitle'))

WebUI.waitForElementVisible(findTestObject('4_Admin_Page/4.3_Admin_Job_JobTitles_Page/4.3.2_Add Job Title Section/Header_AddJobTitle'), 
    0)

WebUI.click(findTestObject('4_Admin_Page/4.3_Admin_Job_JobTitles_Page/4.3.2_Add Job Title Section/Button_SaveJobTitle'))

WebUI.verifyElementText(findTestObject('Page_OrangeHRM/Span_Required_JobTitle_InvalidMsg'), requiredInvalidMsg)

WebUI.setText(findTestObject('4_Admin_Page/4.3_Admin_Job_JobTitles_Page/4.3.2_Add Job Title Section/Input_JobTitle'), jobTitle)

WebUI.verifyElementText(findTestObject('Page_OrangeHRM/Span_Already_Exists_JobTitle_InvalidMsg'), existInvalidMsg)

WebUI.uploadFile(findTestObject('4_Admin_Page/4.3_Admin_Job_JobTitles_Page/4.3.2_Add Job Title Section/Input_File_AddJobTitle'), 
    GlobalVariable.path + jobFile)

WebUI.verifyElementText(findTestObject('Page_OrangeHRM/Span_Attachment_Size_Exceeded_InvalidMsg'), exceededInvalidMsg)

