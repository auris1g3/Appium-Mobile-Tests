import com.codeborne.selenide.Selenide;
import fragments.AgileLoginFragment;
import fragments.MainMenuFragment;
import org.testng.annotations.Test;
import pages.AgilePage;
import pages.HomePage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AgileTest extends MobileWebTest {

    @Test
    public void agilePositiveTest() {
        HomePage homePage = new HomePage();
        AgilePage agilePage = new AgilePage();
        AgileLoginFragment agileLoginFragment = new AgileLoginFragment();
        MainMenuFragment mainMenuFragment = new MainMenuFragment();
        homePage.navigate();
        mainMenuFragment.clickOnAgileProjectButton();
        agileLoginFragment.EnterLoginAndPassword("1303", "Guru99");
        assertTrue(agilePage.isWelcomeMessagePresent());
    }

    @Test
    public void agilePageNegativeLogin(){
        HomePage homePage = new HomePage();
        AgileLoginFragment agileLoginFragment = new AgileLoginFragment();
        MainMenuFragment mainMenuFragment = new MainMenuFragment();
        homePage.navigate();
        mainMenuFragment.clickOnAgileProjectButton();
        agileLoginFragment.EnterLoginAndPassword("qwerty","54321");
        assertEquals("User or Password is not valid", Selenide.switchTo().alert().getText());
        Selenide.switchTo().alert().accept();
    }
}
