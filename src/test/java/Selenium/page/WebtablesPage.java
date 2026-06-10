package Selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebtablesPage {
    private final WebDriver webDriver;

    public WebtablesPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

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

    public void addButton() {
        webDriver.findElement(getWebtablesAddButtonWebtables()).click();
    }

    public void addFirstName(String name) {
        WebElement firstNameWebtables = webDriver.findElement(getFirstNameLocatorWebtables());
        firstNameWebtables.clear();
        firstNameWebtables.sendKeys(name);
    }

    public void addLastName(String lastName) {
        WebElement lastNameWebtables = webDriver.findElement(getLastNameLocatorWebtables());
        lastNameWebtables.clear();
        lastNameWebtables.sendKeys(lastName);
    }

    public void addEmail(String email) {
        WebElement emailWebtables = webDriver.findElement(getEmailLocatorWebtables());
        emailWebtables.clear();
        emailWebtables.sendKeys(email);
    }

    public void addAge(String age) {
        WebElement ageWebtables = webDriver.findElement(getAgeLocatorWebtables());
        ageWebtables.clear();
        ageWebtables.sendKeys(age);
    }

    public void addSalary(String salary) {
        WebElement salaryWebtables = webDriver.findElement(getSalaryLocatorWetables());
        salaryWebtables.clear();
        salaryWebtables.sendKeys(salary);
    }

    public void addDepart(String depart) {
        WebElement departWebtables = webDriver.findElement(getDepartamentLocatorWebtables());
        departWebtables.clear();
        departWebtables.sendKeys(depart);
    }

    public void clickButton() {
        WebElement buttonSubmitWebtables = webDriver.findElement(getSubmitButtonWebtables());
        buttonSubmitWebtables.click();
    }

    public void deletePerson() {
        WebElement deleteButonWebtables = webDriver.findElement(getDeleteButtonWebtables());
        deleteButonWebtables.click();
    }
}
