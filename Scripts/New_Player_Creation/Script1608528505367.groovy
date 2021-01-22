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

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('New_Player_Creation/android.widget.EditText - Email'), 'csbuddy123@mailinator.com', 0)

Mobile.setText(findTestObject('New_Player_Creation/android.widget.EditText - Password'), 'cs@123456', 0)

Mobile.tap(findTestObject('New_Player_Creation/android.widget.Button - Log in'), 0)

Mobile.tap(findTestObject('New_Player_Creation/android.widget.TextView - Start Scoring'), 0)

Mobile.tap(findTestObject('New_Player_Creation/android.widget.TextView - Create New Player'), 0)

Mobile.setText(findTestObject('New_Player_Creation/android.widget.EditText'), 'Home team', 0)

Mobile.setText(findTestObject('New_Player_Creation/android.widget.EditText (1)'), 'Player 1', 0)

Mobile.setText(findTestObject('New_Player_Creation/android.widget.EditText (2)'), 'testautomation@mailinator.com', 0)

'add button'
Mobile.tap(findTestObject('New_Player_Creation/android.widget.TextView - ADD'), 0)

Mobile.scrollToText('Home team')

'validate name'
Mobile.tap(findTestObject('New_Player_Creation/android.widget.TextView - Home Team Player 1'), 0)

'home team selection confirmation'
Mobile.tap(findTestObject('New_Player_Creation/android.widget.ImageView'), 0)

'away team create new player button'
Mobile.tap(findTestObject('New_Player_Creation/android.widget.TextView - Create New Player (1)'), 0)

Mobile.setText(findTestObject('New_Player_Creation/android.widget.EditText'), 'Away Team', 0)

Mobile.setText(findTestObject('New_Player_Creation/android.widget.EditText (1)'), 'Player', 0)

Mobile.setText(findTestObject('New_Player_Creation/android.widget.EditText (2)'), 'testautomation2@mailinator.com', 0)

'player added'
Mobile.tap(findTestObject('New_Player_Creation/android.widget.TextView - ADD'), 0)

Mobile.scrollToText('Away team')

Mobile.tap(findTestObject('New_Player_Creation/android.widget.TextView - Away Team Player'), 0)

'away team player added'
Mobile.tap(findTestObject('New_Player_Creation/android.widget.ImageView'), 0)

Mobile.closeApplication()

