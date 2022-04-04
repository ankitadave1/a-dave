package TestNGFramework.src.main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class AssertionTestCase {
    WebDriver driver;
    @BeforeClass
    void openBrowser()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\snehalkumar.chavada\\IdeaProjects\\TestNGFramework\\src\\test\\resources\\BrowserDriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
    }

    @Test
    void webLogo()  {
        WebElement Logo = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
        Assert.assertTrue(Logo.isDisplayed(),"Logo is not displayed on page");
    }
    @Test
    void homePageTitle()
    {
        String title = driver.getTitle();
        Assert.assertEquals("nopCommerce demo store",title,"Page title is not matched");
    }

    @AfterClass
    void closeBrowser()
    {
        driver.quit();
    }

}
