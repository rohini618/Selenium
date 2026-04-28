package Practice_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Ex6_getAllOptions {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/Yogesh/Desktop/RohiniClass/htmlDoc.html");

        WebElement element = driver.findElement(By.xpath("//select[@id='skills']"));

        Select s=new Select(element);

        List<WebElement> allOptions=s.getOptions();
        System.out.println(allOptions.size());
//for(WebElement singleOption:allOptions){
//    System.out.println(singleOption.getText());
//}

    }
}
