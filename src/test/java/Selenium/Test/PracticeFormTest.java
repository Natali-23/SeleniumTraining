package Selenium.Test;

import Selenium.BaseTest;
import Selenium.page.PracticeFormPage;
import Selenium.page.TestBoxPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PracticeFormTest extends BaseTest {
private  PracticeFormPage practiceFormPage;
    @BeforeEach
    public void initPage() {
        practiceFormPage = new PracticeFormPage(getWebDriver());
        getWebDriver().get("https://demoqa.com/automation-practice-form");
    }

    @Test
    public void positivePracticeFormTest() {
        practiceFormPage.firstName("Name");
        practiceFormPage.lastName("LastName");
        practiceFormPage.gender();
        practiceFormPage.mobileNumber("9119105010");
        practiceFormPage.submitButton();

    }


