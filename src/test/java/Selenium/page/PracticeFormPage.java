package Selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

public class PracticeFormPage {
    private WebDriver driver;

    //обязательные поля
    private final By firstName = By.id("firstName");
    private final By lastName = By.id("lastName");
    private final By gender = By.id("gender-radio-1");
    private final By mobileNumber = By.id("userNumber");
    private final By submit = By.id("submit");


    public PracticeFormPage(WebDriver driver) {
        this.driver = driver;
    }

    public void firstName(String name) {
        WebElement fName = driver.findElement(firstName);
        fName.clear();
        fName.sendKeys(name);

    }

    public void lastName(String name){
        WebElement lName = driver.findElement(lastName);
        lName.clear();
        lName.sendKeys(name);
    }

    public void gender(){
        driver.findElement(gender).click();
    }

    public void mobileNumber(String n){
        WebElement number = driver.findElement(mobileNumber);
        number.clear();
        number.sendKeys(n);
    }

    public void submitButton(){
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();",
                        driver.findElement(submit));
    }
}
