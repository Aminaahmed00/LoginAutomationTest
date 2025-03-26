package openBrowsers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {
    public static void main(String[] str) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        driver.manage().window().maximize();
//        invalid login

        driver.findElement(By.id("username")).sendKeys("Ahmed");
        driver.findElement(By.id("password")).sendKeys("Ajhu@1458#");
        driver.findElement(By.className("radius")).click();

        driver.findElement(By.id("username")).sendKeys("Ahmed");
        driver.findElement(By.id("password")).sendKeys("####");
        driver.findElement(By.className("radius")).click();

        driver.findElement(By.id("username")).sendKeys("Ahmed");
        driver.findElement(By.id("password")).sendKeys("1458");
        driver.findElement(By.className("radius")).click();
    }
}