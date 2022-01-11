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

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/test_training/Page_CURA Healthcare Service/h1_CURA Healthcare Service'))

WebUI.click(findTestObject('Object Repository/test_training/Page_CURA Healthcare Service/h3_We Care About Your Health'))

WebUI.click(findTestObject('Object Repository/test_training/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.click(findTestObject('Object Repository/test_training/Page_CURA Healthcare Service/h2_Login'))

WebUI.click(findTestObject('Object Repository/test_training/Page_CURA Healthcare Service/p_Please login to make appointment'))

WebUI.click(findTestObject('Object Repository/test_training/Page_CURA Healthcare Service/label_Demo account'))

WebUI.click(findTestObject('Object Repository/test_training/Page_CURA Healthcare Service/span_Demo account_glyphicon glyphicon-user'))

WebUI.click(findTestObject('Object Repository/test_training/Page_CURA Healthcare Service/span_Demo account_demo_username_label'))

WebUI.click(findTestObject('Object Repository/test_training/Page_CURA Healthcare Service/input_Demo account_form-control'))

WebUI.click(findTestObject('Object Repository/test_training/Page_CURA Healthcare Service/span_Demo account_demo_password_label'))

WebUI.click(findTestObject('Object Repository/test_training/Page_CURA Healthcare Service/span_Demo account_glyphicon glyphicon-lock'))

WebUI.click(findTestObject('Object Repository/test_training/Page_CURA Healthcare Service/input_Demo account_form-control_1'))

WebUI.click(findTestObject('Object Repository/test_training/Page_CURA Healthcare Service/input_Demo account_form-control'))

WebUI.click(findTestObject('Object Repository/test_training/Page_CURA Healthcare Service/div_Username_col-sm-8'))

WebUI.setText(findTestObject('Object Repository/test_training/Page_CURA Healthcare Service/input_Username_username'), 'John Doe')

WebUI.click(findTestObject('Object Repository/test_training/Page_CURA Healthcare Service/label_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/test_training/Page_CURA Healthcare Service/input_Password_password'), 
    'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.sendKeys(findTestObject('Object Repository/test_training/Page_CURA Healthcare Service/input_Password_password'), Keys.chord(
        Keys.ENTER))

