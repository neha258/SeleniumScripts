package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchAndNavigate {
public static void main(String args[]) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\selenium\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    String url="https://mail.google.com";
    driver.get(url);
    Thread.sleep(5000);
    driver.close();
}
}
