package Tests.day01_DriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_ilkClass {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\com.Team120_Selenium\\kurulumDosyalari\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");
        driver.get("https://www.youtube.com/");
    }
}
