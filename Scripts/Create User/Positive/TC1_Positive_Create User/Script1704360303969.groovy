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



'Mengirim permintaan untuk membuat user baru'
def response = WS.sendRequestAndVerify(findTestObject('Object Repository/Gorest/Create User/TC1_Positive_Create User'))

'Memverifikasi response status code telah sesuai atau tidak'
WS.verifyResponseStatusCode(response,201, FailureHandling.STOP_ON_FAILURE)

'Menampilkan response API pada log console'
println CustomKeywords.'api_property.services.print_response_body'(response)

'Memverifikasi data response telah sesuai atau tidak'
WS.verifyElementPropertyValue(response, 'name', 'tonny')
WS.verifyElementPropertyValue(response, 'gender', 'male')
WS.verifyElementPropertyValue(response, 'email', 'tonny@mail.com')
WS.verifyElementPropertyValue(response, 'status', 'active')
