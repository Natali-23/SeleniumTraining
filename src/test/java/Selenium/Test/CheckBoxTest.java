package Selenium.Test;

import Selenium.BaseTest;
import Selenium.page.CheckBoxPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckBoxTest extends BaseTest {

    @Test
    public void checkBoxTest() {

        getWebDriver().get("https://demoqa.com/checkbox");

        CheckBoxPage page = new CheckBoxPage(getWebDriver());

        page.openHome();
        page.openDesktop();
        page.chooseNotes();

        Assertions.assertTrue(page.isCheckedPage());
    }

    }

