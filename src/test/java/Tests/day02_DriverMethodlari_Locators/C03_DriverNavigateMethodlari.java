package Tests.day02_DriverMethodlari_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C03_DriverNavigateMethodlari {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Amazon sayfasina gidin
        driver.get("https://www.amazon.com");
        Thread.sleep(2000);
        //sayfa basliginin "smile more" icerdigini test edin
        String expectIcerik = "smile more";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectIcerik)) {
            System.out.println("Sayfa basligi testi PASSED");
        }
        else {
            System.out.println("Sayfa basligi testi FAİLED");
        }

        //youtube anasayfaya gidin
        driver.navigate().to("https://www.youtube.com");
        Thread.sleep(2000);
        //url'in youtube icerdigini test edin
        String expectUrl = "youtube";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains(expectUrl)){
            System.out.println("URL testi PASSED");
        }
        else {
            System.out.println("URL testi FAİLED");
        }

        //tekrar amazon sayfasina donun
        driver.navigate().back();
        Thread.sleep(2000);
        //ve url'in "ramazon" icermedigini test edin
        String expectUrlAmazon = "ramazon";
        String actualUrlAmazon = driver.getCurrentUrl();
        if (!actualUrlAmazon.contains(expectUrlAmazon)){
            System.out.println("Amazon URL testi PASSED");
        }
        else {
            System.out.println("Amazon URL testi FAİLED");
        }

        //tekrar youtube anasayfayagidin
        driver.navigate().forward();
        Thread.sleep(2000);

        //kaynak kodlarinda "music" gectigini test edin
        String expectKaynakKod = "music";
        String actualKaynakKod = driver.getPageSource();
        if (actualKaynakKod.contains(expectKaynakKod)){
            System.out.println("Kaynak kod testi PASSED");
        }
        else {
            System.out.println("Kaynak kod testi failed");
        }

        //sayfayi kapatin
        Thread.sleep(2000);
        driver.close();


    }
}
