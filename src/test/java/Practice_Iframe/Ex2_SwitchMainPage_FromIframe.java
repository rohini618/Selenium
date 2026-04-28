package Practice_Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_SwitchMainPage_FromIframe {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");

        driver.switchTo().frame("iframeResult");

        //click on date & time btn
        driver.findElement(By.xpath("//button[contains(text(),'Click')]")).click();

        driver.switchTo().parentFrame();
        driver.findElement(By.xpath("//a[@id='menuButton']")).click();

    }
}
