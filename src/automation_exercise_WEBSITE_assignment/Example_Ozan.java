package automation_exercise_WEBSITE_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Driver;
import utils.Waiter;

import java.util.List;

public class Example_Ozan {
    public static void main(String[] args) {

        System.setProperty("webdriver.chromedriver", "/Users/ozge/IdeaProjects/selenium_initial_project5");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://automationexercise.com/");




        driver.quit();


    }
}
