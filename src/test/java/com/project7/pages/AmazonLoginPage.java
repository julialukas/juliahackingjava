package com.project7.pages;
import com.project7.utilities.ConfigurationReader;
import com.project7.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;;

public class AmazonLoginPage {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");

        WebElement signInButton = driver.findElement(By.id("nav-link-accountList"));
        signInButton.click();

        WebElement usernameInput = driver.findElement(By.id("ap_email"));
        usernameInput.sendKeys("devanmemberships@gmail.com");

        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();

        WebElement passwordInput = driver.findElement(By.id("ap_password"));
        passwordInput.sendKeys("julia2004");

        WebElement continueButton2 = driver.findElement(By.id("signInSubmit"));
        continueButton2.click();

        WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchBox.sendKeys("siberian husky"+ Keys.ENTER);
        
        
    }

    public AmazonLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@data-nav-ref='nav_custrec_signin']//span")
    public WebElement navActionInnerSpan;

    @FindBy(name = "email")
    public WebElement inputUsername;

    @FindBy(xpath = "//input[@tabindex='5']")
    public WebElement continueInput;

    @FindBy(id = "continue")
    public WebElement continueInput2;

    @FindBy(id = "ap_password")
    public WebElement inputPassword;

    @FindBy(id = "signInSubmit")
    public WebElement signinsubmitInput;

    @FindBy(xpath = "//*[@id='ap_email']")
    public WebElement emailInput;

    @FindBy(id = "continue")
    public WebElement continueInput3;

    @FindBy(id = "continue")
    public WebElement continueInput4;

    @FindBy(id = "continue")
    public WebElement continueInput5;

    @FindBy(id = "continue")
    public WebElement continueInput6;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(id = "signInSubmit")
    public WebElement signinsubmitInput2;

    @FindBy(id = "signInSubmit")
    public WebElement signinsubmitInput3;

    @FindBy(name = "field-keywords")
    public WebElement fieldKeywordsInput;

    @FindBy(id = "twotabsearchtextbox")
    public WebElement fieldKeywordsInput2;

    @FindBy(xpath = "//*[@id='nav-search-submit-button']")
    public WebElement navSearchSubmitButtonInput;


    public void login(){
    inputUsername.sendKeys(ConfigurationReader.getProperty("username"));
    inputPassword.sendKeys(ConfigurationReader.getProperty("password"));




    }

}



