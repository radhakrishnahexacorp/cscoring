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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.tap(findTestObject('Start Match/android.widget.Button - 1'), 0)

Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.Button - 2'), 0)

Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.Button - 3'), 0)

Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.Button - 4'), 0)

Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.Button - 4'), 0)

Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.Button - 6'), 0)

Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.Button - YES'), 0)

Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.Button - Select Next Bowler'), 0)

Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.CheckBox'), 0)

Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.Button - Extras'), 0)

Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.TextView - Wide'), 0)

Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.RelativeLayout'), 0)

Mobile.tap(findTestObject('Scoring Runs and Extras/android.widget.Button - Extras'), 0)

Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.TextView - No Ball'), 0)

Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.RelativeLayout (1)'), 0)

Mobile.tap(findTestObject('Scoring Runs and Extras/android.widget.Button - Extras'), 0)

Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.TextView - No Ball off the bat'), 0)

Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.RelativeLayout (2)'), 0)

Mobile.tap(findTestObject('Scoring Runs and Extras/android.widget.Button - Extras'), 0)

Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.TextView - Free Hit'), 0)

Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.RelativeLayout (3)'), 0)

Mobile.tap(findTestObject('Scoring Runs and Extras/android.widget.Button - Extras'), 0)

Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.TextView - Byes'), 0)

Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.RelativeLayout (4)'), 0)

Mobile.tap(findTestObject('Scoring Runs and Extras/android.widget.Button - Extras'), 0)

Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.TextView - Leg Byes'), 0)

Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.RelativeLayout (5)'), 0)

WebUI.callTestCase(findTestCase('scoring wickets'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Scoring Runs and Extras/android.widget.Button - 1'), 0)

Mobile.tap(findTestObject('Scoring Runs and Extras/android.widget.Button - 1'), 0)

Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.Button - YES'), 0)

WebUI.callTestCase(findTestCase('Scoring all wickets test case'), [:], FailureHandling.STOP_ON_FAILURE)

'action button'
Mobile.tap(findTestObject('Object Repository/Action_items/android.widget.Button - Action'), 0)

