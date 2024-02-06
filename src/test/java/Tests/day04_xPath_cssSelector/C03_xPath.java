package Tests.day04_xPath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_xPath {

    public static void main(String[] args) throws InterruptedException {

        //1- WebDrive olusturun
        System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\com.Team120_Selenium\\kurulumDosyalari\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");
        //3- Browseri tam sayfa yapin
        driver.manage().window().maximize();
        //4- Sayfayi “refresh” yapin;
        Thread.sleep(3000);
        driver.navigate().refresh();
        //5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String expectedTitle = "Spend less";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitle)){
            System.out.println("TEST PASSED");
        }
        else {
            System.out.println("TEST FAİLED");
        }
        //6- Gift Cards sekmesine basin
        WebElement giftCard = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]"));
        giftCard.sendKeys(Keys.ENTER);
        //7- Specialty Gift Cards butonuna basin
        driver.findElement(By.linkText("Specialty Gift Cards")).sendKeys(Keys.ENTER);
        //8- ilk urunu tiklayin
        driver.findElement(By.xpath("//*[@id=\"acsProductBlockV1-0\"]/a")).sendKeys(Keys.ENTER);
        //9- Gift card details’den 25 $'i secin
        driver.findElement(By.id("gc-mini-picker-amount-1")).sendKeys(Keys.ENTER);
        //10-Urun ucretinin 25$ oldugunu test edin
        WebElement urunFiyatElementi = driver.findElement(By.xpath("//*[@id=\"gc-live-preview-amount-container\"]"));
        System.out.println(urunFiyatElementi.getText());
        String expectedUrunUcreti = "25$";
        String actualUrunUcreti = urunFiyatElementi.getText();
        if (actualUrunUcreti.equals(expectedUrunUcreti)){
            System.out.println("TEST PASSED");
        }
        else {
            System.out.println("TEST FAİLED");
        }


        //11-Sayfayi kapatin
        Thread.sleep(2000);
        driver.close();
    }
}
