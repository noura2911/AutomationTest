package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By username = By.id("usern");
    private By password = By.id("pass");
    private By code = By.id("acc");
    private By loginButton = By.xpath("/html/body/div/app-root/app-login/div/div/div/div[2]/div[2]/form/button");



    public LoginPage(WebDriver driver)
     {
        this.driver = driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void AddName()
    {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(username)));
        driver.findElement(username).sendKeys("Noura Ezzat");
    }
    public void AddPassword()
    {

        driver.findElement(password).sendKeys("123456Nn&&");
    }

    public void EnterCode()
    {

        driver.findElement(code).sendKeys("01373");
    }


    public NavigationPage ClickLoginButton()
    {

        driver.findElement(loginButton).click();
        return new NavigationPage(driver);

    }





}
