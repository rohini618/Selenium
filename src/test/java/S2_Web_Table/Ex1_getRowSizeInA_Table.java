package S2_Web_Table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex1_getRowSizeInA_Table {
    public static void main(String[] args) {
    WebDriver driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://testautomationpractice.blogspot.com/");

      //  List<WebElement> allRows= driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
        // int size=allRows.size();
       // System.out.println(size);

//        int size1 = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
//        System.out.println(size1);

        System.out.println(driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size());



    }
}
