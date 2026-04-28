package S2_PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

public class Ex3_SwitchToChidWindow {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://skpatro.github.io/demo/links/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Click on New Tab from main page
        driver.findElement(By.xpath("//input[@name='NewTab']")).click();

        //get child window address
        Set<String> allAddress=driver.getWindowHandles();
        ArrayList<String> al=new ArrayList<>(allAddress);

        String mainPageid=al.get(0);
        String childWindowId=al.get(1);

        System.out.println(mainPageid);
        System.out.println(childWindowId);

        //switch to child window
        driver.switchTo().window(childWindowId);

        //click on selenium link from child window
driver.findElement(By.xpath("//span[text()='Selenium']")).click();


    }
}
