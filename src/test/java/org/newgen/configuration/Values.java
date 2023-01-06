package org.newgen.configuration;

public class Values {
public static String getUrl() throws Throwable {
	String url = Config.url();
	return url;
}
public static String getUsername() throws Throwable {
	String username = Config.username();
	return username;

}
public static String getPassword() throws Throwable {
	String password = Config.password();
	return password;

}
}
