import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class App {
    WebDriver driver =null;
    Homepage home;
    Login login;
    Signup signup;
    Accountcreated accountcreated;
    JavascriptExecutor js;
    Actions action;
    SoftAssert soft;
    public static void main(String[] args) {}
    @BeforeTest
   public void OpenBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Hazem Alaa Mostafa\\IdeaProjects\\Learning\\src\\Browsers\\chromedriver.exe");
        driver =new ChromeDriver();
        driver.navigate().to("http://automationexercise.com");
        driver.manage().window().maximize();
        home =new Homepage(driver);
        login =new Login(driver);
        signup =new Signup(driver);
        accountcreated=new Accountcreated(driver);
         js = (JavascriptExecutor) driver;
         action = new Actions(driver);
         soft=new SoftAssert();

    }
    @Test
    public void ValidSignup(){
        home.xpathele().click();
        login.cssele().isDisplayed();
        login.csselename().sendKeys("Hazem");
        login.csseleemail().sendKeys("hazemala12@gmail.com");
        login.csselesignupbtn().click();
        signup.csseleforb().isDisplayed();
        signup.csselefortitle().click();
        signup.passele().sendKeys("12345");
        signup.dayele().sendKeys("27");
        signup.monthele().sendKeys("October");
        signup.yearele().sendKeys("1999");
        signup.csseleforsignupcheckbox().click();
        signup.csseleforsecondcheckbox().click();
        signup.firstnameele().sendKeys("Hazem");
        signup.lastnameele().sendKeys("Alaa");
        signup.companyele().sendKeys("valeo");
        signup.address1ele().sendKeys("7magdy");
        signup.address2ele().sendKeys("7ezz");
        signup.countryele().sendKeys("Egypt");
        signup.stateele().sendKeys("haram");
        signup.cityele().sendKeys("giza");
        signup.zipcodeele().sendKeys("980");
        signup.mobileele().sendKeys("01146280113");
        signup.cssselectorbutton().click();
        accountcreated.cssselectorfrobutton().click();
        String expextedvalue="ACCOUNT CREATED!";
        String actualvalue=accountcreated.cssselectorfrob().getText();
        soft.assertTrue(actualvalue.contains(expextedvalue),"First assertion");
        soft.assertTrue(accountcreated.cssselectorfrob().isDisplayed(),"second assertion");
    }
    @Test
    public void Invalidsignup1(){
        //not email format
        home.xpathele().click();
        login.cssele().isDisplayed();
        login.csselename().sendKeys("Hazem");
        login.csseleemail().sendKeys("hazemala12");



    }
    @Test
    public void Invalidsignup2(){
        //Email Address already exist!
        home.xpathele().click();
        login.cssele().isDisplayed();
        login.csselename().sendKeys("Hazem");
        login.csseleemail().sendKeys("hazemala72@gmail.com");



    }

    @Test
    public void Invalidsignup3(){
//one field or more empty
        home.xpathele().click();
        login.cssele().isDisplayed();
        login.csselename().sendKeys("Hazem");
        login.csseleemail().sendKeys("hazemala26@gmail.com");
        login.csselesignupbtn().click();
        signup.csseleforb().isDisplayed();
        signup.csselefortitle().click();
        signup.passele().sendKeys("");
        signup.dayele().sendKeys("27");
        signup.monthele().sendKeys("October");
        signup.yearele().sendKeys("1999");
        signup.csseleforsignupcheckbox().click();
        signup.csseleforsecondcheckbox().click();
        signup.firstnameele().sendKeys("Hazem");
        signup.lastnameele().sendKeys("Alaa");
        signup.companyele().sendKeys("valeo");
        signup.address1ele().sendKeys("7magdy");
        signup.address2ele().sendKeys("7ezz");
        signup.countryele().sendKeys("Egypt");
        signup.stateele().sendKeys("haram");
        signup.cityele().sendKeys("giza");
        signup.zipcodeele().sendKeys("980");
        signup.mobileele().sendKeys("01146280113");
        signup.cssselectorbutton().click();
        accountcreated.cssselectorfrobutton().click();


    }
    @Test
    public void Validlogout(){
        home.xpathele().click();
        login.csselelogin().isDisplayed();
        login.csseleemaillogin().sendKeys("hazemala72@gmail.com");
        login.csselepasswordlogin().sendKeys("12345");
        login.csselesignupbtnlogin().click();
        home.logedincssele().isDisplayed();
        home.logoutcssele().click();

        String expextedvalue="https://automationexercise.com/login";
        String actualvalue=driver.getCurrentUrl();
        soft.assertTrue(actualvalue.contains(expextedvalue),"third assertion");




    }
    @Test
    public void Validscrollwithoutarrow() throws InterruptedException {
        //scrolldown to the end of the page and up to the top of the page (without arrow)
       js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
         Thread.sleep(3000);
        js.executeScript("window.scrollTo(document.body.scrollHeight,0 )");
        home.subscriptioncssele().isDisplayed();




    }
    @Test
    public void Validscrollwitharrow() throws InterruptedException {
        //scrolldown to the end of the page and up to the top of the page (with arrow)
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(3000);
        home.arrowbntcssele().click();
        home.subscriptioncssele().isDisplayed();


    }

    @Test
    public void AddTocart(){
        home.productbtncssele().click();
        action.moveToElement(home.product1cssele()).perform();
        home.addtocartcssele().click();
        home.contshopbntcssele().click();
        action.moveToElement(home.product2cssele()).perform();
        home.addtocartcssele().click();
        home.viewtocartcssele().click();
        home.product1cssele().isDisplayed();
        home.product2cssele().isDisplayed();
        soft.assertEquals(home.description1cssele(),
                "Blue Top");
        soft.assertEquals(home.description2cssele(),
                "Sleeveless Dress");
        soft.assertEquals(home.price1cssele(),
                "Rs. 500");
        soft.assertEquals(home.price2cssele(),
                "Rs. 1000");
        soft.assertEquals(home.quantity1cssele(),
                "3");
        soft.assertEquals(home.quantity2cssele(),
                "2");
        soft.assertEquals(home.total1cssele(),
                "Rs. 1500");
        soft.assertEquals(home.total2cssele(),
                "Rs. 2000");



    }
    @Test
    public void Search(){
        home.productbtncssele().click();
        soft.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/products");
        home.Searchfield().sendKeys("Blue Top");
        home.Searchfbtn().click();
       String expectedvalue="SEARCHED PRODUCTS";
       String actualvalue=home.Searchfh2().getText();
       soft.assertTrue(actualvalue.contains(expectedvalue),"searched products assertion");
        home.product1cssele().isDisplayed();





    }

}
