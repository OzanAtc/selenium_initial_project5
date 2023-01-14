package automation_exercise_WEBSITE_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class FooterValidation {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        driver.navigate().to("https://automationexercise.com/");

        WebElement footer = driver.findElement(By.cssSelector("p[class='pull-left']"));
        System.out.println(footer.getText());
        System.out.println(footer.isDisplayed());

        Driver.quitDriver();
    }
}
