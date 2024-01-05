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
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

import java.sql.Connection
import java.sql.DriverManager
import java.sql.Statement

public class ConnectDB {
	
	Connection conn = null
	
	
		def ConnectSQL(){
	
			try {
	
				Class.forName("org.postgresql.Driver")
				conn = DriverManager.getConnection("jdbc:postgresql://pgpool-new-env-staging-f0e04b9661ffc117.elb.ap-southeast-1.amazonaws.com:54322/sample_tms",
						"pgpool", "h93xChVKUxOMDt4U")
	
				conn.setAutoCommit(false)
	
				return conn.createStatement()
			} catch ( Exception error ) {
	
				System.err.println( error.getClass().getName()+": "+ error.getMessage() )
				System.exit(0)
			}
		}
	
	
	
		def closeConnection() {
	
			if(conn != null && !conn.isClosed()){
				conn.close()
			}
			conn = null
		}
}
