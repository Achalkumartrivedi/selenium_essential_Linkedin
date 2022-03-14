package SeleniumEssential;

import com.sun.org.apache.xpath.internal.operations.Equals;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Pages.FormPage.submitform;
import static org.junit.Assert.assertEquals;  // import for use Assert Equals

public class AutomateForm {
    public static void main(String[] args) throws InterruptedException {
        //dynamically set and import by ( io.github.bonigarcia.wdm.WebDriverManager )

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");
        driver.manage().window().maximize();

          submitform(driver); //Submit Form function call

        // Find Text ELement with Explicit wait
        WebDriverWait wait = new WebDriverWait(driver,20);
        WebElement alert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));
        System.out.println("Text element is Found");

        String Alerttext = alert.getText(); //Succesfull message store in string
        System.out.println("Alert Text is:- "+Alerttext);   //Print message on console

        //Check only element is displayed or not
        try {
            if (alert.isDisplayed());
            System.out.println("isDisplayed() function call - element is display");

           //IMPORT THIS " import static org.junit.Assert.assertEquals; " for using Assert and Maven Dependancy
            assertEquals("The form was successfully submitted!",Alerttext);
            System.out.println("Text element display as Expected!");

           
        }
        catch(Exception ex) {
            ex.printStackTrace();
            ex.getCause();
           ex.getMessage();
            System.out.println("Catch section ..!!");
        }
        Thread.sleep(3000);
        driver.quit();
        System.out.println("Successfully Run Program and Browser Closed..!");
    }



}
