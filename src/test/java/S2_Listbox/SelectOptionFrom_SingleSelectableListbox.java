package S2_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOptionFrom_SingleSelectableListbox {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //identify the listbox
        WebElement element=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));

       //create object of select class
        Select s=new Select(element);

        //call the select class method
       // s.selectByIndex(1);
        s.selectByValue("option2");
        s.selectByVisibleText("Option1");









    }
}
