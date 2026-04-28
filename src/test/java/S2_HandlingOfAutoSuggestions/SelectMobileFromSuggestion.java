package S2_HandlingOfAutoSuggestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.openqa.selenium.By.xpath;

public class SelectMobileFromSuggestion {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Thread.sleep(1000);

        //search mob name
        driver.findElement(xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
        Thread.sleep(1000);

       List<WebElement> allOptions= driver.findElements(By.xpath("//ul[@class='G43f7e'][1]/li//div[@class='wM6W7d']"));

        System.out.println(allOptions.size());

        String expMobileName="redmi 15c";

        for(WebElement s1:allOptions) {

        String actMobileName=s1.getText();
        if(actMobileName.equalsIgnoreCase(expMobileName)){
        s1.click();
        break;
        }

        }

    }
}
