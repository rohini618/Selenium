package S2_ActionsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex6_mouse_Scroll_ByAmount_Action {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/drag_drop.html");

        Actions act=new Actions(driver);

        //Scroll down
        act.scrollByAmount(0,-400).perform();
        Thread.sleep(2000);

        //Scroll Up
        act.scrollByAmount(0,700).perform();
        Thread.sleep(2000);

        //Scroll right
        act.scrollByAmount(300,0).perform();

        //scroll left
        act.scrollByAmount(-300,0).perform();


    }
}
