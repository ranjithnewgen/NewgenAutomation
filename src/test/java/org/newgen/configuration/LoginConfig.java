package org.newgen.configuration;

import org.newgen.test.automation.GtmBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginConfig extends GtmBaseClass {
public static WebElement getUserField() throws Throwable {
	return driver.findElement(By.id(LoginLocation.userField()));
}
public static WebElement getPassField() throws Throwable {
	return driver.findElement(By.id(LoginLocation.passField()));

}
public static WebElement getLoginBtn() throws Throwable {
	return driver.findElement(By.id(LoginLocation.loginBtn()));

}
public static WebElement getCnfrmLogin() throws Throwable {
	return driver.findElement(By.id(LoginLocation.cnfrmLogin()));
}
}
