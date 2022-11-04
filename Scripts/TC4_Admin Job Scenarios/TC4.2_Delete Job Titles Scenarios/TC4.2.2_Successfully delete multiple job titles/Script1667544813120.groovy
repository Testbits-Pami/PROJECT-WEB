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

def testDataRowNum = findTestData('Delete Multiple Job Title').getRowNumbers()

for (def rowNum = 1; rowNum <= testDataRowNum; rowNum++) {
    WebUI.scrollToElement(findTestObject('4_Admin_Page/4.3_Admin_Job_JobTitles_Page/4.3.1_Job Titles Section/NearElement_Saved_JobTitle', 
            [('jobTitle') : findTestData('Delete Multiple Job Title').getValue('Job Title', rowNum)]), 3)

    WebUI.click(findTestObject('4_Admin_Page/4.3_Admin_Job_JobTitles_Page/4.3.1_Job Titles Section/Checkbox_Element_Saved_JobTitle', 
            [('jobTitle') : findTestData('Delete Multiple Job Title').getValue('Job Title', rowNum)]))
}

WebUI.scrollToElement(findTestObject('4_Admin_Page/4.3_Admin_Job_JobTitles_Page/4.3.1_Job Titles Section/Span_Records_Selected', 
        [('jobTitleQty') : rowNum.toString()]), 3)

WebUI.verifyElementVisible(findTestObject('4_Admin_Page/4.3_Admin_Job_JobTitles_Page/4.3.1_Job Titles Section/Button_Delete_Selected'))

WebUI.click(findTestObject('4_Admin_Page/4.3_Admin_Job_JobTitles_Page/4.3.1_Job Titles Section/Button_Delete_Selected'))

WebUI.waitForElementVisible(findTestObject('4_Admin_Page/4.3_Admin_Job_JobTitles_Page/4.3.1_Job Titles Section/Button_Delete_JobTitle'), 
    3)

WebUI.click(findTestObject('4_Admin_Page/4.3_Admin_Job_JobTitles_Page/4.3.1_Job Titles Section/Button_Delete_JobTitle'))

WebUI.waitForElementVisible(findTestObject('0_Common/0.3_Toast/Toast_SuccessfullyDeleted'), 3)

for (def rowNum = 1; rowNum <= findTestData('Delete Multiple Job Title').getRowNumbers(); rowNum++) {
    WebUI.scrollToElement(findTestObject('4_Admin_Page/4.3_Admin_Job_JobTitles_Page/4.3.1_Job Titles Section/Element_Saved_JobTitle', 
            [('jobTitle') : findTestData('Delete Multiple Job Title').getValue('Job Title', rowNum)]), 1, FailureHandling.OPTIONAL)
}

