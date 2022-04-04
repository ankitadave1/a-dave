package ParallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParallelTest1 {
    WebDriver driver;

    @Test
    void logoTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\snehalkumar.chavada\\IdeaProjects\\TestNGPractice\\src\\test\\resources\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");

        WebElement Logo = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
        Assert.assertTrue(Logo.isDisplayed(), "Logo is not displayed on the page");
        Thread.sleep(5000);
    }

    @Test
    void homepageTitle() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\snehalkumar.chavada\\IdeaProjects\\TestNGPractice\\src\\test\\resources\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");

        String title = driver.getTitle();
        Assert.assertEquals("nopCommerce demo store", title, "Page title is not matched");
        Thread.sleep(5000);
    }

    @AfterMethod
    void CloseBrowser() {
        driver.quit();
    }
}
