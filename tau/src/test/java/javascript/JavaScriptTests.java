package javascript;

import org.testng.annotations.Test;

import base.BaseTests;

public class JavaScriptTests extends BaseTests {

    @Test
    public void testScrollToTable(){
        homePage.clickLargeAndDeepDomLink().scrollToTable();
    }

    @Test
    public void testScrollToBottom(){
        homePage.clickInfiniteScrollLink().scrollToBottom(5);
    }

}
