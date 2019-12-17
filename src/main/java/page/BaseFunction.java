package page;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

@Slf4j
public class BaseFunction {

    public WebElement findElement(By by){
        return findElement(by, 5);
    }

    public WebElement findElement(By by, int timeout){
        //debug
        System.out.println(by.toString());
        if (timeout > 0){
            waitClickable(by, timeout);
        }
        return Driver.getDriver().findElement(by);
    }

    public void overrideKeys(By by, String key){
        //clear before sendKeys
        findElement(by).clear();
        findElement(by).sendKeys(key);
    }

    public void scroll(int start, int end){
        ((JavascriptExecutor)(Driver.getDriver())).executeScript("window.scrollTo(" + start + ","+ end + ")");
    }

    public void waitClickable(By by, int timeout){
        new WebDriverWait(Driver.getDriver(),timeout).until(ExpectedConditions.elementToBeClickable(by));
    }

    public void select(By by){
        waitClickable(by, 5);
        Select select=new Select(findElement(by));
        select.selectByIndex(1);
    }

    public void enableKeyboard(By by){
        findElement(by).click();
        findElement(By.cssSelector(".button_kb")).click();
    }

    //封装显式等待
    public static WebElement waituntil(By locator){
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

}
