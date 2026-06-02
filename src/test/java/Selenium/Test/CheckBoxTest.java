package Selenium.Test;

import Selenium.BaseTest;
import Selenium.page.CheckBoxPage;
import org.junit.jupiter.api.Test;

public class CheckBoxTest extends BaseTest {

    @Test
    public void checkBoxTest(){
        getWebDriver().get("https://demoqa.com/checkbox");

        CheckBoxPage checkBoxPage = new CheckBoxPage(getWebDriver());
        checkBoxPage.checkHome();
        checkBoxPage.checkDesktop();
        checkBoxPage.checkNotes();

    }
}
