package domaci_17_09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class domaci_17_09 {
/*Napisati program koji ucitava https://practicetestautomation.com/ stranicu, klikne na "Practice" i klikne 
	na "Test login page", popunjava username i password (student/Password123), loguje se na 
	stranicu klikom na dugme Submit i zatim se odjavljuje klikom na dugme Logout. Na kraju zatvoriti program.*/
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://practicetestautomation.com/");
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.findElement(By.id("menu-item-20")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div[1]/div[1]/p/a")).click();
		driver.findElement(By.id("username")).sendKeys("student");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Password123");
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/div/div/section/div/div/article/div[2]/div/div/div/a")).click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
