package chatbot;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleChat2 {

	@Test
	public void handleChat2() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://classic.crmpro.com/index.html");

		WebDriverWait wait = new WebDriverWait(driver, 30);

		System.out.println("Waiting for frameFrame");

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
				By.xpath("//iframe[contains(@style,'height') and contains(@class,'intercom')]")));

		System.out.println("Frame found and Switched");

		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Sign up the team')]")));

		System.out.println("Mouse Hover");
		
		driver.findElement(By.xpath("//div[contains(@class,'intercom-69pdxh')]")).click();
		
		System.out.println("Closing chat bot");
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
