package alert;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTests;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        var fileUploadPage = homePage.clickFileUploadLink();
        fileUploadPage.uploadFile("C:\\Users\\Mara\\Downloads\\MTG Print.pdf");
        assertEquals(fileUploadPage.getUploadedFiles(), "MTG Print.pdf");
    }
}
