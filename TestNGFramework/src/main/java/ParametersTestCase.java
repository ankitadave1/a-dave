package TestNGFramework.src.main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTestCase {
    WebDriver driver;
    @BeforeClass
    @Parameters({"browser","url"})
    void OpenBrowser(String browser,String url)
    {
        if(browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\snehalkumar.chavada\\IdeaProjects\\TestNGFramework\\src\\test\\resources\\BrowserDriver\\chromedriver.exe");
            driver = new ChromeDriver();
        }else if(browser.equalsIgnoreCase("edge"))
        {
            System.setProperty("webdriver.edge.driver", "C:\\Users\\snehalkumar.chavada\\IdeaProjects\\TestNGFramework\\src\\test\\resources\\BrowserDriver\\msedgedriver.exe");
            driver = new EdgeDriver();
        }
        driver.get(url);
    }
    @Test(priority = 1)
    void WebLogoTest()
    {
        WebElement Logo = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
        Assert.assertTrue(Logo.isDisplayed(),"Logo is not displayed on the page"); //logo should  display
    }
    @Test(priority = 2)
    void HomePageTitle()
    {
        String title = driver.getTitle();
        Assert.assertEquals("nopCommerce demo store",title,"Page title is not matched");
    }

    @AfterClass
    void CloseBrowser()
    {
        driver.quit();
    }

}
