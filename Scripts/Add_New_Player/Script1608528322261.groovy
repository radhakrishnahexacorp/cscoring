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

'Add new player option selected'
Mobile.tap(findTestObject('Object Repository/Add New player 1/android.widget.TextView - Add Player'), 0)

Mobile.tap(findTestObject('Add_New_Player/android.widget.RelativeLayout'), 0)

'First name'
Mobile.setText(findTestObject('Object Repository/Add_New_Player/android.widget.EditText'), 'aaaa', 0)

'Last name'
Mobile.setText(findTestObject('Object Repository/Add_New_Player/android.widget.EditText (1)'), 'Player 1', 0)

'Email id'
Mobile.setText(findTestObject('Object Repository/Add_New_Player/android.widget.EditText (2)'), 'a11crick@mailinator.com', 
    0)

Mobile.tap(findTestObject('Object Repository/Add_New_Player/android.widget.TextView - ADD'), 0)

Mobile.tap(findTestObject('Object Repository/check/android.widget.CheckBox'), 0)

//Mobile.tap(findTestObject('null'), 0)
'New player added successfully'
Mobile.tap(findTestObject('Object Repository/Home Team Player selection/android.widget.ImageView'), 0)

// after adding the new player below 3 runs copied from scoring runs and extras TC
Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.Button - 3'), 0)

'3rd over completed'
Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.Button - YES'), 0)

'4th over started'
Mobile.tap(findTestObject('Start Match/android.widget.Button - 1'), 0)

'Extras selected'
Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.Button - Extras'), 0)

'Wide selected'
Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.TextView - Wide'), 0)

Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.RelativeLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.Button - 4'), 0)

Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.Button - 2'), 0)

Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.Button - 3'), 0)

Mobile.tap(findTestObject('Start Match/android.widget.Button - 1'), 0)

Mobile.tap(findTestObject('Start Match/android.widget.Button - 1'), 0)

'4th over Ended'
Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.Button - YES'), 0)

Mobile.delay(5)

