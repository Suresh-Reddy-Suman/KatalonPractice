import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('https://www.google.co.in')

WebUI.setText(findTestObject('Object Repository/input_SearchField'), 'Puppies')

WebUI.sendKeys(findTestObject('Object Repository/input_SearchField'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.closeBrowser()