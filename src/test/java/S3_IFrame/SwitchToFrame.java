package S3_IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");

        //switch to iframe
        driver.switchTo().frame("iframeResult");
      //  driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));


        //click on date and time button
        driver.findElement(By.xpath("//button[contains(text(),'Date and Time')]")).click();



    }
}
