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

'1. Enter start match\r\n2. Home team and away team player selection\r\n3. Toss selection\r\n4. Striker and non-striker selection\r\n5. Opening bowler and keeper selection.'
WebUI.callTestCase(findTestCase('Start_Scoring'), [:], FailureHandling.STOP_ON_FAILURE)

'1. Ball by ball 2.5 overs runs 30/5\r\n2. Extras\r\n3. Wickets.\r\n'
WebUI.callTestCase(findTestCase('Scoring runs test case'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Add_New_Player'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Replace_With_Newplayer'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('End innings button'), [:], FailureHandling.STOP_ON_FAILURE)

