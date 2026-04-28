package S2_ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex5_mouse_DragAndDropAction {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.findElement(By.xpath("https://demo.guru99.com/test/drag_drop.html"));

        WebElement src = driver.findElement(By.xpath("(//li[@class='block13 ui-draggable'])[1]"));
        WebElement dest = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[3]"));

        Actions act=new Actions(driver);
        act.dragAndDrop(src,dest).perform();

    }
}
