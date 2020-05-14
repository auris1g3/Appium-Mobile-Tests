import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AndroidCalculator;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;

public class NativeAppTest extends AndroidDriverSetUp {


    @BeforeClass
    public void setUp() {
        closeWebDriver();
        Configuration.startMaximized = false;
        Configuration.browserSize = null;
        Configuration.browser = AndroidDriverSetUp.class.getName();
        open();
    }

    @Test
    public void AddTest() {
        AndroidCalculator androidCalculator = new AndroidCalculator();

        androidCalculator
                .clickOnNumber(3)
                .clickOnPoint()
                .clickOnNumber(8)
                .clickOnAddButton()
                .clickOnNumber(5)
                .clickOnEqual();
        androidCalculator.getResult().shouldHave(text("8.8"));
    }

    @Test
    public void MultiplyTest() {
        AndroidCalculator androidCalculator = new AndroidCalculator();

        androidCalculator
                .clickOnNumber(6)
                .clickOnPoint()
                .clickOnNumber(8)
                .clickOnDeleteButton()
                .clickOnDeleteButton()
                .clickOnMultiplyButton()
                .clickOnNumber(5)
                .clickOnEqual();
        androidCalculator.getResult().shouldHave(text("30"));
    }

    @Test
    public void DeleteSymbolsTest() {
        AndroidCalculator androidCalculator = new AndroidCalculator();

        androidCalculator
                .clickOnNumber(6)
                .clickOnNumber(0)
                .clickOnDeleteButton()
                .clickOnDeleteButton();
        androidCalculator.getInputField().shouldHave(text(""));
    }

    @Test
    public void PercentTest() {
        AndroidCalculator androidCalculator = new AndroidCalculator();

        androidCalculator
                .clickOnNumber(6)
                .clickOnNumber(0)
                .clickOnPercentButton()
                .clickOnNumber(5)
                .clickOnNumber(0)
                .clickOnEqual();
        androidCalculator.getResult().shouldHave(text("30"));
    }
}
