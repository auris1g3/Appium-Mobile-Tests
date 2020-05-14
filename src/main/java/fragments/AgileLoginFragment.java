package fragments;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AgileLoginFragment extends BaseFragment {

    private final SelenideElement loginField = $x("//input[@type='text']");
    private final SelenideElement passwordField = $x("//input[@type='password']");
    private final SelenideElement loginButton = $x("//input[@type='submit']");

    public void EnterLoginAndPassword(String userName, String password) {
        loginField.val(userName).click();
        passwordField.val(password).click();
    }

    public void clickOnLoginButton() {
        loginButton.click();
    }
}
