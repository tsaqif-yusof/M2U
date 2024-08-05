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

String Prod = findTestData('Test Data').getValue(4, 2)

println(Prod)

if (Prod == 'NO') {
	WebUI.callTestCase(findTestCase('00. Login and Logout/Login UAT'), [:], FailureHandling.CONTINUE_ON_FAILURE)
} else {
	WebUI.callTestCase(findTestCase('00. Login and Logout/Login Prod'), [:], FailureHandling.CONTINUE_ON_FAILURE)
}

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/DuitNow Transfer/Page_Maybank2u  Maybank Malaysia/a_PAY  TRANSFER'))

WebUI.click(findTestObject('Object Repository/DuitNow Transfer/Page_Maybank2u  Maybank Malaysia/span_x'))

WebUI.click(findTestObject('Object Repository/DuitNow Transfer/Page_Maybank2u  Maybank Malaysia/div_TRANSFER'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/DuitNow Transfer/Page_Maybank2u  Maybank Malaysia/button_Own Accounts'))

WebUI.click(findTestObject('Object Repository/DuitNow Transfer/Page_Maybank2u  Maybank Malaysia/span_DuitNow'))

WebUI.click(findTestObject('Object Repository/DuitNow Transfer/Page_Maybank2u  Maybank Malaysia/input_ASNB Accounts_PayFromToContainer---pa_1bae3d'))

WebUI.click(findTestObject('Object Repository/DuitNow Transfer/Page_Maybank2u  Maybank Malaysia/div_Mobile Number'))

WebUI.setText(findTestObject('Object Repository/DuitNow Transfer/Page_Maybank2u  Maybank Malaysia/input_Mobile Number_proxyId'),
findTestData('Test Data').getValue(13, 1))

WebUI.setText(findTestObject('Object Repository/DuitNow Transfer/Page_Maybank2u  Maybank Malaysia/input_Recipient Reference_transferPurpose'),
	findTestData('Test Data').getValue(12, 1))


WebUI.setText(findTestObject('Object Repository/DuitNow Transfer/Page_Maybank2u  Maybank Malaysia/input_Transfer Amount_amount'), 
findTestData('Test Data').getValue(9, 1))

WebUI.click(findTestObject('Object Repository/DuitNow Transfer/Page_Maybank2u  Maybank Malaysia/img'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/DuitNow Transfer/Page_Maybank2u  Maybank Malaysia/button_TRANSFER'))

WebUI.click(findTestObject('Object Repository/DuitNow Transfer/Page_Maybank2u  Maybank Malaysia/button_Secure Verification'))

//WebUI.click(findTestObject('Object Repository/DuitNow Transfer/Page_Maybank2u  Maybank Malaysia/span_Secure Verification'))

WebUI.click(findTestObject('Object Repository/DuitNow Transfer/Page_Maybank2u  Maybank Malaysia/button_REQUEST'))

WebUI.takeScreenshot()

WebUI.delay(10)

//WebUI.click(findTestObject('Object Repository/DuitNow Transfer/Page_Maybank2u  Maybank Malaysia/div_Transfer ToTSAQIF YUSOF017304RM 0.05Add_24239c'))

//WebUI.click(findTestObject('Object Repository/DuitNow Transfer/Page_Maybank2u  Maybank Malaysia/span_Transaction Successful'))

WebUI.verifyElementPresent(findTestObject('Object Repository/DuitNow Transfer/Page_Maybank2u  Maybank Malaysia/span_Transaction Successful'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Request Mode/S2U/a_SAVE RECEIPT'), 0)

WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.callTestCase(findTestCase('00. Login and Logout/Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)
