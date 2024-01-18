import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Accountcreated {
    WebDriver driver;
    public Accountcreated(WebDriver driver){
        this.driver=driver;

    }
    public WebElement cssselectorfrob(){
        return driver.findElement(By.cssSelector("h2[data-qa=\"account-created\"]>b"));
    }
    public WebElement cssselectorfrobutton(){
        return driver.findElement(By.cssSelector("a[data-qa=\"continue-button\"]"));
    }

}
