package ObjectReopository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CALoginpage {

    WebDriver driver;

    By Email = By.xpath("//input[@placeholder='Email']");
    By Password = By.xpath("//input[@type='password']");
    By LoginBtn = By.xpath("//button[contains(text(),'Login')]");

    public CALoginpage(WebDriver driver){
        this.driver =driver;
    }

    public WebElement email(){

        return driver.findElement(Email);
    }

    public WebElement password(){
        return driver.findElement(Password);
    }

    public WebElement loginbtn(){

        return driver.findElement(LoginBtn);
    }



}
