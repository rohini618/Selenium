package Setup;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {
    public static void main(String[] args){
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/login/");

    }
}
