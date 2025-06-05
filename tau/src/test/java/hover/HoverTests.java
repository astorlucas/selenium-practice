package hover;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

import com.selenium.pages.HoversPage;

import base.BaseTests;

public class HoverTests extends BaseTests {

    @Test
    public void testHoverOverFigure(){
        var hoversPage = homePage.clickHoversLink();
        hoversPage.hoverOverFigure(1);
        var caption = hoversPage.new FigureCaption(driver.findElement(By.cssSelector(".figure:nth-of-type(1) h5")), 
                                                  driver.findElement(By.cssSelector(".figure:nth-of-type(1) a")));

        assertTrue(caption.isCaptionDisplayed(), "Caption not displayed");
        assertEquals(caption.getTitle(), "name: user1", "Caption title incorrect");
        assertEquals(caption.getLinkUrl(), "https://the-internet.herokuapp.com/users/1", "Caption link URL incorrect");

    }
}
