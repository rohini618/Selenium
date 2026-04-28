package Practice_SeleniumScreenshot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Ex1_Screenshot {
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        Thread.sleep(6000);
        File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        System.out.println(source);

        File destine =new File("C:\\Users\\Yogesh\\Desktop\\RohiniClass\\Selenium_Screenshot\\img5.png");

        FileHandler.copy(source, destine);

    }

}
