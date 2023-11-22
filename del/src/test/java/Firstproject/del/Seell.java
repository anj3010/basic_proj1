package Firstproject.del;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seell {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
        driver.manage().deleteAllCookies();
        driver.get("https://www.amazon.com");
        
        
        WebElement sign = driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_ya_signin']"));
        sign.click();
        
        WebElement username = driver.findElement(By.id("ap_email"));
        username.sendKeys("anjali96906@gmail.com");
        
        WebElement cont = driver.findElement(By.id("continue"));
        cont.click();
        
        

	
	}

}
