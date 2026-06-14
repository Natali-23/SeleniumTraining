package Selenium.Test;

import Selenium.BaseTest;
import Selenium.page.ButtonPage;
import Selenium.page.CheckBoxPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ButtonTest extends BaseTest {
    private ButtonPage button;

@BeforeEach
public void initPage(){
    button = new ButtonPage(getWebDriver());
}

    @Test
    public void doubleClickButton() {
        getWebDriver().get("https://demoqa.com/buttons");
        button.doubleClick();
    }

    @Test
    public void RightClickButton(){
        getWebDriver().get("https://demoqa.com/buttons");
        button.rightClick();
    }

    @Test
    public void dinamickClickButton(){
        getWebDriver().get("https://demoqa.com/buttons");
        button.dinamickClick();
    }
}
