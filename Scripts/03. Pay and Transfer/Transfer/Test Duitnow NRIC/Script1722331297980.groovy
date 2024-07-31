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

WebUI.navigateToUrl('https://www.maybank2u.com.my/home/m2u/common/login.do')

WebUI.setText(findTestObject('Object Repository/DuitNow Transfer- NRIC/Page_Maybank2u  Maybank Malaysia/input_Humanising Financial Services_username'), 
    'cakif93')

WebUI.click(findTestObject('Object Repository/DuitNow Transfer- NRIC/Page_Maybank2u  Maybank Malaysia/img'))

WebUI.click(findTestObject('Object Repository/DuitNow Transfer- NRIC/Page_Maybank2u  Maybank Malaysia/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/DuitNow Transfer- NRIC/Page_Maybank2u  Maybank Malaysia/button_YES'))

WebUI.setText(findTestObject('Object Repository/DuitNow Transfer- NRIC/Page_Maybank2u  Maybank Malaysia/input_Hello_my-password-input'), 
    '●●●●●●●●')

WebUI.click(findTestObject('Object Repository/DuitNow Transfer- NRIC/Page_Maybank2u  Maybank Malaysia/button_LOGIN_1'))

WebUI.click(findTestObject('Object Repository/DuitNow Transfer- NRIC/Page_Maybank2u  Maybank Malaysia/a_PAY  TRANSFER'))

WebUI.click(findTestObject('Object Repository/DuitNow Transfer- NRIC/Page_Maybank2u  Maybank Malaysia/span_x'))

WebUI.click(findTestObject('Object Repository/DuitNow Transfer- NRIC/Page_Maybank2u  Maybank Malaysia/div_TRANSFER'))

WebUI.click(findTestObject('Object Repository/DuitNow Transfer- NRIC/Page_Maybank2u  Maybank Malaysia/span_Own Accounts'))

WebUI.click(findTestObject('Object Repository/DuitNow Transfer- NRIC/Page_Maybank2u  Maybank Malaysia/div_DuitNow'))

WebUI.click(findTestObject('Object Repository/DuitNow Transfer- NRIC/Page_Maybank2u  Maybank Malaysia/input_ASNB Accounts_PayFromToContainer---pa_1bae3d'))

WebUI.click(findTestObject('Object Repository/DuitNow Transfer- NRIC/Page_Maybank2u  Maybank Malaysia/div_NRIC Number'))

WebUI.setText(findTestObject('Object Repository/DuitNow Transfer- NRIC/Page_Maybank2u  Maybank Malaysia/input_NRIC Number_proxyId'), 
    '930924075653')

WebUI.setText(findTestObject('Object Repository/DuitNow Transfer- NRIC/Page_Maybank2u  Maybank Malaysia/input_Transfer Amount_amount'), 
    '0.01')

WebUI.setText(findTestObject('Object Repository/DuitNow Transfer- NRIC/Page_Maybank2u  Maybank Malaysia/input_Recipient Reference_transferPurpose'), 
    'test')

WebUI.click(findTestObject('Object Repository/DuitNow Transfer- NRIC/Page_Maybank2u  Maybank Malaysia/img_1'))

WebUI.click(findTestObject('Object Repository/DuitNow Transfer- NRIC/Page_Maybank2u  Maybank Malaysia/button_TRANSFER'))

WebUI.click(findTestObject('Object Repository/DuitNow Transfer- NRIC/Page_Maybank2u  Maybank Malaysia/button_REQUEST'))

