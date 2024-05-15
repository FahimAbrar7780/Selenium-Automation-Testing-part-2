package batch13pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rokomariSignUpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//WebDriverManager.firefoxdriver().setup();
	   	WebDriverManager.chromedriver().setup();
	     WebDriver driver=new ChromeDriver();
		driver.get("https://www.rokomari.com");
		driver.findElement(By.xpath("/html/body/header/div/div/div/div/div[3]/div/div[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/section/div/div[2]/div[2]/div/div/input[2]")).sendKeys("01315320105");
		driver.findElement(By.xpath("/html/body/div[2]/div/section/div/div[2]/div[2]/button")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/section/div/div[2]/div[2]/form[2]/div[1]/div/input")).sendKeys("7830");
		driver.findElement(By.xpath("/html/body/div[2]/div/section/div/div[2]/div[2]/form[2]/div[2]/div[1]/div/label")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/section/div/div[2]/div[2]/form[2]/button")).click();
		
		//using gmail
		
      //  driver.findElement(By.xpath("/html/body/div[2]/div/section/div/div[2]/div[1]/div/button[2]")).click();
       // driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[2]/div/div/div[1]/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input")).sendKeys("fahimabrarcse7780@gmail.com");
       //driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[3]/div/div[1]/div/div/button/span")).click();
		
	}

}
