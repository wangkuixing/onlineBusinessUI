package page;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Driver {

    public Driver loginWithCookie(){
        String url="http://t0st.ytzq.com:8443/web/html/account/myAccount/index.html";
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setCapability("pageLoadStrategy", "none");

        ChromeDriver driver=new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();

        driver.manage().addCookie(new Cookie("sso_cookie", "3o%2F%2BqYJWo0hM8VKiISsYJw%2F5EGb%2F620DsmiWlGKvqCmv%2F9d%2By1YUPnNnWdclVI%2FB9dZ4lf%2F8xnjQ%0AHq8AFRx5hpIBm1TwcMvLnQPHRjQBisBcLvvvCVzBm07DacDGlKcrhakStUVNyQrVGZXkelf3hJup%0Ajdg6puJYhMeS6NuTxOX8TnmNd7SJcu1wmu%2Bu3KFGk06epgN%2FggvaqFraryx5fTYXKvFo2Pb70zW4%0ALFfxZSzgg7C3jeZm9hNfGGFNTsCH7BnSqseQBDxt2A7rMSRw9jowy5BQaAd%2BmruGdClg2qTO46AK%0AP5NYSYlvkPKWy9uwF0%2FERaNprhpY8W%2Fd%2FFGyT1kxLLW1AP2TQf77bt6lPCyiwCpYzqTEXYHutiby%0A8Ym6z9n%2BFWfzATF1Kyyl%2FCAb%2FE1QG%2F2fZY%2FqeZWA0URuraO75JsNUxxKMa9SCOyySKQG4nbYlwdp%0A%2B7jBarzVZuRK91Ve%2Bb9rhPc%2Fw0E7i741T9lsaAO%2FLyGNuAmlSZ%2FHaz0WJMPQQR4tz6vKvy%2BO6K8Q%0Ay1pK6OSUBFnMOFXL5DLCiYI7TCWKYCiDcYv6NWRVkcJXLUaiUB12a%2FzDVJAfGNirKx0N8gl9M6Jo%0Aea9Pc%2FZwKF%2FJVQRjuDq2%2FIbcK7BXmqetpTkwXDhPwXJAqZjBGm%2BVsmZ4kO1Lyj8eibXlVBulompu%0A2KIm554q5r55FjxwL8jmERFd%2F7eJa7y6AiXgoNF8hacWWnUfVqonnBm3DxppeFVvYR81XcE%2B1rZZ%0AGzRQ%2BMe7%2BYmKXFjEsSh%2F%2FcxqS4%2B5GNwQuzEakpI3eci4rOQ5CAcmC59nK8ZmESvzQCCQDL8jrWV8%0Al4TRvfx1W8ydeNMAGrofjkpsa%2BlfhjTU%2BrmQFwd9kB9DFIrtEhdXfRNkaehfgXrdLhp5F6Ya%2BAfw%0AGTAi8XL%2BCS90YnmmLpu04tMO4gRalgx20qXsSXErZFCaxUVG0zW4LFfxZSx7rnyoNowlLdKi8OdQ%0AK8X5lgTDLGoWlWXszdzfSNneGaLQmCW%2F9IfdY2XxlQ1cXqW%2BWiQUUxXTkLwkD9gwQjqs34FDfg%2F2%0Ao6bJH9rFfZo924Pfj9BT9uy9YKoKbBUHI509N9P1xj8DS%2FDuDzVzhuGTn0S9RMxeP8bg%2FqEMTJ4L%0A6nqPEhfek0gId0nWVqkuiWc%3D"));
        driver.navigate().refresh();
        return this;
    }
}
