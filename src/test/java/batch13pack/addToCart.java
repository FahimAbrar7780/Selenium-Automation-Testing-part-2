package batch13pack;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class addToCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 	WebDriverManager.chromedriver().setup();
	     WebDriver driver=new ChromeDriver();
		driver.get("https://www.rokomari.com/book");
       driver.findElement(By.xpath("/html/body/header/div/div/div/div/div[2]/div/form/div/input[1]")).sendKeys("shirts");
       driver.findElement(By.xpath("/html/body/header/div/div/div/div/div[2]/div/form/div/div[2]")).click();
       
       String mainpage=driver.getWindowHandle();
       System.out.println("Mainpage"+ mainpage);
       driver.findElement(By.xpath("/html/body/div[6]/div/div/div/section[2]/div[2]/div/div[1]/div/a/div[1]/img")).click();
       Set<String> allPages=driver.getWindowHandles();
       for(String page:allPages) {
       	if(!page.equals(mainpage)) {
       		driver.switchTo().window(page);
       		break;
       	}
       }
       System.out.println(driver.getCurrentUrl());
      driver.findElement(By.xpath("/html/body/section/section[1]/div[3]/div[4]/a")).click();
      driver.findElement(By.xpath("/html/body/section/section[1]/div[3]/div[4]/a")).click();
      driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/section[2]/div/div[4]/button[2]")).click();
      driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/div[3]/div/a[2]")).click();
      driver.findElement(By.xpath("/html/body/div[2]/div/section/div/div[2]/div[2]/div/div/input[2]")).sendKeys("01315320105");
      //driver.findElement(By.xpath("/html/body/header/div/div/div/div/div[3]/div/div[3]")).click();
      driver.findElement(By.xpath("/html/body/div[2]/div/section/div/div[2]/div[2]/button")).click();
		
	}
}

