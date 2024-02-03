package Tests.day02_DriverMethodlari_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverGetMethodlari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver-win64 (1)/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(4000);

        driver.get("https://www.amazon.com");
        System.out.println("title :"+driver.getTitle());
        System.out.println("url :"+driver.getCurrentUrl());
        System.out.println("********************************");
        System.out.println(driver.getPageSource());
        System.out.println("*********************************");
        System.out.println("Windov handle :"+driver.getWindowHandle());
        System.out.println("Windov handles :"+driver.getWindowHandles());
        Thread.sleep(3500);
        driver.close();
    }
}
