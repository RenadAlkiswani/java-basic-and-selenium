package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaBasic {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\ChromeDriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:5500/index.html");
		String theTitle = driver.getTitle();
		System.out.println(theTitle);
		List<WebElement> myOptions = driver.findElements(By.tagName("option"));
		for (int i = 0; i < myOptions.size(); i++) {
			System.out.println(myOptions.get(i).getText());
		}
	}
}
