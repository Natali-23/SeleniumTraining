package Selenium.page;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebtablesPage {
    protected WebDriver webDriver;


    protected By webtablesAddButtonWebtables = By.xpath("//button[@id = 'addNewRecordButton']");
    protected By firstNameLocatorWebtables = By.xpath("//input[@id = 'firstName']");
    protected By LastNameLocatorWebtables = By.xpath("//input[@id='lastName']");
    protected By emailLocatorWebtables = By.xpath("//input[@id='userEmail']");
    protected By ageLocatorWebtables = By.xpath("//input[@id='age']");
    protected By salaryLocatorWetables = By.xpath("//input[@id='salary']");
    protected By departamentLocatorWebtables = By.xpath("//input[@id='department']");
    protected By submitButtonWebtables = By.xpath("//button[@id = 'submit']");
    protected By deleteButtonWebtables = By.xpath("//span[@id='delete-record-1']");

    @Test
    public void webtablesTestAddPerson(){
        webDriver.get("https://demoqa.com/webtables");
        WebElement addButton = webDriver.findElement(webtablesAddButtonWebtables);
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
