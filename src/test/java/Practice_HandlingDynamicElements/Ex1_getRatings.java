package Practice_HandlingDynamicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Ex1_getRatings {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.flipkart.com/");
        Thread.sleep(3000);

        //click on popup close btn
        driver.findElement(By.xpath("//span[@class='b3wTlE']")).click();
        Thread.sleep(3000);

        //enetr mob name
        driver.findElement(By.xpath("(//input[@class='nw1UBF v1zwn25'])[1]")).sendKeys("redmi 15 5G");

        driver.findElement(By.xpath("(//button[@class='XFwMiH'])[1]")).click();

        String ratings=driver.findElement(By.xpath("((//div[@class='jIjQ8S'][1]//span)[6])")).getText();
        System.out.println(ratings);

        String reviews=driver.findElement(By.xpath("((//div[@class='jIjQ8S'][1]//span)[8])")).getText();
        System.out.println(reviews);


    }
}
