package S2_ShadowRootElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowRootElement {
    public static void main(String[] args) throws InterruptedException {
    WebDriver driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://testautomationpractice.blogspot.com/");

    Thread.sleep(2000);

        //driver.findElement(By.cssSelector("#shadow_host")).getShadowRoot().findElement(By.cssSelector("input[type='text']")).sendKeys("abc");
driver.findElement(By.cssSelector("#shadow_host")).getShadowRoot().findElement(By.cssSelector("input[type='text']")).sendKeys("abc");




    }
}
