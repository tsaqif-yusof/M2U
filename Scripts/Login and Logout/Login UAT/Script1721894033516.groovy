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

WebUI.navigateToUrl(findTestData('Test Data').getValue(3, 2))

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_Maybank2u  Maybank Malaysia/input_Humanising Financial Services_username'),findTestData('Test Data').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Page_Maybank2u  Maybank Malaysia/button_LOGIN_1'))

WebUI.click(findTestObject('Object Repository/Page_Maybank2u  Maybank Malaysia/button_YES'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Maybank2u  Maybank Malaysia/div_Hello, cakif93'), 20)

WebUI.delay(2)

//WebUI.setText(findTestObject('Login Elements/Page_Maybank2u1/Enter Password'), '●●●●●●●●')

WebUI.setText(findTestObject('Object Repository/Page_Maybank2u  Maybank Malaysia/input_Hello_my-password-input'),findTestData('Test Data').getValue(2, 1))

WebUI.click(findTestObject('Object Repository/Page_Maybank2u  Maybank Malaysia/button_LOGIN_1'))

WebUI.delay(5)

//WebUI.click(findTestObject('Object Repository/Page_Maybank2u  Maybank Malaysia/span_LOGOUT'))

//WebUI.closeBrowser()

