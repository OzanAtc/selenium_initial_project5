package automation_exercise_WEBSITE_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

import java.util.List;

public class HeaderItems {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();
        driver.navigate().to("https://automationexercise.com/");

        List<WebElement> headerItems = driver.findElements(By.cssSelector("ul[class='nav navbar-nav']>li"));

        String[] actualText = {"Home", "Products", "Cart", "Signup/Login", "Test Cases", "API Testing", "Video Tutorials", "Contact us"};

        for (int i = 0; i < headerItems.size(); i++) {

            System.out.println("Check 1 = " + headerItems.get(i).getText().equals(actualText[i])); // added Check1 to see the patterns if there is any bug with that.
            System.out.println("\n" + headerItems.get(i).getText());
            System.out.println(headerItems.get(i).isDisplayed() && headerItems.get(i).isEnabled()); // true
        }

        Driver.quitDriver();
    }
}
