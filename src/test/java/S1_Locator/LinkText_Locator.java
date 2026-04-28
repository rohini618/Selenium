package S1_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_Locator {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/r.php?entry_point=login");

        driver.findElement(By.linkText("Already have an account?")).click();
    }
}
