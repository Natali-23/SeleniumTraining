package Selenium.page;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButtonPage {
    protected WebDriver webDriver;

    protected By radioButtonYes = By.xpath("//label[@for='yesRadio']");
    protected By radioButtonImpressive = By.xpath("//label[@for='impressiveRadio']");

    public RadioButtonPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
public void radioButtonYesClick(){
        webDriver.findElement(radioButtonYes).click();
}

public void RadioButtonImpressiveClick(){
        webDriver.findElement(radioButtonImpressive).click();
}
}
