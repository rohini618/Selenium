package S2_CaptureScreenShot;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

import static java.util.logging.FileHandler.*;

public class Ex2_CaptureScreenshotOfSpecificElement {
    public static void main(String[] args) throws InterruptedException,IOException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");

        Thread.sleep(3000);

       // driver.findElement(By.xpath(""))
        Thread.sleep(3000);

        WebElement logo = driver.findElement(By.xpath("//div[@class='_1psv1zeb9 _1psv1ze0 _1psv1zedi'][1]"));
        File src=logo.getScreenshotAs(OutputType.FILE);

        File dest=new File("C:\\Users\\Yogesh\\Desktop\\RohiniClass\\Selenium_Screenshot\\logo1.png");
        FileHandler.copy(src,dest);





    }
}
