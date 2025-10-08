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

WebUI.openBrowser('https://www.globalsqa.com/angularJs-protractor/BankingProject/')

WebUI.click(findTestObject('BankProject/XYZ_Home/Button_Manager_Login'))

WebUI.click(findTestObject('BankProject/Manager/customer/Customers'))

WebUI.click(findTestObject('BankProject/Manager/customer/InputSearchCustomer'))

WebUI.sendKeys(findTestObject('BankProject/Manager/customer/InputSearchCustomer'), 'Neville')

WebUI.click(findTestObject('BankProject/Manager/customer/SortFirstName'))

WebUI.click(findTestObject('BankProject/Manager/customer/SortLastname'))

WebUI.click(findTestObject('BankProject/Manager/customer/SortPostCode'))

WebUI.click(findTestObject('BankProject/Manager/customer/DeleteButton'))

WebUI.click(findTestObject('BankProject/Manager/OpenAccount/Open Account'))

WebUI.selectAllOption(findTestObject('BankProject/Manager/OpenAccount/CustomerNameSelect'))

WebUI.selectAllOption(findTestObject('BankProject/Manager/OpenAccount/CurrencySelect'))

WebUI.click(findTestObject('BankProject/Manager/OpenAccount/ProcessButton'))

WebUI.acceptAlert()

WebUI.click(findTestObject('BankProject/Manager/addcustomer/Add Customer'))

WebUI.click(findTestObject('BankProject/Manager/addcustomer/InputFirstName'))

WebUI.sendKeys(findTestObject('BankProject/Manager/addcustomer/InputFirstName'), 'Punnaphop')

WebUI.click(findTestObject('BankProject/Manager/addcustomer/InputLastName'))

WebUI.sendKeys(findTestObject('BankProject/Manager/addcustomer/InputLastName'), 'Meerit')

WebUI.click(findTestObject('BankProject/Manager/addcustomer/inputPostCode'))

WebUI.sendKeys(findTestObject('BankProject/Manager/addcustomer/inputPostCode'), '65000')

WebUI.click(findTestObject('BankProject/Manager/addcustomer/Add Cutomer Button'))

WebUI.acceptAlert()

WebUI.click(findTestObject('BankProject/Manager/button_XYZ Bank_btn logout'))

