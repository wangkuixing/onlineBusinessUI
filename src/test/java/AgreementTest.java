import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import page.MainPage;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class AgreementTest {
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
    public void agreementQuery() throws InterruptedException {
        mainPage.agreementQuery();
        String message9=mainPage.getMessage9();
        String message10=mainPage.getMessage10();
        assertThat(message9, equalTo("已签署"));
        assertThat(message10, equalTo("下一步"));
    }

    @Order(2)
    @Test
    public void signedAgreement() throws InterruptedException {
        mainPage.signedAgreement();
        String message11=mainPage.getMessage9();
        assertThat(message11, equalTo("《适当性匹配意见及投资者确认书》"));
    }
}
