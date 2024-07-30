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

Mobile.startExistingApplication('com.maybank2u.life.uat', FailureHandling.CONTINUE_ON_FAILURE)


	Mobile.verifyElementExist(findTestObject('common/Maybank 2u_db'), 0, FailureHandling.CONTINUE_ON_FAILURE)

	String type = "Approve"

	System.out.println(type)

	not_run: Mobile.verifyElementExist(findTestObject('Parlel Testing/Mobile/Secure2u_btn'), 0, FailureHandling.CONTINUE_ON_FAILURE)

	not_run: Mobile.doubleTap(findTestObject('Parlel Testing/Mobile/Secure2u_btn'), 0, FailureHandling.CONTINUE_ON_FAILURE)

	Mobile.verifyElementExist(findTestObject('Parlel Testing/Mobile/android.widget.TextView - Secure2u authorisation'),
		1500)

	Mobile.verifyElementExist(findTestObject('Parlel Testing/Mobile/android.widget.TextView - Approve'), 0)

	Mobile.verifyElementExist(findTestObject('Parlel Testing/Mobile/android.widget.TextView - Reject'), 0)

	if (type == 'Approve') {
		Mobile.tap(findTestObject('Parlel Testing/Mobile/android.widget.TextView - Approve'), 0)

		Mobile.verifyElementExist(findTestObject('Parlel Testing/Mobile/android.widget.TextView - Done'), 0)

		Mobile.doubleTap(findTestObject('Parlel Testing/Mobile/android.widget.TextView - Done'), 0)
	} else {
		Mobile.tap(findTestObject('Parlel Testing/Mobile/android.widget.TextView - Reject'), 0)

		Mobile.verifyElementExist(findTestObject('Parlel Testing/Mobile/android.widget.TextView - Transaction unsuccessful'),
			0)

		Mobile.verifyElementExist(findTestObject('Parlel Testing/Mobile/android.widget.TextView - Your Secure Verification authorisation was rejected'),
			0)

		Mobile.verifyElementExist(findTestObject('Parlel Testing/Mobile/android.widget.TextView - Done'), 0)

		Mobile.doubleTap(findTestObject('Parlel Testing/Mobile/android.widget.TextView - Done'), 0)
	}
