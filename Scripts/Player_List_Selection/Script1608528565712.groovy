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

Mobile.setText(findTestObject('Object Repository/Player_List_Selection/android.widget.EditText - Email (1)'), 'csbuddy123@mailinator.com',
	0)

Mobile.setText(findTestObject('Object Repository/Player_List_Selection/android.widget.EditText - Password'), 'cs@123456',
	0)

Mobile.tap(findTestObject('Object Repository/Player_List_Selection/android.widget.Button - Log in'), 0)

Mobile.tap(findTestObject('Object Repository/Player_List_Selection/android.widget.TextView - Start Scoring'), 0)

Mobile.tap(findTestObject('Object Repository/Player_List_Selection/android.widget.CheckBox'), 0)

Mobile.tap(findTestObject('Object Repository/Player_List_Selection/android.widget.CheckBox (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Player_List_Selection/android.widget.CheckBox (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Player_List_Selection/android.widget.CheckBox (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Player_List_Selection/android.widget.CheckBox (4)'), 0)

Mobile.tap(findTestObject('Object Repository/Player_List_Selection/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Player_List_Selection/android.widget.CheckBox (5)'), 0)

Mobile.tap(findTestObject('Object Repository/Player_List_Selection/android.widget.CheckBox (6)'), 0)

Mobile.tap(findTestObject('Object Repository/Player_List_Selection/android.widget.CheckBox (7)'), 0)

Mobile.tap(findTestObject('Object Repository/Player_List_Selection/android.widget.CheckBox (8)'), 0)

Mobile.tap(findTestObject('Object Repository/Player_List_Selection/android.widget.CheckBox (9)'), 0)

Mobile.tap(findTestObject('Player_List_Selection/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Player_List_Selection/android.widget.TextView - Select'), 0)

Mobile.tap(findTestObject('Object Repository/Player_List_Selection/android.widget.TextView - One Day Cricket'), 0)

Mobile.tap(findTestObject('Player_List_Selection/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Player_List_Selection/android.widget.TextView - Select (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Player_List_Selection/android.widget.TextView - Test Cricket'), 0)

Mobile.tap(findTestObject('Object Repository/Player_List_Selection/android.widget.TextView - Bat'), 0)

Mobile.tap(findTestObject('Object Repository/Player_List_Selection/android.widget.TextView - select (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Player_List_Selection/android.widget.Button - DONE'), 0)

Mobile.tap(findTestObject('Object Repository/Player_List_Selection/android.widget.LinearLayout (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Player_List_Selection/android.widget.TextView - Striker'), 0)

Mobile.tap(findTestObject('Object Repository/Player_List_Selection/android.widget.CheckBox (10)'), 0)

Mobile.tap(findTestObject('Object Repository/Player_List_Selection/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Player_List_Selection/android.widget.TextView - Non Striker'), 0)

Mobile.tap(findTestObject('Player_List_Selection/android.widget.CheckBox'), 0)

