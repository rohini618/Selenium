package S1_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName_Locator {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/r.php?entry_point=login");

        //Select Dob
        driver.findElement(By.tagName("select")).sendKeys("18");

        //select gender
        driver.findElement(By.tagName("label")).sendKeys("Female");





 ;   }
}
