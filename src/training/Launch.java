package training;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver");
		WebDriver driver=new ChromeDriver();
		Properties p=new Properties();
		try {
			p.load(new FileInputStream("./data.properties"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		driver.get(p.getProperty("URL"));
		driver.findElement(By.id("edit-name")).sendKeys(p.getProperty("username"));
		driver.findElement(By.id("edit-pass")).sendKeys("");
		driver.findElement(By.id("edit-submit")).click();
		String t=driver.getTitle();
		System.out.println(driver.getTitle());
		String url=driver.getCurrentUrl();
		System.out.println(url);
		if(t.equals("Programming Competition,Programming Contest,Online Computer Programming")) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		driver.close();
	}

}
