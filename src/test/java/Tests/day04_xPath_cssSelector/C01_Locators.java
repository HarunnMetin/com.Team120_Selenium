package Tests.day04_xPath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_Locators {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\com.Team120_Selenium\\kurulumDosyalari\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- https://www.amazon.com/ sayfasına gidin.
        driver.get("https://www.amazon.com/");
        //2- Arama kutusuna “city bike” yazip aratin
        WebElement aramaKutusu =driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike");
        aramaKutusu.sendKeys(Keys.ENTER);
        //3- Görüntülenen sonuçların sayısını yazdırın
        WebElement yaziElementi = driver.findElement(By.className("sg-col-inner"));
        System.out.println(yaziElementi.getText());
        //4- Listeden ilk urunun resmine tıklayın.

        List<WebElement> urunListesi =driver.findElements(By.className("s-image"));
        urunListesi.get(12).click();

        Thread.sleep(3000);
        driver.close();
    }
}
