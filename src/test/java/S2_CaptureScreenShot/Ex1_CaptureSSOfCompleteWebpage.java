package S2_CaptureScreenShot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;

public class Ex1_CaptureSSOfCompleteWebpage {
    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");

        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        File dest = new File("C:\\Users\\Yogesh\\Desktop\\RohiniClass\\Selenium_Screenshot\\image1.png");

        FileHandler.copy(source, dest);

    }
}