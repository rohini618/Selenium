package S1_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByIndex {
public static void main(String[] args){
    ChromeDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/r.php?entry_point=login");
driver.get("");
    //Enter Firstname
    driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("abc");

    //Enter surnamename
    driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("xyz");



}
}
