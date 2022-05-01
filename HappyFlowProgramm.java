package Registration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HappyFlowProgramm {

    WebDriver driver;

    @BeforeMethod
        public void beforeMethod(){
        System.out.println("searching the product");
    }

    @Test
        public void searchingButton() throws InterruptedException {
        String baseUrl = "https://demo.nopcommerce.com/";

        System.out.println("Open Chrome Browser");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]")).sendKeys("shoes");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/button")).click();
        Thread.sleep(3000);

        WebElement hoveronNike = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[1]"));

        Actions actions = new Actions(driver);
        actions.moveToElement(hoveronNike).click().build().perform();
        Thread.sleep(4000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)","");

        WebElement Sizedrpdwn=driver.findElement(By.xpath("//*[@id=\"product_attribute_6\"]"));
        Select oSelect=new Select(Sizedrpdwn);
        oSelect.selectByVisibleText("8");
        WebElement Colour = driver.findElement(By.cssSelector("#product_attribute_7"));
        Select cSelect1 = new Select(Colour);
        cSelect1.selectByVisibleText("White/Blue");
        Thread.sleep(2000);
        WebDriverWait wait= new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"image-squares-8\"]/li[1]")))).click();
        // driver.findElement(By.xpath("//*[@id=\"image-squares-8\"]/li[2]")).click();

        Thread.sleep(2000);

        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,-2000)","");

        WebElement jewelry = driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[6]/a"));
        Actions actions1 = new Actions(driver);
        actions1.moveToElement(jewelry).click().build().perform();

        Thread.sleep(1000);

        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[3]/div[2]/button[1]")).click();

        Thread.sleep(2000);

        String text = driver.findElement(By.className("content")).getText();
        if (text.equals("The product has been added to your shopping cart")) {
            System.out.println("Item added to cart successfully");
        } else {
            System.out.println("Item not added to cart");
        }
        driver.findElement(By.linkText("shopping cart")).click();

        Thread.sleep(2000);


       // WebElement qty = driver.findElement(By.className("qty-input"));
        //WebElement updateCart = driver.findElement(By.name("updatecart"));
        //actions.sendKeys(qty, "2").build().perform();
        // actions.click(updateCart).build().perform();

        //WebElement email = driver.findElement(By.id("Email"));
        //WebElement password = driver.findElement(By.id("Password"));
        //WebElement loginBtn = driver.findElement(By.className("login-button"));

       // Actions actions2 = new Actions(driver);

        //actions2.sendKeys(email, "test@gmail.com").build().perform();
        //actions2.sendKeys(password, "testing").build().perform();
       // actions.click(loginBtn).build().perform();


        Thread.sleep(2000);
        WebElement termsOfService = driver.findElement(By.id("termsofservice"));
        WebElement checkOutBtn = driver.findElement(By.id("checkout"));
        actions.click(termsOfService).build().perform();
        actions.click(checkOutBtn).build().perform();

        Thread.sleep(3000);

       // driver.findElement(By.id("email")).sendKeys("test1249@test.com");
      //  driver.findElement(By.id("passwd")).sendKeys("PKR@PKR");
       //y driver.findElement(By.id("SubmitLogin")).click();


        driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("kk@yahoo.com");
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("kd25");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();


        //driver.findElement(By.id("add-to-cart-button-24")).click();

        /*WebElement Cart = driver.findElement(By.cssSelector("##add-to-cart-button-24"));
        Select pSelect3= new Select(Cart);
        pSelect3.selectByVisibleText("Addtocart");

         */

        //driver.findElement(By.xpath("//*[@id=\"product_enteredQuantity_24\"]")).clear();

       // Thread.sleep(2000);


    /*
       WebDriverWait wait= new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-24\"]")))).click();


        String text = driver.findElement(By.className("content")).getText();
        if (text.equals("The product has been added to your shopping cart")) {
            System.out.println("Item added to cart successfully");
        } else {
            System.out.println("Item not added to cart");
        }
        driver.findElement(By.linkText("shopping cart")).click();

             Thread.sleep(2000);
            WebElement termsOfService = driver.findElement(By.id("termsofservice"));
            WebElement checkOutBtn = driver.findElement(By.id("checkout"));
            actions.click(termsOfService).build().perform();
            actions.click(checkOutBtn).build().perform();

        WebElement hoveronAddTocart = driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-24\"]"));
        Actions actions1 = new Actions(driver);
        actions1.moveToElement(hoveronAddTocart).click().build().perform();



        driver.findElement(By.id("add-to-cart-button-24")).click();


        Thread.sleep(3000);

        String text = driver.findElement(By.className("content")).getText();
        if (text.equals("The product has been added to your shopping cart")) {
            System.out.println("Item added to cart successfully");
        } else {
            System.out.println("Item not added to cart");
        }
        driver.findElement(By.linkText("shopping cart")).click();

     */

        Thread.sleep(2000);

    }

    @AfterMethod
    public void afterMethod() throws InterruptedException {
        System.out.println("close");
        Thread.sleep(5000);
       driver.close();
    }


        }



