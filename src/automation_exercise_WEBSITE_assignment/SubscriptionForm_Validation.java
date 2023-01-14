package automation_exercise_WEBSITE_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class SubscriptionForm_Validation {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        driver.navigate().to("https://automationexercise.com/");

        WebElement heading2Validation = driver.findElement(By.cssSelector("div[class='single-widget']>h2"));
        heading2Validation.isDisplayed();



        Driver.quitDriver();
    }
}
