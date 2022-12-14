package com.qacart.com.base;

import com.qacart.com.factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    protected WebDriver driver;
           @BeforeMethod
            public void setUp()
            {
                driver=new DriverFactory().initializeDriver();
            }

            @AfterMethod
            public void teardown()
            {
                driver.quit();
            }


}
