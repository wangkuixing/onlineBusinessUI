import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import page.MainPage;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class MyServiceTest {
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
    public void myService(){
        mainPage.myService();
        String message7=mainPage.getMessage7();
        assertThat(message7, equalTo("订单号"));
    }

    @Test
    public void tradeRecord() throws InterruptedException {
        mainPage.tradeRecord();
        String message8=mainPage.getMessage8();
        assertThat(message8, equalTo("20190712\n" + "证券买入"));
    }
}
