package Lib;

import java.io.FileInputStream;
import java.util.Properties;

public class Property {
	public static String getdata(String path, String key) {
		String s="";
		Properties p=new Properties();
		try {
		p.load(new FileInputStream(path));
		p.getProperty(key);
		}
		catch(Exception e){
			
		}
		return s;
	}
}
