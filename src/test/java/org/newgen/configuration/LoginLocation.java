package org.newgen.configuration;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebElement;

public class LoginLocation {
public static String userField() throws Throwable {
	Properties p = new Properties();
	File f1 = new File("C:\\Users\\ranjith.p\\eclipse-workspace\\NG_AUTOMATION\\src\\test\\java\\org\\Sample\\Project\\Location.Properties");
	FileReader f = new FileReader(f1);
	p.load(f);
	String property = p.getProperty("id");
	return property;
	
}
public static String passField() throws Throwable {
	
	Properties p = new Properties();
	File f1 = new File("C:\\Users\\ranjith.p\\eclipse-workspace\\NG_AUTOMATION\\src\\test\\java\\org\\Sample\\Project\\Location.Properties");
	FileReader f = new FileReader(f1);
	p.load(f);
	String password = p.getProperty("password");
	return password;
}
public static String loginBtn() throws Throwable {
	Properties p = new Properties();
	File f1 = new File("C:\\Users\\ranjith.p\\eclipse-workspace\\NG_AUTOMATION\\src\\test\\java\\org\\Sample\\Project\\Location.Properties");
	FileReader f = new FileReader(f1);
	p.load(f);
	String login = p.getProperty("loginbtn");
	return login;

}
public static String cnfrmLogin() throws Throwable {
	Properties p = new Properties();
	File f1 = new File("C:\\Users\\ranjith.p\\eclipse-workspace\\NG_AUTOMATION\\src\\test\\java\\org\\Sample\\Project\\Location.Properties");
	FileReader f = new FileReader(f1);
	p.load(f);
	String cnfrmlogin = p.getProperty("cnfrmlogin");
	return cnfrmlogin;
}
}
