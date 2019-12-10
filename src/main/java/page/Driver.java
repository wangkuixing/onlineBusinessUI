package page;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Driver {
    public static ChromeDriver driver;

    public static void loginWithCookie(){
        String url="http://t0st.ytzq.com:8443/web/html/account/myAccount/index.html";
//        ChromeOptions chromeOptions=new ChromeOptions();
//        chromeOptions.setCapability("pageLoadStrategy", "none");

        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();

        driver.manage().addCookie(new Cookie("sso_cookie", "3o%2F%2BqYJWo0hM8VKiISsYJw%2F5EGb%2F620DsmiWlGKvqCmv%2F9d%2By1YUPnNnWdclVI%2FB9dZ4lf%2F8xnjQ%0AHq8AFRx5hpIBm1TwcMvLnQPHRjQBisBcLvvvCVzBmy%2B1jHXe3Y4pysSbfpKA2Met0U3%2FNwO8NWj7%0A0nNJcGuOGqBI7FLfMkg7SSvVUtLu7fln4gZXO%2BQe1mRBE3CFBWLFUqN2d8Qw9JBQhkKSMGDNx4HP%0AZXfnRY%2B04YajrzXRM9xKZee4HMAgyH9xcIDYCt6aHvbqgpFnBdg9qPwxoeEcaZpTtbD2Aa3JHxso%0A2bFSU4WUpqyWkJ6KB4mZPAFLNHP54r6BITMBZNcDFFsgrt%2BlEUBq9Y27xDCkxWKipSv1SJbH9RF3%0AKJ5HOPH8CbVPwpkmGt6DVyTNdsUJepjkBnquluaD3Uwflxj9KjEKORoLAJarg7QQMBiOTtGIwlyL%0AnFKisaI%2BPufcKKdnUUhIMg0i78Akc%2BPXo6t2QOIyXSrxta78RqbcEoP52jtYlqWfPo7YpfM1R%2BwV%0AvibS5CQ47VdCoE7o96Tifi%2B3OND1w%2B4Or6dfBMmmWnD8mZotbgXCDRBnRDBmBJ%2Bf9l7SifFZ%2BdQU%0A1iFCDK3ttMmBet0uGnkXpmwMx%2FxZEkywoi66v0T9xEn4v6WH%2B5tYqbQvGkkxoehMkU2oszCK5yqu%0A0RZ5Ej0h4%2FDJR%2B0ldGS1eev1uzhVvyvwagdz9j753p6r67GlreXAqPlFg07vDR8I4Au3YVVJIs3Z%0AdYsPwY6OIqWsAJDuMy4qBc1iQ3CwDpbiQS1FXbV1UN%2BatsSd8zsNnYLg0OMx3GEwvY%2BmjQofpzpA%0A1BsdWYu3nBR61jiJh6PFYyB9ctk0o3HWko%2B1GpsWP7g2YZnXYGA%2BBwNJhUYQkZJA039P4%2B95WtkC%0AFmMYbU3%2BrtmytWae6hKvG1SsDSLen99PEGw2rxdmtatrICj6hMeS6NuTxOXklh91DhTofXKCFQFT%0ANvGEwlM9WsxCr67tCODWZfNExymihOo0YYtiEl9u4RNJotUQDHj%2BTYCteyZu8TrdeyNSoCoZSqp9%0AxZwLnga5CHbIkFDe8O8SbrHZrUO5Dh2cB9nWSZAEHU7VlbrhdPVdopm%2FcrwbyKZ7n3ZHOH3kgsAA%0AeDf1bLPsYv%2F74HwFtwd4mHI%3D"));
        driver.navigate().refresh();
    }

    public static void quit() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();
    }

    public static ChromeDriver getDriver(){
        return driver;
    }
}
