package pages;

import fragments.MainMenuFragment;

public class NewToursPage extends BasePage {

    MainMenuFragment mainMenuFragment = new MainMenuFragment();

    public boolean isMainMenuFragmentPresent() {
        return mainMenuFragment.getRootElement().isDisplayed();
    }
}
