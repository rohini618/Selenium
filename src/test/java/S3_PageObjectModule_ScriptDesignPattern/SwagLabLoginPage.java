package S3_PageObjectModule_ScriptDesignPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage {
    //Step1: variable declaration
    @FindBy(xpath="//input[@id='user-name']")private WebElement UN;
    @FindBy(xpath="//input[@id='password']") private WebElement Pwd;
    @FindBy(xpath="//input[@id='login-button']") private WebElement LoginButton;

    //Step2: initialization
    public SwagLabLoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    //Step 3: Perform Action
    public void enterUN(String username) {
        UN.sendKeys(username);
    }
    public void enterPwd(String password){
        Pwd.sendKeys(password);
    }
    public void clickOnLoginBtn(){
    LoginButton.click();
    }
}
