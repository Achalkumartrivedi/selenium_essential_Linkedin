package SeleniumEssential;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobutton {
    public static void main(String[] args) throws InterruptedException {

        //Manually set path for chromedriver.exe driver file
        // System.setProperty("webdriver.chrome.driver", "/Users/CU-21/Drivers/chromedriver.exe"); // C:\Users\CU-21\Drivers

        //dynamically set and import by ( io.github.bonigarcia.wdm.WebDriverManager )

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");
        driver.manage().window().maximize();

        WebElement radio1 = driver.findElement(By.id("radio-button-1"));
        radio1.click();
        System.out.println("first Radio Button clicked..!");

        Thread.sleep(3000);

        WebElement radio2 = driver.findElement(By.cssSelector("input[value='option2']"));
        radio2.click();
        System.out.println("Second Radio button Clicked ..!");

        Thread.sleep(3000);

        WebElement radio3 = driver.findElement(By.cssSelector("input[value='option3']"));
        radio3.click();
        System.out.println("Third Radio button Clicked ..!");

        Thread.sleep(3000);
        driver.quit();
        System.out.println("Successfully Run and Driver Closed..!");
    }
}