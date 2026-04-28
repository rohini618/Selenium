package S1_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains_UsingAtrribute {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        //enter Username
        driver.findElement(By.xpath("//input[contains(@placeholder,'phone')]")).sendKeys("abc");

        //enter password
        driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("xyz");



    }
}