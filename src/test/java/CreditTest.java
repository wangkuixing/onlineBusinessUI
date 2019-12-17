import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import page.MainPage;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class CreditTest {
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
    @Order(1)
    public void amountChange() throws InterruptedException {
        mainPage.amountChange();
        String message18=mainPage.getMessage18();
        assertThat(message18, equalTo("您的业务申请已受理！"));
    }

    @Order(2)
    @Test
    public void ContractRenewal() {
        mainPage.contractRenewal();
        String message19=mainPage.getMessage19();
        assertThat(message19, equalTo("不可展期"));
    }

    @Order(3)
    @Test
    public void suggestion() {
        mainPage.suggestion();
        String message20=mainPage.getMessage20();
        assertThat(message20, equalTo("资产两融条件满足（适当）"));
    }
}
