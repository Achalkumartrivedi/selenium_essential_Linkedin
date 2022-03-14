package SeleniumEssential;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class JavaScriptCommand {
    public static void main(String[] args) {

        //dynamically set and import by ( io.github.bonigarcia.wdm.WebDriverManager )
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/modal");

        WebElement name = driver.findElement(By.id("name"));
        name.sendKeys("Achal Trivedi");
        System.out.println("Name Entered..!");

        WebElement login = driver.findElement(By.xpath("//button[@id='button']"));
        login.click();
        System.out.println("Clicked..!");


        driver.quit();
        System.out.println("Successfully Run and Driver Closed..!");
    }
}

