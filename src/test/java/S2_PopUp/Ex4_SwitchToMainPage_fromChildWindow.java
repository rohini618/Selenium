package S2_PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

public class Ex4_SwitchToMainPage_fromChildWindow {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://skpatro.github.io/demo/links/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //click on new tab from main page
        driver.findElement(By.xpath("//input[@name='NewTab']")).click();

        //get child window address
        Set<String> allAddress = driver.getWindowHandles();
        ArrayList<String> al= new ArrayList<String>(allAddress);

        //switch to child window
        driver.switchTo().window(al.get(1));

        //click on Selenium link from child window
        driver.findElement(By.xpath("(//span[text()='Selenium'])[1]")).click();
        Thread.sleep(3000);


        //switch to main page
        driver.switchTo().window(al.get(0));
        Thread.sleep(2000);

        //click on NewWindow from main page
        driver.findElement(By.xpath("//input[@name='NewWindow']")).click();

    }
}
