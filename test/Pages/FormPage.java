package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FormPage {

    public static void submitform(WebDriver driver)
    {
        System.out.println("Submit form Function call!");
        try {


            driver.findElement(By.id("first-name")).sendKeys("Achal");
            Thread.sleep(1000);
            driver.findElement(By.id("last-name")).sendKeys("Trivedi");
            Thread.sleep(1000);
            driver.findElement(By.id("job-title")).sendKeys("Software Tester");
            Thread.sleep(1000);
            driver.findElement(By.id("radio-button-2")).click();
            Thread.sleep(1000);
            driver.findElement(By.id("checkbox-2")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("option[value='1']")).click();
            Thread.sleep(3000);
            driver.findElement(By.id("datepicker")).sendKeys("01/02/2019");
            Thread.sleep(3000);
            driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
            Thread.sleep(3000);

            System.out.println("Form is Filled .!");

            driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
            System.out.println("Submit Button Clicked!");
        }
        catch(Exception ex) {
            ex.printStackTrace();
            ex.getMessage();
            System.out.println("Form is not Submitted");

        }

    }
}
