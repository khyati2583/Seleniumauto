package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class JewelleryPage extends Utils{
    LoadProperty loadProperty = new LoadProperty();

    private By _waitforclick = By.xpath("/html/body/div[6]/div[2]/ul[1]/li[6]/a");
    private By _clickonFlowerGirlBracelet = By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[3]/div[2]/button[1]");

    private By _clickOnShoppingCart = By.xpath("//*[@id=\"bar-notification\"]/div/p/a");
    private By _updatecart = By.xpath("//*[@id=\"shopping-cart-form\"]/div[2]/div[1]/button[1]");
    private By _termsService = By.id("termsofservice");
    private By _checkOutBtn = By.id("checkout");


    public void  clickOnFlowerGirlBracelet() throws InterruptedException {


            waitForClickable(_waitforclick,5000);
        Thread.sleep(2000);
            clickOnElement(_clickonFlowerGirlBracelet);


        clickOnElement(_clickOnShoppingCart);
        clickOnElement(_updatecart);
        clickOnElement(_termsService);
        clickOnElement(_checkOutBtn);

        }
    }


