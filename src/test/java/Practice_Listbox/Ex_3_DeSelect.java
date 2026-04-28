package Practice_Listbox;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex_3_DeSelect {
        public static void main(String[] args) throws InterruptedException {
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("file:///C:/Users/Yogesh/Desktop/RohiniClass/htmlDoc.html");
            Thread.sleep(4000);
            WebElement skills = driver.findElement(By.xpath("//select[@id='skills']"));
            Select s=new Select(skills);

            s.selectByIndex(0);
            s.selectByIndex(1);
            s.selectByIndex(2);

            Thread.sleep(2000);

//            s.deselectByVisibleText("Java");
//            s.deselectByValue("selenium");
//            s.deselectByVisibleText("SQL");

            s.deselectAll();

    }
}
