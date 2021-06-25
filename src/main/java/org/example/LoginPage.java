package org.example;

import org.openqa.selenium.By;

import static org.openqa.selenium.By.xpath;

public class LoginPage extends Utils{

    LoadProperty loadProperty = new LoadProperty();
    private By _waitforlogin = By.linkText("Log in");
    private By _login =  By.linkText("Log in");
    private By _emailId = xpath("//input[@id='Email']");
    private By _password = By.xpath("//*[@id=\"Password\"]");
    private By _loginButton = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button");


    public void enterLoginDetails() throws InterruptedException {

       // waitForClickable(_login, 6000);
        Thread.sleep(2000);

        enterText(_emailId, loadProperty.getProperty("emailId"));

        enterText(_password, loadProperty.getProperty("password"));

      clickOnElement(_loginButton);

    }

}
