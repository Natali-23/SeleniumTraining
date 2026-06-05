package Selenium.page;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebtablesPage {


    protected By webtablesAddButtonWebtables = By.xpath("//button[@id = 'addNewRecordButton']");
    protected By firstNameLocatorWebtables = By.xpath("//input[@id = 'firstName']");
    protected By LastNameLocatorWebtables = By.xpath("//input[@id='lastName']");
    protected By emailLocatorWebtables = By.xpath("//input[@id='userEmail']");
    protected By ageLocatorWebtables = By.xpath("//input[@id='age']");
    protected By salaryLocatorWetables = By.xpath("//input[@id='salary']");
    protected By departamentLocatorWebtables = By.xpath("//input[@id='department']");
    protected By submitButtonWebtables = By.xpath("//button[@id = 'submit']");
    protected By deleteButtonWebtables = By.xpath("//span[@id='delete-record-1']");



    public By getWebtablesAddButtonWebtables() {
        return webtablesAddButtonWebtables;
    }

    public By getFirstNameLocatorWebtables() {
        return firstNameLocatorWebtables;
    }

    public By getLastNameLocatorWebtables() {
        return LastNameLocatorWebtables;
    }

    public By getEmailLocatorWebtables() {
        return emailLocatorWebtables;
    }

    public By getAgeLocatorWebtables() {
        return ageLocatorWebtables;
    }

    public By getSalaryLocatorWetables() {
        return salaryLocatorWetables;
    }

    public By getDepartamentLocatorWebtables() {
        return departamentLocatorWebtables;
    }

    public By getSubmitButtonWebtables() {
        return submitButtonWebtables;
    }

    public By getDeleteButtonWebtables() {
        return deleteButtonWebtables;
    }
}
