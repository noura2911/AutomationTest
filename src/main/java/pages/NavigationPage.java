package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NavigationPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By ClosePopup= By.xpath("/html/body/div/app-root/nazeel-dashboard/div/div/main/app-home/app-verify-mobile-number-user/kendo-dialog/div[2]/kendo-dialog-actions/button[2]");


    public NavigationPage (WebDriver driver)
    {
        this.driver=driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(30));

    }

    public void ClosePopup() {

        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(ClosePopup).click();
        }





    }


