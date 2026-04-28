package Practice_HandlingOfAutoSuggestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex1_getAllOptions_FromAutoSuggestion {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");

       List<WebElement> allOptions=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li//div[@class='wM6W7d']"));

       for(WebElement s1:allOptions){
           System.out.println(s1.getText());
       }
    }
}
