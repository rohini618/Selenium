package S2_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectOptionFrom_MultiSelectListbox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/Yogesh/Desktop/RohiniClass/htmlDoc.html");

        //1: identify the listbox
        WebElement selectskill = driver.findElement(By.xpath("//select[@id='skills']"));

        //2: create an object of select class
        Select s=new Select(selectskill);

        //3: call the select class methods
        s.selectByIndex(1);
        s.selectByIndex(2);
        s.selectByIndex(3);

        Thread.sleep(3000);

        s.deselectByVisibleText("Selenium");
//        s.deselectByVisibleText("");
//        s.deselectByIndex(3);
//        s.deselectByValue("");

}
}