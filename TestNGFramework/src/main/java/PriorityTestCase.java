package TestNGFramework.src.main.java;

import org.testng.annotations.Test;

public class PriorityTestCase {
    @Test(priority = 1)
    void testOne()
    {
        System.out.println("Test One");
    }
    @Test(priority = 2)
    void testTwo()
    {
        System.out.println("Test Two");
    }
    @Test(priority = 3)
    void testThree()
    {
        System.out.println("Test Three");
    }
    @Test(priority = 4,enabled = true)
    void testFour()
    {
        System.out.println("Test Four");
    }
}
