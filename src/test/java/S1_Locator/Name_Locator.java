package S1_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name_Locator {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/r.php?entry_point=login");

        //Enter FN
        driver.findElement(By.name("firstname")).sendKeys("abc");

        //Enter email/mob no
        driver.findElement(By.name("reg_email__")).sendKeys("xyz");


    }
}
