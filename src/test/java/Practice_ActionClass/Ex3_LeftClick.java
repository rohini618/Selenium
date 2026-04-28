package Practice_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex3_LeftClick {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(3000);

        //click on popup close btn
        driver.findElement(By.xpath("//span[@class='b3wTlE']")).click();
        Thread.sleep(3000);

        WebElement cart = driver.findElement(By.xpath("//span[text()='Cart']"));

        Actions act=new Actions(driver);
        act.click(cart).perform();
    }
}
