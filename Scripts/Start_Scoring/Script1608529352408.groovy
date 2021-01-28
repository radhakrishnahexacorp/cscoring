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

Mobile.startApplication('C:\\Users\\smanikandan\\Downloads\\Scoring_app_qa_remove_umpire_approval_v2.0.0.apk', true)

Mobile.setText(findTestObject('Object Repository/Action_items/android.widget.EditText - Email'), 'mk@mailinator.com', 0)

Mobile.setText(findTestObject('Object Repository/Action_items/android.widget.EditText - Password'), '123456', 0)

'Logged in successful'
Mobile.tap(findTestObject('Object Repository/Action_items/android.widget.Button - Log in'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

'Clicked Start scoring'
Mobile.tap(findTestObject('Player_List_Selection/android.widget.TextView - Start Scoring'), 0)

'Home team selected'
WebUI.callTestCase(findTestCase('Home team players'), [:], FailureHandling.STOP_ON_FAILURE)

'Away team selected'
WebUI.callTestCase(findTestCase('Away team players'), [:], FailureHandling.STOP_ON_FAILURE)

'match type\r\n'
Mobile.tap(findTestObject('Object Repository/Action_items/android.widget.TextView - Select'), 0)

'select match type'
Mobile.tap(findTestObject('Object Repository/For 5 overs/android.widget.CheckBox'), 0)

'Select T20'
Mobile.tap(findTestObject('Object Repository/For 5 overs/android.widget.TextView - 20'), 0)

'Select 7 overs'
Mobile.tap(findTestObject('Object Repository/7 overs/android.widget.TextView - 7'), 0)

//Mobile.scrollToText('5')
//Mobile.tap(findTestObject('Object Repository/For 5 overs/android.widget.TextView - 5'), 0)
//Mobile.tap(findTestObject('Object Repository/Action_items/android.widget.CheckBox (12)'), 0)
'ok button'
Mobile.tap(findTestObject('Action_items/android.widget.ImageView (1)'), 0)

'Toss selected\r\n'
Mobile.tap(findTestObject('Object Repository/Action_items/android.widget.TextView - Select (1)'), 0)

'team selection'
Mobile.tap(findTestObject('Object Repository/Action_items/android.widget.CheckBox (13)'), 0)

'Elected for Batting / Bowling\r\n'
Mobile.tap(findTestObject('Object Repository/Action_items/android.widget.CheckBox (14)'), 0)

'drop down selection'
Mobile.tap(findTestObject('Object Repository/Action_items/android.widget.TextView - select (2)'), 0)

'done button'
Mobile.tap(findTestObject('Object Repository/Action_items/android.widget.Button - DONE'), 0)

'ok button for toss details'
Mobile.tap(findTestObject('Action_items/android.widget.ImageView (1)'), 0)

'Striker selection'
Mobile.tap(findTestObject('Object Repository/Action_items/android.widget.TextView - Striker'), 0)

'Select player'
Mobile.tap(findTestObject('Action_items/android.widget.CheckBox'), 0)

'ok button'
Mobile.tap(findTestObject('Object Repository/Action_items/android.widget.ImageView (2)'), 0)

'non striker'
Mobile.tap(findTestObject('Object Repository/Action_items/android.widget.TextView - Non Striker'), 0)

'player selection'
Mobile.tap(findTestObject('Action_items/android.widget.CheckBox'), 0)

'ok button'
Mobile.tap(findTestObject('Action_items/android.widget.ImageView (1)'), 0)

'opening bowler'
Mobile.tap(findTestObject('Object Repository/Action_items/android.widget.TextView - Opening Bowler'), 0)

'player selection\r\n'
Mobile.tap(findTestObject('Action_items/android.widget.CheckBox'), 0)

'ok button'
Mobile.tap(findTestObject('Action_items/android.widget.ImageView (1)'), 0)

'keeper'
Mobile.tap(findTestObject('Object Repository/Action_items/android.widget.TextView - Keeper'), 0)

'player selection'
Mobile.tap(findTestObject('Action_items/android.widget.CheckBox'), 0)

'ok button'
Mobile.tap(findTestObject('Action_items/android.widget.ImageView (1)'), 0)

'Select captain'
Mobile.tap(findTestObject('Object Repository/Captain selection/android.widget.TextView - Select Captain'), 0)

Mobile.tap(findTestObject('Object Repository/captain select check/android.widget.CheckBox'), 0)

//Mobile.tap(findTestObject('Object Repository/Captain selection/android.widget.CheckBox'), 0)

Mobile.tap(findTestObject('Object Repository/Captain selection/android.widget.ImageView'), 0)


'Innings Started'
Mobile.tap(findTestObject('Object Repository/Action_items/android.widget.Button - START MATCH'), 0)

