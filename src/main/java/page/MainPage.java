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
    String message17;
    String message18;
    String message19;
    String message20;

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
        findElement(By.cssSelector(".person_list:nth-child(2) .muneLi1:nth-child(4) > a")).click();
        findElement(By.cssSelector("#mdfTradePwd > a")).click();
        enableKeyboard(By.id("oldpwd"));
        findElement(By.id("oldpwd")).sendKeys("123321");
        enableKeyboard(By.id("newpwd"));
        findElement(By.id("newpwd")).sendKeys("456654");
        enableKeyboard(By.id("confirm_newpwd"));
        findElement(By.id("confirm_newpwd")).sendKeys("456654");
        findElement(By.linkText("确   定")).click();
        message3=findElement(By.id("showErrorInfo")).getText();
        findElement(By.id("alert_btn")).click();

        //recover
        findElement(By.cssSelector("#mdfTradePwd > a")).click();
        enableKeyboard(By.id("oldpwd"));
        findElement(By.id("oldpwd")).sendKeys("456654");
        enableKeyboard(By.id("newpwd"));
        findElement(By.id("newpwd")).sendKeys("123321");
        enableKeyboard(By.id("confirm_newpwd"));
        findElement(By.id("confirm_newpwd")).sendKeys("123321");
        findElement(By.linkText("确   定")).click();
        findElement(By.id("alert_btn")).click();
        return this;
    }

    public MainPage fundPwd() throws InterruptedException {
        findElement(By.cssSelector(".person_list:nth-child(2) .muneLi1:nth-child(4) > a")).click();
        findElement(By.cssSelector("#mdfFundPwd > a")).click();
        enableKeyboard(By.id("oldpwd"));
        findElement(By.id("oldpwd")).sendKeys("123321");
        enableKeyboard(By.id("newpwd"));
        findElement(By.id("newpwd")).sendKeys("456654");
        enableKeyboard(By.id("confirm_newpwd"));
        findElement(By.id("confirm_newpwd")).sendKeys("456654");
        findElement(By.linkText("确   定")).click();
        message4=findElement(By.id("showErrorInfo")).getText();
        findElement(By.id("alert_btn")).click();

        //recover
        findElement(By.cssSelector("#mdfFundPwd > a")).click();
        waituntil(By.id("oldpwd"));
        enableKeyboard(By.id("oldpwd"));
        findElement(By.id("oldpwd")).sendKeys("456654");
        enableKeyboard(By.id("newpwd"));
        findElement(By.id("newpwd")).sendKeys("123321");
        enableKeyboard(By.id("confirm_newpwd"));
        findElement(By.id("confirm_newpwd")).sendKeys("123321");
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

    public MainPage gemPermission() {
        scroll(0, 800);
        findElement(By.cssSelector("#qxgl > a")).click();
        findElement(By.cssSelector("#cybLi > a")).click();
        message12=findElement(By.cssSelector(".sign_success > dd")).getText();
        //您已有创业板交易权限！
        return this;
    }

    public MainPage hkPermission() {
        scroll(0, 800);
        findElement(By.cssSelector("#qxgl > a")).click();
        findElement(By.cssSelector("#hk_stk_trd_auth_sign > a")).click();
        message13=findElement(By.cssSelector(".hk_tips_show > p:nth-child(1)")).getText();
        //您的沪港通、深港通权限已开通！
        return this;
    }

    public MainPage bank() {
        findElement(By.cssSelector("#sfcg > a")).click();
        message14=findElement(By.cssSelector(".bankName")).getText();
        message15=findElement(By.cssSelector(".cardCode")).getText();
        //工商银行 尾号0003
        return this;
    }

    public MainPage tradePermission() {
        findElement(By.cssSelector("#jyqx > a")).click();
        findElement(By.cssSelector("#mobileCode a")).click();
        message16=findElement(By.id("showErrorInfo")).getText();
        //已开通网上交易，如需关闭请到柜台办理！
        findElement(By.id("alert_btn")).click();
        findElement(By.cssSelector("#shAlert a")).click();
        findElement(By.id("popup_protocol_btn")).click();
        findElement(By.id("popup_protocol_btn")).click();
        message17=findElement(By.cssSelector("#shAlert a")).getText();
        //开通成功
        return this;
    }

    public MainPage amountChange() throws InterruptedException {
        findElement(By.cssSelector("#rzrq > a")).click();
        findElement(By.cssSelector("#amount_change > a")).click();
        findElement(By.id("btn_kb")).click();
        findElement(By.id("password")).sendKeys("123321");
        findElement(By.cssSelector(".passwordSure")).click();
        Thread.sleep(5000);
        findElement(By.id("fundNum")).sendKeys("300");
        findElement(By.id("nextButton")).click();
        Thread.sleep(3000);
        message18=findElement(By.cssSelector(".sign_success > dd:nth-child(2)")).getText();
        //您的业务申请已受理！
        //取消申请
        findElement(By.cssSelector("#rzrq > a")).click();
        findElement(By.cssSelector("#amount_change > a")).click();
        findElement(By.id("cancelApout")).click();
        findElement(By.cssSelector(".sign_success > dd"));
        return this;
    }

    public MainPage contractRenewal() {
        findElement(By.cssSelector("#rzrq > a")).click();
        findElement(By.cssSelector("#rzrq_contract > a")).click();
        message19=findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(12)")).getText();
        //不可展期
        return this;
    }

    public MainPage suggestion() {
        findElement(By.cssSelector("#sug_attend > a")).click();
        message20=findElement(By.cssSelector("#suggest_attend .sug_tips_box > span")).getText();
        //资产两融条件满足（适当）
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
    public String getMessage13(){
        return message13;
    }
    public String getMessage14(){
        return message14;
    }
    public String getMessage15(){
        return message15;
    }
    public String getMessage16(){
        return message16;
    }
    public String getMessage17(){
        return message17;
    }
    public String getMessage18(){
        return message18;
    }
    public String getMessage19(){
        return message19;
    }
    public String getMessage20(){
        return message20;
    }
}
