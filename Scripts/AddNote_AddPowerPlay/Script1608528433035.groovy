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

WebUI.callTestCase(findTestCase('Action_items'), [:], FailureHandling.STOP_ON_FAILURE)

'Add note button'
Mobile.tap(findTestObject('Object Repository/AddNote_AddPowerPlay/android.widget.TextView - Add Note'), 0)

'ok button'
Mobile.tap(findTestObject('Object Repository/AddNote_AddPowerPlay/android.widget.RelativeLayout'), 0)

'text'
Mobile.setText(findTestObject('Object Repository/AddNote_AddPowerPlay/android.widget.EditText - Enter notes'), 'Test Note',
	0)

'ok button\r\n'
Mobile.tap(findTestObject('Object Repository/AddNote_AddPowerPlay/android.widget.Button - OK'), 0)

'done button'
Mobile.tap(findTestObject('Object Repository/AddNote_AddPowerPlay/android.widget.LinearLayout'), 0)

'Action button'
Mobile.tap(findTestObject('Action_items/android.widget.Button - Action'), 0)

'add power play'
Mobile.tap(findTestObject('Object Repository/AddNote_AddPowerPlay/android.widget.TextView - Add Powerplay'), 0)

'start over button'
Mobile.tap(findTestObject('Object Repository/AddNote_AddPowerPlay/android.widget.Button'), 0)

Mobile.tapAndHold(findTestObject('AddNote_AddPowerPlay/android.widget.Button - 1 (1)'), 0, 0)

Mobile.tapAndHold(findTestObject('Object Repository/AddNote_AddPowerPlay/android.widget.Button - 1 (1)'), 0, 0)

'done button'
Mobile.tap(findTestObject('AddNote_AddPowerPlay/android.widget.Button - DONE'), 0)

'end over button'
Mobile.tap(findTestObject('Object Repository/AddNote_AddPowerPlay/android.widget.Button (1)'), 0)

Mobile.tapAndHold(findTestObject('Object Repository/AddNote_AddPowerPlay/android.widget.Button - 7'), 0, 0)

'done button'
Mobile.tap(findTestObject('AddNote_AddPowerPlay/android.widget.Button - DONE'), 0)

'dropdown selection'
Mobile.tap(findTestObject('Object Repository/AddNote_AddPowerPlay/android.widget.TextView'), 0)

'select batting'
Mobile.tap(findTestObject('Object Repository/AddNote_AddPowerPlay/android.widget.TextView - Batting'), 0)

'done button'
Mobile.tap(findTestObject('android.widget.LinearLayout'), 0)

Mobile.closeApplication()


