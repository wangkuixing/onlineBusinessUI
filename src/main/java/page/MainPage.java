package page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class MainPage extends BaseFunction{
    String message1;
    String message2;

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
        overrideKeys(By.id("email"), "test@gmail.com");

        select(By.id("province"));
        select(By.id("city"));

        overrideKeys(By.id("address"), "深圳湾" + random + "号");
        overrideKeys(By.id("workplace"), "银行");

        select(By.id("position_a"));
        select(By.id("education"));
        select(By.id("position_a"));
        select(By.id("occ_type"));
        select(By.id("occu_type"));

        findElement(By.id("changeInfo")).click();

        findElement(By.id("btn_kb")).click();
        findElement(By.id("password")).sendKeys("123321");
        findElement(By.cssSelector(".password_sure")).click();
        message1=findElement(By.id("showErrorInfo")).getText();

        findElement(By.id("alert_btn")).click();
        return this;
    }

    public MainPage standbyContact() {
        Random ra = new Random();
        int random = ra.nextInt(1000) + 1;

        findElement(By.cssSelector("#updateAccount > a")).click();
        overrideKeys(By.id("standby_name"), "tony");
        overrideKeys(By.id("standby_phone"), "13823342" + random);

        findElement(By.id("changeStandby")).click();
        findElement(By.id("btn_kb")).click();
        findElement(By.id("password")).sendKeys("123321");
        findElement(By.cssSelector(".password_sure")).click();
        message2=findElement(By.id("showErrorInfo")).getText();
        findElement(By.id("alert_btn")).click();
        return this;
    }

    public String getMessage1(){
        return message1;
    }

    public String getMessage2(){
        return message2;
    }
}
