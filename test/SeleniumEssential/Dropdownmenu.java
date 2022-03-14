package SeleniumEssential;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdownmenu {
    public static void main(String[] args) throws InterruptedException {

        //Manually set path for chromedriver.exe driver file
        // System.setProperty("webdriver.chrome.driver", "/Users/CU-21/Drivers/chromedriver.exe"); // C:\Users\CU-21\Drivers

        //dynamically set and import by ( io.github.bonigarcia.wdm.WebDriverManager )

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");
        driver.manage().window().maximize();

        WebElement dropdown = driver.findElement(By.id("dropdownMenuButton"));
        dropdown.click();
        Thread.sleep(3000);

        WebElement option = driver.findElement(By.id("autocomplete"));
        option.click();
        Thread.sleep(3000);


        System.out.println("Autocomplete option is selected .!");






        Thread.sleep(3000);
        driver.quit();
        System.out.println("Successfully Run and Driver Closed..!");
    }
}

