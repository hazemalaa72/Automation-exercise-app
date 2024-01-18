import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
    WebDriver driver;
    public Login(WebDriver driver){
          this.driver=driver;
    }
    public WebElement cssele(){
      return   driver.findElement(By.cssSelector("div[class=\"signup-form\"] > h2"));


    }
    public WebElement csselelogin(){
        return   driver.findElement(By.cssSelector("div[class=\"login-form\"]>h2"));


    }
    public WebElement csselename(){
        return   driver.findElement(By.cssSelector("input[type=\"text\"]"));


    }
    public WebElement csseleemail(){
        return   driver.findElement(By.cssSelector("input[data-qa=\"signup-email\"]"));


    }
    public WebElement csselesignupbtn(){
        return   driver.findElement(By.cssSelector("button[data-qa=\"signup-button\"]"));


    }
    public WebElement csselesignupbtnlogin(){
        return   driver.findElement(By.cssSelector("button[data-qa=\"login-button\"]"));


    }
    public WebElement csseleemaillogin(){
        return   driver.findElement(By.cssSelector("input[data-qa=\"login-email\"]"));


    }
    public WebElement csselepasswordlogin(){
        return   driver.findElement(By.cssSelector("input[data-qa=\"login-password\"]"));


    }

}
