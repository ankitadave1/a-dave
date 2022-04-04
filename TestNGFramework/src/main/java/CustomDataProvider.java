package TestNGFramework.src.main.java;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {
    @DataProvider(name="loginTest")
    public Object[][] getData() {
        Object[][] data = {{"abc@gmail.com", "abc"}, {"xyz@gmail.com", "xyz"},
                {"tys@gmail.com", "tys"}};
        return data;
    }
}
