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

'action button'
Mobile.tap(findTestObject('Object Repository/Action_items/android.widget.Button - Action'), 0)

'Replace player button selected'
Mobile.tap(findTestObject('Object Repository/ReplacePlayer_with_NewPlayer/android.widget.TextView - Replace Player'), 0)

Mobile.tap(findTestObject('Object Repository/ReplacePlayer_with_NewPlayer/android.widget.CheckBox'), 0)

Mobile.tap(findTestObject('Object Repository/ReplacePlayer_with_NewPlayer/android.widget.ImageView'), 0)

'Create new player button selected'
Mobile.tap(findTestObject('Object Repository/ReplacePlayer_with_NewPlayer/android.widget.TextView - Create New Player'), 
    0)

'First name'
Mobile.setText(findTestObject('Object Repository/ReplacePlayer_with_NewPlayer/android.widget.EditText'), 'abbc', 0)

'Last name'
Mobile.setText(findTestObject('Object Repository/ReplacePlayer_with_NewPlayer/android.widget.EditText (1)'), 'test', 0)

'Email id'
Mobile.setText(findTestObject('Object Repository/ReplacePlayer_with_NewPlayer/android.widget.EditText (2)'), 'ab11@mailinator.com', 
    0)

Mobile.tap(findTestObject('Object Repository/ReplacePlayer_with_NewPlayer/android.widget.TextView - ADD'), 0)

'Go to bench'
Mobile.tap(findTestObject('Object Repository/ReplacePlayer_with_NewPlayer/android.widget.TextView - BENCH'), 0)

'Selected the new player'
Mobile.tap(findTestObject('Object Repository/For 5 overs/android.widget.CheckBox (1)'), 0)

Mobile.tap(findTestObject('Object Repository/For 5 overs/android.widget.ImageView'), 0)

Mobile.delay(10)

'5th over started'
Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.Button - 4'), 0)

Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.Button - 2'), 0)

Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.Button - 3'), 0)

Mobile.tap(findTestObject('Start Match/android.widget.Button - 1'), 0)

Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.Button - 2'), 0)

Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.Button - 2'), 0)

'5th over completed'
Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.Button - YES'), 0)

'action button'
Mobile.tap(findTestObject('Object Repository/Action_items/android.widget.Button - Action'), 0)

'Add note button'
Mobile.tap(findTestObject('Object Repository/AddNote_AddPowerPlay/android.widget.TextView - Add Note'), 0)

'ok button'
Mobile.tap(findTestObject('Object Repository/AddNote_AddPowerPlay/android.widget.RelativeLayout'), 0)

'Text, Test note'
Mobile.setText(findTestObject('Object Repository/AddNote_AddPowerPlay/android.widget.EditText - Enter notes'), 'Test Note', 
    0)

'ok button\r\n'
Mobile.tap(findTestObject('Object Repository/AddNote_AddPowerPlay/android.widget.Button - OK'), 0)

'done button'
Mobile.tap(findTestObject('Object Repository/AddNote_AddPowerPlay/android.widget.LinearLayout'), 0)

'6th over started'
Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.Button - 4'), 0)

Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.Button - 2'), 0)

Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.Button - 3'), 0)

Mobile.tap(findTestObject('Start Match/android.widget.Button - 1'), 0)

Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.Button - 2'), 0)

Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.Button - 2'), 0)

'6th over completed'
Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.Button - YES'), 0)

'7th over started'
Mobile.tap(findTestObject('Start Match/android.widget.Button - 1'), 0)

Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.Button - 2'), 0)

Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.Button - 3'), 0)

Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.Button - 4'), 0)

Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.Button - 4'), 0)

Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.Button - 6'), 0)

'7th over completed'
Mobile.tap(findTestObject('Object Repository/Scoring Runs and Extras/android.widget.Button - YES'), 0)

Mobile.delay(5)

