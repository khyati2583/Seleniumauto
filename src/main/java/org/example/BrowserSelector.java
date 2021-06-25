package org.example;



import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


import java.util.concurrent.TimeUnit;

public class BrowserSelector extends BasePage {
    LoadProperty loadProperty = new LoadProperty();

    String browserName =loadProperty.getProperty("browser");

    public void openBrowser(){

        if (browserName.equalsIgnoreCase("Chrome"))
        {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\amit_\\IdeaProjects\\SeleniumAuto\\chromedriver.exe");

            driver = new ChromeDriver();
        }
        else if (browserName.equalsIgnoreCase("edge"))
        {
            System.setProperty("webdriver.edge.driver","C:\\Users\\amit_\\IdeaProjects\\SeleniumAuto\\msedgedriver.exe");


            driver = new EdgeDriver();
        }else
        {
            System.out.println("In correct browser name or empty...:"+browserName);
        }



        // maximize the browser window
        driver.manage().window().maximize();
        // applying implicit wait to driver object
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

}