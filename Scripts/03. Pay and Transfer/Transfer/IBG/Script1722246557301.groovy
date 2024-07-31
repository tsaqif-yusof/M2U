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

WebUI.click(findTestObject('Object Repository/IBG/Page_Maybank2u  Maybank Malaysia/a_PAY  TRANSFER'))

WebUI.click(findTestObject('Object Repository/IBG/Page_Maybank2u  Maybank Malaysia/span_x'))

WebUI.click(findTestObject('Object Repository/IBG/Page_Maybank2u  Maybank Malaysia/div_TRANSFER'))

WebUI.click(findTestObject('Object Repository/IBG/Page_Maybank2u  Maybank Malaysia/div_Own Accounts'))

WebUI.click(findTestObject('Object Repository/IBG/Page_Maybank2u  Maybank Malaysia/span_Other Accounts ( Maybank and other banks )'))

WebUI.setText(findTestObject('Object Repository/IBG/Page_Maybank2u  Maybank Malaysia/input_ASNB Accounts_PayFromToContainer---pa_1bae3d'),  findTestData('Test Data').getValue(7, 2))

WebUI.click(findTestObject('Object Repository/IBG/Page_Maybank2u  Maybank Malaysia/div_CIMB BANK BERHAD'))

WebUI.setText(findTestObject('Object Repository/IBG/Page_Maybank2u  Maybank Malaysia/input_Account number_beneficiaryAccountNumber'), findTestData('Test Data').getValue(8, 2))

WebUI.click(findTestObject('Object Repository/IBG/Page_Maybank2u  Maybank Malaysia/input_concat(Recipient, , s Name)_beneficiaryName'))

WebUI.setText(findTestObject('Object Repository/IBG/Page_Maybank2u  Maybank Malaysia/input_concat(Recipient, , s Name)_beneficiaryName'), 
findTestData('Test Data').getValue(7, 2))

WebUI.click(findTestObject('Object Repository/IBG/Page_Maybank2u  Maybank Malaysia/button_Funds Transfer'))

WebUI.click(findTestObject('Object Repository/IBG/Page_Maybank2u  Maybank Malaysia/div_Funds Transfer'))

WebUI.click(findTestObject('Object Repository/IBG/Page_Maybank2u  Maybank Malaysia/div_DuitNow Transfer'))

WebUI.click(findTestObject('Object Repository/IBG/Page_Maybank2u  Maybank Malaysia/span_Interbank GIRO'))

WebUI.setText(findTestObject('Object Repository/IBG/Page_Maybank2u  Maybank Malaysia/input_Transfer Amount_amount'), findTestData('Test Data').getValue(9, 2))

WebUI.setText(findTestObject('Object Repository/IBG/Page_Maybank2u  Maybank Malaysia/input_Recipient Reference_transactionReferenceNo'), 
findTestData('Test Data').getValue(6, 5))

WebUI.click(findTestObject('Object Repository/IBG/Page_Maybank2u  Maybank Malaysia/button_TRANSFER'))

WebUI.click(findTestObject('Object Repository/IBG/Page_Maybank2u  Maybank Malaysia/button_REQUEST'))

WebUI.takeScreenshot()

WebUI.delay(10)

WebUI.verifyElementPresent(findTestObject('Object Repository/IBG/Page_Maybank2u  Maybank Malaysia/span_Transaction Accepted'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Request Mode/S2U/a_SAVE RECEIPT'), 0)

WebUI.takeScreenshot()

WebUI.delay(2)

