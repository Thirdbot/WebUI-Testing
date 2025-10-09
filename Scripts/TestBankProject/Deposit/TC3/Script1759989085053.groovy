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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login')

WebUI.click(findTestObject('Object Repository/BankProject/Deposit/TC3/Page_XYZ Bank/button_Logout_btn btn-primary btn-lg'))

WebUI.selectOptionByValue(findTestObject('Object Repository/BankProject/Deposit/TC3/Page_XYZ Bank/select_Your Name_userSelect'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/BankProject/Deposit/TC3/Page_XYZ Bank/button_Your Name_btn btn-default'))

WebUI.click(findTestObject('Object Repository/BankProject/Deposit/TC3/Page_XYZ Bank/button_Transactions_btn btn-lg tab'))

WebUI.setText(findTestObject('Object Repository/BankProject/Deposit/TC3/Page_XYZ Bank/input_Amount to be Deposited_form-control n_97f4dd'), 
    '32.7')

WebUI.click(findTestObject('Object Repository/BankProject/Deposit/TC3/Page_XYZ Bank/button_Amount to be Deposited_btn btn-default'))

WebUI.click(findTestObject('Object Repository/BankProject/Deposit/TC3/Page_XYZ Bank/button_Amount to be Deposited_btn btn-default'))

WebUI.click(findTestObject('Object Repository/BankProject/Deposit/TC3/Page_XYZ Bank/button_Amount to be Deposited_btn btn-default'))

