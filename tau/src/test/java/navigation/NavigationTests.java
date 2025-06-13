package navigation;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import base.BaseTests;

public class NavigationTests extends BaseTests {

    @Test
    public void testBackAndForwardNavigation(){
        var loadingPage = homePage.clickDynamicLoadingLink().clickExample1Link();
        getWindowManager().goBack();
        getWindowManager().refresh();
        getWindowManager().goTo("https://google.com");
    }

    @Test
    public void testSwitchToTab(){
        var multipleWindowsPage = homePage.clickMultipleWindowsLink();
        multipleWindowsPage.clickHereLink();
        getWindowManager().switchToTab("New Window");
        assertEquals(driver.getTitle(), "New Window");
    }

}
