package dropdown;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.testng.annotations.Test;

import base.BaseTests;

public class DropdownTests extends BaseTests {

    @Test
    public void testDropdown(){
        var dropdownPage = homePage.clickDropdownLink();
        dropdownPage.selectFromDropdown("Option 1");
        List<String> selectedOptions = dropdownPage.getSelectedOption();
        assertEquals(selectedOptions.size(), 1);
        assertTrue(selectedOptions.contains("Option 1"));
    }
}
