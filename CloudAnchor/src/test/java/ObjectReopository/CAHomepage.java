package ObjectReopository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CAHomepage {

    WebDriver driver;

    By projectName = By.xpath("(//button[@id='dropdownBasic1'])[1]");
    By projectDropdown = By.xpath("//button[@class='dropdown-item ng-star-inserted']");

    public CAHomepage(WebDriver driver){
        this.driver=driver;
    }

    public WebElement ProjectName(){
        return driver.findElement(projectName);
    }

    public List<WebElement> ProjectDropdown(){
        return driver.findElements(projectDropdown);
    }




}
