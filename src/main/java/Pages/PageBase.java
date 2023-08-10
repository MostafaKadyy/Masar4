package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageBase {
    public WebDriver driver;
    public WebDriverWait wait;

    public PageBase(WebDriver driver) {
        this.driver=driver;
        this.wait= new WebDriverWait(driver, Duration.ofSeconds(5));
    }


    public WebElement find(By locator){
        return driver.findElement(locator);
    }

    public  void click(By locator){
        find(locator).click();
    }

    public  void Type(By locator,String value){
        find(locator).clear();
        find(locator).sendKeys(value);
    }
}
