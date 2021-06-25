package org.example;

import org.testng.annotations.Test;

public class TestSuite extends BaseTest{
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();
    JewelleryPage jewelleryPage = new JewelleryPage();


    @Test
    public void userShouldbeAbleToRegisterSuccessfully() throws InterruptedException {
        homePage.clickOnRegisterLink();
        registerPage.enterRegisterationDetails();
    }

    @Test
    public void userShouldbeAbleToLoginSuccessfully() throws InterruptedException {
        homePage.clickOnLoginLink();
        loginPage.enterLoginDetails();
    }
    @Test
    public void userShouldbeAbleToclickSuccessfullyOnJewellery() throws InterruptedException {
        homePage.clickOnJewelleryLInk();
        jewelleryPage.clickOnFlowerGirlBracelet();
    }


}
