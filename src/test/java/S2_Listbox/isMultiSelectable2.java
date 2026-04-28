package S2_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class isMultiSelectable2 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement element=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));

        Select s=new Select(element);

        boolean result=s.isMultiple();

        if(result){
            System.out.println("Listbox is multiselectable");
        }
        else{
            System.out.println("Listbox is single selectable");
        }


    }
}
