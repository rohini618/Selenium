package Practice_HandlingOfAutoSuggestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex2_SelectSpecificMobile_FromAutosuggestion {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Thread.sleep(2000);

        //search mobile name
        driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
        Thread.sleep(1000);

        List<WebElement> allOptions = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li//div[@class='wM6W7d']"));

        System.out.println(allOptions.size());

        String expMobName="redmi 15";
        for(WebElement s1:allOptions){
            String actMobName=s1.getText();
            if(actMobName.equalsIgnoreCase(expMobName)){
                s1.click();
                break;
            }

        }
    }

}
