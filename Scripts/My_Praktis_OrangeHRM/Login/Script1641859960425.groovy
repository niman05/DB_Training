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

WebUI.openBrowser('')

WebUI.delay(4)

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://dbmosaj-trials73.orangehrmlive.com/auth/login')

WebUI.setText(findTestObject('Object Repository/My_Praktis/Login_OrangeHRM/Page_OrangeHRM/input_Login_txtUsername'), findTestData(
        'HRMCredentials/idPWD1').getValue(1, 1))

WebUI.setText(findTestObject('Object Repository/My_Praktis/Login_OrangeHRM/Page_OrangeHRM/input_Login_txtPassword'), findTestData(
        'HRMCredentials/idPWD1').getValue(2, 1))

WebUI.click(findTestObject('Object Repository/My_Praktis/Login_OrangeHRM/Page_OrangeHRM/img_Login_icon show-icon'))

WebUI.click(findTestObject('Object Repository/My_Praktis/Login_OrangeHRM/Page_OrangeHRM/button_Login'))

WebUI.takeScreenshot()

header = WebUI.getText(findTestObject('Object Repository/My_Praktis/Login_OrangeHRM/Page_Dashboard/li_Dashboard'))

WebUI.delay(3)

WebUI.click(findTestObject('My_Praktis/Login_OrangeHRM/spy_leave/Page_Dashboard/span_Leave'))

WebUI.delay(3)

WebUI.click(findTestObject('My_Praktis/Login_OrangeHRM/spy_leave/Page_Dashboard/span_Apply'))

WebUI.delay(3)

WebUI.click(findTestObject('My_Praktis/Login_OrangeHRM/spy_leave/Page_Apply Leave/input__select-dropdown'))

WebUI.delay(3)

WebUI.click(findTestObject('My_Praktis/Login_OrangeHRM/spy_leave/Page_Apply Leave/span_Sick Leave - US'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/My_Praktis/Login_OrangeHRM/Page_Dashboard/i_keyboard_arrow_down'))

WebUI.click(findTestObject('Object Repository/My_Praktis/Login_OrangeHRM/Page_Dashboard/a_Logout'))

WebUI.closeBrowser()

