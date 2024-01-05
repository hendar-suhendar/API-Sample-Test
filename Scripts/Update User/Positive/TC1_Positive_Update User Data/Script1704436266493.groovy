import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.RequestObject as RequestObject
import com.kms.katalon.core.testobject.TestObjectProperty as TestObjectProperty
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WebAPI
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import groovy.json.JsonSlurper
import groovy.json.JsonOutput
import java.sql.ResultSet


'Mengirim permintaan untuk update data user berdasrkan ID'
def response = WS.sendRequestAndVerify(findTestObject('Object Repository/Gorest/Update User/TC1_Positive_Update User Data'))

'Memverifikasi response status code telah sesuai atau tidak'
WS.verifyResponseStatusCode(response,200, FailureHandling.STOP_ON_FAILURE)

'Menampilkan response API pada log console'
println CustomKeywords.'api_property.services.print_response_body'(response)

'Memverifikasi data response telah sesuai atau tidak'
WS.verifyElementPropertyValue(response, 'id', '5894041')
WS.verifyElementPropertyValue(response, 'name', 'Tonny Stark')
WS.verifyElementPropertyValue(response, 'gender', 'male')
WS.verifyElementPropertyValue(response, 'email', 'Tonnystark@gmail.com')
WS.verifyElementPropertyValue(response, 'status', 'active')
