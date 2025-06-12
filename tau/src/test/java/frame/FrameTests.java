package frame;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import base.BaseTests;

public class FrameTests extends BaseTests {

    @Test
    public void testWysiwyg() {
        var editorPage = homePage.clickWysiwygEditorLink();
        editorPage.clearTextArea();
        String text1 = "Hello ";
        String text2 = "World";
        editorPage.setTextArea(text1);
        editorPage.clickDecreaseIndentButton();
        editorPage.setTextArea(text2);
        assertEquals(editorPage.getTextArea(), text1 + text2, "Text area content is incorrect");
    }
}
