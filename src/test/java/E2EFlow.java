import org.testng.annotations.Test;
import pages.NavigationPage;

import static org.testng.Assert.assertEquals;


public class E2EFlow extends BaseTest{

    @Test
    public void  TestSuccessfulLogin()
    {

        loginPage.AddName();
        loginPage.AddPassword();
        loginPage.EnterCode();
       NavigationPage navigationPage= loginPage.ClickLoginButton();
       navigationPage.ClosePopup();
        assertEquals(driver.getCurrentUrl(),"https://staging.nazeel.net:9002/dashboard");
        navigationPage.OpenReservation()



    }


}
