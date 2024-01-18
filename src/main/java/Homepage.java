import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
WebDriver driver;
public Homepage(WebDriver driver){
    this.driver=driver;

}
public WebElement xpathele(){
return driver.findElement(By.xpath(" //a[@href=\"/login\"]"));
}
public WebElement logedincssele(){
    return driver.findElement(By.cssSelector("li:nth-child(10) > a"));
}
public WebElement logoutcssele(){
        return driver.findElement(By.cssSelector("a[href=\"/logout\"]"));
    }

}

