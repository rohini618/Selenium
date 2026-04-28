package Practice_ActionClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex6_MouseScrollByAmount {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        Thread.sleep(5000);

        Actions act=new Actions(driver);
        act.scrollByAmount(0,700).perform();
        act.scrollByAmount(0,-400).perform();

    }
}
