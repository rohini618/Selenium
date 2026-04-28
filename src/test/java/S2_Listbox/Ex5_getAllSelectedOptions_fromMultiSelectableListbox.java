package S2_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Ex5_getAllSelectedOptions_fromMultiSelectableListbox {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/Yogesh/Desktop/RohiniClass/htmlDoc.html");

        WebElement element=driver.findElement(By.xpath("//select[@id='skills']"));
        Select s=new Select(element);
        s.selectByIndex(1);
        s.selectByIndex(2);
        s.selectByIndex(3);

        List<WebElement> allSelectedOptions=s.getAllSelectedOptions();

        for(WebElement s1:allSelectedOptions){
            System.out.println(s1.getText());
        }
        System.out.println(allSelectedOptions.size());











    }
}
