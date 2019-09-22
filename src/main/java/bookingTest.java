import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class bookingTest {
    public static void main(String[] args){
        System.setProperty("webdriver.firefox.marionette","src\\webdriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.booking.com/index.pl.html");
    }
}
