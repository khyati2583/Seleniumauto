package org.example;


import org.openqa.selenium.By;

public class HomePage extends Utils {

    LoadProperty loadProperty = new LoadProperty();

    private   By waitforRegisterLink = By.linkText("Register");
    private By _clickOnRegister = By.linkText("Register");
    private By _waitforLoginLink = By.linkText("Log in");
    private By _clickOnLogin = By.linkText("Log in");
    private By _Jewellery = By.xpath("/html/body/div[6]/div[2]/ul[1]/li[6]/a");



    public void clickOnRegisterLink() {
        waitForClickable(waitforRegisterLink, 5000);
        clickOnElement(_clickOnRegister);

    }

    public void clickOnLoginLink() {
        waitForClickable(_waitforLoginLink,5000);
        clickOnElement(_clickOnLogin);

    }

    public void clickOnJewelleryLInk(){
        clickOnElement(_Jewellery);

    }



    }

