package keypresses;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import base.BaseTests;

public class KeysPressesTests extends BaseTests {

    @Test
    public void testBackspace(){
        var keyPressesPage = homePage.clickKeyPressesLink();
        keyPressesPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPressesPage.getResult(), "You entered: BACK_SPACE");
    }

    @Test
    public void testPi(){
        var keyPressesPage = homePage.clickKeyPressesLink();
        keyPressesPage.enterPi();
        assertEquals(keyPressesPage.getResult(), "You entered: 4");
    }

}
