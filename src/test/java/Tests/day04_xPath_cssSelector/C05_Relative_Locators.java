package Tests.day04_xPath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C05_Relative_Locators {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver-win64 (1)/chromedriver-win64/chromedriver.exekurulumDosyalari/chromedriver-win64 (1)/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //1 ) https://www.diemol.com/selenium-4-demo/relative-locators-demo.html adresine gidin
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");
        //2 ) Berlin'i 3 farkli relative locator ile locate edin
        //<img id="pid7_thumb" src="bots/sl-berlin-bot.png" class="ui-li-thumb">
        //A- NYC altinda diye locate edin
        WebElement nycElementi = driver.findElement(By.id("pid7_thumb"));
        WebElement berlin1 = driver.findElement(RelativeLocator.with(By.tagName("img")).below(nycElementi));

        //B- Boston'un sagindaki diye locate edelim
        ///<img id="pid6_thumb" src="bots/sl-boston-bot.png" class="ui-li-thumb">
        WebElement bostonElementi = driver.findElement(By.className("ui-li-thumb"));
        WebElement berlin2 = driver.findElement(RelativeLocator.with(By.id("pid7_thumb")).toRightOf(bostonElementi));


        //3 ) Relative locator’larin dogru calistigini test edin



    }
}
