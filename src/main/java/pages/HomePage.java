package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class HomePage extends BasePage {

    private final SelenideElement loginForm = $x("//input[@type='text']");

    public HomePage() {
    }

    public void navigate() {
        open("");
    }

    public boolean isLoginFormPresent() {
        return loginForm.isDisplayed();
    }
}
