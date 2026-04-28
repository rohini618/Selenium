package S2_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOptionFrom_MultiSelectableListbox {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/Yogesh/Desktop/RohiniClass/htmlDoc.html");

        //1: identify the listbox
        WebElement selectskill = driver.findElement(By.xpath("//select[@id='skills']"));

        //2: create an object of select class
        Select s=new Select(selectskill);

        //3: call the select class methods
        s.selectByVisibleText("Selenium");
        s.selectByVisibleText("API Testing");
        s.selectByIndex(4);
//        s.selectByValue("java");





    }
}
