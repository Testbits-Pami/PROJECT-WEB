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

WebUI.click(findTestObject('4_Admin_Page/4.2_Admin_UserManagement_User_Page/4.2.2_User_Search_Results_Section/button_Add_New_User'))

WebUI.waitForElementVisible(findTestObject('4_Admin_Page/4.2_Admin_UserManagement_User_Page/4.2.3_Add_User_Section/Title_Add_User_Section'), 
    3)

WebUI.click(findTestObject('4_Admin_Page/4.2_Admin_UserManagement_User_Page/4.2.3_Add_User_Section/List_User_Role'))

WebUI.click(findTestObject('4_Admin_Page/4.2_Admin_UserManagement_User_Page/4.2.3_Add_User_Section/4.2.3.1_UserRole_ListOptions/ListOption_UserRole', 
        [('userRole') : userRole]))

WebUI.setText(findTestObject('4_Admin_Page/4.2_Admin_UserManagement_User_Page/4.2.3_Add_User_Section/Input_Employee_Name'), 
    newEmployeeFirstName)

WebUI.click(findTestObject('4_Admin_Page/4.2_Admin_UserManagement_User_Page/4.2.3_Add_User_Section/4.2.3.2_Hints_Employee_Name/HintsOption_Employee_Name', 
        [('newEmployeeName') : newEmployeeName]))

WebUI.click(findTestObject('4_Admin_Page/4.2_Admin_UserManagement_User_Page/4.2.3_Add_User_Section/List_Status'))

WebUI.click(findTestObject('4_Admin_Page/4.2_Admin_UserManagement_User_Page/4.2.3_Add_User_Section/4.2.3.3_Status_ListOptions/ListOption_Status', 
        [('userStatus') : userStatus]))

WebUI.setText(findTestObject('4_Admin_Page/4.2_Admin_UserManagement_User_Page/4.2.3_Add_User_Section/Input_NewUser_Username'), 
    newUsername)

WebUI.setEncryptedText(findTestObject('4_Admin_Page/4.2_Admin_UserManagement_User_Page/4.2.3_Add_User_Section/Input_NewUser_Password'), 
    newPwd)

WebUI.setEncryptedText(findTestObject('4_Admin_Page/4.2_Admin_UserManagement_User_Page/4.2.3_Add_User_Section/Input_NewUser_ConfirmPwd'), 
    newPwd)

WebUI.click(findTestObject('4_Admin_Page/4.2_Admin_UserManagement_User_Page/4.2.3_Add_User_Section/button_Save_New_User'))

WebUI.waitForElementVisible(findTestObject('0_Common/0.3_Toast/Toast_SuccessfullySaved'), 3)

