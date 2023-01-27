package nl.example.mobileapp.pages.settings;

import nl.example.mobileapp.utils.DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class SettingsScreen {
    private final By batteryButton = By.xpath("//*[@text='Battery']");
    DriverSetup driver = new DriverSetup();
    public void clickSettingsBattery() {
        try{
            System.out.println("Tapping on battery in settings");
            driver.getDriver().findElement(batteryButton).click();
        } catch (NoSuchElementException e) {
            throw new RuntimeException(e);
        }
    }
}
