package TestNGFramework.src.main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class AnnotationsTestCase1 {
    WebDriver driver;
    @Test
    void test1() throws InterruptedException {
        System.out.println("Test Case 1");
//        Thread.sleep(2000);
//        driver.findElement(By.id("Email")).sendKeys("test123@gmail.com");
//        driver.findElement(By.id("Password")).sendKeys("Tester123");
//        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
    }
    @Test
    void test2()
    {
        System.out.println("Test Case 2");
//        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
    }

    @BeforeMethod
    void beforeMethod()
    {
        System.out.println("Execute Before Method");
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\snehalkumar.chavada\\IdeaProjects\\TestNGFramework\\src\\test\\resources\\BrowserDriver\\chromedriver.exe");
//        driver=new ChromeDriver();
//        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
    }
    @AfterMethod
    void afterMethod()
    {
        System.out.println("Execute After Method");
//        driver.quit();
    }

    @BeforeClass
    void beforeClass()
    {
        System.out.println("Execute Before class");
    }
    @AfterClass
    void afterClass()
    {
        System.out.println("Execute After class");
    }

    @BeforeTest
    void beforeTests()
    {
        System.out.println("Execute Before Tests");
    }
    @AfterTest
    void afterTests()
    {
        System.out.println("Execute After Tests");
    }


}
