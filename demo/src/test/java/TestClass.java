import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {
    @Test
    public void first() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        //driver.findElement(By.className("gLFyf")).sendKeys("Python");
        //driver.findElement(By.className("gNO89b")).click();
        driver.findElement(By.linkText("Store")).click();

        Thread.sleep(2000);
        driver.close();
    }
    
}
