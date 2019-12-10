package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseFunction {

    public WebElement findElement(By by){
        return findElement(by, 5);
    }

    public WebElement findElement(By by, int timeout){
        if (timeout > 0){
            waitClickable(by, timeout);
        }
        //debug
        System.out.println(by.toString());
        return Driver.getDriver().findElement(by);
    }

    public void waitClickable(By by, int timeout){
        new WebDriverWait(Driver.getDriver(),timeout).until(ExpectedConditions.elementToBeClickable(by));
    }

    public void select(By by){
        Select select=new Select(findElement(by));
        select.selectByIndex(1);
    }

}
