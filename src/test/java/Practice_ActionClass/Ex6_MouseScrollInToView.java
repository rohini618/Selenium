package Practice_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex6_MouseScrollInToView {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        Thread.sleep(5000);

        Actions act=new Actions(driver);
        WebElement copyright=driver.findElement(By.xpath("//span[contains(text(),'© Copyright')]"));

        act.scrollToElement(copyright).perform();
        Thread.sleep(3000);

        WebElement selenium=driver.findElement(By.xpath("//a[text()='Selenium']"));
        act.scrollToElement(selenium).perform();

    }
}
