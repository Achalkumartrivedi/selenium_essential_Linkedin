package SeleniumEssential;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class KeyboardAndMouseInput {
    public static void main(String[] args) {

        //Manually set path for chromedriver.exe driver file
       // System.setProperty("webdriver.chrome.driver", "/Users/CU-21/Drivers/chromedriver.exe"); // C:\Users\CU-21\Drivers

       //dynamically set and import by ( io.github.bonigarcia.wdm.WebDriverManager )

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");

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
