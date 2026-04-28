package Practice_PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

public class Ex3_SwitchToChildWindow {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://skpatro.github.io/demo/links/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//input[@name='NewTab']")).click();

        Set<String> alladdress=driver.getWindowHandles();
        ArrayList<String> al=new ArrayList<String>(alladdress);

        String mainPageid=al.get(0);
        String childWindowid=al.get(1);

        System.out.println(mainPageid);
        System.out.println(childWindowid);

        driver.switchTo().window(childWindowid);
        driver.findElement(By.xpath("//span[text()='Selenium'][1]")).click();

    }
}
