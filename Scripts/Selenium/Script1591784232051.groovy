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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://www.seleniumeasy.com/test/basic-checkbox-demo.html')

for (def rowNum = 1; rowNum <= findTestData('testing22').getRowNumbers(); rowNum++) {
    if (findTestData('testing22').getValue(1, rowNum) == 'cek') {
        WebUI.check(findTestObject('o1'))
    }
    
    if (findTestData('testing22').getValue(1, rowNum) == 'uncek') {
        WebUI.uncheck(findTestObject('o1'))
    }
    
    if (findTestData('testing22').getValue(2, rowNum) == 'cek') {
        WebUI.check(findTestObject('o2'))
    }
    
    if (findTestData('testing22').getValue(2, rowNum) == 'uncek') {
        WebUI.uncheck(findTestObject('o2'))
    }
    
    if (findTestData('testing22').getValue(3, rowNum) == 'cek') {
        WebUI.check(findTestObject('o3'))
    }
    
    if (findTestData('testing22').getValue(3, rowNum) == 'uncek') {
        WebUI.uncheck(findTestObject('o3'))
    }
    
    if (findTestData('testing22').getValue(4, rowNum) == 'cek') {
        WebUI.check(findTestObject('o4'))
    }
    
    if (findTestData('testing22').getValue(4, rowNum) == 'uncek') {
        WebUI.uncheck(findTestObject('o4'))
    }
}

