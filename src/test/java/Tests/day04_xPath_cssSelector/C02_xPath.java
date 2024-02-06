package Tests.day04_xPath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_xPath {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\com.Team120_Selenium\\kurulumDosyalari\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //2- Add Element butonuna basin
        WebElement addElementTusu = driver.findElement(By.xpath("//*[@id=\"content\"]/div/button"));
        addElementTusu.sendKeys(Keys.ENTER);
        //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu = driver.findElement(By.xpath("//*[@id=\"elements\"]/button"));
        if (deleteButonu.isDisplayed()){
            System.out.println("DELETE tusu gorunuyor");
            System.out.println("test PASSED");
        }
        else {
            System.out.println("DELETE tusu gorunmuyor");
            System.out.println("test FAİLED");
        }
        //4- Delete tusuna basin
        deleteButonu.sendKeys(Keys.ENTER);
        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveYazisi = driver.findElement(By.xpath("//*[@id=\"content\"]/h3"));
        if (addRemoveYazisi.isDisplayed()){
            System.out.println("yazi gorunuyor");
            System.out.println("test PASSED");
        }
        else {
            System.out.println("yazi gorunmuyor");
            System.out.println("test FAİLED");
        }


    }
}
