package chatbot;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleChat {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ksrtc.in/oprs-web/");
		
		List<WebElement> element = driver.findElements(By.xpath("//div[@id='corover-close-btn']"));
		
		System.out.println("Found chat bot");
		
		if(element.size()>0) {
			element.get(0).click();
			System.out.println("Closing chat bot");
		}
		
		Thread.sleep(10000);
		driver.quit();
		
	}

}
