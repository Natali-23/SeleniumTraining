package Selenium.page;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButtonPage {
    protected WebDriver webDriver;

    protected By radioButton = By.xpath("//input[@id='impressiveRadio']");

    @Test
    public void RadioButtonTest(){
        webDriver.get("https://demoqa.com/radio-button");
        WebElement button = webDriver.findElement(radioButton);
        button.click();
/// данные для обновленных файлов
        Assertions.assertTrue(button.isSelected());
    }
}
