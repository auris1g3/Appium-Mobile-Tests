package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class DragAndDropPage {


    private final SelenideElement message = $x("//a[text()='Perfect!']");
    private final SelenideElement bank = $x("//a[text()=' BANK ']/ancestor::li[@id='credit2']");
    private final SelenideElement accountDebit = $x("//li[@class='placeholder']/ancestor::ol[@id='bank']");
    private final SelenideElement sum = $x("//a[@class='button button-orange']/ancestor::li[@id='fourth']");
    private final SelenideElement amountDebit = $x("//li[@class='placeholder']/ancestor::ol[@id='amt7']");
    private final SelenideElement sale = $x("//a[text()=' SALES ']/ancestor::li[@id='credit1']");
    private final SelenideElement accountCredit = $x("//li[@class='placeholder']/ancestor::ol[@id='loan']");
    private final SelenideElement amountCredit = $x("//li[@class='placeholder']/ancestor::ol[@id='amt8']");

    public SelenideElement getBank() {
        return bank;
    }

    public SelenideElement getSum() {
        return sum;
    }

    public SelenideElement getSale() {
        return sale;
    }

    public boolean isNotMessageShown() {
        boolean isShown = message.isDisplayed();
        return !isShown;
    }

    public void moveDebitAccount() {
        ( bank ).dragAndDropTo(accountDebit);
    }

    public void moveDebitAmount() {
        ( sum ).dragAndDropTo(amountDebit);
    }

    public void moveCreditAccount() {
        ( sale ).dragAndDropTo(accountCredit);
    }

    public void moveCreditAmount() {
        ( sum ).dragAndDropTo(amountCredit);
    }

    public boolean isMessageShown() {
        return message.waitUntil(Condition.visible, 1000).isDisplayed();
    }
}
