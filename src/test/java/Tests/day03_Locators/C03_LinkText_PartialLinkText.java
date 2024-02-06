package Tests.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_LinkText_PartialLinkText {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\com.Team120_Selenium\\kurulumDosyalari\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Amazon sayfasina gidin
        driver.get("https://www.amazon.com");
        //Gift Cards linkine gidin
        //driver.findElement(By.linkText("Gift Cards")).click();
        //driver.findElement(By.partialLinkText("Gift")).click();
        driver.findElement(By.linkText("Gift Cards")).sendKeys(Keys.ENTER);
        //linkin bizi Gift Cards sayfasina yonlendirdigini test edin

        //sayfayi kapatin
        WebElement giftCardYaziElementi = driver.findElement(By.className("nav-menu-logo"));
        if (giftCardYaziElementi.isDisplayed()){
            System.out.println("test PASSED");
        }
        else {
            System.out.println("test FAİLED");
        }

    }
}
