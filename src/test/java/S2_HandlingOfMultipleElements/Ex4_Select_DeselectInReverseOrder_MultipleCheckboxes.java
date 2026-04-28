package S2_HandlingOfMultipleElements;

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
        Thread.sleep(1000);

        List<WebElement> allcheckboxes = driver.findElements(By.xpath("(//div[@class='form-group'])[4]//input"));

        //select checkboxes in forward direction
        for(WebElement s1:allcheckboxes){
            s1.click();
            Thread.sleep(1000);
        }

        //de-select checkboxes in reverse direction
        for(int i=allcheckboxes.size()-1;i>=0;i--){
        allcheckboxes.get(i).click();
        Thread.sleep(1000);
        }


    }
}
