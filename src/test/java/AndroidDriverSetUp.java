import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static io.appium.java_client.remote.AndroidMobileCapabilityType.APP_ACTIVITY;
import static io.appium.java_client.remote.AndroidMobileCapabilityType.APP_PACKAGE;

public class AndroidDriverSetUp implements WebDriverProvider {

    @Override
    public WebDriver createDriver(DesiredCapabilities capabilities) {
        capabilities.setCapability("platformVersion", "10.0");
        capabilities.setCapability("noReset", true);
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 100);
//        capabilities.setCapability(APP_PACKAGE, "com.google.android.calculator");
//        capabilities.setCapability(APP_ACTIVITY, "com.android.calculator2.Calculator");
        capabilities.setCapability("browserName", "Chrome");
        capabilities.setCapability("chromedriverExecutable", "C:\\Users\\potap\\.m2\\repository\\webdriver\\chromedriver\\win32\\81.0.4044.138\\chromedriver.exe");


        try {
            return new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
