package Selenium.Test;

import Selenium.BaseTest;
import Selenium.page.TestBoxPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestBoxTest extends BaseTest {
    private TestBoxPage testBoxPage;

    @BeforeEach
    public void initPage() {
        testBoxPage = new TestBoxPage(getWebDriver());
        getWebDriver().get("https://demoqa.com/text-box");
    }

    @Test
    public void positiveTestBox() {
        testBoxPage.FullName("Катя");
        testBoxPage.Email("qwerty@yandex.ru");
        testBoxPage.currentAddress("улица пупкина, дом залупкина");
        testBoxPage.permaentAddress("совпадает с нынешним адресом");
        testBoxPage.submitButton();

        Assertions.assertTrue(testBoxPage.getResultName().contains("Катя"),
                "Имя не совпадает! Ожидали Катя, а получили: " + testBoxPage.getResultName());
        Assertions.assertTrue(testBoxPage.getResultEmail().contains("qwerty@yandex.ru"));
        Assertions.assertTrue(testBoxPage.getResultCurrentAddress().contains("улица пупкина, дом залупкина"),
                "Адрес не найден в строке: " + testBoxPage.getResultCurrentAddress());
        Assertions.assertTrue(testBoxPage.getResultPermanentAddress().contains("совпадает с нынешним адресом"));
    }
@Test
   public void shouldShowErrorForInvalidEmail(){
        testBoxPage.Email("testmail.ru");
    testBoxPage.submitButton();
    System.out.println(testBoxPage.emailHasError());
    Assertions.assertTrue(testBoxPage.emailHasError(),"Поле Email должно быть подсвечено как ошибочное");
}

@Test
    public void shouldShowEmptyEmail(){
    testBoxPage.Email("");
    testBoxPage.submitButton();
    System.out.println(testBoxPage.emailHasError());
    Assertions.assertFalse(testBoxPage.emailHasError(),"Поле Email должно быть пустым");
}
}

