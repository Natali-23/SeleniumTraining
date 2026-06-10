package Selenium.Test;

import Selenium.BaseTest;
import Selenium.page.WebtablesPage;
import org.junit.jupiter.api.Test;

public class WebtablesTest extends BaseTest {

    @Test
    public void webtablesTestAddPerson() {

        getWebDriver().get("https://demoqa.com/webtables");

        WebtablesPage webtablesPage =
                new WebtablesPage(getWebDriver());

        webtablesPage.addButton();
        webtablesPage.addFirstName("Kate");
        webtablesPage.addLastName("Liaison");
        webtablesPage.addEmail("qwerty12345@yandex.ru");
        webtablesPage.addAge("34");
        webtablesPage.addSalary("123345");
        webtablesPage.addDepart("department");
        webtablesPage.clickButton();


    }

    @Test
    public void webtablesTestDeletePerson() {
        getWebDriver().get("https://demoqa.com/webtables");

        WebtablesPage webtablesPage =
                new WebtablesPage(getWebDriver());

        webtablesPage.deletePerson();
    }
}
