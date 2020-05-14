package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AndroidCalculator {

    public AndroidCalculator clickOnNumber(int number) {
        $(By.id("digit_" + number)).click();
        return this;
    }

    public AndroidCalculator clickOnPoint() {
        $(By.id("dec_point")).click();
        return this;
    }

    public AndroidCalculator clickOnMultiplyButton() {
        $(By.id("op_mul")).click();
        return this;
    }

    public AndroidCalculator clickOnAddButton() {
        $(By.id("op_add")).click();
        return this;
    }

    public AndroidCalculator clickOnDeleteButton() {
        $(By.id("del")).click();
        return this;
    }

    public AndroidCalculator clickOnPercentButton() {
        $(By.id("op_pct")).click();
        return this;
    }

    public void clickOnEqual() {
        $(By.id("eq")).click();
    }

    public SelenideElement getResult() {
        return $(By.id("result_final"));
    }

    public SelenideElement getInputField() {
        return $(By.id("formula"));
    }
}
