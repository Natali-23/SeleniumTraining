package Selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestBoxPage {
    private WebDriver webDriver;

    private By fullNameLocatorTestBox = By.xpath("//input[@id = 'userName']");
    private By emailLocatorTestBox = By.xpath("//input[@id= 'userEmail']");
    private By currentAddressTestBox = By.xpath("//textarea[@id = 'currentAddress']");
    private By permanentAddressTestBox = By.xpath("//textarea[@id = 'permanentAddress']");
    private By submitTestBox = By.xpath("//button[@id='submit']");


    //локаторы вывода после нажатия кнопки
    private By findNameByLocatorTestBox = By.xpath("//p[@id='name']");
    private By findEmailByLocatorTestBox = By.xpath("//p[@id ='email']");
    private By findCurrentAddressByLocatorTestBox = By.xpath("//p[@id='currentAddress']");
    private By findPermanentAddressByLocatorTestBox = By.xpath("//p[@id='permanentAddress']");
    private By userEmail = By.id("userEmail");

    public TestBoxPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void FullName(String name) {
        WebElement fullname = webDriver.findElement(fullNameLocatorTestBox);
        fullname.clear();
        fullname.sendKeys(name);
    }

    public void Email(String e) {
        WebElement email = webDriver.findElement(emailLocatorTestBox);
        email.clear();
        email.sendKeys(e);
    }

    public void currentAddress(String address) {
        WebElement curAddress = webDriver.findElement(currentAddressTestBox);
        curAddress.clear();
        curAddress.sendKeys(address);
    }

    public void permaentAddress(String address) {
        WebElement permanAddress = webDriver.findElement(permanentAddressTestBox);
        permanAddress.clear();
        permanAddress.sendKeys(address);
    }

    public void submitButton() {
        WebElement submitButton = webDriver.findElement(submitTestBox);
        submitButton.click();
    }

    public String getResultName() {
        return webDriver.findElement(findNameByLocatorTestBox).getText();
    }

    public String getResultEmail() {
        return webDriver.findElement(findEmailByLocatorTestBox).getText();
    }

    public String getResultCurrentAddress() {
        return webDriver.findElement(findCurrentAddressByLocatorTestBox).getText();
    }

    public String getResultPermanentAddress() {
        return webDriver.findElement(findPermanentAddressByLocatorTestBox).getText();
    }

    public boolean emailHasError(){
        String classes = webDriver.findElement(userEmail)
                .getAttribute("class");
        return classes.contains("field-error");
    }
}
