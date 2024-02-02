package Tests.day01_DriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_seleniumWebDriver {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.trendyol.com");
    }
}
