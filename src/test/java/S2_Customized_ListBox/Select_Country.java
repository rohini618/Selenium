package S2_Customized_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Select_Country {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(2000);

        Actions act=new Actions(driver);

        WebElement country = driver.findElement(By.xpath("//select[@id='country']"));

        //step1: click on listbox
        act.click(country).perform();
        Thread.sleep(2000);

        //step2: Arrow_down
        act.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(2000);

        //step2: Arrow_Up
        act.sendKeys(Keys.ARROW_UP).perform();
        Thread.sleep(2000);

        //step2: Select option
        act.sendKeys(Keys.ENTER).perform();
        Thread.sleep(5000);


        driver.quit();

    }
}
