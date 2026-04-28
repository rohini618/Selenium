package S2_Web_Table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4_SelectCheckbox_withLaptopName {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        driver.findElement(By.xpath("//table[@id='productTable']//tr/td[text()='Laptop']//following-sibling::td[2]/input")).click();


        Thread.sleep(5000);
        driver.quit();

    }
}
