import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class bookingTest {
    public static void main(String[] args){
        WebDriver driver;
        System.setProperty("webdriver.gecko.driver","src\\webdriver\\geckodriver.exe");
        driver = new FirefoxDriver();

        driver.get("https://www.booking.com/index.pl.html");
        driver.close();
    }
}
