package org.example;

import org.openqa.selenium.By;

import static org.openqa.selenium.By.xpath;

public class RegisterPage extends Utils{

    LoadProperty loadProperty = new LoadProperty();
    private By _register = By.linkText("Register");
    private By _firstName = By.id("FirstName");
    private By _lastName = By.id("LastName");
    private By _dateOfBirth = By.name("DateOfBirthDay");
    private By _monthOfBirth = By.name("DateOfBirthMonth");
    private By _yearOfBirth = By.name("DateOfBirthYear");
    private By _emailId = xpath("//input[@id='Email']");
    private By _companyName = xpath("//input[@id='Company']");
    private By _password = By.id("Password");
    private By _confirmPassword = By.xpath("//*[@id=\"ConfirmPassword\"]");
    private By _registerButton = By.xpath("//*[@id=\"register-button\"]");

    public void enterRegisterationDetails() throws InterruptedException {

        waitForClickable(_register, 6000);
        Thread.sleep(2000);


        enterText(_firstName, loadProperty.getProperty("firstname"));
        enterText(_lastName,loadProperty.getProperty("lastname"));



        selectFromDropdownByVisibleText(_dateOfBirth, loadProperty.getProperty("dateofbirth"));
        selectFromDropdownByVisibleText(_monthOfBirth, loadProperty.getProperty("monthofbirth"));

        selectFromDropdownByVisibleText(_yearOfBirth, loadProperty.getProperty("yearofbirth"));

        enterText(_emailId, loadProperty.getProperty("emailId"));

        enterText(_companyName, loadProperty.getProperty("companyname"));

        driver.findElement(By.xpath("//*[@id=\"Newsletter\"]"));

        enterText(_password, loadProperty.getProperty("password"));

        enterText(_confirmPassword, loadProperty.getProperty("confirmpassword"));

        clickOnElement(By.name("register-button"));

    }
}
