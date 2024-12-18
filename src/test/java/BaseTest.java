import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;

import static org.testng.Assert.assertEquals;

public class BaseTest {

    public WebDriver driver;
    protected LoginPage loginPage;


    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://staging.nazeel.net:9002/login");
        driver.manage().window().maximize();
         loginPage=new LoginPage(driver);


    }




    }
