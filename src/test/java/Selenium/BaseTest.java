package Selenium;

import Selenium.page.TestBoxPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {
    private WebDriver webDriver;

    @BeforeEach
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }



//    @AfterEach
//    public void tearDown() {
//            webDriver.quit();
//        }
  }
