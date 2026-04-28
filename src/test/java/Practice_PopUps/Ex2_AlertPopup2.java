package Practice_PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_AlertPopup2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/delete_customer.php");

        Thread.sleep(2000);

        //enter customer id
        driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1234");
        Thread.sleep(2000);

        //click on submit btn
        driver.findElement(By.xpath("//input[@name='submit']")).click();

        Alert alt=driver.switchTo().alert();
        String text=alt.getText();
        System.out.println(text);

      //  alt.dismiss();
//alt.accept();
alt.accept();
alt.accept();



    }
}
