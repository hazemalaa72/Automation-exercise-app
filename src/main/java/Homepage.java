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
    public WebElement subscriptioncssele(){
        return driver.findElement(By.cssSelector("div[class=\"single-widget\"]>h2"));
    }
    public WebElement arrowbntcssele(){
        return driver.findElement(By.className("fa-angle-up"));
    }
    public WebElement contshopbntcssele(){
        return driver.findElement(By.cssSelector("button[data-dismiss=\"modal\"]"));
    }
    public WebElement productbtncssele(){
        return driver.findElement(By.cssSelector("a[href=\"/products\"]"));
    }
    public WebElement product1cssele(){
        return driver.findElement(By.cssSelector("img[src=\"/get_product_picture/1\"]"));
    }
    public WebElement product2cssele(){
        return driver.findElement(By.cssSelector("img[src=\"/get_product_picture/3\"]"));
    }
    public WebElement addtocartcssele(){
        return driver.findElement(By.cssSelector("div[class=\"productinfo text-center\"] >a[data-product-id=\"1\"]"));
    }
    public WebElement viewtocartcssele(){
        return driver.findElement(By.cssSelector("a[href=\"/view_cart\"]"));
    }
    public WebElement description1cssele(){
        return driver.findElement(By.cssSelector(" a[href=\"/product_details/1\"]"));
    }
    public WebElement description2cssele(){
        return driver.findElement(By.cssSelector(" a[href=\"/product_details/3\"]"));
    }
    public WebElement price1cssele(){
        return driver.findElement(By.cssSelector(" #product-1 > td.cart_price > p"));
    }
    public WebElement price2cssele(){
        return driver.findElement(By.cssSelector(" #product-3 > td.cart_price > p"));
    }
    public WebElement quantity1cssele(){
        return driver.findElement(By.cssSelector(" #product-1 > td.cart_quantity > button"));
    }
    public WebElement quantity2cssele(){
        return driver.findElement(By.cssSelector(" #product-3 > td.cart_price > p"));
    }
    public WebElement total1cssele(){
        return driver.findElement(By.cssSelector(" #product-1 > td.cart_total > p"));
    }
    public WebElement total2cssele(){
        return driver.findElement(By.cssSelector(" #product-3 > td.cart_total > p"));
    }
    public WebElement Searchfield(){
    return driver.findElement(By.id("search_product"));
    }
    public WebElement Searchfbtn(){
        return driver.findElement(By.id("submit_search"));
    }
    public WebElement Searchfh2(){
        return driver.findElement(By.className("title"));
    }





}

