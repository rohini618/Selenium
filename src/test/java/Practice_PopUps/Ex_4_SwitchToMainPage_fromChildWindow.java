package Practice_PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

public class Ex_4_SwitchToMainPage_fromChildWindow {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://skpatro.github.io/demo/links/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //click on NewTab from main page
        driver.findElement(By.xpath("//input[@name='NewTab']")).click();

        Set<String> allAddress=driver.getWindowHandles();
        ArrayList<String> al=new ArrayList<String>(allAddress);

        driver.switchTo().window(al.get(1));
        driver.findElement(By.xpath("(//span[text()='Selenium'])[1]")).click();
        Thread.sleep(3000);

        driver.switchTo().window(al.get(0));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='NewWindow']")).click();

        //Ex4: Switch to childwindow 2 from main page

        Set<String> alladdress1=driver.getWindowHandles();
        ArrayList<String> al1=new ArrayList<String>(alladdress1);

        driver.switchTo().window(al1.get(2));
        Thread.sleep(2000);

        driver.manage().window().maximize();




    }
}
