package Selenium.Test;

import Selenium.BaseTest;
import Selenium.page.WebtablesPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebtablesTest extends BaseTest {
    WebDriver webDriver;
WebtablesPage webtablesPage = new WebtablesPage();

    @Test
    public void webtablesTestAddPerson(){

        webDriver.get("https://demoqa.com/webtables");
        WebElement addButton = webDriver.findElement(webtablesPage.getWebtablesAddButtonWebtables());
        addButton.click();
//проверка имени
        WebElement firstNameWebtables = webDriver.findElement(firstNameLocatorWebtables);
        firstNameWebtables.clear();
        firstNameWebtables.sendKeys("Kate");

        //проверка фамилии
        WebElement lastNameWebtables = webDriver.findElement(LastNameLocatorWebtables);
        lastNameWebtables.clear();
        lastNameWebtables.sendKeys("Liaison");

        // проверка имейла
        WebElement emailWebtables = webDriver.findElement(emailLocatorWebtables);
        emailWebtables.clear();
        emailWebtables.sendKeys("qwerty12345@yandex.ru");

        //проверка возраста
        WebElement ageWebtables = webDriver.findElement(ageLocatorWebtables);
        ageWebtables.clear();
        ageWebtables.sendKeys("34");

        //проверка зарплаты
        WebElement salaryWebtables = webDriver.findElement(salaryLocatorWetables);
        salaryWebtables.clear();
        salaryWebtables.sendKeys("123345");

        // проверка департамента
        WebElement departWebtables = webDriver.findElement(departamentLocatorWebtables);
        departWebtables.clear();
        departWebtables.sendKeys("department");

//button
        WebElement buttonSubmitWebtables= webDriver.findElement(submitButtonWebtables);
        buttonSubmitWebtables.click();



    }

    @Test
    public void webtablesTestDeletePerson(){
        webDriver.get("https://demoqa.com/webtables");
        WebElement deleteButonWebtables = webDriver.findElement(deleteButtonWebtables);
        deleteButonWebtables.click();
    }
}
