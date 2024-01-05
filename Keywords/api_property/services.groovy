package api_property
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

import groovy.json.JsonSlurper
import groovy.json.JsonOutput
import java.sql.ResultSet

import com.kms.katalon.core.util.KeywordUtil

public class services {

	@Keyword
	def print_response_body(response) {
		def JSResponse = new JsonSlurper()
		def jsonResponse = JSResponse.parseText(response.getResponseText())
		return (JsonOutput.prettyPrint(response.getResponseText()))
	}

	@Keyword
	void addGlobalVariable(String name, def value) {
		GroovyShell shell1 = new GroovyShell()
		MetaClass mc = shell1.evaluate("internal.GlobalVariable").metaClass
		String getterName = "get" + name.capitalize()
		mc.'static'."$getterName" = { -> return value }
		mc.'static'."$name" = value
	}

	@Keyword
	def inputReplace(String str,varInput,varData ){
		String strJson = str.replaceFirst(varInput,varData);
		return strJson
	}
	@Keyword
	def timeWindow(String format){

		/*LocalDateTime myDateObj = LocalDateTime.now();
		 DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern(format);
		 String formattedDate = myDateObj.format(myFormatObj);*/

		//katalon conv time zone
		Date date = new Date();
		TimeZone.setDefault(TimeZone.getTimeZone("Asia/Jakarta"));
		Calendar cal = Calendar.getInstance(TimeZone.getDefault());
		//println date = cal.getTime();
		def formattedDate = date.format(format)

		return formattedDate
	}
}
