package S2_PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_AlertPopUp_sendKeys {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://skpatro.github.io/demo/alerts/");
        Thread.sleep(1000);

        //enter customer id
        driver.findElement(By.xpath("//input[@id='prompt']")).click();

        Alert alt= driver.switchTo().alert();


        alt.sendKeys("abcd");
        alt.accept();





    }
}
