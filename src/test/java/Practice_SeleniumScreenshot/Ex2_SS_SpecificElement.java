package Practice_SeleniumScreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Ex2_SS_SpecificElement {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        Thread.sleep(5000);

        WebElement item = driver.findElement(By.xpath("//a[@class='nav-a nav-a-2   nav-progressive-attribute'][1]"));
        File src = item.getScreenshotAs(OutputType.FILE);
        File destine = new File("C:\\Users\\Yogesh\\Desktop\\RohiniClass\\Selenium_Screenshot\\img3.png");
        FileHandler.copy(src, destine);


    }
}
