package script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Lib.Property;
import generic.constant;

public class Execution implements constant{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.get(Property.getdata(path, "URL"));
		

	}

}
