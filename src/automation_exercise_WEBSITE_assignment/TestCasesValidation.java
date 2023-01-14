package automation_exercise_WEBSITE_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.Waiter;

public class TestCasesValidation {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        driver.get("https://automationexercise.com/");

        WebElement testCaseLinkValidation = driver.findElement(By.xpath("(//ul//li/a)[5]"));
        testCaseLinkValidation.click();
        Waiter.pause(2);

        System.out.println("Expected URL = " + driver.getCurrentUrl());
        System.out.println(("Expected Title = " + driver.getTitle()));

        Driver.quitDriver();

        System.out.println("------ END OF THE TEST CASES ------");
    }
}
