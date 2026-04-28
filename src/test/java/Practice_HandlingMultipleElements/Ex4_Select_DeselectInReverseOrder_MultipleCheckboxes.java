package Practice_HandlingMultipleElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex4_Select_DeselectInReverseOrder_MultipleCheckboxes {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(2000);

        List<WebElement> allCheckboxes=driver.findElements(By.xpath("(//div[@class='form-group'])[4]//input"));
        for(WebElement s1:allCheckboxes){
            s1.click();
            Thread.sleep(1000);
        }
for(int i=allCheckboxes.size()-1;i>=0;i--){
allCheckboxes.get(i).click();
Thread.sleep(1000);
}
    }
}
