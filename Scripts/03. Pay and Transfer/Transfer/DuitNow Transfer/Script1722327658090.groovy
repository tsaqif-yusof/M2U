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

WebUI.click(findTestObject('Object Repository/DuitNow Transfer/Page_Maybank2u  Maybank Malaysia/a_PAY  TRANSFER'))

WebUI.click(findTestObject('Object Repository/DuitNow Transfer/Page_Maybank2u  Maybank Malaysia/span_x'))

WebUI.click(findTestObject('Object Repository/DuitNow Transfer/Page_Maybank2u  Maybank Malaysia/div_TRANSFER'))

WebUI.click(findTestObject('Object Repository/DuitNow Transfer/Page_Maybank2u  Maybank Malaysia/button_Own Accounts'))

WebUI.click(findTestObject('Object Repository/DuitNow Transfer/Page_Maybank2u  Maybank Malaysia/span_DuitNow'))

WebUI.click(findTestObject('Object Repository/DuitNow Transfer/Page_Maybank2u  Maybank Malaysia/input_ASNB Accounts_PayFromToContainer---pa_1bae3d'))

String duitNowType = findTestData('Test Data').getValue(11, 1)

println(duitNowType)

switch (duitNowType)
{ case ('1'): 
	WebUI.click(findTestObject('Object Repository/DuitNow Transfer/Page_Maybank2u  Maybank Malaysia/div_Mobile Number'))
	
	WebUI.setText(findTestObject('Object Repository/DuitNow Transfer/Page_Maybank2u  Maybank Malaysia/input_Mobile Number_proxyId'),
	findTestData('Test Data').getValue(13, 1))
	
	WebUI.setText(findTestObject('Object Repository/DuitNow Transfer/Page_Maybank2u  Maybank Malaysia/input_Recipient Reference_transferPurpose'),
		findTestData('Test Data').getValue(12, 1))
	
	break
	case ('2'): 
	WebUI.click(findTestObject('Object Repository/DuitNow Transfer/Page_Maybank2u  Maybank Malaysia/div_NRIC Number'))
	
	WebUI.setText(findTestObject('Object Repository/DuitNow Transfer/Page_Maybank2u  Maybank Malaysia/input_NRIC Number_proxyId'),
		findTestData('Test Data').getValue(13, 2))
	
	WebUI.setText(findTestObject('Object Repository/DuitNow Transfer/Page_Maybank2u  Maybank Malaysia/input_Recipient Reference_transferPurpose'),
		findTestData('Test Data').getValue(12, 2))
	break
	case ('3'): 
	WebUI.setText(findTestObject('Object Repository/DuitNow Transfer Passport/Page_Maybank2u  Maybank Malaysia/input_Country_RenderSearchableDropdown---pa_d92ba8'),
		'Japan')
	
	WebUI.click(findTestObject('Object Repository/DuitNow Transfer Passport/Page_Maybank2u  Maybank Malaysia/div_JAPAN'))
	
	WebUI.click(findTestObject('Object Repository/DuitNow Transfer/Page_Maybank2u  Maybank Malaysia/div_Passport Number'))
	
	WebUI.setText(findTestObject('Object Repository/DuitNow Transfer/Page_Maybank2u  Maybank Malaysia/input_Passport Number_proxyId'),
		findTestData('Test Data').getValue(13, 3))
	break
	case ('4'): 
	WebUI.click(findTestObject('Object Repository/DuitNow Transfer/Page_Maybank2u  Maybank Malaysia/div_Business Registration Number'))
	
	WebUI.setText(findTestObject('Object Repository/DuitNow Transfer/Page_Maybank2u  Maybank Malaysia/input_Business Registration Number_proxyId'),
		findTestData('Test Data').getValue(13, 4))
	break
	case ('5'):
	WebUI.click(findTestObject('Object Repository/DuitNow Transfer/Page_Maybank2u  Maybank Malaysia/div_Army ID  Police ID'))
	
	WebUI.setText(findTestObject('Object Repository/DuitNow Transfer/Page_Maybank2u  Maybank Malaysia/input_Army ID  Police ID_proxyId'),
		findTestData('Test Data').getValue(8, 3))
	break
	default: WebUI.callTestCase(findTestCase('00. Login and Logout/Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)
	break
}


WebUI.setText(findTestObject('Object Repository/DuitNow Transfer/Page_Maybank2u  Maybank Malaysia/input_Transfer Amount_amount'), 
findTestData('Test Data').getValue(9, 1))

if(WebUI.verifyElementPresent(findTestObject('Object Repository/DuitNow Transfer/Page_Maybank2u  Maybank Malaysia/img')))
{
	WebUI.click(findTestObject('Object Repository/DuitNow Transfer/Page_Maybank2u  Maybank Malaysia/img'))
}
else
{
	WebUI.click(findTestObject('Object Repository/DuitNow Transfer- NRIC/Page_Maybank2u  Maybank Malaysia/img_1'))
}	

//WebUI.click(findTestObject('Object Repository/DuitNow Transfer/Page_Maybank2u  Maybank Malaysia/img'))

WebUI.click(findTestObject('Object Repository/DuitNow Transfer/Page_Maybank2u  Maybank Malaysia/button_TRANSFER'))

WebUI.click(findTestObject('Object Repository/DuitNow Transfer/Page_Maybank2u  Maybank Malaysia/button_Secure Verification'))

WebUI.click(findTestObject('Object Repository/DuitNow Transfer/Page_Maybank2u  Maybank Malaysia/span_Secure Verification'))

WebUI.click(findTestObject('Object Repository/DuitNow Transfer/Page_Maybank2u  Maybank Malaysia/button_REQUEST'))

WebUI.takeScreenshot()

WebUI.delay(10)

//WebUI.click(findTestObject('Object Repository/DuitNow Transfer/Page_Maybank2u  Maybank Malaysia/div_Transfer ToTSAQIF YUSOF017304RM 0.05Add_24239c'))

//WebUI.click(findTestObject('Object Repository/DuitNow Transfer/Page_Maybank2u  Maybank Malaysia/span_Transaction Successful'))

WebUI.verifyElementPresent(findTestObject('Object Repository/DuitNow Transfer/Page_Maybank2u  Maybank Malaysia/span_Transaction Successful'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Request Mode/S2U/a_SAVE RECEIPT'), 0)

WebUI.takeScreenshot()

WebUI.delay(2)

