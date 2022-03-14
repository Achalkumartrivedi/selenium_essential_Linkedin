package SeleniumEssential;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class SwitchToalert {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement Alertbutton = driver.findElement(By.xpath("//button[@id='alert-button']"));
        Alertbutton.click();
        Alert alertpopup = driver.switchTo().alert();
        Thread.sleep(3000);
        alertpopup.accept();

//        String originalhandle = driver.getWindowHandle();
//        for (String handle1: driver.getWindowHandles())
//        {
//            driver.switchTo().window(handle1);
//            System.out.println("Window is Switched..!");
//            WebElement menu= driver.findElement(By.xpath("//a[@id='navbarDropdownMenuLink']"));
//            menu.click();
//            Thread.sleep(3000);
//            menu.click();
//        }
//        Thread.sleep(3000);
//        driver.switchTo().window(originalhandle);
        System.out.println("Alert Window Program Run.!");

        Thread.sleep(4000);
        driver.close();

    }

}