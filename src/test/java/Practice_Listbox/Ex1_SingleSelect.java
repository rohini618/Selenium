package Practice_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex1_SingleSelect {
    public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://rahulshettyacademy.com/AutomationPractice/");

    WebElement element=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));

    Select s=new Select(element);

   // s.selectByVisibleText(Option1);
  //  s.selectByValue(option2);
    s.selectByIndex(1);
    }
}
