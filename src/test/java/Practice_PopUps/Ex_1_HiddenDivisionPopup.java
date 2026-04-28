package Practice_PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_1_HiddenDivisionPopup {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mobikwik.com/");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[text()='Login'][1]")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//label[text()='Enter Mobile Number']")).sendKeys("9999999999");
Thread.sleep(4000);

    }
}
