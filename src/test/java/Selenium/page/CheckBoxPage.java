package Selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBoxPage {
    private final WebDriver webDriver;

    private final By homeSwitcher = By.xpath("//div[@role='treeitem'][.//*[contains(@title, 'Home') or text()='Home']]/span[contains(@class, 'rc-tree-switcher')]");
    private final By desktopSwitcher = By.xpath("//div[@role='treeitem'][.//*[contains(@title, 'Desktop') or text()='Desktop']]/span[contains(@class, 'rc-tree-switcher')]");
    private final By checkNotes = By.xpath("//div[@role='treeitem'][.//*[contains(@title, 'Notes') or text()='Notes']]/span[contains(@class, 'rc-tree-checkbox')]");

    public CheckBoxPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void checkHome() {
        webDriver.findElement(homeSwitcher).click();
    }

    public void checkDesktop() {
        webDriver.findElement(desktopSwitcher).click();
    }

    public void checkNotes() {
        webDriver.findElement(checkNotes).click();
    }
}
