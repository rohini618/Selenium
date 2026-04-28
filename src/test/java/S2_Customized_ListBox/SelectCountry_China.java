package S2_Customized_ListBox;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SelectCountry_China
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(2000);

        Actions act = new Actions(driver);

        WebElement country = driver.findElement(By.xpath("//select[@id='country']"));

        //step 1: click on listbox
        act.click(country).perform();
        Thread.sleep(2000);

        //step2: navigate to china option by using arrow_down key
        for (int i = 1; i <= 7; i++) {
            act.sendKeys(Keys.ARROW_DOWN).perform();
            Thread.sleep(1000);
        }
        //Step3: Select option
        act.sendKeys(Keys.ENTER).perform();
        Thread.sleep(5000);

        driver.quit();
    }

}

