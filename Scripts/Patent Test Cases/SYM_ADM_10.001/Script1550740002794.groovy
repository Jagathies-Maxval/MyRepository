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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://symphonyipm-dev-ed.my.salesforce.com/')

WebUI.setText(findTestObject('Object Repository/Page_Login  Salesforce/input_Username_username'), 'symphony18@symphony.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login  Salesforce/input_Password_pw'), '8/3JcMP1cUbfnN5xMe0JeQ==')

WebUI.click(findTestObject('Object Repository/Page_Login  Salesforce/input_Password_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home  Salesforce/span_Import'))

WebUI.setText(findTestObject('Object Repository/Page_SymphonyIPM__ImportView  Sales/textarea_Please enter'), 'US9877896')

WebUI.click(findTestObject('Object Repository/Page_SymphonyIPM__ImportView  Sales/button_Import'))

WebUI.switchToWindowTitle('SymphonyIPM__ImportView | Salesforce')

WebUI.click(findTestObject('Object Repository/Page_SymphonyIPM__ImportView  Sales/a_here'))

WebUI.click(findTestObject('Object Repository/Page_MVIB-3632  Salesforce/span_Related'))

WebUI.doubleClick(findTestObject('Object Repository/Page_SYMP100526USORG1  Salesforce/span_US9877896B2'))

WebUI.click(findTestObject('Object Repository/Page_SYMP100526USORG1  Salesforce/div_PatentNo TitleFollowEditDe'))

WebUI.click(findTestObject('Object Repository/Page_SYMP100526USORG1  Salesforce/span_Notifications_uiImage'))

WebUI.closeBrowser()

