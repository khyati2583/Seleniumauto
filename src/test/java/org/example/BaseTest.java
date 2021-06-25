package org.example;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils{
    BrowserSelector browserSelector = new BrowserSelector();

    @BeforeMethod
    public void launchBrowser(){
        browserSelector.openBrowser();
        driver.get("https://demo.nopcommerce.com/");
    }
    @AfterMethod
    public void closeBrowser() {
        driver.close();
    }
}
