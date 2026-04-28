package Practice_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex2_MultiSelect {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/Yogesh/Desktop/RohiniClass/htmlDoc.html");
        Thread.sleep(4000);
       WebElement skills = driver.findElement(By.xpath("//select[@id='skills']"));
        Select s=new Select(skills);

        s.selectByVisibleText("Selenium");
        s.selectByValue("java");
        s.selectByIndex(3);
    }
}
