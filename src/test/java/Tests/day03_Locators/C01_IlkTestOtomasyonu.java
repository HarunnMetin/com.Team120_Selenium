package Tests.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_IlkTestOtomasyonu {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver-win64 (1)/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //amazon anasayfaya gidin
        driver.get("https://www.amazon.com");
        //arama kutusuna "Nutella" yazdirip aratin
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella");
        aramaKutusu.submit();
        //arama sonuclarinin "Nutella" icerdigini test edin

        //WebElement aramaSonucuElementi = driver.findElement(By.className("sg-col-inner"));

        List<WebElement>  elementlerListesi = driver.findElements(By.className("sg-col-inner"));
        String actualAramaSonucu = elementlerListesi.get(0).getText();
        String expectedIcerik = "Nutella";
        System.out.println(actualAramaSonucu);
        Thread.sleep(3000);
        driver.close();

        if (actualAramaSonucu.contains(expectedIcerik)){
            System.out.println("Ilk otomasyon test PASSED");
        }
        else {
            System.out.println("Ilk otomasyon testi FAİLED");
        }


    }
}
