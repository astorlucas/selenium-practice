package alert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.selenium.pages.HomePage;
import com.selenium.pages.LoginPage;
import com.selenium.pages.SecureAreaPage;

import base.BaseTests;

public class AlertTests extends BaseTests {

@Test
public void testAlert(){
    var alertsPage = homePage.clickAlertsLink();
    alertsPage.clickTriggerAlertButton();
    alertsPage.acceptAlertButton();
    assertEquals(alertsPage.getResult(), "You successfully clicked an alert");
}

@Test
public void testGetTextFromAlert(){
    var alertsPage = homePage.clickAlertsLink();
    alertsPage.clickTriggerAlertButton();
    assertEquals(alertsPage.getConfirmText(), "I am a JS Alert");
}

@Test
public void testConfirmAlert(){
    var alertsPage = homePage.clickAlertsLink();
    alertsPage.clickTriggerConfirmButton();
    alertsPage.clickDismissAlertButton();
    assertEquals(alertsPage.getConfirmText(), "I am a JS Confirm");
}

}
