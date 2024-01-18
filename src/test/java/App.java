import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class App {
    WebDriver driver =null;
    Homepage home;
    Login login;
    Signup signup;
    Accountcreated accountcreated;
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
        SoftAssert soft1=new SoftAssert();
        String expextedvalue="ACCOUNT CREATED!";
        String actualvalue=accountcreated.cssselectorfrob().getText();
        soft1.assertTrue(actualvalue.contains(expextedvalue),"First assertion");
        soft1.assertTrue(accountcreated.cssselectorfrob().isDisplayed(),"second assertion");
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
        SoftAssert soft2=new SoftAssert();
        String expextedvalue="https://automationexercise.com/login";
        String actualvalue=driver.getCurrentUrl();
        soft2.assertTrue(actualvalue.contains(expextedvalue),"third assertion");




    }

}
