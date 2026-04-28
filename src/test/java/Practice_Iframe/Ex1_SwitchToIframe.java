package Practice_Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_SwitchToIframe {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");

        //switch to iframe
        driver.switchTo().frame("iframeResult");

        //click on date and time
        driver.findElement(By.xpath("//button[contains(text(),'Click')]")).click();

    }
}
