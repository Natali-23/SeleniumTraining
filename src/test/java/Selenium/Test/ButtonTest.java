package Selenium.Test;

import Selenium.BaseTest;
import Selenium.page.ButtonPage;
import Selenium.page.CheckBoxPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ButtonTest extends BaseTest {
    private WebDriver driver;
ButtonPage button = new ButtonPage(getWebDriver());

    @Test
    public void doubleClickButton(){
        getWebDriver().get("https://demoqa.com/buttons");
        CheckBoxPage page = new CheckBoxPage(getWebDriver());
button.doubleClick();
    }
}
