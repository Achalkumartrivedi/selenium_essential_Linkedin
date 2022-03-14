package SeleniumEssential;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;


public class Scrollelement {
        public static void main(String[] args) throws InterruptedException {

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            driver.get("https://formy-project.herokuapp.com/scroll");

           // WebElement name = driver.findElement(By.id("name"));
            WebElement name = driver.findElement(By.xpath("//input[@id='name']"));

            Actions actions = new Actions(driver);
            actions.moveToElement(name);
            Thread.sleep(2000);

            System.out.println("Scrolled down!");
            name.sendKeys("Achal");
            System.out.println("Name Entered..!");

            WebElement date = driver.findElement(By.xpath("//input[@id='date']"));
            date.sendKeys("13/02/1989");
            System.out.println("Date Entered..!");







        }
        
}
