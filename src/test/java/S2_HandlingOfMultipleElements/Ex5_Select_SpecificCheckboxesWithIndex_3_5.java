package S2_HandlingOfMultipleElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex5_Select_SpecificCheckboxesWithIndex_3_5 {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(1000);

        List<WebElement> allcheckboxes = driver.findElements(By.xpath("(//div[@class='form-group'])[4]//input"));

        for(int i=0;i<=allcheckboxes.size()-1;i++){
        if(i==3|i==5){
        allcheckboxes.get(i).click();
        }
        }

    }
}
