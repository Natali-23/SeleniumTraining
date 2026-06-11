package Selenium.Test;

import Selenium.BaseTest;
import Selenium.page.TestBoxPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBoxTest extends BaseTest {


    @Test
    public void testBox() {
        getWebDriver().get("https://demoqa.com/text-box");

        TestBoxPage testBoxPage = new TestBoxPage(getWebDriver());
        testBoxPage.FullName("Катя");
        testBoxPage.Email("qwerty@yandex.ru");
        testBoxPage.currentAddress("улица пупкина, дом залупкина");
        testBoxPage.permaentAddress("совпадает с нынешним адресом");
        testBoxPage.button();

        // Проверка Имени
        Assertions.assertTrue(testBoxPage.getResultName().contains("Катя"),
                "Имя не совпадает! Ожидали Катя, а получили: " + testBoxPage.getResultName());

        // Проверка Email
        Assertions.assertTrue(testBoxPage.getResultEmail().contains("qwerty@yandex.ru"));

        // Проверка Current Address (самое проблемное место)
        Assertions.assertTrue(testBoxPage.getResultCurrentAddress().contains("улица пупкина, дом залупкина"),
                "Адрес не найден в строке: " + testBoxPage.getResultCurrentAddress());

        // Проверка Permanent Address (исправил опечатку в слове Permanent)
        Assertions.assertTrue(testBoxPage.getResultPermanentAddress().contains("совпадает с нынешним адресом"));

    }
}
