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

Mobile.tap(findTestObject('Object Repository/Action_items/android.widget.Button - Action'), 0)

Mobile.tap(findTestObject('Object Repository/Replacing_with_existing_Player/android.widget.TextView - Replace Player'), 
    0)

Mobile.tap(findTestObject('Object Repository/Replacing_with_existing_Player/android.widget.TextView - Member'), 0)

Mobile.tap(findTestObject('Object Repository/Replacing_with_existing_Player/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Replacing_with_existing_Player/android.widget.TextView - Member (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Replacing_with_existing_Player/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Replacing_with_existing_Player/android.widget.RadioButton - Batting Details'), 
    0)

Mobile.tap(findTestObject('Object Repository/Replacing_with_existing_Player/android.widget.TextView - OK'), 0)

Mobile.tap(findTestObject('Action_items/android.widget.Button - Action'), 0)

Mobile.tap(findTestObject('Replacing_with_existing_Player/android.widget.TextView - Replace Player'), 0)

Mobile.tap(findTestObject('Replacing_with_existing_Player/android.widget.TextView - Member'), 0)

Mobile.tap(findTestObject('ReplacePlayer_with_NewPlayer/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Replacing_with_existing_Player/android.widget.TextView - BENCH'), 0)

Mobile.tap(findTestObject('Object Repository/Replacing_with_existing_Player/android.widget.TextView - Member (2)'), 0)

Mobile.tap(findTestObject('Replacing_with_existing_Player/android.widget.ImageView'), 0)

WebUI.getText(findTestObject('Action_items/android.widget.Button - Action'))

