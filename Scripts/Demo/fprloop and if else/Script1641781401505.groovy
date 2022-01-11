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

WebUI.navigateToUrl('https://dbmosaj-trials73.orangehrmlive.com/auth/seamlessLogin')

for ( def row=1; row<=findTestData('HRMcrendentials/idPWD').getRowNumbers();row++) {
//GET ROW IN THE EXCEL

WebUI.click(findTestObject('Object Repository/test_training/training-10-01/Page_OrangeHRM/img'))

WebUI.click(findTestObject('Object Repository/test_training/training-10-01/Page_OrangeHRM/img_1'))

WebUI.click(findTestObject('Object Repository/test_training/training-10-01/Page_OrangeHRM/img_Login_icon'))

WebUI.click(findTestObject('Object Repository/test_training/training-10-01/Page_OrangeHRM/div_Login'))

WebUI.setText(findTestObject('Object Repository/test_training/training-10-01/Page_OrangeHRM/input_Login_txtUsername'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/test_training/training-10-01/Page_OrangeHRM/input_Login_txtPassword'), 
    'p4y+y39Ir5OTdtOb306gDg==')

WebUI.click(findTestObject('Object Repository/test_training/training-10-01/Page_OrangeHRM/button_Login'))
}
WebUI.closeBrowser()

