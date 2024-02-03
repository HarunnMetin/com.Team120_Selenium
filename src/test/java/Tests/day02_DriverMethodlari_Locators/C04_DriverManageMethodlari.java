package Tests.day02_DriverMethodlari_Locators;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_DriverManageMethodlari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver-win64 (1)/chromedriver-win64/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        System.out.println("maximize size :"+driver.manage().window().getSize());
        System.out.println("makimize konum :"+driver.manage().window().getPosition());

        //window'u fullscreen yapin

        driver.manage().window().fullscreen();

        System.out.println("fulscrean size :"+driver.manage().window().getSize());
        System.out.println("fulscrean konum :"+driver.manage().window().getPosition());



        //window'un baslangic konumunu (200,300) ve boyutunu (500,500) yapin

        driver.manage().window().setPosition(new Point(200,300));
        driver.manage().window().setSize(new Dimension(500,500));

        System.out.println("costomize size :"+driver.manage().window().getSize());
        System.out.println("costomize konum :"+driver.manage().window().getPosition());


        Thread.sleep(300);
        driver.close();

    }
}
