package S1_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID_Locator {
    public static void main(String[]args){

        WebDriver driver =new ChromeDriver();
        driver.get("https://www.facebook.com/r.php?entry_point=login");

        driver.findElement(By.id("js_0")).sendKeys("abc"); //This ID is dynamic in nature so output is nothing

    }
}
