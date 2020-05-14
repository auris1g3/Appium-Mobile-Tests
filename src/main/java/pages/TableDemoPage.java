package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class TableDemoPage extends BasePage {

    private final SelenideElement table = $x("//table[@cellspacing]");

    public boolean isTableDemoPresent() {
        return table.waitUntil(Condition.visible, 1000).isDisplayed();
    }
}
