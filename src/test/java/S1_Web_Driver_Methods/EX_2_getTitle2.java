package S1_Web_Driver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX_2_getTitle2 {
    public static void main(String[]args){

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");

        String expTitle="facebook- login or signup";
        String actTitle=driver.getTitle();
        System.out.println(actTitle);

        if (actTitle.equals(expTitle))
        {
            System.out.println("facebook webpage open");
        }
        else
        {
            System.out.println("facebook webpage not found");
        }




    }
}
