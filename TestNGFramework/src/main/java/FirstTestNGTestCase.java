package TestNGFramework.src.main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//1. Open browser - ent url
//2. Login
//3. Close the browser
public class FirstTestNGTestCase {
    WebDriver driver;
    @Test(priority = 1)
    void openBrowser(){
        System.out.println("Browser will open");
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\snehalkumar.chavada\\IdeaProjects\\TestNGFramework\\src\\test\\resources\\BrowserDriver\\chromedriver.exe");
//        driver=new ChromeDriver();
//        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
    }
    @Test(priority = 2)
    void logIn() throws InterruptedException {
        System.out.println("User able to login");
//        Thread.sleep(2000);
//        driver.findElement(By.id("Email")).sendKeys("test123@gmail.com");
//        driver.findElement(By.id("Password")).sendKeys("Tester123");
//        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
    }
    @Test(priority = 3)
    void closeBrowser() throws InterruptedException {
//        Thread.sleep(2000);
        System.out.println("Browser will close");
//        driver.quit();

    }

}
