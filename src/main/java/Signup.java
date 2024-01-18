import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Signup {
    WebDriver driver;
    public Signup(WebDriver driver){
        this.driver=driver;

    }
    public WebElement csseleforb(){
      return   driver.findElement(By.cssSelector("div[class=\"login-form\"]>h2 > b"));
    }
    public WebElement csselefortitle(){
        return   driver.findElement(By.cssSelector("label[for=\"id_gender1\"]"));
    }
    public WebElement nameele(){
       return driver.findElement(By.id("name"));
    }
    public WebElement emailele(){
        return driver.findElement(By.id("email"));
    }
    public WebElement passele(){
        return driver.findElement(By.id("password"));
    }
    public WebElement dayele(){
        return driver.findElement(By.id("days"));
    }
    public WebElement monthele(){
        return driver.findElement(By.id("months"));
    }
    public WebElement yearele(){
        return driver.findElement(By.id("years"));
    }
    public WebElement csseleforsignupcheckbox(){
        return   driver.findElement(By.cssSelector("label[for=\"newsletter\"]"));
    }
    public WebElement csseleforsecondcheckbox(){
        return   driver.findElement(By.cssSelector("label[for=\"optin\"]"));
    }
    public WebElement firstnameele(){
        return driver.findElement(By.id("first_name"));
    }
    public WebElement lastnameele(){
        return driver.findElement(By.id("last_name"));
    }
    public WebElement companyele(){
        return driver.findElement(By.id("company"));
    }
    public WebElement address1ele(){
        return driver.findElement(By.id("address1"));
    }
    public WebElement address2ele(){
        return driver.findElement(By.id("address2"));
    }
    public WebElement mobileele(){
        return driver.findElement(By.id("mobile_number"));
    }
    public WebElement countryele(){
        return driver.findElement(By.id("country"));
    }
    public WebElement stateele(){
        return driver.findElement(By.id("state"));
    }
    public WebElement cityele(){
        return driver.findElement(By.id("city"));
    }
    public WebElement zipcodeele(){
        return driver.findElement(By.id("zipcode"));
    }
    public WebElement cssselectorbutton(){
        return driver.findElement(By.cssSelector("button[data-qa=\"create-account\"]"));
    }


}

//First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number