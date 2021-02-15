package day1;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumScript {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\New folder\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://chromedriver.chromium.org/downloads");
		System.out.print(driver.getTitle());
		Thread.sleep(5000);
		driver.quit();

	}
}


