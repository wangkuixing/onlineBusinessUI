import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import page.MainPage;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class PermissionTest {
    static MainPage mainPage;

    @BeforeAll
    public static void login() throws InterruptedException {
        mainPage=MainPage.start();
        Thread.sleep(5000);
    }

    @AfterAll
    public static void quit() throws InterruptedException {
        mainPage.stop();
    }

    @Order(1)
    @Test
    public void gemPermission() {
        mainPage.gemPermission();
        String message12=mainPage.getMessage12();
        assertThat(message12, equalTo("您已有创业板交易权限！"));
    }

    @Order(2)
    @Test
    public void hkPermission() {
        mainPage.hkPermission();
        String message13=mainPage.getMessage13();
        assertThat(message13, equalTo("您的沪港通、深港通权限已开通！"));
    }

    @Order(3)
    @Test
    public void bank() {
        mainPage.bank();
        String message14=mainPage.getMessage14();
        String message15=mainPage.getMessage15();
        assertThat(message14, equalTo("工商银行"));
        assertThat(message15, equalTo("尾号0003"));
    }

    @Order(4)
    @Test
    public void tradePermission() {
        mainPage.tradePermission();
        String message16=mainPage.getMessage16();
        String message17=mainPage.getMessage17();
        assertThat(message16, equalTo("已开通网上交易，如需关闭请到柜台办理！"));
        assertThat(message17, equalTo("开通成功"));
    }
}
