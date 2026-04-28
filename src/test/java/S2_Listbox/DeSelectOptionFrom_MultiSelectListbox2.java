package S2_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectOptionFrom_MultiSelectListbox2 {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver =new ChromeDriver();
        driver.get("file:///C:/Users/Yogesh/Desktop/RohiniClass/htmlDoc.html");
        driver.manage().window().maximize();

        WebElement element=driver.findElement(By.xpath("//select[@id='skills']"));

        Select s=new Select(element);

      //  s.selectByIndex(0);
       // s.selectByIndex(1);
      //  s.selectByIndex(2);
        s.selectByValue("java");
        s.selectByVisibleText("Selenium");

        Thread.sleep(2000);

        s.deselectAll();

    }
}
