package TestNGFramework.src.main.java;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestNGTestCase {
    @Test(priority = 1)
    void OpenBrowser()
    {
        System.out.println("User able to Open Browser");
    }

    @Test(priority = 2)
    void AddProduct()
    {
        System.out.println("User able to Add Product");
    }

    @Test(priority = 3)
    void BuyProduct()
    {
        System.out.println("User able to Buy Product");
//        Assert.assertEquals(1,1); //Fail the Testcase
    }

    @Test(priority = 4)
    void CloseBrowser()
    {
        System.out.println("User able to Close browser");
    }
}
