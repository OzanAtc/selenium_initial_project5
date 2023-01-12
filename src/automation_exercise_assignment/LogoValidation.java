package automation_exercise_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class LogoValidation {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();
        driver.navigate().to("https://automationexercise.com/");

        WebElement logoValidation = driver.findElement(By.cssSelector("img[src='/static/images/home/logo.png']"));
        System.out.println(logoValidation.isDisplayed()); // true

        WebElement emailInputBox = driver.findElement(By.cssSelector("input[id='susbscribe_email']"));
        System.out.println(emailInputBox.isDisplayed());
        System.out.println(emailInputBox.getAttribute("placeholder"));

        WebElement submitButton = driver.findElement(By.id("subscribe"));
        System.out.println(submitButton.isDisplayed());

        WebElement textUnderEmail = driver.findElement(By.cssSelector("form[class='searchform'] p"));
        System.out.println(textUnderEmail.isDisplayed());




        Driver.quitDriver();
    }
}
