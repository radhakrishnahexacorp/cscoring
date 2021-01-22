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

Mobile.tap(findTestObject('Object Repository/ReplacePlayer_with_NewPlayer/android.widget.TextView - Replace Player'), 0)

Mobile.tap(findTestObject('Object Repository/ReplacePlayer_with_NewPlayer/android.widget.CheckBox'), 0)

Mobile.tap(findTestObject('Object Repository/ReplacePlayer_with_NewPlayer/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/ReplacePlayer_with_NewPlayer/android.widget.TextView - Create New Player'), 
    0)

Mobile.setText(findTestObject('Object Repository/ReplacePlayer_with_NewPlayer/android.widget.EditText'), 'abc1', 0)

Mobile.setText(findTestObject('Object Repository/ReplacePlayer_with_NewPlayer/android.widget.EditText (1)'), 'test', 0)

Mobile.setText(findTestObject('Object Repository/ReplacePlayer_with_NewPlayer/android.widget.EditText (2)'), 'abc1@mailinator.com', 
    0)

Mobile.tap(findTestObject('Object Repository/ReplacePlayer_with_NewPlayer/android.widget.TextView - ADD'), 0)

Mobile.tap(findTestObject('Object Repository/ReplacePlayer_with_NewPlayer/android.widget.TextView - BENCH'), 0)

Mobile.tap(findTestObject('Object Repository/For 5 overs/android.widget.CheckBox (1)'), 0)

Mobile.tap(findTestObject('Object Repository/For 5 overs/android.widget.ImageView'), 0)

