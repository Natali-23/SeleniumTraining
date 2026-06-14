package Selenium.page;

import io.qameta.allure.Step;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBoxPage {

    private final WebDriver driver;

    public CheckBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    private By switcher(String title) {
        return By.xpath(
                "//span[text()='" + title + "']/ancestor::div[@role='treeitem']" +
                        "//span[contains(@class,'rc-tree-switcher')]"
        );
    }

    private By checkboxByTitle(String title) {
        return By.xpath("//span[contains(@class, 'rct-title') and text()='" + title + "']" +
                "/ancestor::label/span[contains(@class, 'rct-checkbox')]");
    }

    private By checkbox(String title) {
        return By.xpath(
                "//span[text()='" + title + "']/ancestor::div[@role='treeitem']" +
                        "//span[contains(@class,'rc-tree-checkbox')]"
        );
    }
@Step("открываем дерево и кликаем на него")
    public void openHome() {
        driver.findElement(switcher("Home")).click();
    }

    public void openDesktop() {
        driver.findElement(switcher("Desktop")).click();
    }

    public void chooseNotes() {
        driver.findElement(checkbox("Notes")).click();
    }

    public boolean isCheckedPage() {
        String checked =
                driver.findElement(checkbox("Notes"))
                        .getAttribute("aria-checked");

        return "true".equals(checked);
    }
}