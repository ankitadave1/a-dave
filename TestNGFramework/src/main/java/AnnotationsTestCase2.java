package TestNGFramework.src.main.java;

import org.testng.annotations.*;

public class AnnotationsTestCase2 {
    @Test
    void test3() {
        System.out.println("Test Case 3");
    }
    @Test
    void test4()
    {
        System.out.println("Test Case 4");
    }

    @BeforeMethod
    void beforeMethod(){
    System.out.println("Execute Before Method");
    }
    @AfterMethod
    void afterMethod()
    {
        System.out.println("Execute After Method");
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

    @BeforeSuite
    void beforeSuite()
    {
        System.out.println("Execute Before Suite");
    }
    @AfterSuite
    void afterSuite()
    {
        System.out.println("Execute After Suite");
    }

}
