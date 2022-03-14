package SeleniumEssential;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Datepicker {
    public static void main(String[] args) throws InterruptedException {

        //Manually set path for chromedriver.exe driver file
        // System.setProperty("webdriver.chrome.driver", "/Users/CU-21/Drivers/chromedriver.exe"); // C:\Users\CU-21\Drivers

        //dynamically set and import by ( io.github.bonigarcia.wdm.WebDriverManager )

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");
        driver.manage().window().maximize();

        WebElement datefield = driver.findElement(By.id("datepicker"));
        datefield.sendKeys("01/02/2023");
        Thread.sleep(3000);
         datefield.sendKeys(Keys.RETURN);

        System.out.println("Date picker element is clicked .!");






        Thread.sleep(3000);
        driver.quit();
        System.out.println("Successfully Run and Driver Closed..!");
    }
}
