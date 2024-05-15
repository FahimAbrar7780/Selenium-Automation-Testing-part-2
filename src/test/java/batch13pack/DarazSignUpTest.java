package batch13pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DarazSignUpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	     WebDriver driver=new ChromeDriver();
		driver.get("https://www.daraz.com.bd/");
		driver.findElement(By.linkText("Sign Up")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/form/div/div[1]/div[1]/input")).sendKeys("01937239981");
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/form/div/div[2]/div[1]/input")).sendKeys("Fahim Abrar");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/form/div/div[1]/div[2]/div[1]/input")).sendKeys("484832");
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/form/div/div[1]/div[3]/input")).sendKeys("panda123");
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/form/div/div[1]/div[3]/div[1]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/form/div/div[1]/div[4]/div[1]/div[2]/div[2]/div[1]/span/i")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div/ul/li[2]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/form/div/div[1]/div[4]/div[1]/div[2]/div[2]/span[1]/i")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div/ul/li[2]")).click();
	    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/form/div/div[1]/div[4]/div[1]/div[2]/div[2]/span[2]/i")).click();
	    driver.findElement(By.xpath("/html/body/div[5]/div/div/ul/li[27]")).click();
	    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/form/div/div[1]/div[4]/div[2]/div/span/i")).click();
	    driver.findElement(By.xpath("/html/body/div[5]/div/div/ul/li[1]")).click();
	    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/form/div/div[2]/div[3]/button")).click();
		
	}

}
