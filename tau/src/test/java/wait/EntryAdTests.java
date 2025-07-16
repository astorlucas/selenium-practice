package wait;

import java.time.Duration;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
 
import com.selenium.pages.EntryAdPage;
 
import base.BaseTests;
 
public class EntryAdTests extends BaseTests {
 
    @Test
    public void testEntryAdModal() {
        driver.get("https://the-internet.herokuapp.com/entry_ad");
        EntryAdPage entryAdPage = new EntryAdPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("modal")));
        Assert.assertTrue(driver.findElement(By.id("modal")).isEnabled());
 
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Close']")));
        entryAdPage.closeModal();
        Assert.assertFalse(driver.findElements(By.id("modal")).get(0).isDisplayed());
    }
}
