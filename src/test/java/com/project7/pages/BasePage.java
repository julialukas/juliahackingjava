package com.project7.pages;

import com.project7.utilities.Driver;
import com.project7.utilities.WebDriverFactory;
import io.cucumber.java.AfterAll;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class BasePage {

protected WebDriver driver;

@BeforeClass
    public void setupMethod() {

    driver = WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // PageFactory.initElements(Driver.getDriver(), this);
    }
    @AfterAll
    public void tearDown(){
    driver.close();

    }
}
//abstract - to prevent instantiation
//parent class for concrete Page object classes
//provides a reusable constructor with initElements