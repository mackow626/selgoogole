package data;

import TestBase.Base;
import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

/**
 * Created by mkowalczuk on 2015-10-27.
 */
public class dataProvider extends Base {

    @DataProvider(name = "mail")
    public Object[][] dane(Method method) {

        Object[][] result = null;

        if (method.getName().equals("Login1")) {
            result = new Object[][]{
                    {"626mackow626",
                            "selenium123"}
            };
        } else if (method.getName().equals("readMail")) {
            result = new Object[][]{
                    {"626mackow626",
                            "selenium123"}
            };
        } else if (method.getName().equals("sendRecive")) {
            result = new Object[][]{
                    {"626mackow626",
                            "selenium123",
                            "626mackow626@gmail.com",
                            "afawdfawdwa"}
            };
        }

        return result;
    }
}