import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;

public class MobileWebTest {

    @BeforeClass
    public void setUp() {
        closeWebDriver();
        Configuration.startMaximized = false;
        Configuration.browserSize = null;
        Configuration.browser = AndroidDriverSetUp.class.getName();
    }
}
