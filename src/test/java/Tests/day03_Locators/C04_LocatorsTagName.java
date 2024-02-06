package Tests.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C04_LocatorsTagName {

    public static void main(String[] args) throws InterruptedException {

        //1- Bir test class’i olusturun ilgili ayarlari yapin
        System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\com.Team120_Selenium\\kurulumDosyalari\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/");
        //3- Sayfada 147 adet link bulundugunu test edin.
        List<WebElement> linkListesi = driver.findElements(By.name("a"));
        int expectedLinkListesi = 147;
        int actualLinkListesi = linkListesi.size();
        if (actualLinkListesi == expectedLinkListesi){
            System.out.println("Link testi PASSED");
        }
        else {
            System.out.println("Link testi FAILED");
        }
        //4- Products linkine tiklayin
        driver.findElement(By.partialLinkText("Products")).sendKeys(Keys.ENTER);
        //5- special offer yazisinin gorundugunu test edin
        //driver.findElement(By.linkText("special offer")).isDisplayed();
        //6- Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();
    }
}
