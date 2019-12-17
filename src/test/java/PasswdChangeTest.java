import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import page.MainPage;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class PasswdChangeTest {
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

    @Test
    public void tradePwd(){
        mainPage.tradePwd();
        String message=mainPage.getMessage3();
        assertThat(message, equalTo("修改成功，请妥善保管新密码！"));
    }

    @Test
    public void fundPwd() throws InterruptedException{
        mainPage.fundPwd();
        String message=mainPage.getMessage4();
        assertThat(message, equalTo("修改成功，请妥善保管新密码！"));
    }
}
