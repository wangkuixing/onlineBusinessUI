package page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class MainPage extends BaseFunction{
    String message;

    public static MainPage start(){
        Driver.loginWithCookie();
        return new MainPage();
    }

    public void stop() throws InterruptedException {
        Thread.sleep(10000);
        Driver.quit();
    }

    public MainPage personalData(){
        Random ra=new Random();
        int random=ra.nextInt(1000) + 1;

        findElement(By.cssSelector("#updateAccount > a")).click();
        findElement(By.id("email")).sendKeys("test@gmail.com");

        select(By.id("province"));
        select(By.id("city"));

        findElement(By.id("address")).sendKeys("深圳湾" + random + "号");
        findElement(By.id("workplace")).sendKeys("银行");

        select(By.id("position_a"));
        select(By.id("education"));
        select(By.id("position_a"));
        select(By.id("occ_type"));
        select(By.id("occu_type"));

        findElement(By.id("changeInfo")).click();

        findElement(By.id("btn_kb")).click();
        findElement(By.id("password")).sendKeys("123321");
        findElement(By.cssSelector(".password_sure")).click();
        message=findElement(By.id("showErrorInfo")).getText();

        findElement(By.id("alert_btn")).click();
        return this;
    }

    public String getMessage(){
        return message;
    }
}
