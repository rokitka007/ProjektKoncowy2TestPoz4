import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Date;
import java.util.List;

public class bookingTest {
    public static void main(String[] args) {
        WebDriver driver;

        System.setProperty("webdriver.gecko.driver", "src\\webdriver\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.booking.com/index.pl.html");
        driver.findElement(By.cssSelector("input.sb-searchbox__input")).sendKeys("Warszawa, mazowieckie, Polska");
        driver.findElement(By.cssSelector("button.sb-date-field__icon-btn")).click();
        List<WebElement> dateIn = driver.findElements(By.cssSelector("td.bui-calendar__date"));
        WebElement SingleDay = driver.findElement (By.cssSelector("div.bui-calendar__wrapper:nth-child(1) > table:nth-child(2) > tbody:nth-child(1) > tr:nth-child(6) > td:nth-child(1)"));
        SingleDay.click();
        WebElement SingleDay2 = driver.findElement(By.cssSelector("div.bui-calendar__wrapper:nth-child(1) > table:nth-child(2) > tbody:nth-child(1) > tr:nth-child(6) > td:nth-child(4)"));
        SingleDay2.click();
        driver.findElement(By.cssSelector("div.bui-checkbox:nth-child(8) > label:nth-child(2)")).click();
        driver.findElement(By.cssSelector("button.sb-searchbox__button")).click();
        driver.findElement(By.linkText("Cena (od najniższej)")).click();

    }
}
//