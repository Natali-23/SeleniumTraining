package Selenium.Test;

import Selenium.BaseTest;
import Selenium.page.RadioButtonPage;
import org.junit.jupiter.api.Test;

public class RadioButtonTest extends BaseTest {

    @Test
    public void radioButtonTestClickYes(){
getWebDriver().get("https://demoqa.com/radio-button");
        RadioButtonPage radioButtonPage = new RadioButtonPage(getWebDriver());
        radioButtonPage.radioButtonYesClick();
    }

    @Test
    public void radioButtonTestClickImpressive(){
        getWebDriver().get("https://demoqa.com/radio-button");
        RadioButtonPage radioButtonPage = new RadioButtonPage(getWebDriver());
        radioButtonPage.RadioButtonImpressiveClick();
    }
}
