package Practice_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex2_SelectCountryCustomizedListbox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(2000);

        Actions act=new Actions(driver);

        WebElement country= driver.findElement(By.xpath("//select[@id='country']"));

        act.click(country).perform();
        Thread.sleep(2000);

        for(int i=1;i<=7;i++){
            act.sendKeys(Keys.ARROW_DOWN).perform();
            Thread.sleep(1000);
        }

        act.sendKeys(Keys.ENTER).perform();
        Thread.sleep(4000);

        driver.quit();



    }
}
