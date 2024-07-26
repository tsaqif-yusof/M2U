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


WebUI.click(findTestObject('Object Repository/3rd Party/Page_Maybank2u  Maybank Malaysia/a_PAY  TRANSFER'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/3rd Party/Page_Maybank2u  Maybank Malaysia/button_x'))

WebUI.click(findTestObject('Object Repository/3rd Party/Page_Maybank2u  Maybank Malaysia/div_TRANSFER'))

WebUI.click(findTestObject('Object Repository/3rd Party/Page_Maybank2u  Maybank Malaysia/button_Own Accounts'))

WebUI.click(findTestObject('Object Repository/3rd Party/Page_Maybank2u  Maybank Malaysia/span_Other Accounts ( Maybank and other banks )'))

'Bank Islam'
//WebUI.setText(findTestObject('Object Repository/3rd Party/Page_Maybank2u  Maybank Malaysia/input_ASNB Accounts_PayFromToContainer---pa_1bae3d'), 'bank islam')
//WebUI.click(findTestObject('Object Repository/3rd Party/Page_Maybank2u  Maybank Malaysia/div_BANK ISLAM MALAYSIA'))
//WebUI.click(findTestObject('Object Repository/3rd Party/Page_Maybank2u  Maybank Malaysia/span_Transfer To BANK ISLAM MALAYSIA_TransferModal---close---1-8Bs'))

WebUI.delay(2)

'Maybank'
WebUI.click(findTestObject('Object Repository/3rd Party/Page_Maybank2u  Maybank Malaysia/input_ASNB Accounts_PayFromToContainer---pa_1bae3d'))

WebUI.click(findTestObject('Object Repository/3rd Party/Page_Maybank2u  Maybank Malaysia/div_Maybank  Maybank Islamic'))

WebUI.setText(findTestObject('Object Repository/3rd Party/Page_Maybank2u  Maybank Malaysia/input_Account number_toAccount'), findTestData('Test Data').getValue(8, 1))

WebUI.setText(findTestObject('Object Repository/3rd Party/Page_Maybank2u  Maybank Malaysia/input_Transfer Amount_amount'), findTestData('Test Data').getValue(9, 1))

WebUI.setText(findTestObject('Object Repository/3rd Party/Page_Maybank2u  Maybank Malaysia/input_Recipient Reference_transferPurpose'), findTestData('Test Data').getValue(7, 1))

WebUI.click(findTestObject('Object Repository/3rd Party/Page_Maybank2u  Maybank Malaysia/button_TRANSFER'))

WebUI.callTestCase(findTestCase('Auto_framework_mobile'), [:], FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.click(findTestObject('Object Repository/3rd Party/Page_Maybank2u  Maybank Malaysia/button_REQUEST'))

//WebUI.delay(15)

//WebUI.setEncryptedText(findTestObject('Object Repository/3rd Party/Page_Maybank2u  Maybank Malaysia/input_click here_OneTimePassword---pair-inp_868bc1'), 'URLxZCWNH10=')

//WebUI.click(findTestObject('Object Repository/3rd Party/Page_Maybank2u  Maybank Malaysia/button_CONFIRM'))

//WebUI.click(findTestObject('Object Repository/3rd Party/Page_Maybank2u  Maybank Malaysia/span_Transfer ToASAHI514013127536RM 0.01'))

