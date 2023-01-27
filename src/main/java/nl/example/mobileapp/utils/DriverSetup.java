package nl.example.mobileapp.utils;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
public class DriverSetup {
    public static AndroidDriver<AndroidElement> driver;
    public static AndroidDriver<AndroidElement> getDriver() {
        //System.out.println("***** Inside getDriver*****");
        if (driver == null) {
            createDriver();
        }
        return driver;
    }
    private static void createDriver() {
        System.out.println("***** Connecting Device *****");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        // Set the desired device capabilities
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:deviceName", "Android"); //udid
        capabilities.setCapability("appium:appPackage", "com.android.settings");
        capabilities.setCapability("appium:appActivity", ".Settings");

        // Set the desired appium server capabilities
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("newCommandTimeout", 60);

        String appiumUrl = System.getenv("APPIUM_URL");
        String appiumPort = System.getenv("APPIUM_PORT");
        String appiumServerUrl = appiumUrl+":"+appiumPort;

        // Initialize the AndroidDriver object
        try {
            //driver = new AndroidDriver<>(new URL(appiumServerUrl), capabilities);
            driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}
