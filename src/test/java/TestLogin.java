import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

/**
 * Created by t_shubhik on 5/23/2017.
 */
public class TestLogin {

    @Test
    public void Test1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\t_shubhik\\Downloads\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://www.flipkart.com/");
        driver.findElement(By.cssSelector("#container > div > header > div._1tz-RS > div._1H5F__ > div > ul > li:nth-child(9) > a")).click();

    }

}