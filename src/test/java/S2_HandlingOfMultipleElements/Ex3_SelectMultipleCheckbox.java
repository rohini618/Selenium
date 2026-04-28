package S2_HandlingOfMultipleElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex3_SelectMultipleCheckbox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(2000);

        List<WebElement> allCheckboxes =driver.findElements(By.xpath("(//div[@class='form-group'])[4]//input"));
        for(WebElement s1:allCheckboxes)
        {
        s1.click();
        Thread.sleep(1000);
        }





    }


}
