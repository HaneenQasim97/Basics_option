import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sentence {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\OneDrive\\Desktop\\new exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("http://127.0.0.1:5500/select.html");
		String MyTitle = driver.getTitle();
		System.out.println(MyTitle);
		List<WebElement> MyListOfOptions = driver.findElements(By.tagName("option"));
		for (int i = 0; i < MyListOfOptions.size(); i++) {
			System.out.println(MyListOfOptions.get(i).getText());
		}
	}

}
