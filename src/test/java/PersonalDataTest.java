import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import page.Driver;
import page.MainPage;
import sun.rmi.rmic.newrmic.Main;

public class PersonalDataTest {
    static MainPage mainPage;

    @BeforeAll
    public static void login(){
        mainPage=MainPage.start();
    }

    @AfterAll
    public static void quit() throws InterruptedException {
        mainPage.stop();
    }

    @Test
    public void modifyData(){
        mainPage.personalData();
        String message=mainPage.getMessage();
        assertThat(message, equalTo("修改成功"));

    }
}
