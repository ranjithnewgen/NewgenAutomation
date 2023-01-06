package org.newgen.configuration;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class Config {
	
	
public static String username() throws Throwable {
	Properties p = new Properties();
	File f1 = new File("C:\\Users\\ranjith.p\\eclipse-workspace\\NG_AUTOMATION\\src\\test\\java\\org\\Sample\\Project\\TestData.properties");
	FileReader f = new FileReader(f1);
	p.load(f);
   String username = p.getProperty("UserName");
    return username; 
}
public static String url() throws Throwable {
	Properties p = new Properties();
	File f1 = new File("C:\\Users\\ranjith.p\\eclipse-workspace\\NG_AUTOMATION\\src\\test\\java\\org\\Sample\\Project\\TestData.properties");
	FileReader f = new FileReader(f1);
	p.load(f);
	String url = p.getProperty("SearchTerm");
    return url;

}
public static String password() throws Throwable {
	Properties p = new Properties();
	File f1 = new File("C:\\Users\\ranjith.p\\eclipse-workspace\\NG_AUTOMATION\\src\\test\\java\\org\\Sample\\Project\\TestData.properties");
	FileReader f = new FileReader(f1);
	p.load(f);
String password = p.getProperty("Password");
    return password;

}

}
