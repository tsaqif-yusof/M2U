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

if (Prod == 'YES') {
    WebUI.callTestCase(findTestCase('Login and Logout/Login Prod'), [:], FailureHandling.CONTINUE_ON_FAILURE)
} else {
    WebUI.callTestCase(findTestCase('Login and Logout/Login UAT'), [:], FailureHandling.CONTINUE_ON_FAILURE)
}

String transaction = findTestData('Test Data').getValue(5, 1)

println(transaction)

if (transaction == '1') {
    WebUI.callTestCase(findTestCase('Pay and Transfer/Transfer/3rd Party'), [:], FailureHandling.CONTINUE_ON_FAILURE)
} else if (transaction == '2') {
	WebUI.callTestCase(findTestCase('Pay and Transfer/Transfer/IBFT'), [:], FailureHandling.CONTINUE_ON_FAILURE)
} else {
	WebUI.callTestCase(findTestCase('Pay and Transfer/Transfer/IBG'), [:], FailureHandling.CONTINUE_ON_FAILURE)
}

WebUI.callTestCase(findTestCase('Login and Logout/Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

