package day1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterIdAndPwd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\selenium\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
String url = "https://mail.google.com";
driver.get (url);
driver.close();
	}

}
