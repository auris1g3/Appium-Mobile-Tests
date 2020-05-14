package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import static com.codeborne.selenide.Selenide.$x;

public class UploadFilePage extends BasePage {

    private final SelenideElement chooseFileButton = $x("//div[@id='filelist']");
    String fileName = "setuplogfile.log";
    private final SelenideElement submitButton = $x("//button[@id='submitbutton']");
    private final SelenideElement message = $x("//h3/center");

    public void clickOnChooseFileButton() {
        chooseFileButton.click();
    }

    public void addFile() throws Exception {
        Robot robot = new Robot();
        robot.setAutoDelay(1000);
        StringSelection ss = new StringSelection("C:\\" + fileName);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        robot.setAutoDelay(2000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public void clickOnSubmitButton() {
        submitButton.click();
    }

    public boolean isMessageShown() {
        return message.waitUntil(Condition.visible, 1000).isDisplayed();
    }
}
