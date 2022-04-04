package TestNGFramework.src.main.java;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTestCase {

//    @Test(dataProvider = "loginTest")
    @Test(dataProvider = "loginTest",dataProviderClass = CustomDataProvider.class)
    public void loginTest(String email, String pwd) {
        System.out.println(email + "  " + pwd);
    }
//    @DataProvider(name="loginTest")
//    public Object[][] getData() {
//        Object[][] data = {{"abc@gmail.com", "abc"}, {"xyz@gmail.com", "xyz"},
//                {"tys@gmail.com", "tys"}};
//        return data;
//    }
}

