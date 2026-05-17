import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass {
    public static void main(String[] args) throws InterruptedException {
//
//        WebDriver driver=new EdgeDriver();
//        driver.get("https://the-internet.herokuapp.com/");
//
////
//        ChromeOptions options = new ChromeOptions();
//
//        //  Disable general popups
//        options.addArguments("--disable-notifications");
//        options.addArguments("--disable-geolocation");
//        options.addArguments("--disable-infobars");
//        options.addArguments("--disable-extensions");
//        options.addArguments("--disable-popup-blocking");
//
//        //  Block all permissions popups (notifications, camera, mic, etc.)
//        Map<String, Object> prefs = new HashMap<>();
//        prefs.put("profile.default_content_setting_values.notifications", 2);
//        prefs.put("profile.default_content_setting_values.geolocation", 2);
//        prefs.put("profile.default_content_setting_values.media_stream", 2);
//        prefs.put("profile.password_manager_leak_detection", false);
//
//        options.setExperimentalOption("prefs", prefs);
//
//        //open veezeta
//        WebDriver mybrowser=new ChromeDriver();
//      mybrowser.get("https://www.vezeeta.com/ar");
//
//        mybrowser.manage().window().maximize();
//        JavascriptExecutor JS =(JavascriptExecutor)mybrowser;
//        JS.executeScript("argument[0].scrollIntoView(True);",mybrowser.findElement(By.xpath("//*[@id='__next']/div/div[1]/div[2]/div/div[1]/div/a[2]/div[2]")));
//
//        mybrowser.findElement(By.xpath("//*[@id='__next']/div/div[1]/div[2]/div/div[1]/div/a[2]/div[2]")).click();
////        JS.executeScript("window.scrollBy(0,1000)");
////        Thread.sleep(1000);
////        JS.executeScript("window.scrollBy(0,-600)");
////        Thread.sleep(1000);
////        JS.executeScript("window.scrollBy(0,6000)");
////        Thread.sleep(1000);
//        JS.executeScript("window.scrollBy(0,-800)");


      //  mybrowser.switchTo().newWindow(WindowType.TAB);
     //   mybrowser.get("https://www.saucedemo.com/");
//        WebElement Addtocart=mybrowser.findElement(By.xpath("//button[text()='Add to cart'][1]"));
//                Addtocart .click();
//
//        ArrayList<String>tabs=new ArrayList<>(mybrowser.getWindowHandles());
//        Thread.sleep(1000);
//        mybrowser.switchTo().window(tabs.get(1));
//        Thread.sleep(3000);
//        mybrowser.switchTo().window(tabs.get(0));
//
//        WebElement spiciality_dropdown=mybrowser.findElement(By.id("selectSpecialityDropdown"));
//        spiciality_dropdown.click();
//        Thread.sleep(1000);
//        List<WebElement> All_spiciality=mybrowser.findElements(By.cssSelector("ul>li[data-testid *= 'speciality']"));
//        All_spiciality.get(4).click();



//        WebDriver MyBrowser =new ChromeDriver(options);
//        //TO OPEN WEBSITE
//        MyBrowser.get("https://www.saucedemo.com/");
//        //allocators with id
//        WebElement UserName=MyBrowser.findElement(By.id("user-name"));
//        UserName.sendKeys("standard_user");
//        WebElement password=MyBrowser.findElement(By.id("password"));
//        password.sendKeys("secret_sauce");
//        WebElement Login=MyBrowser.findElement(By.id("login-button"));
//        Login.click();
//        WebElement SortingDroplist=MyBrowser.findElement(By.cssSelector("[class=\"product_sort_container\"]"));
//        Select select_from_theDropDown=new Select(SortingDroplist);
//        select_from_theDropDown.selectByIndex(1);
//        select_from_theDropDown.deSelectByContainsVisibleText("Name (Z to A)");
//



//        // to maximize the window
//        MyBrowser.manage().window().maximize();
//        //wait (delay time )
//         Thread.sleep(3000);
//        //to minimize the window
//        MyBrowser.manage().window().minimize();
//
//        //allocators with name
//        WebElement UserName =MyBrowser.findElement(By.name("user-name"));
//        UserName.sendKeys("standard_user");
//
//        //if i have more than one elements use (findelements)
//        WebElement UserName=MyBrowser.findElements(By.name("input_error")).get(0);
//        Username.sendKeys("fady123");

        // website2 demoblaze

//
//        WebDriver Mybrowser=new ChromeDriver(options);
//        Mybrowser.get("https://www.demoblaze.com/");
//        Mybrowser.manage().window().maximize();
//        WebElement Login=Mybrowser.findElement(By.id("login2"));
//        Login.click();
//        WebDriverWait LoginWait=new WebDriverWait(Mybrowser,Duration.ofSeconds(5));
//        WebElement Username1=LoginWait.until(ExpectedConditions.visibilityOf(Mybrowser.findElement(By.id("loginusername"))));
//
//        Username1.sendKeys("fady12");
//        WebElement Password1=LoginWait.until(ExpectedConditions.visibilityOf(Mybrowser.findElement(By.id("loginpassword"))));
//
//        Password1.sendKeys("123");
//
//        WebElement LOGIN1=Mybrowser.findElements(By.className("btn-primary")).get(2);
//        LOGIN1.click();
//
//        Alert myalert = LoginWait.until(ExpectedConditions.alertIsPresent());
//        System.out.println(myalert.getText());
//        myalert.accept();
//        Thread.sleep(2000);
//        Username1.clear();
//        Username1.sendKeys("fady123");
//        Password1.clear();
//        Password1.sendKeys("123");
//        LOGIN1.click();
//



//        Thread.sleep(3000);
//        WebElement Username=Mybrowser.findElement(By.id("loginusername"));
//        Username.sendKeys("fady123");
//        WebElement Password=Mybrowser.findElement(By.id("loginpassword"));
//        Password.sendKeys("1234");
//        WebElement LOGIN=Mybrowser.findElements(By.className("btn-primary")).get(2);
//        LOGIN.click();
//        Thread.sleep(1000);

//        Thread.sleep(1000);




        WebDriver Mybrowser=new ChromeDriver();
        Mybrowser.get("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
        Mybrowser.manage().window().maximize();
        Actions myAction=new Actions(Mybrowser);
        myAction.moveToElement(Mybrowser.findElement(By.xpath("//*[@id=\"widget-navbar-217834\"]/ul/li[4]/a/div/span"))).click();










    }
}
