package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AgilePage {

    private final SelenideElement welcomeMessage = $x("//marquee[@class='heading3']");

    public boolean isWelcomeMessagePresent() {
        return welcomeMessage.waitUntil(Condition.visible, 10000).isDisplayed();
    }
}
