package page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class MainPage extends BaseFunction{
    String message1;
    String message2;
    String message3;
    String message4;
    String message5;
    String message6;
    String message7;
    String message8;
    String message9;
    String message10;
    String message11;
    String message12;
    String message13;
    String message14;
    String message15;
    String message16;


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

    public MainPage tradePwd(){
        findElement(By.cssSelector(".on > a")).click();
        findElement(By.linkText("交易密码修改")).click();
        findElement(By.id("oldpwd")).sendKeys("123321");
        findElement(By.id("newpwd")).sendKeys("456654");
        findElement(By.id("confirm_newpwd")).sendKeys("456654");
        findElement(By.linkText("确   定")).click();
        message3=findElement(By.id("showErrorInfo")).getText();
        findElement(By.id("alert_btn")).click();
        return this;
    }

    public MainPage fundPwd(){
        findElement(By.cssSelector(".on > a")).click();
        findElement(By.linkText("资金密码修改")).click();
        findElement(By.id("oldpwd")).sendKeys("123321");
        findElement(By.id("newpwd")).sendKeys("456654");
        findElement(By.id("confirm_newpwd")).sendKeys("456654");
        findElement(By.linkText("确   定")).click();
        message4=findElement(By.id("showErrorInfo")).getText();
        findElement(By.id("alert_btn")).click();
        return this;
    }

    public MainPage hold(){
        findElement(By.cssSelector("#position > a")).click();
        message5=findElement(By.cssSelector("#rmb tr:nth-child(1) > th")).getText();
        message6=findElement(By.cssSelector(".tabFour th:nth-child(1)")).getText();
        findElement(By.linkText("港币资产")).click();
        findElement(By.linkText("美元资产")).click();
        return this;
    }

    public MainPage myService(){
        findElement(By.cssSelector("#left_product > a")).click();
        //订单号
        message7=findElement(By.cssSelector("th:nth-child(2)")).getText();
        return this;
    }

    public MainPage tradeRecord() throws InterruptedException {
        findElement(By.cssSelector("#transactionView > a")).click();
        overrideKeys(By.id("trade_date_start"), "2019-06-04");
        overrideKeys(By.id("trade_date_end"), "2019-08-13");
        findElement(By.id("searchBtnTransaction")).click();
        Thread.sleep(5000);
        message8=findElement(By.cssSelector("tr:nth-child(6) > td:nth-child(1)")).getText();
        //20190712
        //证券买入
        findElement(By.linkText("服务产品明细")).click();
        return this;
    }

    public MainPage agreementQuery() throws InterruptedException {
        findElement(By.cssSelector("#selfAgreement > a")).click();
        message9=findElement(By.cssSelector(".con_btn")).getText();
        //已签署
        findElement(By.cssSelector("#ElectronicsAgreement > a")).click();
        Thread.sleep(5000);
        message10=findElement(By.id("nextButton")).getText();
        //下一步
        return this;
    }

    public MainPage signedAgreement() {
        findElement(By.cssSelector("#agree_doc > a")).click();
        message11=findElement(By.cssSelector("#agree_1 .ag_con_box:nth-child(2) > .con_btn")).getText();
        //《适当性匹配意见及投资者确认书》
        return this;
    }

    public String getMessage1(){
        return message1;
    }
    public String getMessage2(){
        return message2;
    }
    public String getMessage3(){
        return message3;
    }
    public String getMessage4(){
        return message4;
    }
    public String getMessage5(){
        return message5;
    }
    public String getMessage6(){
        return message6;
    }
    public String getMessage7(){
        return message7;
    }
    public String getMessage8(){
        return message8;
    }
    public String getMessage9(){
        return message9;
    }
    public String getMessage10(){
        return message10;
    }
    public String getMessage11(){
        return message11;
    }
    public String getMessage12(){
        return message12;
    }
}
