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

Mobile.setText(findTestObject('Object Repository/Action_items/android.widget.EditText - Email'), 'automation@mailinator.com', 
    0)

Mobile.setText(findTestObject('Object Repository/Action_items/android.widget.EditText - Password'), '123456', 0)

'login button.'
Mobile.tap(findTestObject('Object Repository/Action_items/android.widget.Button - Log in'), 0)

'start scoring'
Mobile.tap(findTestObject('Player_List_Selection/android.widget.TextView - Start Scoring'), 0)

'select player 1'
Mobile.tap(findTestObject('Object Repository/Action_items/android.widget.CheckBox'), 0)

Mobile.tap(findTestObject('Object Repository/Action_items/android.widget.CheckBox (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Action_items/android.widget.CheckBox (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Action_items/android.widget.CheckBox (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Action_items/android.widget.CheckBox (4)'), 0)

'select player 5 '
Mobile.tap(findTestObject('Object Repository/Action_items/android.widget.CheckBox (5)'), 0)

'ok button for home team player'
Mobile.tap(findTestObject('Object Repository/Action_items/android.widget.ImageView (1)'), 0)

'select players for away team'
Mobile.tap(findTestObject('Object Repository/Action_items/android.widget.CheckBox (6)'), 0)

Mobile.tap(findTestObject('Object Repository/Action_items/android.widget.CheckBox (7)'), 0)

Mobile.tap(findTestObject('Object Repository/Action_items/android.widget.CheckBox (8)'), 0)

Mobile.tap(findTestObject('Object Repository/Action_items/android.widget.CheckBox (9)'), 0)

Mobile.tap(findTestObject('Object Repository/Action_items/android.widget.CheckBox (10)'), 0)

'select 5 players for away team'
Mobile.tap(findTestObject('Object Repository/Action_items/android.widget.CheckBox (11)'), 0)

'ok button for away team'
Mobile.tap(findTestObject('Action_items/android.widget.ImageView (1)'), 0)

'match type\r\n'
Mobile.tap(findTestObject('Object Repository/Action_items/android.widget.TextView - Select'), 0)

'select match type'
Mobile.tap(findTestObject('Object Repository/Action_items/android.widget.CheckBox (12)'), 0)

'ok button'
Mobile.tap(findTestObject('Action_items/android.widget.ImageView (1)'), 0)

'toss detail'
Mobile.tap(findTestObject('Object Repository/Action_items/android.widget.TextView - Select (1)'), 0)

'team selection'
Mobile.tap(findTestObject('Object Repository/Action_items/android.widget.CheckBox (13)'), 0)

'elected for'
Mobile.tap(findTestObject('Object Repository/Action_items/android.widget.CheckBox (14)'), 0)

'drop down selection'
Mobile.tap(findTestObject('Object Repository/Action_items/android.widget.TextView - select (2)'), 0)

'done button'
Mobile.tap(findTestObject('Object Repository/Action_items/android.widget.Button - DONE'), 0)

'ok button for toss details'
Mobile.tap(findTestObject('Action_items/android.widget.ImageView (1)'), 0)

'striker sselection'
Mobile.tap(findTestObject('Object Repository/Action_items/android.widget.TextView - Striker'), 0)

'select player'
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

'start match'
Mobile.tap(findTestObject('Object Repository/Action_items/android.widget.Button - START MATCH'), 0)

'action button'
Mobile.tap(findTestObject('Object Repository/Action_items/android.widget.Button - Action'), 0)

