package S3_IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_NestedFrame {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://autotestsandbox.com/examples/nested-iframes");

        //switch to outer frame
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Outer nested frame']")));

        //switch to inner frame
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Inner']")));

        //get text
        String text= driver.findElement(By.xpath("//p[text()='Inner iframe content']")).getText();
        System.out.println(text);



    }
}
