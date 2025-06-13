package wait;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import base.BaseTests;

public class WaitTests extends BaseTests {

    @Test
    public void testWaitUntilHidden(){
        var loadingPage = homePage.clickDynamicLoadingLink().clickExample1Link();
        loadingPage.clickStartButton();
        assertEquals(loadingPage.getLoadedText(), "Hello World!");
    }
}
