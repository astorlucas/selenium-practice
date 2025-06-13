package javascript;

import org.testng.annotations.Test;

import base.BaseTests;

public class JavaScriptTests extends BaseTests {

    @Test
    public void testScrollToTable(){
        homePage.clickLargeAndDeepDomLink().scrollToTable();
    }

}
