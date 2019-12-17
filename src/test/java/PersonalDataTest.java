import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import lombok.extern.slf4j.Slf4j;
import page.MainPage;

@Slf4j
public class PersonalDataTest {
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
    public void modifyData(){
        mainPage.personalData();
        String message=mainPage.getMessage1();
        assertThat(message, equalTo("修改成功"));
    }

    @Order(2)
    @Test
    public void standbyContact(){
        mainPage.standbyContact();
        String message=mainPage.getMessage2();
        assertThat(message, equalTo("修改成功"));
    }
}
