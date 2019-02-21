import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.acceptAlert()

WebUI.verifyEqual(null, null)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://login.salesforce.com/')

WebUI.setText(findTestObject('Object Repository/IDF/Page_Login  Salesforce/input_Username_username'), 'dev.admin@symphony.com')

WebUI.setEncryptedText(findTestObject('Object Repository/IDF/Page_Login  Salesforce/input_Password_pw'), 'JoIhoEp72ZeVlgc3r+fsUQ==')

WebUI.click(findTestObject('Object Repository/IDF/Page_Login  Salesforce/input_Password_Login'))

WebUI.click(findTestObject('Object Repository/IDF/Page_Home  Salesforce/div_View profile_slds-r4'))

WebUI.click(findTestObject('Object Repository/IDF/Page_Home  Salesforce/div_View profile_slds-icon-waf'))

WebUI.click(findTestObject('Object Repository/IDF/Page_Home  Salesforce/a_System Administrator'))

WebUI.click(findTestObject('Object Repository/IDF/Page_Home  Salesforce/span_Portfolio'))

WebUI.switchToWindowTitle('CategoryView | Salesforce')

WebUI.click(findTestObject('Object Repository/IDF/Page_CategoryView  Salesforce/button_Submit New Disclosure'))

WebUI.setText(findTestObject('Object Repository/IDF/Page_/input_Invention Title_inputTex'), 'Title for ID #1')

WebUI.click(findTestObject('Object Repository/IDF/Page_/span_Next'))

WebUI.click(findTestObject('Object Repository/IDF/Page_/span_Finish'))

WebUI.click(findTestObject('Object Repository/IDF/Page_Home  Salesforce/img_Notifications_profileTrigg'))

WebUI.click(findTestObject('Object Repository/IDF/Page_Home  Salesforce/a_Log Out'))

WebUI.closeBrowser()

