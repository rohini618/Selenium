package S2_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class isMultiple {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/Yogesh/Desktop/RohiniClass/htmlDoc.html");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.xpath("//select[@id='skills'] "));

        Select s=new Select(element);

        boolean result=s.isMultiple();
        System.out.println(result);

        if(result){
            System.out.println("Listbox is multi selectable");
        }
        else{
            System.out.println("Listbox is single selectable");
        }










    }
}
