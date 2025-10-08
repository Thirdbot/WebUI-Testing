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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//open browser
// go to https://www.globalsqa.com/angularJs-protractor/BankingProject/
WebUI.openBrowser('https://www.globalsqa.com/angularJs-protractor/BankingProject/')

WebUI.click(findTestObject('BankProject/XYZ_Home/Button_Customer_Login'))

WebUI.selectAllOption(findTestObject('BankProject/Customer/Select Username'))

WebUI.click(findTestObject('BankProject/Customer/Username Login Button'))

WebUI.selectAllOption(findTestObject('BankProject/Customer/Select Currency'))

WebUI.click(findTestObject('BankProject/Customer/Deposit/Deposit Button'))

WebUI.click(findTestObject('BankProject/Customer/Deposit/Input Amount Deposit'))

WebUI.sendKeys(findTestObject('BankProject/Customer/Deposit/Input Amount Deposit'), '100')

WebUI.click(findTestObject('BankProject/Customer/Deposit/Confirm Deposit'))

WebUI.click(findTestObject('BankProject/Customer/Withdraw/Withdraw Button'))

WebUI.click(findTestObject('BankProject/Customer/Withdraw/Input Withdraw Amount'))

WebUI.sendKeys(findTestObject('BankProject/Customer/Withdraw/Input Withdraw Amount'), '50')

WebUI.click(findTestObject('BankProject/Customer/Withdraw/Confirm Withdraw'))

WebUI.click(findTestObject('BankProject/Customer/Transaction/Transaction Button'))

WebUI.click(findTestObject('BankProject/Customer/Transaction/Reset Table'))

WebUI.click(findTestObject('BankProject/Customer/Transaction/Top'))

WebUI.click(findTestObject('BankProject/Customer/Transaction/Back Button'))

WebUI.click(findTestObject('BankProject/Customer/button_XYZ Bank_btn logout'))

