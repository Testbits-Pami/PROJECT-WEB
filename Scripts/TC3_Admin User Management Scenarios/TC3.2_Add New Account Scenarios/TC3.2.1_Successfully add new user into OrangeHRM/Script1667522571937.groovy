import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('0_Common/0.2_Sidebar/SidebarLink_Admin'))

WebUI.click(findTestObject('4_Admin_Page/4.1_Admin_Topbar_Navlinks/List_UserManagement'))

WebUI.click(findTestObject('4_Admin_Page/4.1_Admin_Topbar_Navlinks/4.1.1_UserManagement_ListOptions/ListOption_Users'))

datapath = (GlobalVariable.path + datafile)

for (def rowNum = 1; rowNum <= findTestData(datafileInput).getRowNumbers(); rowNum++) {
    WebUI.click(findTestObject('4_Admin_Page/4.2_Admin_UserManagement_User_Page/4.2.2_User_Search_Results_Section/button_Add_New_User'))

    WebUI.waitForElementVisible(findTestObject('4_Admin_Page/4.2_Admin_UserManagement_User_Page/4.2.3_Add_User_Section/Title_Add_User_Section'), 
        3)

    WebUI.click(findTestObject('4_Admin_Page/4.2_Admin_UserManagement_User_Page/4.2.3_Add_User_Section/List_User_Role'))

    WebUI.click(findTestObject('4_Admin_Page/4.2_Admin_UserManagement_User_Page/4.2.3_Add_User_Section/4.2.3.1_UserRole_ListOptions/ListOption_UserRole', 
            [('userRole') : findTestData(datafileInput).getValue('User Role', rowNum)]))

    WebUI.setText(findTestObject('4_Admin_Page/4.2_Admin_UserManagement_User_Page/4.2.3_Add_User_Section/Input_Employee_Name'), 
        findTestData(datafileInput).getValue('Employee First Name', rowNum))

    WebUI.click(findTestObject('4_Admin_Page/4.2_Admin_UserManagement_User_Page/4.2.3_Add_User_Section/4.2.3.2_Hints_Employee_Name/HintsOption_Employee_Name', 
            [('newEmployeeName') : findTestData(datafileInput).getValue('Employee Name', rowNum)]))

    WebUI.click(findTestObject('4_Admin_Page/4.2_Admin_UserManagement_User_Page/4.2.3_Add_User_Section/List_Status'))

    WebUI.click(findTestObject('4_Admin_Page/4.2_Admin_UserManagement_User_Page/4.2.3_Add_User_Section/4.2.3.3_Status_ListOptions/ListOption_Status', 
            [('userStatus') : findTestData(datafileInput).getValue('Status', rowNum)]))

    WebUI.setText(findTestObject('4_Admin_Page/4.2_Admin_UserManagement_User_Page/4.2.3_Add_User_Section/Input_NewUser_Username'), 
        findTestData(datafileInput).getValue('Username', rowNum))

    username = WebUI.getAttribute(findTestObject('4_Admin_Page/4.2_Admin_UserManagement_User_Page/4.2.3_Add_User_Section/Input_NewUser_Username'), 
        'value')

    WebUI.setEncryptedText(findTestObject('4_Admin_Page/4.2_Admin_UserManagement_User_Page/4.2.3_Add_User_Section/Input_NewUser_Password'), 
        findTestData(datafileInput).getValue('Password', rowNum))

    WebUI.setEncryptedText(findTestObject('4_Admin_Page/4.2_Admin_UserManagement_User_Page/4.2.3_Add_User_Section/Input_NewUser_ConfirmPwd'), 
        findTestData(datafileInput).getValue('Password', rowNum))

    CustomKeywords.'web.ProjectWeb.writeUnameToExcel'(datapath, usedsheet, username, rowNum)

    WebUI.click(findTestObject('4_Admin_Page/4.2_Admin_UserManagement_User_Page/4.2.3_Add_User_Section/button_Save_New_User'))

    WebUI.waitForElementVisible(findTestObject('0_Common/0.3_Toast/Toast_SuccessfullySaved'), 3)
}

