package batch13pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class darazLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriverManager.firefoxdriver().setup();
	   	WebDriverManager.chromedriver().setup();
	     WebDriver driver=new ChromeDriver();
		driver.get("https://daraz.com.bd/");
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/form/div/div[1]/div[1]/input")).sendKeys("01937239981");
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/form/div/div[1]/div[2]/input")).sendKeys("panda23");
	    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/form/div/div[2]/div[1]/button")).click();
	     driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[1]/div[2]/div/div[4]")).click();

	}

}
