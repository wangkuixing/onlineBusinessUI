import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import page.MainPage;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class MyHoldTest {
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
    public void myHold(){
        mainPage.hold();
        String message5=mainPage.getMessage5();
        String message6=mainPage.getMessage6();
        assertThat(message5, equalTo("人民币资产"));
        assertThat(message6, equalTo("证券类别"));
    }
}
