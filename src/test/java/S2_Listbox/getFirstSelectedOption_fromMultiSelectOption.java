package S2_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getFirstSelectedOption_fromMultiSelectOption {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/Yogesh/Desktop/RohiniClass/htmlDoc.html");

       WebElement element= driver.findElement(By.xpath("//select[@id='skills']"));

       Select s=new Select(element);

       s.selectByIndex(0);
       s.selectByIndex(1);

       String text=s.getFirstSelectedOption().getText();
        System.out.println(text);


    }

}
