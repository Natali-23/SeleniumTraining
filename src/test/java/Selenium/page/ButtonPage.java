package Selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ButtonPage{
    private Actions actions;
    private WebDriver driver;

    private final By doubleClick =By.xpath("//button[@id='doubleClickBtn']");
private final By rightClick = By.id("rightClickBtn");
    private final By dynamicClick = By.xpath("//button[text()='Click Me']");

    public ButtonPage(WebDriver driver) {
        this.actions = new Actions(driver);
        this.driver = driver;
    }

    public void doubleClick(){
        WebElement button = driver.findElement(doubleClick);
        actions.doubleClick(button).perform();
    }

    public void rightClick(){
        WebElement button = driver.findElement(rightClick);
        actions.contextClick(button).perform();
    }

    public void dinamickClick(){
        WebElement element = driver.findElement(dynamicClick);
        actions.moveToElement(element)
                .click()
                .perform();
    }
}

