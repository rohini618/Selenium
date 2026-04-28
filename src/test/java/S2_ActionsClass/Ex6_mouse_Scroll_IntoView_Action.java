package S2_ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex6_mouse_Scroll_IntoView_Action {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/drag_drop.html");

        Actions act=new Actions(driver);

        WebElement copyright = driver.findElement(By.xpath("//span[contains(text(),'Copyright')]"));
        act.scrollToElement(copyright).perform();
        Thread.sleep(2000);

        WebElement selenium=driver.findElement(By.xpath("//a[text()='Selenium']"));
        act.scrollToElement(selenium).perform();





    }
}
