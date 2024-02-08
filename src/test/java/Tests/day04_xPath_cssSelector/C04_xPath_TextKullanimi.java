package Tests.day04_xPath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_xPath_TextKullanimi {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrom.driver","C:\\Users\\acer\\com.Team120_Selenium\\kurulumDosyalari\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));

        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //2- Add Element butonuna basin
        driver.findElement(By.xpath("//button[text() = 'Add Element']")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu = driver.findElement(By.xpath("//button[text()= 'Delete']"));
        if (deleteButonu.isDisplayed()){
            System.out.println("buton gorunuyor test PASSED");
        }
        else{
            System.out.println("buton gorunmuyor test FAİLED");
        }
        Thread.sleep(2000);
        //4- Delete tusuna basin
        deleteButonu.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveYazisi = driver.findElement(By.xpath("//*[text()= 'Add/Remove Elements']"));
        if (addRemoveYazisi.isDisplayed()){
            System.out.println("Add remove yazisi gorunuyor TEST PASSED");
        }
        else {
            System.out.println("Add remove yazisi gorunmuyor TEST FAİLED");
        }
        Thread.sleep(2000);
        driver.close();


    }
}
