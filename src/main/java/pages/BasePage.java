package pages;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.title;

public class BasePage {

    public BasePage() {
        Configuration.baseUrl = "http://demo.guru99.com";
        Configuration.timeout = 5000;
    }

    public String getTitle() {
        return title();
    }
}
