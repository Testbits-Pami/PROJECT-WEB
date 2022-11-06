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

WebUI.click(findTestObject('Object Repository/4_Admin_Page/4.1_Admin_Topbar_Navlinks/4.1.2_Job_ListOptions/ListOption_PayGrades'))

WebUI.click(findTestObject('4_Admin_Page/4.4_Admin_Job_PayGrades_Page/4.4.1_PayGrades_Section/Button_Add_PayGrades'))

WebUI.setText(findTestObject('Object Repository/4_Admin_Page/4.4_Admin_Job_PayGrades_Page/4.4.2_AddPayGrade_Section/Input_Grade_Name'), 
    gradeName)

WebUI.click(findTestObject('4_Admin_Page/4.4_Admin_Job_PayGrades_Page/4.4.2_AddPayGrade_Section/Button_Save_AddPayGrade'))

WebUI.verifyElementText(findTestObject('4_Admin_Page/4.4_Admin_Job_PayGrades_Page/4.4.1_PayGrades_Section/Span_AlreadyExists_PayGrade_InvalidMsg'), invalidPayGradeNameMsg)

WebUI.verifyElementAttributeValue(findTestObject('4_Admin_Page/4.4_Admin_Job_PayGrades_Page/4.4.2_AddPayGrade_Section/Input_Grade_Name'), 
    'class', 'oxd-input oxd-input--active oxd-input--error', 2)

WebUI.closeBrowser()

