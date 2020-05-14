import fragments.MainMenuFragment;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.NewToursPage;
import pages.TableDemoPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SmokeNavigationTests extends MobileWebTest {

    @Test
    public void navigateToHomePage(){
        HomePage homePage = new HomePage();
        homePage.navigate();
        assertEquals("Guru99 Bank Home Page", homePage.getTitle());
    }

    @Test
    public void navigateToNewToursPage(){
        HomePage homePage = new HomePage();
        MainMenuFragment mainMenuFragment = new MainMenuFragment();
        NewToursPage newToursPage = new NewToursPage();
        homePage.navigate();
        mainMenuFragment.ClickOnNewToursButton();
        assertEquals("Welcome: Mercury Tours", newToursPage.getTitle());
        assertTrue(newToursPage.isMainMenuFragmentPresent());
    }

    @Test
    public void navigateToTableDemoPage(){
        HomePage homePage = new HomePage();
        TableDemoPage tableDemoPage = new TableDemoPage();
        MainMenuFragment mainMenuFragment = new MainMenuFragment();
        homePage.navigate();
        mainMenuFragment.clickOnTableDemo();
        assertEquals("Table Demo", tableDemoPage.getTitle());
        assertTrue(tableDemoPage.isTableDemoPresent());
    }
}
