package StepDefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static StepDefs.Hooks.driver;

public class FBLoginPage
{
    WebElement eMailInput;
    WebElement passInput;
    WebElement submitButton;
    WebElement fNameInput;
    WebElement sNameInput;
    WebElement mNoInput;
    WebElement nPwdInput;
    WebElement dayList;
    WebElement monthList;
    WebElement yearList;
    WebElement radioButton1;
    WebElement radioButton2;
    WebElement signUpButton;

    public FBLoginPage(WebDriver driver)
    {
        accessFB("https://www.facebook.com/");
        eMailInput = driver.findElement(By.id("email"));
        passInput = driver.findElement(By.id("pass"));
        submitButton = driver.findElement(By.id("u_0_2"));
        fNameInput = driver.findElement(By.id("u_0_l"));
        sNameInput = driver.findElement(By.id("u_0_n"));
        mNoInput = driver.findElement(By.id("u_0_q"));
        nPwdInput = driver.findElement(By.id("u_0_x"));
        dayList = driver.findElement(By.id("day"));
        monthList = driver.findElement(By.id("month"));
        yearList = driver.findElement(By.id("year"));
        radioButton1 = driver.findElement(By.id("u_0_9"));
        radioButton2 = driver.findElement(By.id("u_0_a"));
        signUpButton = driver.findElement(By.id("u_0_13"));
    }

    public static void accessFB(String S)
    {
        driver.get(S);
    }
    public void isSeen()
    {
        if(eMailInput.isDisplayed())
        {
            enterEmail("panga.vl1@gmail.com");
        }
        else
        {
            System.out.println("Email Input is not Displayed");
        }
        if(passInput.isDisplayed())
        {
            enterPwd("Test@123!");
        }
        else
        {
            System.out.println("Password Input is not Displayed");
        }
    }
    public void enterEmail(String S)
    {
        eMailInput.sendKeys(S);

    }

    public void enterPwd(String S)
    {
        passInput.sendKeys(S);
    }

    public void click1()
    {
        submitButton.click();
    }
}
