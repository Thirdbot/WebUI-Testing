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

WebUI.navigateToUrl('https://cms.demo.katalon.com/')

WebUI.click(findTestObject('Object Repository/KatalonShopProject/Checkout/TC1/Page_Katalon Shop  Katalon Ecommerce/a_Sale_button product_type_simple add_to_ca_c8f215'))

WebUI.click(findTestObject('Object Repository/KatalonShopProject/Checkout/TC1/Page_Katalon Shop  Katalon Ecommerce/a__button product_type_simple add_to_cart_b_a0e296'))

WebUI.click(findTestObject('Object Repository/KatalonShopProject/Checkout/TC1/Page_Katalon Shop  Katalon Ecommerce/a__button product_type_simple add_to_cart_b_a0e296_1'))

WebUI.click(findTestObject('Object Repository/KatalonShopProject/Checkout/TC1/Page_Katalon Shop  Katalon Ecommerce/a'))

WebUI.setText(findTestObject('Object Repository/KatalonShopProject/Checkout/TC1/Page_Checkout  Katalon Shop/input__billing_first_name'), 
    'Warin')

WebUI.setText(findTestObject('Object Repository/KatalonShopProject/Checkout/TC1/Page_Checkout  Katalon Shop/input__billing_last_name'), 
    'Saipanya')

WebUI.setText(findTestObject('Object Repository/KatalonShopProject/Checkout/TC1/Page_Checkout  Katalon Shop/input__billing_address_1'), 
    '-')

WebUI.setText(findTestObject('Object Repository/KatalonShopProject/Checkout/TC1/Page_Checkout  Katalon Shop/input__billing_city'), 
    'Sriracha')

WebUI.click(findTestObject('Object Repository/KatalonShopProject/Checkout/TC1/Page_Checkout  Katalon Shop/span__select2-billing_state-container'))

WebUI.setText(findTestObject('Object Repository/KatalonShopProject/Checkout/TC1/Page_Checkout  Katalon Shop/input_concat(id(, , select2-billing_state-c_53e431'), 
    'CHONBURI')

WebUI.sendKeys(findTestObject('Object Repository/KatalonShopProject/Checkout/temp/Page_Checkout  Katalon Shop/input_Themes Zone_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/KatalonShopProject/Checkout/TC1/Page_Checkout  Katalon Shop/input__billing_postcode'), 
    '20110')

WebUI.setText(findTestObject('Object Repository/KatalonShopProject/Checkout/TC1/Page_Checkout  Katalon Shop/input__billing_phone'), 
    '012-345-6789')

WebUI.setText(findTestObject('Object Repository/KatalonShopProject/Checkout/TC1/Page_Checkout  Katalon Shop/input__billing_email'), 
    'warin.sai@ku.th')

WebUI.click(findTestObject('KatalonShopProject/Checkout/TC1/Page_Checkout  Katalon Shop/button_privacy policy_place_order'))

