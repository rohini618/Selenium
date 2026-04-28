package S2_Web_Table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3_getSpecificData_from_TableTable {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        String text=driver.findElement(By.xpath("//table[@id='taskTable']//tr/td[text()='Chrome']/following-sibling::td[contains(text(),'Mbps')]")).getText();
        System.out.println(text);

        Thread.sleep(5000);
        driver.quit();
    }
}
