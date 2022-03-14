package SeleniumEssential;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.concurrent.TimeUnit;

public class Fileupload {
    public static void main(String[] args) throws InterruptedException {

        //Manually set path for chromedriver.exe driver file
        // System.setProperty("webdriver.chrome.driver", "/Users/CU-21/Drivers/chromedriver.exe"); // C:\Users\CU-21\Drivers

        //dynamically set and import by ( io.github.bonigarcia.wdm.WebDriverManager )

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");
        driver.manage().window().maximize();
        //imlicit wait to all elements
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        WebDriverWait wait = new WebDriverWait(driver,10);

        //Explicit wait to element
        WebElement datefield = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("file-upload-field")));

       // WebElement datefield = driver.findElement(By.id("file-upload-field"));  //old way
        Thread.sleep(3000);
        datefield.sendKeys("SeleniumEssential/spidy.jpg");  // upload file from SENDKEYS() method
        Thread.sleep(3000);



        System.out.println("File is uploaded.!");






        Thread.sleep(3000);
        driver.quit();
        System.out.println("Successfully Run and Driver Closed..!");
    }
}

