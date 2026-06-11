package Selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ButtonPage{
    private Actions actions;
    private WebDriver driver;

    private final By doubleClick =By.xpath("//button[@id='doubleClickBtn']");

    public ButtonPage(WebDriver webDriver) {
    }

    public By getDoubleClick() {
        return doubleClick;
    }

    public void doubleClick(){
        actions.doubleClick();
        
    }
}
