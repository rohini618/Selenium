package S2_PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_AlertPopUps {
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

        //getText from alert popup
        String text= driver.switchTo().alert().getText();
        System.out.println(text);

        //click on cancel button from alert pop up
      //  driver.switchTo().alert().dismiss();

        //click on Ok button from alert pop up
       driver.switchTo().alert().accept();

        //click on Ok button from alert pop up 2
        driver.switchTo().alert().accept();
        }
    }

