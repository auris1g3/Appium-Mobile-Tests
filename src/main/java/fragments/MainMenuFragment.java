package fragments;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainMenuFragment extends BaseFragment {

    SelenideElement rootElement = $x("//div[@class='row']");
    private final SelenideElement newToursButton = $x("//a[contains(text(), 'New Tours')]");
    private final SelenideElement dropDownMenuSelenium = $x("//a[@class='dropdown-toggle' and contains(text(), 'Selenium')]");
    private final SelenideElement tableDemoButton = $x("//a[contains(text(), 'Table Demo')]");
    private final SelenideElement uploadFileButton = $x("//a[contains(text(), 'File Upload')]");
    private final SelenideElement dragAndDropButton = $x("//a[contains(text(), 'Drag and Drop Action')]");
    private final SelenideElement agileProjectButton = $x("//a[contains(text(), 'Agile Project')]");

    public MainMenuFragment() {
        super.rootElement = rootElement;
    }

    public SelenideElement getRootElement() {
        return rootElement;
    }

    public void ClickOnNewToursButton() {
        newToursButton.click();
    }

    public void clickOnTableDemo() {
        dropDownMenuSelenium.click();
        tableDemoButton.click();
    }

    public void clickOnUploadFile() {
        dropDownMenuSelenium.click();
        uploadFileButton.click();
    }

    public void clickOnDragAndDropActions() {
        dropDownMenuSelenium.click();
        dragAndDropButton.click();
    }

    public void clickOnAgileProjectButton() {
        agileProjectButton.click();
    }
}
