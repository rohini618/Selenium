package Practice_HandlingMultipleElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex5_Select_SpecificCheckboxesWithIndex_2_4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(2000);

        List<WebElement> allCheckboxes = driver.findElements(By.xpath("(//div[@class='form-group'])[4]//input"));
        for(int i=0;i<= allCheckboxes.size()-1;i++){
        if(i==2||i==5){
        allCheckboxes.get(i).click();
}
}
    }
}
