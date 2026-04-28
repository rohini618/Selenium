package S3_IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMainFrame_fromIframe {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");

        //switch to iframe
        driver.switchTo().frame("iframeResult");

        //click on date and time
        driver.findElement(By.xpath("//button[contains(text(),'Click')]")).click();

        //switch to main page
     //   driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();

        //click on open menu btn from main page
        driver.findElement(By.xpath("//a[@id='menuButton']")).click();



    }
}

