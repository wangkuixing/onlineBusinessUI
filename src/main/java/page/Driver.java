package page;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Driver {
    public static ChromeDriver driver;

    public static void loginWithCookie(){
        String url="http://t0st.ytzq.com:8443/web/html/account/myAccount/index.html";
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setCapability("pageLoadStrategy", "none");

        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();

        driver.manage().addCookie(new Cookie("sso_cookie", "3o%2F%2BqYJWo0hM8VKiISsYJw%2F5EGb%2F620DsmiWlGKvqCmv%2F9d%2By1YUPnNnWdclVI%2FB9dZ4lf%2F8xnjQ%0AHq8AFRx5hpIBm1TwcMvLnQPHRjQBisBcLvvvCVzBmy%2B1jHXe3Y4pysSbfpKA2Met0U3%2FNwO8NWj7%0A0nNJcGuOGqBI7FLfMkg7SSvVUtLu7fln4gZXO%2BQe1mRBE3CFBWLFUqN2d8Qw9JBQhkKSMGDNx4HP%0AZXfnRY%2B04YajrzXRM9xKZee4HMAgyH9xcIDYCt6aHvbqgpFnBdg9qPwxoeEcaZpTtbD2Aa3JHxso%0A2bFSU4WUpqyWkJ6KB4mZPAFLNHP54r6BITMBZNcDFFsgrt%2BlEUBq9Y27xDCkxWKipSv1SJbH9RF3%0AKJ5HOPH8CbVPwpkmGt6DVyTNdsUJepjkBnquluaD3Uwflxj9KjEKORoLAJarg7QQMBiOTtGIwlyL%0AnFKisaI%2BPufcKKdnUUhIMg0i78Akc%2BPXo6t2QOIyXSrxta78RqbcEoP52jtYlqWfPo7YpfM1R%2BwV%0AvibS5CQ47VdCoE7o96Tifi%2B3OND1w%2B4Or6dfBMmmWnD8mZotbgXCDRBnRDBmBJ%2Bf9l7SifFZ%2BdQU%0A1iFCDK3ttMmBet0uGnkXpmwMx%2FxZEkywoi66v0T9xEn4v6WH%2B5tYqbQvGkkxoehMkU2oszCK5yqu%0A0RZ5Ej0h4%2FDJR%2B0ldGS1eev1uzhVvyvwagdz9j753p6r67GlreXAqPlFg07vDR8I4Au3YVVJIs3Z%0AdYsPwY6OIqWsAJDuMy4qBc1iQ3CwDpbiQS1FXbV1UN%2BatsSd8zsNnYLg0OMx3GEwvY%2BmjQofpzpA%0A1BsdWYu3nBR61jiJh6PFYyB9ctk0o3HWko%2B1GpsWP7g2YZnXYGA%2BBwNJhUYQkZJA039P4%2B95WtkC%0AFmMYbU3%2BrtmytWae6hKvG1SsDSLen99PEGw2rxdmtatrICj6hMeS6NuTxOXklh91DhTofXKCFQFT%0ANvGEwlM9WsxCr67tCODWZfNExymihOo0YYtiEl9u4RNJotUQDHj%2BTYCteyZu8TrdeyNSoCoZSqp9%0AxZwLnga5CHbIkFDe8O8SbrHZrUO5Dh2cB9nWSZAEHU7VlbrhdPVdopm%2FcrwbyKZ7n3ZHOH3kgsAA%0AeDf1bLPsYv%2F74HwFtwd4mHI%3D"));
        driver.manage().addCookie(new Cookie("info", "%7B%22sfbd%22:%221%22,%22rzrq_creditAccount%22:%221390000235%22,%22net_addr%22:%22240e:00ff:b344:eeff:4c19:e433:a21e:60c3%22,%22crm_name%22:%22%E9%99%88%E8%BE%89%22,%22trade_account%22:%221300022253%22,%22crm_no%22:%226423083%22,%22trade_name%22:%22%E9%99%88%E8%BE%89%22,%22branch_no%22:%220013%22,%22device_info%22:%22Mozilla/5.0%20(Windows%20NT%2010.0@#@%20Win64@#@%20x64)%20AppleWebKit/537.36%20(KHTML,%20like%20Gecko)%20Chrome/78.0.3904.108%20Safari/537.36%22,%22crm_client_type%22:%220%22,%22identity_exp_date%22:%2220260812%22,%22branch_name%22:%22%E4%B8%8A%E6%B5%B7%E5%98%89%E5%96%84%E8%B7%AF%E8%AF%81%E5%88%B8%E8%90%A5%E4%B8%9A%E9%83%A8%22,%22trade_no%22:%221300022253%22,%22wealth_product%22:%22%22,%22wealth_level%22:%220%22,%22identity_idno%22:%22310230197711013718%22%7D"));
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
