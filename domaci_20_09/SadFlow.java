package domaci_20_09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadFlow {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.navigate().to("https://the-internet.herokuapp.com/login");

		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("blank");
		Thread.sleep(2000);

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("SuperSecretPassword!");
		Thread.sleep(2000);

		WebElement login = driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in"));
		login.click();
		Thread.sleep(2000);

		WebElement check = driver.findElement(By.id("flash"));
		String condition = check.getText();

		if (condition.contains("You logged into a secure area")) {
			System.out.println("End");
		} else {
			System.out.println("Try again :(");
		}
		driver.close();
	}

}
