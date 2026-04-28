package S1_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByText2 {
    public static void main(String[] args){
         WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");

        //create new account

        driver.findElement(By.xpath("//a[text()='Create new account']")).click();

    }
}
