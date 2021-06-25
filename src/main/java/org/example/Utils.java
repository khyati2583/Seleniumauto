package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BasePage {
    public WebElement getElement(By locator) {
        WebElement element = driver.findElement(locator);
        return element;
    }

    public void element(By String) {
        getElement(String).click();
    }

    public static void waitForClickable(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public static void selectFromDropDownValue(By by, String value) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }

    public static void selectFromDropDownByIndex(By by, int index) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);
    }

    public static void selectFromDropdownByVisibleText(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    public static String getTextFRomElement(By by) {

        return driver.findElement(by).getText();
    }

    public static void enterText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    public static String timestamp(By by) {

        return driver.findElement(by).getText();
    }

    public static String getSelectedTextFromDropDown(By by) {

        Select select = new Select(driver.findElement(by));
        return select.getFirstSelectedOption().getText();
    }

    public static String dateStamp() {
        SimpleDateFormat format = new SimpleDateFormat("ddMMyyyyHHmmss");
        return format.format(new Date());

    }

}
