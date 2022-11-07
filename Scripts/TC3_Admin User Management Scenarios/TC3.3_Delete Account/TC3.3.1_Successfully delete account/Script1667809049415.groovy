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

WebUI.click(findTestObject('4_Admin_Page/4.1_Admin_Topbar_Navlinks/List_UserManagement'))

WebUI.click(findTestObject('4_Admin_Page/4.1_Admin_Topbar_Navlinks/4.1.1_UserManagement_ListOptions/ListOption_Users'))

for (def rowNum = 1; rowNum <= findTestData(datafileInput).getRowNumbers(); rowNum++) {
    username = findTestData(datafileInput).getValue('Existing Username', rowNum)

    WebUI.sendKeys(findTestObject('4_Admin_Page/4.2_Admin_UserManagement_User_Page/4.2.1_System_Users_Section/Input_SystemUser_Username'), 
        Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

    WebUI.setText(findTestObject('4_Admin_Page/4.2_Admin_UserManagement_User_Page/4.2.1_System_Users_Section/Input_SystemUser_Username'), 
        username)

    WebUI.click(findTestObject('4_Admin_Page/4.2_Admin_UserManagement_User_Page/4.2.1_System_Users_Section/Button_SystemUser_Search'))

    WebUI.waitForElementVisible(findTestObject('4_Admin_Page/4.2_Admin_UserManagement_User_Page/4.2.2_User_Search_Results_Section/RowResult_Username', 
            [('username') : username]), 0)

    WebUI.click(findTestObject('4_Admin_Page/4.2_Admin_UserManagement_User_Page/4.2.2_User_Search_Results_Section/Checkbox_RowResult_Username', [('username') : username]))

    WebUI.click(findTestObject('4_Admin_Page/4.2_Admin_UserManagement_User_Page/4.2.2_User_Search_Results_Section/Button_TrashCan_RowResult_Username', [('username') : username]))

    WebUI.waitForElementVisible(findTestObject('4_Admin_Page/4.2_Admin_UserManagement_User_Page/4.2.1_System_Users_Section/Button_Delete_Username'), 3)

    WebUI.click(findTestObject('4_Admin_Page/4.2_Admin_UserManagement_User_Page/4.2.1_System_Users_Section/Button_Delete_Username'))

    WebUI.waitForElementVisible(findTestObject('0_Common/0.3_Toast/Toast_SuccessfullyDeleted'), 3)
}