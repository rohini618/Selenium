package S1_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute {
public static void main(String[] args){

    WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");
    driver.manage().window().fullscreen();

    //Enter UN
    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc");

    //Enter PW
    driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("xyz");

    //Click on login
    driver.findElement(By.xpath("//button[@name='login']")).click();


}
}
