package automation_exercise_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.Waiter;

import java.sql.SQLOutput;

public class TestCasesValidation {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        driver.get("https://automationexercise.com/");

        WebElement testCaseLinkValidation = driver.findElement(By.xpath("(//ul//li)[5]"));
        testCaseLinkValidation.click();
        Waiter.pause(2);
        driver.navigate().to("https://automationexercise.com/test_cases");

        System.out.println("Expected URL = " + driver.getCurrentUrl());
        System.out.println(("Expected Title = " + driver.getTitle()));

        Driver.quitDriver();

        System.out.println("------ END OF THE TEST CASES ------");
    }
}
